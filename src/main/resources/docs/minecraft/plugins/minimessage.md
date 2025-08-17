# adventure-text-minimessage-4.24.0 API Reference

## Package: net.kyori.adventure.text.minimessage

### Class: net.kyori.adventure.text.minimessage.Context
Type: Interface

Methods:
- Pointered targetOrThrow()
- boolean emitVirtuals()
- Pointered targetAsType(Class)
- ParsingException newException(String, ArgumentQueue)
- ParsingException newException(String)
- ParsingException newException(String, Throwable, ArgumentQueue)
- Component deserialize(String)
- Component deserialize(String, TagResolver)
- Component deserialize(String, TagResolver[])
- Pointered target()

### Class: net.kyori.adventure.text.minimessage.MiniMessage
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- String escapeTags(String)
- String escapeTags(String, TagResolver)
- String escapeTags(String, TagResolver[])
- **static** MiniMessage miniMessage()
- **static** MiniMessage$Builder builder()
- String stripTags(String)
- String stripTags(String, TagResolver)
- String stripTags(String, TagResolver[])
- Node$Root deserializeToTree(String)
- Node$Root deserializeToTree(String, Pointered)
- Node$Root deserializeToTree(String, TagResolver)
- Node$Root deserializeToTree(String, Pointered, TagResolver)
- Node$Root deserializeToTree(String, TagResolver[])
- Node$Root deserializeToTree(String, Pointered, TagResolver[])
- boolean strict()
- TagResolver tags()
- Component deserialize(String, Pointered)
- Component deserialize(String, TagResolver)
- Component deserialize(String, Pointered, TagResolver)
- Component deserialize(String, TagResolver[])
- Component deserialize(String, Pointered, TagResolver[])

### Class: net.kyori.adventure.text.minimessage.MiniMessage$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- MiniMessage$Builder debug(Consumer)
- MiniMessage$Builder preProcessor(UnaryOperator)
- MiniMessage build()
- Object build()
- MiniMessage$Builder emitVirtuals(boolean)
- MiniMessage$Builder postProcessor(UnaryOperator)
- MiniMessage$Builder strict(boolean)
- MiniMessage$Builder editTags(Consumer)
- MiniMessage$Builder tags(TagResolver)

### Class: net.kyori.adventure.text.minimessage.MiniMessage$Provider
Type: Interface

Methods:
- MiniMessage miniMessage()
- Consumer builder()

### Class: net.kyori.adventure.text.minimessage.ParsingException
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String detailMessage()

## Package: net.kyori.adventure.text.minimessage.internal

### Class: net.kyori.adventure.text.minimessage.internal.TagInternals
Type: Class

Methods:
- **static** boolean sanitizeAndCheckValidTagName(String)
- **static** void assertValidTagName(String)
- **static** void sanitizeAndAssertValidTagName(String)

## Package: net.kyori.adventure.text.minimessage.internal.parser

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenParser$TagProvider
Type: Interface

Methods:
- Tag resolve(String, List, Token)
- Tag resolve(String)
- Tag resolve(TagNode)
- **static** String sanitizePlaceholderName(String)

### Class: net.kyori.adventure.text.minimessage.internal.parser.ParsingExceptionImpl
Type: Class
Extends: net.kyori.adventure.text.minimessage.ParsingException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String getMessage()
- Token[] tokens()
- void tokens(Token[])
- String detailMessage()

### Class: net.kyori.adventure.text.minimessage.internal.parser.Token
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- int startIndex()
- int hashCode()
- int endIndex()
- boolean equals(Object)
- CharSequence get(CharSequence)
- String toString()
- List childTokens()
- void childTokens(List)
- Stream examinableProperties()
- TokenType type()

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenParser
Type: Class

Methods:
- **static** String resolvePreProcessTags(String, TokenParser$TagProvider)
- **static** void parseString(String, boolean, MatchedTokenConsumer)
- **static** String unescape(String, int, int, IntPredicate)
- **static** RootNode parse(TokenParser$TagProvider, Predicate, String, String, boolean) throws ParsingException
- **static** List tokenize(String, boolean)

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TokenType valueOf(String)
- **static** TokenType[] values()

## Package: net.kyori.adventure.text.minimessage.internal.parser.match

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer
Type: Abstract Class

Methods:
- Object result()
- int lastEndIndex()
- void accept(int, int, TokenType)

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.StringResolvingMatchedTokenConsumer
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- String result()
- Object result()
- void accept(int, int, TokenType)

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.TokenListProducingMatchedTokenConsumer
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- List result()
- Object result()
- void accept(int, int, TokenType)

## Package: net.kyori.adventure.text.minimessage.internal.parser.node

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Type: Class
Implements: net.kyori.adventure.text.minimessage.tree.Node

Methods:
- String sourceMessage()
- ElementNode parent()
- Node parent()
- List unsafeChildren()
- StringBuilder buildToString(StringBuilder, int)
- List children()
- String toString()
- void addChild(ElementNode)
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.RootNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Implements: net.kyori.adventure.text.minimessage.tree.Node$Root

Methods:
- String input()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TagNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String name()
- List parts()
- Tag tag()
- void tag(Tag)
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TagPart
Type: Class
Implements: net.kyori.adventure.text.minimessage.tag.Tag$Argument

Methods:
- **static** String unquoteAndEscape(String, int, int)
- String toString()
- String value()
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TextNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ValueNode

No public methods found

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.ValueNode
Type: Abstract Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String value()
- Token token()

## Package: net.kyori.adventure.text.minimessage.internal.serializer

### Class: net.kyori.adventure.text.minimessage.internal.serializer.ClaimConsumer
Type: Interface

Methods:
- boolean component(Emitable)
- boolean styleClaimed(String)
- boolean componentClaimed()
- void style(String, Emitable)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.Emitable
Type: Interface

Methods:
- void emit(TokenEmitter)
- Component substitute()

### Class: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver
Type: Interface

Methods:
- **static** TagResolver claimingStyle(String, BiFunction, StyleClaim)
- **static** TagResolver claimingStyle(Set, BiFunction, StyleClaim)
- **static** TagResolver claimingComponent(String, BiFunction, Function)
- **static** TagResolver claimingComponent(Set, BiFunction, Function)
- void handle(Component, ClaimConsumer)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver$Single
Type: Interface
Implements: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver

Methods:
- void handle(Component, ClaimConsumer)
- StyleClaim claimStyle()
- Emitable claimComponent(Component)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.StyleClaim
Type: Interface

Methods:
- Emitable apply(Style)
- String claimKey()
- **static** StyleClaim claim(String, Function, BiConsumer)
- **static** StyleClaim claim(String, Function, Predicate, BiConsumer)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.TokenEmitter
Type: Interface

Methods:
- TokenEmitter pop()
- TokenEmitter argument(String)
- TokenEmitter argument(String, QuotingOverride)
- TokenEmitter argument(Component)
- TokenEmitter selfClosingTag(String)
- TokenEmitter arguments(String[])
- TokenEmitter text(String)
- TokenEmitter tag(String)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.QuotingOverride
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** QuotingOverride valueOf(String)
- **static** QuotingOverride[] values()

## Package: net.kyori.adventure.text.minimessage.tag

### Class: net.kyori.adventure.text.minimessage.tag.Inserting
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- boolean allowsChildren()
- Component value()

### Class: net.kyori.adventure.text.minimessage.tag.Modifying
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- void postVisit()
- Component apply(Component, int)
- void visit(Node, int)

### Class: net.kyori.adventure.text.minimessage.tag.ParserDirective
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

No public methods found

### Class: net.kyori.adventure.text.minimessage.tag.PreProcess
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- String value()

### Class: net.kyori.adventure.text.minimessage.tag.Tag
Type: Interface

Methods:
- **static** Tag styling(Consumer)
- **static** Tag styling(StyleBuilderApplicable[])
- **static** PreProcess preProcessParsed(String)
- **static** Tag inserting(Component)
- **static** Tag inserting(ComponentLike)
- **static** Tag selfClosingInserting(Component)
- **static** Tag selfClosingInserting(ComponentLike)

### Class: net.kyori.adventure.text.minimessage.tag.Tag$Argument
Type: Interface

Methods:
- OptionalInt asInt()
- boolean isTrue()
- OptionalDouble asDouble()
- boolean isFalse()
- String lowerValue()
- String value()

### Class: net.kyori.adventure.text.minimessage.tag.TagPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: net.kyori.adventure.text.minimessage.tag.resolver

### Class: net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue
Type: Interface

Methods:
- Tag$Argument pop()
- void reset()
- boolean hasNext()
- Tag$Argument popOr(String)
- Tag$Argument popOr(Supplier)
- Tag$Argument peek()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver
Type: Interface

Methods:
- **static** TagResolver standard()
- **static** TagResolver$Single resolver(String, Tag)
- **static** TagResolver resolver(String, BiFunction)
- **static** TagResolver resolver(Set, BiFunction)
- **static** TagResolver resolver(TagResolver[])
- **static** TagResolver resolver(Iterable)
- Tag resolve(String, ArgumentQueue, Context) throws ParsingException
- **static** TagResolver$Builder builder()
- boolean has(String)
- **static** Collector toTagResolver()
- **static** TagResolver caching(TagResolver$WithoutArguments)
- **static** TagResolver empty()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$Builder
Type: Interface

Methods:
- TagResolver$Builder resolver(TagResolver)
- TagResolver$Builder resolvers(TagResolver[])
- TagResolver$Builder resolvers(Iterable)
- TagResolver build()
- TagResolver$Builder tag(String, Tag)
- TagResolver$Builder tag(String, BiFunction)
- TagResolver$Builder tag(Set, BiFunction)
- TagResolver$Builder caching(TagResolver$WithoutArguments)

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$Single
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$WithoutArguments

Methods:
- Tag resolve(String)
- boolean has(String)
- Tag tag()
- String key()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$WithoutArguments
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver

Methods:
- Tag resolve(String)
- Tag resolve(String, ArgumentQueue, Context) throws ParsingException
- boolean has(String)

### Class: net.kyori.adventure.text.minimessage.tag.resolver.Formatter
Type: Class

Methods:
- **static** TagResolver date(String, TemporalAccessor)
- **static** TagResolver joining(String, Iterable)
- **static** TagResolver joining(String, ComponentLike[])
- **static** TagResolver number(String, Number)
- **static** TagResolver booleanChoice(String, boolean)
- **static** TagResolver choice(String, Number)

### Class: net.kyori.adventure.text.minimessage.tag.resolver.Placeholder
Type: Class

Methods:
- **static** TagResolver$Single component(String, ComponentLike)
- **static** TagResolver$Single styling(String, StyleBuilderApplicable[])
- **static** TagResolver$Single unparsed(String, String)
- **static** TagResolver$Single parsed(String, String)

## Package: net.kyori.adventure.text.minimessage.tag.standard

### Class: net.kyori.adventure.text.minimessage.tag.standard.StandardTags
Type: Class

Methods:
- **static** TagResolver nbt()
- **static** TagResolver translatable()
- **static** TagResolver color()
- **static** TagResolver gradient()
- **static** TagResolver decorations(TextDecoration)
- **static** TagResolver decorations()
- **static** TagResolver transition()
- **static** TagResolver hoverEvent()
- **static** TagResolver score()
- **static** TagResolver rainbow()
- **static** TagResolver clickEvent()
- **static** TagResolver newline()
- **static** TagResolver defaults()
- **static** TagResolver pride()
- **static** TagResolver keybind()
- **static** TagResolver reset()
- **static** TagResolver translatableFallback()
- **static** TagResolver selector()
- **static** TagResolver insertion()
- **static** TagResolver shadowColor()
- **static** TagResolver font()

### Class: net.kyori.adventure.text.minimessage.tag.standard.TransitionTag
Type: Class
Implements: net.kyori.adventure.text.minimessage.tag.Inserting, net.kyori.examination.Examinable

Methods:
- int hashCode()
- boolean equals(Object)
- Stream examinableProperties()
- Component value()

## Package: net.kyori.adventure.text.minimessage.translation

### Class: net.kyori.adventure.text.minimessage.translation.MiniMessageTranslationStore
Type: Interface
Implements: net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- **static** MiniMessageTranslationStore create(Key)
- **static** MiniMessageTranslationStore create(Key, MiniMessage)

### Class: net.kyori.adventure.text.minimessage.translation.Argument
Type: Class

Methods:
- **static** ComponentLike argument(String, TranslationArgumentLike)
- **static** ComponentLike argument(String, TranslationArgument)
- **static** ComponentLike component(String, ComponentLike)
- **static** ComponentLike string(String, String)
- **static** ComponentLike bool(String, boolean)
- **static** ComponentLike numeric(String, Number)
- **static** ComponentLike numeric(String, String)
- **static** ComponentLike tag(String, Tag)
- **static** ComponentLike target(Pointered)
- **static** ComponentLike tagResolver(TagResolver[])
- **static** ComponentLike tagResolver(Iterable)
- **static** ComponentLike tagResolver(TagResolver)

### Class: net.kyori.adventure.text.minimessage.translation.MiniMessageTranslator
Type: Abstract Class
Implements: net.kyori.adventure.translation.Translator

Methods:
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)

## Package: net.kyori.adventure.text.minimessage.tree

### Class: net.kyori.adventure.text.minimessage.tree.Node
Type: Interface

Methods:
- Node parent()
- List children()
- String toString()

### Class: net.kyori.adventure.text.minimessage.tree.Node$Root
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tree.Node

Methods:
- String input()

