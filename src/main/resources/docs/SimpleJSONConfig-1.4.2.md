# SimpleJSONConfig-1.4.2 API Reference

## Package: com.fasterxml.jackson.annotation

### Class: com.fasterxml.jackson.annotation.JacksonAnnotation
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.fasterxml.jackson.annotation.JacksonAnnotationValue
Type: Interface

Methods:
- Class valueFor()

### Class: com.fasterxml.jackson.annotation.JacksonAnnotationsInside
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.fasterxml.jackson.annotation.JacksonInject
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- OptBoolean useInput()
- String value()

### Class: com.fasterxml.jackson.annotation.JsonAlias
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: com.fasterxml.jackson.annotation.JsonAnyGetter
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean enabled()

### Class: com.fasterxml.jackson.annotation.JsonAnySetter
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean enabled()

### Class: com.fasterxml.jackson.annotation.JsonAutoDetect
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonAutoDetect$Visibility getterVisibility()
- JsonAutoDetect$Visibility fieldVisibility()
- JsonAutoDetect$Visibility isGetterVisibility()
- JsonAutoDetect$Visibility setterVisibility()
- JsonAutoDetect$Visibility creatorVisibility()

### Class: com.fasterxml.jackson.annotation.JsonBackReference
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonClassDescription
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonCreator
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonCreator$Mode mode()

### Class: com.fasterxml.jackson.annotation.JsonEnumDefaultValue
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.fasterxml.jackson.annotation.JsonFilter
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonFormat
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonFormat$Feature[] with()
- JsonFormat$Shape shape()
- String timezone()
- String pattern()
- String locale()
- JsonFormat$Feature[] without()
- OptBoolean lenient()

### Class: com.fasterxml.jackson.annotation.JsonGetter
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonIdentityInfo
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class resolver()
- Class scope()
- String property()
- Class generator()

### Class: com.fasterxml.jackson.annotation.JsonIdentityReference
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean alwaysAsId()

### Class: com.fasterxml.jackson.annotation.JsonIgnore
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean value()

### Class: com.fasterxml.jackson.annotation.JsonIgnoreProperties
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean allowGetters()
- boolean ignoreUnknown()
- boolean allowSetters()
- String[] value()

### Class: com.fasterxml.jackson.annotation.JsonIgnoreType
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean value()

### Class: com.fasterxml.jackson.annotation.JsonInclude
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class valueFilter()
- JsonInclude$Include value()
- Class contentFilter()
- JsonInclude$Include content()

### Class: com.fasterxml.jackson.annotation.JsonIncludeProperties
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: com.fasterxml.jackson.annotation.JsonKey
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean value()

### Class: com.fasterxml.jackson.annotation.JsonManagedReference
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonMerge
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- OptBoolean value()

### Class: com.fasterxml.jackson.annotation.JsonProperty
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonProperty$Access access()
- String defaultValue()
- String namespace()
- int index()
- String value()
- boolean required()

### Class: com.fasterxml.jackson.annotation.JsonPropertyDescription
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonPropertyOrder
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean alphabetic()
- String[] value()

### Class: com.fasterxml.jackson.annotation.JsonRawValue
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean value()

### Class: com.fasterxml.jackson.annotation.JsonRootName
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String namespace()
- String value()

### Class: com.fasterxml.jackson.annotation.JsonSetter
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Nulls contentNulls()
- Nulls nulls()
- String value()

### Class: com.fasterxml.jackson.annotation.JsonSubTypes
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean failOnRepeatedNames()
- JsonSubTypes$Type[] value()

### Class: com.fasterxml.jackson.annotation.JsonSubTypes$Type
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] names()
- String name()
- Class value()

### Class: com.fasterxml.jackson.annotation.JsonTypeId
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.fasterxml.jackson.annotation.JsonTypeInfo
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonTypeInfo$As include()
- boolean visible()
- JsonTypeInfo$Id use()
- String property()
- Class defaultImpl()

### Class: com.fasterxml.jackson.annotation.JsonTypeName
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.fasterxml.jackson.annotation.JsonUnwrapped
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String prefix()
- String suffix()
- boolean enabled()

### Class: com.fasterxml.jackson.annotation.JsonValue
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean value()

### Class: com.fasterxml.jackson.annotation.JsonView
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class[] value()

### Class: com.fasterxml.jackson.annotation.ObjectIdResolver
Type: Interface

Methods:
- ObjectIdResolver newForDeserialization(Object)
- boolean canUseFor(ObjectIdResolver)
- Object resolveId(ObjectIdGenerator$IdKey)
- void bindItem(ObjectIdGenerator$IdKey, Object)

### Class: com.fasterxml.jackson.annotation.JacksonInject$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- Object getId()
- Class valueFor()
- boolean willUseInput(boolean)
- **static** JacksonInject$Value construct(Object, Boolean)
- JacksonInject$Value withId(Object)
- **static** JacksonInject$Value empty()
- boolean hasId()
- **static** JacksonInject$Value forId(Object)
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** JacksonInject$Value from(JacksonInject)
- Boolean getUseInput()
- JacksonInject$Value withUseInput(Boolean)

### Class: com.fasterxml.jackson.annotation.JsonAutoDetect$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- JsonAutoDetect$Visibility getSetterVisibility()
- JsonAutoDetect$Value withCreatorVisibility(JsonAutoDetect$Visibility)
- JsonAutoDetect$Visibility getIsGetterVisibility()
- Class valueFor()
- **static** JsonAutoDetect$Value defaultVisibility()
- **static** JsonAutoDetect$Value construct(PropertyAccessor, JsonAutoDetect$Visibility)
- **static** JsonAutoDetect$Value construct(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)
- JsonAutoDetect$Value withGetterVisibility(JsonAutoDetect$Visibility)
- JsonAutoDetect$Visibility getCreatorVisibility()
- JsonAutoDetect$Visibility getFieldVisibility()
- int hashCode()
- boolean equals(Object)
- **static** JsonAutoDetect$Value merge(JsonAutoDetect$Value, JsonAutoDetect$Value)
- JsonAutoDetect$Value withIsGetterVisibility(JsonAutoDetect$Visibility)
- String toString()
- JsonAutoDetect$Value withFieldVisibility(JsonAutoDetect$Visibility)
- **static** JsonAutoDetect$Value from(JsonAutoDetect)
- JsonAutoDetect$Value withOverrides(JsonAutoDetect$Value)
- **static** JsonAutoDetect$Value noOverrides()
- JsonAutoDetect$Visibility getGetterVisibility()
- JsonAutoDetect$Value withSetterVisibility(JsonAutoDetect$Visibility)

### Class: com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonAutoDetect$Visibility valueOf(String)
- **static** JsonAutoDetect$Visibility[] values()
- boolean isVisible(Member)

### Class: com.fasterxml.jackson.annotation.JsonCreator$Mode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonCreator$Mode valueOf(String)
- **static** JsonCreator$Mode[] values()

### Class: com.fasterxml.jackson.annotation.JsonFormat$Feature
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonFormat$Feature valueOf(String)
- **static** JsonFormat$Feature[] values()

### Class: com.fasterxml.jackson.annotation.JsonFormat$Features
Type: Class

Methods:
- JsonFormat$Features with(JsonFormat$Feature[])
- int hashCode()
- boolean equals(Object)
- Boolean get(JsonFormat$Feature)
- String toString()
- JsonFormat$Features withOverrides(JsonFormat$Features)
- **static** JsonFormat$Features construct(JsonFormat)
- **static** JsonFormat$Features construct(JsonFormat$Feature[], JsonFormat$Feature[])
- JsonFormat$Features without(JsonFormat$Feature[])
- **static** JsonFormat$Features empty()

### Class: com.fasterxml.jackson.annotation.JsonFormat$Shape
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isNumeric()
- **static** JsonFormat$Shape valueOf(String)
- **static** JsonFormat$Shape[] values()
- boolean isStructured()

### Class: com.fasterxml.jackson.annotation.JsonFormat$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- JsonFormat$Value withLocale(Locale)
- **static** JsonFormat$Value forPattern(String)
- JsonFormat$Value withShape(JsonFormat$Shape)
- TimeZone getTimeZone()
- boolean isLenient()
- Boolean getLenient()
- JsonFormat$Shape getShape()
- JsonFormat$Value withLenient(Boolean)
- JsonFormat$Value withoutFeature(JsonFormat$Feature)
- **static** JsonFormat$Value forShape(JsonFormat$Shape)
- **static** JsonFormat$Value empty()
- boolean hasShape()
- **static** JsonFormat$Value mergeAll(JsonFormat$Value[])
- boolean hasLocale()
- int hashCode()
- boolean hasTimeZone()
- JsonFormat$Value withFeature(JsonFormat$Feature)
- JsonFormat$Value withPattern(String)
- **static** JsonFormat$Value merge(JsonFormat$Value, JsonFormat$Value)
- **static** JsonFormat$Value from(JsonFormat)
- boolean hasLenient()
- boolean hasPattern()
- String timeZoneAsString()
- Class valueFor()
- Boolean getFeature(JsonFormat$Feature)
- JsonFormat$Features getFeatures()
- boolean equals(Object)
- **static** JsonFormat$Value forLeniency(boolean)
- String toString()
- JsonFormat$Value withOverrides(JsonFormat$Value)
- String getPattern()
- Locale getLocale()
- JsonFormat$Value withTimeZone(TimeZone)

### Class: com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- **static** JsonIgnoreProperties$Value forIgnoreUnknown(boolean)
- **static** JsonIgnoreProperties$Value construct(Set, boolean, boolean, boolean, boolean)
- boolean getMerge()
- **static** JsonIgnoreProperties$Value empty()
- **static** JsonIgnoreProperties$Value mergeAll(JsonIgnoreProperties$Value[])
- **static** JsonIgnoreProperties$Value forIgnoredProperties(Set)
- **static** JsonIgnoreProperties$Value forIgnoredProperties(String[])
- int hashCode()
- JsonIgnoreProperties$Value withoutAllowSetters()
- **static** JsonIgnoreProperties$Value merge(JsonIgnoreProperties$Value, JsonIgnoreProperties$Value)
- JsonIgnoreProperties$Value withAllowGetters()
- **static** JsonIgnoreProperties$Value from(JsonIgnoreProperties)
- Set getIgnored()
- boolean getIgnoreUnknown()
- JsonIgnoreProperties$Value withIgnoreUnknown()
- boolean getAllowSetters()
- Class valueFor()
- boolean getAllowGetters()
- JsonIgnoreProperties$Value withMerge()
- JsonIgnoreProperties$Value withoutIgnoreUnknown()
- Set findIgnoredForDeserialization()
- Set findIgnoredForSerialization()
- boolean equals(Object)
- JsonIgnoreProperties$Value withAllowSetters()
- String toString()
- JsonIgnoreProperties$Value withoutIgnored()
- JsonIgnoreProperties$Value withIgnored(Set)
- JsonIgnoreProperties$Value withIgnored(String[])
- JsonIgnoreProperties$Value withOverrides(JsonIgnoreProperties$Value)
- JsonIgnoreProperties$Value withoutAllowGetters()
- JsonIgnoreProperties$Value withoutMerge()

### Class: com.fasterxml.jackson.annotation.JsonInclude$Include
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonInclude$Include valueOf(String)
- **static** JsonInclude$Include[] values()

### Class: com.fasterxml.jackson.annotation.JsonInclude$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- JsonInclude$Value withValueInclusion(JsonInclude$Include)
- Class getContentFilter()
- JsonInclude$Value withContentFilter(Class)
- JsonInclude$Include getValueInclusion()
- Class valueFor()
- JsonInclude$Include getContentInclusion()
- **static** JsonInclude$Value construct(JsonInclude$Include, JsonInclude$Include)
- **static** JsonInclude$Value construct(JsonInclude$Include, JsonInclude$Include, Class, Class)
- Class getValueFilter()
- **static** JsonInclude$Value empty()
- JsonInclude$Value withValueFilter(Class)
- **static** JsonInclude$Value mergeAll(JsonInclude$Value[])
- int hashCode()
- boolean equals(Object)
- **static** JsonInclude$Value merge(JsonInclude$Value, JsonInclude$Value)
- String toString()
- **static** JsonInclude$Value from(JsonInclude)
- JsonInclude$Value withOverrides(JsonInclude$Value)
- JsonInclude$Value withContentInclusion(JsonInclude$Include)

### Class: com.fasterxml.jackson.annotation.JsonIncludeProperties$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- **static** JsonIncludeProperties$Value all()
- int hashCode()
- boolean equals(Object)
- Set getIncluded()
- String toString()
- Class valueFor()
- **static** JsonIncludeProperties$Value from(JsonIncludeProperties)
- JsonIncludeProperties$Value withOverrides(JsonIncludeProperties$Value)

### Class: com.fasterxml.jackson.annotation.JsonProperty$Access
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonProperty$Access valueOf(String)
- **static** JsonProperty$Access[] values()

### Class: com.fasterxml.jackson.annotation.JsonSetter$Value
Type: Class
Implements: com.fasterxml.jackson.annotation.JacksonAnnotationValue, java.io.Serializable

Methods:
- **static** JsonSetter$Value forValueNulls(Nulls)
- **static** JsonSetter$Value forValueNulls(Nulls, Nulls)
- JsonSetter$Value withValueNulls(Nulls)
- JsonSetter$Value withValueNulls(Nulls, Nulls)
- Class valueFor()
- **static** JsonSetter$Value construct(Nulls, Nulls)
- Nulls getValueNulls()
- JsonSetter$Value withContentNulls(Nulls)
- **static** JsonSetter$Value empty()
- Nulls getContentNulls()
- Nulls nonDefaultValueNulls()
- int hashCode()
- boolean equals(Object)
- **static** JsonSetter$Value merge(JsonSetter$Value, JsonSetter$Value)
- Nulls nonDefaultContentNulls()
- String toString()
- **static** JsonSetter$Value from(JsonSetter)
- JsonSetter$Value withOverrides(JsonSetter$Value)
- **static** JsonSetter$Value forContentNulls(Nulls)

### Class: com.fasterxml.jackson.annotation.JsonTypeInfo$As
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonTypeInfo$As valueOf(String)
- **static** JsonTypeInfo$As[] values()

### Class: com.fasterxml.jackson.annotation.JsonTypeInfo$Id
Type: Enum
Extends: java.lang.Enum

Methods:
- String getDefaultPropertyName()
- **static** JsonTypeInfo$Id valueOf(String)
- **static** JsonTypeInfo$Id[] values()

### Class: com.fasterxml.jackson.annotation.JsonTypeInfo$None
Type: Abstract Class

No public methods found

### Class: com.fasterxml.jackson.annotation.Nulls
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Nulls valueOf(String)
- **static** Nulls[] values()

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerator
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- ObjectIdGenerator newForSerialization(Object)
- boolean isValidReferencePropertyName(String, Object)
- boolean maySerializeAsObject()
- boolean canUseFor(ObjectIdGenerator)
- Object generateId(Object)
- ObjectIdGenerator$IdKey key(Object)
- Class getScope()
- ObjectIdGenerator forScope(Class)

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey
Type: Class
Implements: java.io.Serializable

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerators
Type: Class

No public methods found

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator
Type: Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerators$Base

Methods:
- ObjectIdGenerator newForSerialization(Object)
- boolean canUseFor(ObjectIdGenerator)
- Integer generateId(Object)
- Object generateId(Object)
- ObjectIdGenerator$IdKey key(Object)
- ObjectIdGenerator forScope(Class)

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerators$None
Type: Abstract Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerator

No public methods found

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator
Type: Abstract Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerators$Base

Methods:
- boolean canUseFor(ObjectIdGenerator)

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator
Type: Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerators$Base

Methods:
- ObjectIdGenerator newForSerialization(Object)
- boolean canUseFor(ObjectIdGenerator)
- String generateId(Object)
- Object generateId(Object)
- ObjectIdGenerator$IdKey key(Object)
- ObjectIdGenerator forScope(Class)

### Class: com.fasterxml.jackson.annotation.ObjectIdGenerators$UUIDGenerator
Type: Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerators$Base

Methods:
- ObjectIdGenerator newForSerialization(Object)
- boolean canUseFor(ObjectIdGenerator)
- UUID generateId(Object)
- Object generateId(Object)
- ObjectIdGenerator$IdKey key(Object)
- ObjectIdGenerator forScope(Class)

### Class: com.fasterxml.jackson.annotation.OptBoolean
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** OptBoolean valueOf(String)
- **static** boolean equals(Boolean, Boolean)
- **static** OptBoolean[] values()
- **static** OptBoolean fromBoolean(Boolean)
- boolean asPrimitive()
- Boolean asBoolean()

### Class: com.fasterxml.jackson.annotation.PropertyAccessor
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean getterEnabled()
- **static** PropertyAccessor valueOf(String)
- **static** PropertyAccessor[] values()
- boolean creatorEnabled()
- boolean setterEnabled()
- boolean fieldEnabled()
- boolean isGetterEnabled()

### Class: com.fasterxml.jackson.annotation.SimpleObjectIdResolver
Type: Class
Implements: com.fasterxml.jackson.annotation.ObjectIdResolver

Methods:
- ObjectIdResolver newForDeserialization(Object)
- boolean canUseFor(ObjectIdResolver)
- Object resolveId(ObjectIdGenerator$IdKey)
- void bindItem(ObjectIdGenerator$IdKey, Object)

## Package: com.fasterxml.jackson.core

### Class: com.fasterxml.jackson.core.FormatFeature
Type: Interface
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int getMask()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.FormatSchema
Type: Interface

Methods:
- String getSchemaType()

### Class: com.fasterxml.jackson.core.PrettyPrinter
Type: Interface

Methods:
- void beforeObjectEntries(JsonGenerator) throws IOException
- void writeArrayValueSeparator(JsonGenerator) throws IOException
- void writeRootValueSeparator(JsonGenerator) throws IOException
- void writeObjectEntrySeparator(JsonGenerator) throws IOException
- void writeStartObject(JsonGenerator) throws IOException
- void writeEndArray(JsonGenerator, int) throws IOException
- void writeStartArray(JsonGenerator) throws IOException
- void writeObjectFieldValueSeparator(JsonGenerator) throws IOException
- void beforeArrayValues(JsonGenerator) throws IOException
- void writeEndObject(JsonGenerator, int) throws IOException

### Class: com.fasterxml.jackson.core.SerializableString
Type: Interface

Methods:
- int appendQuotedUTF8(byte[], int)
- String getValue()
- int appendUnquotedUTF8(byte[], int)
- int charLength()
- int putUnquotedUTF8(ByteBuffer) throws IOException
- int writeUnquotedUTF8(OutputStream) throws IOException
- int putQuotedUTF8(ByteBuffer) throws IOException
- int appendUnquoted(char[], int)
- byte[] asUnquotedUTF8()
- int writeQuotedUTF8(OutputStream) throws IOException
- byte[] asQuotedUTF8()
- char[] asQuotedChars()
- int appendQuoted(char[], int)

### Class: com.fasterxml.jackson.core.TreeNode
Type: Interface

Methods:
- boolean isContainerNode()
- JsonParser$NumberType numberType()
- boolean isObject()
- Iterator fieldNames()
- JsonToken asToken()
- JsonParser traverse()
- JsonParser traverse(ObjectCodec)
- TreeNode path(String)
- TreeNode path(int)
- TreeNode at(JsonPointer)
- TreeNode at(String) throws IllegalArgumentException
- boolean isMissingNode()
- int size()
- TreeNode get(String)
- TreeNode get(int)
- boolean isArray()
- boolean isValueNode()

### Class: com.fasterxml.jackson.core.Versioned
Type: Interface

Methods:
- Version version()

### Class: com.fasterxml.jackson.core.Base64Variant
Type: Class
Implements: java.io.Serializable

Methods:
- String encode(byte[])
- String encode(byte[], boolean)
- String encode(byte[], boolean, String)
- int encodeBase64Partial(int, int, char[], int)
- void encodeBase64Partial(StringBuilder, int, int)
- int encodeBase64Partial(int, int, byte[], int)
- String getName()
- Base64Variant withWritePadding(boolean)
- boolean usesPaddingChar(char)
- boolean usesPaddingChar(int)
- char getPaddingChar()
- byte[] decode(String) throws IllegalArgumentException
- void decode(String, ByteArrayBuilder) throws IllegalArgumentException
- Base64Variant withPaddingForbidden()
- Base64Variant withPaddingAllowed()
- boolean requiresPaddingOnRead()
- byte getPaddingByte()
- int hashCode()
- boolean acceptsPaddingOnRead()
- String missingPaddingMessage()
- int getMaxLineLength()
- Base64Variant$PaddingReadBehaviour paddingReadBehaviour()
- byte encodeBase64BitsAsByte(int)
- int decodeBase64Char(char)
- int decodeBase64Char(int)
- Base64Variant withPaddingRequired()
- int encodeBase64Chunk(int, char[], int)
- void encodeBase64Chunk(StringBuilder, int)
- int encodeBase64Chunk(int, byte[], int)
- Base64Variant withReadPadding(Base64Variant$PaddingReadBehaviour)
- char encodeBase64BitsAsChar(int)
- boolean usesPadding()
- boolean equals(Object)
- String toString()
- int decodeBase64Byte(byte)

### Class: com.fasterxml.jackson.core.Base64Variant$PaddingReadBehaviour
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Base64Variant$PaddingReadBehaviour valueOf(String)
- **static** Base64Variant$PaddingReadBehaviour[] values()

### Class: com.fasterxml.jackson.core.Base64Variants
Type: Class

Methods:
- **static** Base64Variant getDefaultVariant()
- **static** Base64Variant valueOf(String) throws IllegalArgumentException

### Class: com.fasterxml.jackson.core.JacksonException
Type: Abstract Class
Extends: java.io.IOException

Methods:
- Object getProcessor()
- JsonLocation getLocation()
- String getOriginalMessage()

### Class: com.fasterxml.jackson.core.JsonEncoding
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonEncoding valueOf(String)
- **static** JsonEncoding[] values()
- int bits()
- boolean isBigEndian()
- String getJavaName()

### Class: com.fasterxml.jackson.core.JsonFactory
Type: Class
Extends: com.fasterxml.jackson.core.TokenStreamFactory
Implements: com.fasterxml.jackson.core.Versioned, java.io.Serializable

Methods:
- int getFormatGeneratorFeatures()
- boolean canUseCharArrays()
- boolean requiresPropertyOrdering()
- JsonFactory setCodec(ObjectCodec)
- StreamReadConstraints streamReadConstraints()
- InputDecorator getInputDecorator()
- BufferRecycler _getBufferRecycler()
- boolean canParseAsync()
- JsonFactory setInputDecorator(InputDecorator)
- String getFormatName()
- String getRootValueSeparator()
- JsonParser createJsonParser(File) throws IOException, JsonParseException
- JsonParser createJsonParser(URL) throws IOException, JsonParseException
- JsonParser createJsonParser(InputStream) throws IOException, JsonParseException
- JsonParser createJsonParser(Reader) throws IOException, JsonParseException
- JsonParser createJsonParser(byte[]) throws IOException, JsonParseException
- JsonParser createJsonParser(byte[], int, int) throws IOException, JsonParseException
- JsonParser createJsonParser(String) throws IOException, JsonParseException
- Class getFormatWriteFeatureType()
- JsonFactory setCharacterEscapes(CharacterEscapes)
- JsonFactory enable(JsonFactory$Feature)
- JsonFactory enable(JsonParser$Feature)
- JsonFactory enable(JsonGenerator$Feature)
- JsonParser createNonBlockingByteBufferParser() throws IOException
- **static** TSFBuilder builder()
- JsonParser createParser(File) throws IOException, JsonParseException
- JsonParser createParser(URL) throws IOException, JsonParseException
- JsonParser createParser(InputStream) throws IOException, JsonParseException
- JsonParser createParser(Reader) throws IOException, JsonParseException
- JsonParser createParser(byte[]) throws IOException, JsonParseException
- JsonParser createParser(byte[], int, int) throws IOException, JsonParseException
- JsonParser createParser(String) throws IOException, JsonParseException
- JsonParser createParser(char[]) throws IOException
- JsonParser createParser(char[], int, int) throws IOException
- JsonParser createParser(DataInput) throws IOException
- JsonFactory copy()
- JsonFactory setRootValueSeparator(String)
- CharacterEscapes getCharacterEscapes()
- int getFormatParserFeatures()
- TSFBuilder rebuild()
- MatchStrength hasFormat(InputAccessor) throws IOException
- ObjectCodec getCodec()
- int getParserFeatures()
- JsonParser createNonBlockingByteArrayParser() throws IOException
- boolean requiresCustomCodec()
- JsonFactory configure(JsonFactory$Feature, boolean)
- JsonFactory configure(JsonParser$Feature, boolean)
- JsonFactory configure(JsonGenerator$Feature, boolean)
- JsonGenerator createJsonGenerator(OutputStream, JsonEncoding) throws IOException
- JsonGenerator createJsonGenerator(Writer) throws IOException
- JsonGenerator createJsonGenerator(OutputStream) throws IOException
- Version version()
- Class getFormatReadFeatureType()
- JsonFactory setOutputDecorator(OutputDecorator)
- JsonGenerator createGenerator(OutputStream, JsonEncoding) throws IOException
- JsonGenerator createGenerator(OutputStream) throws IOException
- JsonGenerator createGenerator(Writer) throws IOException
- JsonGenerator createGenerator(File, JsonEncoding) throws IOException
- JsonGenerator createGenerator(DataOutput, JsonEncoding) throws IOException
- JsonGenerator createGenerator(DataOutput) throws IOException
- boolean canHandleBinaryNatively()
- OutputDecorator getOutputDecorator()
- JsonFactory disable(JsonFactory$Feature)
- JsonFactory disable(JsonParser$Feature)
- JsonFactory disable(JsonGenerator$Feature)
- boolean isEnabled(JsonFactory$Feature)
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(StreamReadFeature)
- boolean isEnabled(JsonGenerator$Feature)
- boolean isEnabled(StreamWriteFeature)
- int getGeneratorFeatures()
- boolean canUseSchema(FormatSchema)

### Class: com.fasterxml.jackson.core.JsonFactory$Feature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int getMask()
- **static** JsonFactory$Feature valueOf(String)
- **static** JsonFactory$Feature[] values()
- boolean enabledByDefault()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.JsonFactoryBuilder
Type: Class
Extends: com.fasterxml.jackson.core.TSFBuilder

Methods:
- JsonFactoryBuilder quoteChar(char)
- char quoteChar()
- JsonFactoryBuilder characterEscapes(CharacterEscapes)
- CharacterEscapes characterEscapes()
- JsonFactory build()
- JsonFactoryBuilder highestNonEscapedChar(int)
- int highestNonEscapedChar()
- JsonFactoryBuilder disable(JsonReadFeature)
- JsonFactoryBuilder disable(JsonReadFeature, JsonReadFeature[])
- JsonFactoryBuilder disable(JsonWriteFeature)
- JsonFactoryBuilder disable(JsonWriteFeature, JsonWriteFeature[])
- TSFBuilder disable(JsonWriteFeature, JsonWriteFeature[])
- TSFBuilder disable(JsonWriteFeature)
- TSFBuilder disable(JsonReadFeature, JsonReadFeature[])
- TSFBuilder disable(JsonReadFeature)
- JsonFactoryBuilder enable(JsonReadFeature)
- JsonFactoryBuilder enable(JsonReadFeature, JsonReadFeature[])
- JsonFactoryBuilder enable(JsonWriteFeature)
- JsonFactoryBuilder enable(JsonWriteFeature, JsonWriteFeature[])
- TSFBuilder enable(JsonWriteFeature, JsonWriteFeature[])
- TSFBuilder enable(JsonWriteFeature)
- TSFBuilder enable(JsonReadFeature, JsonReadFeature[])
- TSFBuilder enable(JsonReadFeature)
- JsonFactoryBuilder rootValueSeparator(String)
- JsonFactoryBuilder rootValueSeparator(SerializableString)
- SerializableString rootValueSeparator()
- JsonFactoryBuilder configure(JsonReadFeature, boolean)
- JsonFactoryBuilder configure(JsonWriteFeature, boolean)
- TSFBuilder configure(JsonWriteFeature, boolean)
- TSFBuilder configure(JsonReadFeature, boolean)

### Class: com.fasterxml.jackson.core.JsonGenerationException
Type: Class
Extends: com.fasterxml.jackson.core.exc.StreamWriteException

Methods:
- JsonGenerator getProcessor()
- Object getProcessor()
- JsonGenerationException withGenerator(JsonGenerator)
- StreamWriteException withGenerator(JsonGenerator)

### Class: com.fasterxml.jackson.core.JsonGenerator
Type: Abstract Class
Implements: java.io.Closeable, java.io.Flushable, com.fasterxml.jackson.core.Versioned

Methods:
- JsonGenerator setFeatureMask(int)
- boolean canWriteObjectId()
- JsonGenerator setCodec(ObjectCodec)
- JsonGenerator setHighestNonEscapedChar(int)
- void setSchema(FormatSchema)
- JsonGenerator setPrettyPrinter(PrettyPrinter)
- void writeFieldId(long) throws IOException
- JacksonFeatureSet getWriteCapabilities()
- int getOutputBuffered()
- void writeTypeId(Object) throws IOException
- boolean canWriteTypeId()
- int getFeatureMask()
- JsonGenerator enable(JsonGenerator$Feature)
- Object getCurrentValue()
- void writeUTF8String(byte[], int, int) throws IOException
- void writeEndArray() throws IOException
- CharacterEscapes getCharacterEscapes()
- void writeObjectRef(Object) throws IOException
- ObjectCodec getCodec()
- void writeObject(Object) throws IOException
- void writeStartObject() throws IOException
- void writeStartObject(Object) throws IOException
- void writeStartObject(Object, int) throws IOException
- void writeBooleanField(String, boolean) throws IOException
- void writeEndObject() throws IOException
- WritableTypeId writeTypeSuffix(WritableTypeId) throws IOException
- void writeNull() throws IOException
- JsonGenerator overrideStdFeatures(int, int)
- Version version()
- void writeNullField(String) throws IOException
- void writeTree(TreeNode) throws IOException
- int getHighestEscapedChar()
- void writeObjectFieldStart(String) throws IOException
- boolean canOmitFields()
- boolean isEnabled(JsonGenerator$Feature)
- boolean isEnabled(StreamWriteFeature)
- void writeNumber(short) throws IOException
- void writeNumber(int) throws IOException
- void writeNumber(long) throws IOException
- void writeNumber(BigInteger) throws IOException
- void writeNumber(double) throws IOException
- void writeNumber(float) throws IOException
- void writeNumber(BigDecimal) throws IOException
- void writeNumber(String) throws IOException
- void writeNumber(char[], int, int) throws IOException
- PrettyPrinter getPrettyPrinter()
- void writeRaw(String) throws IOException
- void writeRaw(String, int, int) throws IOException
- void writeRaw(char[], int, int) throws IOException
- void writeRaw(char) throws IOException
- void writeRaw(SerializableString) throws IOException
- void setCurrentValue(Object)
- void writeNumberField(String, short) throws IOException
- void writeNumberField(String, int) throws IOException
- void writeNumberField(String, long) throws IOException
- void writeNumberField(String, BigInteger) throws IOException
- void writeNumberField(String, float) throws IOException
- void writeNumberField(String, double) throws IOException
- void writeNumberField(String, BigDecimal) throws IOException
- void writeBoolean(boolean) throws IOException
- Object getOutputTarget()
- void writeRawUTF8String(byte[], int, int) throws IOException
- void writeRawValue(String) throws IOException
- void writeRawValue(String, int, int) throws IOException
- void writeRawValue(char[], int, int) throws IOException
- void writeRawValue(SerializableString) throws IOException
- void writeFieldName(String) throws IOException
- void writeFieldName(SerializableString) throws IOException
- void writeObjectField(String, Object) throws IOException
- void writePOJO(Object) throws IOException
- void writeStartArray() throws IOException
- void writeStartArray(int) throws IOException
- void writeStartArray(Object) throws IOException
- void writeStartArray(Object, int) throws IOException
- void writeEmbeddedObject(Object) throws IOException
- void writeBinary(Base64Variant, byte[], int, int) throws IOException
- void writeBinary(byte[], int, int) throws IOException
- void writeBinary(byte[]) throws IOException
- int writeBinary(InputStream, int) throws IOException
- int writeBinary(Base64Variant, InputStream, int) throws IOException
- JsonGenerator useDefaultPrettyPrinter()
- void writeBinaryField(String, byte[]) throws IOException
- void writeOmittedField(String) throws IOException
- void flush() throws IOException
- void writeArray(int[], int, int) throws IOException
- void writeArray(long[], int, int) throws IOException
- void writeArray(double[], int, int) throws IOException
- void writeArray(String[], int, int) throws IOException
- int getFormatFeatures()
- WritableTypeId writeTypePrefix(WritableTypeId) throws IOException
- JsonGenerator setCharacterEscapes(CharacterEscapes)
- void writeArrayFieldStart(String) throws IOException
- boolean canWriteFormattedNumbers()
- void copyCurrentStructure(JsonParser) throws IOException
- JsonStreamContext getOutputContext()
- void copyCurrentEvent(JsonParser) throws IOException
- JsonGenerator setRootValueSeparator(SerializableString)
- void close() throws IOException
- void writeStringField(String, String) throws IOException
- void writePOJOField(String, Object) throws IOException
- JsonGenerator configure(JsonGenerator$Feature, boolean)
- void writeObjectId(Object) throws IOException
- FormatSchema getSchema()
- JsonGenerator overrideFormatFeatures(int, int)
- void assignCurrentValue(Object)
- boolean isClosed()
- JsonGenerator disable(JsonGenerator$Feature)
- boolean canWriteBinaryNatively()
- boolean canUseSchema(FormatSchema)
- void writeString(String) throws IOException
- void writeString(Reader, int) throws IOException
- void writeString(char[], int, int) throws IOException
- void writeString(SerializableString) throws IOException
- Object currentValue()

### Class: com.fasterxml.jackson.core.JsonGenerator$Feature
Type: Enum
Extends: java.lang.Enum

Methods:
- int getMask()
- **static** JsonGenerator$Feature valueOf(String)
- **static** JsonGenerator$Feature[] values()
- boolean enabledByDefault()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.JsonLocation
Type: Class
Implements: java.io.Serializable

Methods:
- long getByteOffset()
- int getColumnNr()
- int getLineNr()
- Object getSourceRef()
- StringBuilder appendOffsetDescription(StringBuilder)
- ContentReference contentReference()
- int hashCode()
- long getCharOffset()
- boolean equals(Object)
- String toString()
- String offsetDescription()
- String sourceDescription()

### Class: com.fasterxml.jackson.core.JsonParseException
Type: Class
Extends: com.fasterxml.jackson.core.exc.StreamReadException

Methods:
- JsonParser getProcessor()
- Object getProcessor()
- JsonParseException withParser(JsonParser)
- StreamReadException withParser(JsonParser)
- RequestPayload getRequestPayload()
- String getRequestPayloadAsString()
- String getMessage()
- JsonParseException withRequestPayload(RequestPayload)
- StreamReadException withRequestPayload(RequestPayload)

### Class: com.fasterxml.jackson.core.JsonParser
Type: Abstract Class
Implements: java.io.Closeable, com.fasterxml.jackson.core.Versioned

Methods:
- JsonParser setFeatureMask(int)
- int getValueAsInt() throws IOException
- int getValueAsInt(int) throws IOException
- int readBinaryValue(OutputStream) throws IOException
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- boolean isExpectedNumberIntToken()
- void clearCurrentToken()
- void setCodec(ObjectCodec)
- boolean isExpectedStartArrayToken()
- double getDoubleValue() throws IOException
- boolean isExpectedStartObjectToken()
- boolean hasTokenId(int)
- boolean isNaN() throws IOException
- Object getTypeId() throws IOException
- boolean canParseAsync()
- void setSchema(FormatSchema)
- Object getObjectId() throws IOException
- int getTextOffset() throws IOException
- int getCurrentTokenId()
- JsonToken getCurrentToken()
- int getFeatureMask()
- JsonParser enable(JsonParser$Feature)
- Object getCurrentValue()
- long getLongValue() throws IOException
- Iterator readValuesAs(Class) throws IOException
- Iterator readValuesAs(TypeReference) throws IOException
- Object getNumberValueDeferred() throws IOException
- boolean getBooleanValue() throws IOException
- BigInteger getBigIntegerValue() throws IOException
- JsonLocation getCurrentLocation()
- Object getInputSource()
- byte[] getBinaryValue(Base64Variant) throws IOException
- byte[] getBinaryValue() throws IOException
- void finishToken() throws IOException
- boolean getValueAsBoolean() throws IOException
- boolean getValueAsBoolean(boolean) throws IOException
- boolean canReadTypeId()
- JsonToken getLastClearedToken()
- ObjectCodec getCodec()
- TreeNode readValueAsTree() throws IOException
- String getText() throws IOException
- int getText(Writer) throws IOException, UnsupportedOperationException
- JsonParser skipChildren() throws IOException
- int nextIntValue(int) throws IOException
- boolean requiresCustomCodec()
- JsonParser overrideStdFeatures(int, int)
- Version version()
- Number getNumberValueExact() throws IOException
- int getTextLength() throws IOException
- Object readValueAs(Class) throws IOException
- Object readValueAs(TypeReference) throws IOException
- JsonToken nextToken() throws IOException
- byte getByteValue() throws IOException
- int currentTokenId()
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(StreamReadFeature)
- boolean hasToken(JsonToken)
- Number getNumberValue() throws IOException
- JsonToken nextValue() throws IOException
- void setCurrentValue(Object)
- boolean canReadObjectId()
- boolean nextFieldName(SerializableString) throws IOException
- String nextFieldName() throws IOException
- int getIntValue() throws IOException
- String getCurrentName() throws IOException
- long nextLongValue(long) throws IOException
- StreamReadConstraints streamReadConstraints()
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- BigDecimal getDecimalValue() throws IOException
- Boolean nextBooleanValue() throws IOException
- char[] getTextCharacters() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getFormatFeatures()
- short getShortValue() throws IOException
- int releaseBuffered(OutputStream) throws IOException
- int releaseBuffered(Writer) throws IOException
- void setRequestPayloadOnError(RequestPayload)
- void setRequestPayloadOnError(byte[], String)
- void setRequestPayloadOnError(String)
- void close() throws IOException
- JsonLocation currentTokenLocation()
- String nextTextValue() throws IOException
- NonBlockingInputFeeder getNonBlockingInputFeeder()
- double getValueAsDouble() throws IOException
- double getValueAsDouble(double) throws IOException
- Object getEmbeddedObject() throws IOException
- JsonParser configure(JsonParser$Feature, boolean)
- JsonLocation currentLocation()
- FormatSchema getSchema()
- JsonToken currentToken()
- boolean hasTextCharacters()
- JsonParser overrideFormatFeatures(int, int)
- void assignCurrentValue(Object)
- boolean isClosed()
- float getFloatValue() throws IOException
- JsonParser disable(JsonParser$Feature)
- String currentName() throws IOException
- JsonStreamContext getParsingContext()
- JsonParser$NumberType getNumberType() throws IOException
- boolean canUseSchema(FormatSchema)
- void overrideCurrentName(String)
- boolean hasCurrentToken()
- Object currentValue()
- long getValueAsLong() throws IOException
- long getValueAsLong(long) throws IOException
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.JsonParser$Feature
Type: Enum
Extends: java.lang.Enum

Methods:
- int getMask()
- **static** JsonParser$Feature valueOf(String)
- **static** JsonParser$Feature[] values()
- boolean enabledByDefault()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.JsonParser$NumberType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonParser$NumberType valueOf(String)
- **static** JsonParser$NumberType[] values()

### Class: com.fasterxml.jackson.core.JsonPointer
Type: Class
Implements: java.io.Serializable

Methods:
- JsonPointer appendIndex(int)
- JsonPointer last()
- JsonPointer tail()
- **static** JsonPointer valueOf(String)
- boolean matchesProperty(String)
- JsonPointer matchElement(int)
- int length()
- JsonPointer matchProperty(String)
- int getMatchingIndex()
- boolean matches()
- JsonPointer appendProperty(String)
- **static** JsonPointer empty()
- JsonPointer head()
- boolean mayMatchElement()
- String getMatchingProperty()
- **static** JsonPointer compile(String) throws IllegalArgumentException
- boolean matchesElement(int)
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean mayMatchProperty()
- JsonPointer append(JsonPointer)
- **static** JsonPointer forPath(JsonStreamContext, boolean)

### Class: com.fasterxml.jackson.core.JsonProcessingException
Type: Class
Extends: com.fasterxml.jackson.core.JacksonException

Methods:
- Object getProcessor()
- JsonLocation getLocation()
- String getMessage()
- String toString()
- String getOriginalMessage()
- void clearLocation()

### Class: com.fasterxml.jackson.core.JsonStreamContext
Type: Abstract Class

Methods:
- JsonLocation getStartLocation(Object)
- String getTypeDesc()
- JsonStreamContext getParent()
- boolean hasCurrentName()
- String typeDesc()
- boolean hasPathSegment()
- boolean inRoot()
- String getCurrentName()
- int getCurrentIndex()
- boolean inObject()
- int getNestingDepth()
- JsonLocation startLocation(ContentReference)
- Object getCurrentValue()
- boolean inArray()
- String toString()
- void setCurrentValue(Object)
- boolean hasCurrentIndex()
- int getEntryCount()
- JsonPointer pathAsPointer()
- JsonPointer pathAsPointer(boolean)

### Class: com.fasterxml.jackson.core.JsonToken
Type: Enum
Extends: java.lang.Enum

Methods:
- byte[] asByteArray()
- boolean isBoolean()
- boolean isStructEnd()
- boolean isNumeric()
- char[] asCharArray()
- **static** JsonToken valueOf(String)
- **static** JsonToken[] values()
- boolean isScalarValue()
- String asString()
- int id()
- boolean isStructStart()

### Class: com.fasterxml.jackson.core.ObjectCodec
Type: Abstract Class
Extends: com.fasterxml.jackson.core.TreeCodec
Implements: com.fasterxml.jackson.core.Versioned

Methods:
- void writeTree(JsonGenerator, TreeNode) throws IOException
- Object readValue(JsonParser, Class) throws IOException
- Object readValue(JsonParser, TypeReference) throws IOException
- Object readValue(JsonParser, ResolvedType) throws IOException
- Object treeToValue(TreeNode, Class) throws JsonProcessingException
- JsonParser treeAsTokens(TreeNode)
- TreeNode createArrayNode()
- Iterator readValues(JsonParser, Class) throws IOException
- Iterator readValues(JsonParser, TypeReference) throws IOException
- Iterator readValues(JsonParser, ResolvedType) throws IOException
- JsonFactory getJsonFactory()
- JsonFactory getFactory()
- void writeValue(JsonGenerator, Object) throws IOException
- Version version()
- TreeNode createObjectNode()
- TreeNode readTree(JsonParser) throws IOException

### Class: com.fasterxml.jackson.core.StreamReadCapability
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int getMask()
- **static** StreamReadCapability valueOf(String)
- **static** StreamReadCapability[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.StreamReadConstraints
Type: Class
Implements: java.io.Serializable

Methods:
- int getMaxNestingDepth()
- StreamReadConstraints$Builder rebuild()
- void validateIntegerLength(int) throws StreamConstraintsException
- **static** StreamReadConstraints defaults()
- **static** StreamReadConstraints$Builder builder()
- void validateNestingDepth(int) throws StreamConstraintsException
- int getMaxStringLength()
- int getMaxNumberLength()
- void validateStringLength(int) throws StreamConstraintsException
- void validateFPLength(int) throws StreamConstraintsException

### Class: com.fasterxml.jackson.core.StreamReadConstraints$Builder
Type: Class

Methods:
- StreamReadConstraints build()
- StreamReadConstraints$Builder maxNestingDepth(int)
- StreamReadConstraints$Builder maxStringLength(int)
- StreamReadConstraints$Builder maxNumberLength(int)

### Class: com.fasterxml.jackson.core.StreamReadFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int getMask()
- **static** StreamReadFeature valueOf(String)
- **static** StreamReadFeature[] values()
- boolean enabledByDefault()
- JsonParser$Feature mappedFeature()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.StreamWriteCapability
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int getMask()
- **static** StreamWriteCapability valueOf(String)
- **static** StreamWriteCapability[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.StreamWriteFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int getMask()
- **static** StreamWriteFeature valueOf(String)
- **static** StreamWriteFeature[] values()
- boolean enabledByDefault()
- JsonGenerator$Feature mappedFeature()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.TSFBuilder
Type: Abstract Class

Methods:
- int streamReadFeatures()
- InputDecorator inputDecorator()
- TSFBuilder inputDecorator(InputDecorator)
- JsonFactory build()
- OutputDecorator outputDecorator()
- TSFBuilder outputDecorator(OutputDecorator)
- TSFBuilder disable(JsonFactory$Feature)
- TSFBuilder disable(StreamReadFeature)
- TSFBuilder disable(StreamReadFeature, StreamReadFeature[])
- TSFBuilder disable(StreamWriteFeature)
- TSFBuilder disable(StreamWriteFeature, StreamWriteFeature[])
- TSFBuilder disable(JsonReadFeature)
- TSFBuilder disable(JsonReadFeature, JsonReadFeature[])
- TSFBuilder disable(JsonWriteFeature)
- TSFBuilder disable(JsonWriteFeature, JsonWriteFeature[])
- TSFBuilder enable(JsonFactory$Feature)
- TSFBuilder enable(StreamReadFeature)
- TSFBuilder enable(StreamReadFeature, StreamReadFeature[])
- TSFBuilder enable(StreamWriteFeature)
- TSFBuilder enable(StreamWriteFeature, StreamWriteFeature[])
- TSFBuilder enable(JsonReadFeature)
- TSFBuilder enable(JsonReadFeature, JsonReadFeature[])
- TSFBuilder enable(JsonWriteFeature)
- TSFBuilder enable(JsonWriteFeature, JsonWriteFeature[])
- TSFBuilder streamReadConstraints(StreamReadConstraints)
- int streamWriteFeatures()
- TSFBuilder configure(JsonFactory$Feature, boolean)
- TSFBuilder configure(StreamReadFeature, boolean)
- TSFBuilder configure(StreamWriteFeature, boolean)
- TSFBuilder configure(JsonReadFeature, boolean)
- TSFBuilder configure(JsonWriteFeature, boolean)
- int factoryFeaturesMask()

### Class: com.fasterxml.jackson.core.TokenStreamFactory
Type: Abstract Class
Implements: com.fasterxml.jackson.core.Versioned, java.io.Serializable

Methods:
- int getFormatParserFeatures()
- int getFormatGeneratorFeatures()
- int getParserFeatures()
- boolean requiresPropertyOrdering()
- JsonParser createNonBlockingByteArrayParser() throws IOException
- StreamReadConstraints streamReadConstraints()
- Class getFormatReadFeatureType()
- boolean canParseAsync()
- JsonGenerator createGenerator(DataOutput, JsonEncoding) throws IOException
- JsonGenerator createGenerator(DataOutput) throws IOException
- JsonGenerator createGenerator(File, JsonEncoding) throws IOException
- JsonGenerator createGenerator(OutputStream) throws IOException
- JsonGenerator createGenerator(OutputStream, JsonEncoding) throws IOException
- JsonGenerator createGenerator(Writer) throws IOException
- String getFormatName()
- boolean canHandleBinaryNatively()
- Class getFormatWriteFeatureType()
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(JsonGenerator$Feature)
- JsonParser createNonBlockingByteBufferParser() throws IOException
- int getGeneratorFeatures()
- JsonParser createParser(byte[]) throws IOException
- JsonParser createParser(byte[], int, int) throws IOException
- JsonParser createParser(char[]) throws IOException
- JsonParser createParser(char[], int, int) throws IOException
- JsonParser createParser(DataInput) throws IOException
- JsonParser createParser(File) throws IOException
- JsonParser createParser(InputStream) throws IOException
- JsonParser createParser(Reader) throws IOException
- JsonParser createParser(String) throws IOException
- JsonParser createParser(URL) throws IOException
- boolean canUseSchema(FormatSchema)

### Class: com.fasterxml.jackson.core.TreeCodec
Type: Abstract Class

Methods:
- TreeNode missingNode()
- void writeTree(JsonGenerator, TreeNode) throws IOException, JsonProcessingException
- JsonParser treeAsTokens(TreeNode)
- TreeNode createArrayNode()
- TreeNode nullNode()
- TreeNode createObjectNode()
- TreeNode readTree(JsonParser) throws IOException, JsonProcessingException

### Class: com.fasterxml.jackson.core.Version
Type: Class
Implements: java.lang.Comparable, java.io.Serializable

Methods:
- String toFullString()
- int getMinorVersion()
- boolean isUnknownVersion()
- int getPatchLevel()
- int compareTo(Version)
- int compareTo(Object)
- **static** Version unknownVersion()
- String getGroupId()
- int getMajorVersion()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getArtifactId()
- boolean isUknownVersion()
- boolean isSnapshot()

## Package: com.fasterxml.jackson.core.async

### Class: com.fasterxml.jackson.core.async.ByteArrayFeeder
Type: Interface
Implements: com.fasterxml.jackson.core.async.NonBlockingInputFeeder

Methods:
- void feedInput(byte[], int, int) throws IOException

### Class: com.fasterxml.jackson.core.async.ByteBufferFeeder
Type: Interface
Implements: com.fasterxml.jackson.core.async.NonBlockingInputFeeder

Methods:
- void feedInput(ByteBuffer) throws IOException

### Class: com.fasterxml.jackson.core.async.NonBlockingInputFeeder
Type: Interface

Methods:
- void endOfInput()
- boolean needMoreInput()

## Package: com.fasterxml.jackson.core.base

### Class: com.fasterxml.jackson.core.base.GeneratorBase
Type: Abstract Class
Extends: com.fasterxml.jackson.core.JsonGenerator

Methods:
- JsonGenerator setFeatureMask(int)
- ObjectCodec getCodec()
- void writeObject(Object) throws IOException
- JsonGenerator setCodec(ObjectCodec)
- void writeRawValue(String) throws IOException
- void writeRawValue(String, int, int) throws IOException
- void writeRawValue(char[], int, int) throws IOException
- void writeRawValue(SerializableString) throws IOException
- void writeFieldName(SerializableString) throws IOException
- void writeStartObject(Object) throws IOException
- int writeBinary(Base64Variant, InputStream, int) throws IOException
- JsonGenerator overrideStdFeatures(int, int)
- Version version()
- void writeTree(TreeNode) throws IOException
- JsonGenerator useDefaultPrettyPrinter()
- boolean isClosed()
- void flush() throws IOException
- JsonGenerator disable(JsonGenerator$Feature)
- JsonGenerator enable(JsonGenerator$Feature)
- int getFeatureMask()
- Object getCurrentValue()
- boolean isEnabled(JsonGenerator$Feature)
- JsonStreamContext getOutputContext()
- void setCurrentValue(Object)
- void close() throws IOException
- void writeString(SerializableString) throws IOException

### Class: com.fasterxml.jackson.core.base.ParserBase
Type: Abstract Class
Extends: com.fasterxml.jackson.core.base.ParserMinimalBase

Methods:
- JsonParser setFeatureMask(int)
- ByteArrayBuilder _getByteArrayBuilder()
- int getIntValue() throws IOException
- String getCurrentName() throws IOException
- double getDoubleValue() throws IOException
- StreamReadConstraints streamReadConstraints()
- boolean isNaN() throws IOException
- BigDecimal getDecimalValue() throws IOException
- JsonParser enable(JsonParser$Feature)
- Object getCurrentValue()
- long getLongValue() throws IOException
- Object getNumberValueDeferred() throws IOException
- BigInteger getBigIntegerValue() throws IOException
- JsonLocation getCurrentLocation()
- byte[] getBinaryValue(Base64Variant) throws IOException
- void close() throws IOException
- int getTokenLineNr()
- long getTokenCharacterOffset()
- JsonParser overrideStdFeatures(int, int)
- Version version()
- Number getNumberValueExact() throws IOException
- int getTokenColumnNr()
- boolean hasTextCharacters()
- boolean isClosed()
- float getFloatValue() throws IOException
- JsonParser disable(JsonParser$Feature)
- JsonReadContext getParsingContext()
- JsonStreamContext getParsingContext()
- JsonParser$NumberType getNumberType() throws IOException
- Number getNumberValue() throws IOException
- void setCurrentValue(Object)
- void overrideCurrentName(String)
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.base.ParserMinimalBase
Type: Abstract Class
Extends: com.fasterxml.jackson.core.JsonParser

Methods:
- int getValueAsInt() throws IOException
- int getValueAsInt(int) throws IOException
- boolean isExpectedNumberIntToken()
- void clearCurrentToken()
- String getCurrentName() throws IOException
- boolean isExpectedStartArrayToken()
- boolean isExpectedStartObjectToken()
- boolean hasTokenId(int)
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- char[] getTextCharacters() throws IOException
- int getTextOffset() throws IOException
- int getCurrentTokenId()
- JsonToken getCurrentToken()
- byte[] getBinaryValue(Base64Variant) throws IOException
- void close() throws IOException
- boolean getValueAsBoolean(boolean) throws IOException
- JsonToken getLastClearedToken()
- String getText() throws IOException
- JsonParser skipChildren() throws IOException
- double getValueAsDouble(double) throws IOException
- JsonToken currentToken()
- boolean hasTextCharacters()
- int getTextLength() throws IOException
- boolean isClosed()
- JsonToken nextToken() throws IOException
- int currentTokenId()
- JsonStreamContext getParsingContext()
- boolean hasToken(JsonToken)
- JsonToken nextValue() throws IOException
- void overrideCurrentName(String)
- boolean hasCurrentToken()
- long getValueAsLong() throws IOException
- long getValueAsLong(long) throws IOException

## Package: com.fasterxml.jackson.core.exc

### Class: com.fasterxml.jackson.core.exc.InputCoercionException
Type: Class
Extends: com.fasterxml.jackson.core.exc.StreamReadException

Methods:
- Class getTargetType()
- InputCoercionException withParser(JsonParser)
- StreamReadException withParser(JsonParser)
- JsonToken getInputType()
- InputCoercionException withRequestPayload(RequestPayload)
- StreamReadException withRequestPayload(RequestPayload)

### Class: com.fasterxml.jackson.core.exc.StreamConstraintsException
Type: Class
Extends: com.fasterxml.jackson.core.JsonProcessingException

No public methods found

### Class: com.fasterxml.jackson.core.exc.StreamReadException
Type: Abstract Class
Extends: com.fasterxml.jackson.core.JsonProcessingException

Methods:
- JsonParser getProcessor()
- Object getProcessor()
- StreamReadException withParser(JsonParser)
- RequestPayload getRequestPayload()
- String getRequestPayloadAsString()
- String getMessage()
- StreamReadException withRequestPayload(RequestPayload)

### Class: com.fasterxml.jackson.core.exc.StreamWriteException
Type: Abstract Class
Extends: com.fasterxml.jackson.core.JsonProcessingException

Methods:
- JsonGenerator getProcessor()
- Object getProcessor()
- StreamWriteException withGenerator(JsonGenerator)

## Package: com.fasterxml.jackson.core.filter

### Class: com.fasterxml.jackson.core.filter.FilteringParserDelegate
Type: Class
Extends: com.fasterxml.jackson.core.util.JsonParserDelegate

Methods:
- int getValueAsInt() throws IOException
- int getValueAsInt(int) throws IOException
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- void clearCurrentToken()
- int getIntValue() throws IOException
- String getCurrentName() throws IOException
- boolean isExpectedStartArrayToken()
- double getDoubleValue() throws IOException
- boolean isExpectedStartObjectToken()
- boolean hasTokenId(int)
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- BigDecimal getDecimalValue() throws IOException
- char[] getTextCharacters() throws IOException
- int getTextOffset() throws IOException
- int getCurrentTokenId()
- JsonToken getCurrentToken()
- long getLongValue() throws IOException
- boolean getBooleanValue() throws IOException
- BigInteger getBigIntegerValue() throws IOException
- short getShortValue() throws IOException
- JsonLocation getCurrentLocation()
- byte[] getBinaryValue(Base64Variant) throws IOException
- boolean getValueAsBoolean() throws IOException
- boolean getValueAsBoolean(boolean) throws IOException
- int getMatchCount()
- JsonToken getLastClearedToken()
- String getText() throws IOException
- JsonParser skipChildren() throws IOException
- Object getEmbeddedObject() throws IOException
- double getValueAsDouble() throws IOException
- double getValueAsDouble(double) throws IOException
- JsonToken currentToken()
- TokenFilter getFilter()
- boolean hasTextCharacters()
- int getTextLength() throws IOException
- float getFloatValue() throws IOException
- JsonToken nextToken() throws IOException
- byte getByteValue() throws IOException
- String currentName() throws IOException
- int currentTokenId()
- JsonStreamContext getParsingContext()
- boolean hasToken(JsonToken)
- JsonParser$NumberType getNumberType() throws IOException
- Number getNumberValue() throws IOException
- JsonToken nextValue() throws IOException
- void overrideCurrentName(String)
- boolean hasCurrentToken()
- JsonLocation getTokenLocation()
- long getValueAsLong() throws IOException
- long getValueAsLong(long) throws IOException

### Class: com.fasterxml.jackson.core.filter.JsonPointerBasedFilter
Type: Class
Extends: com.fasterxml.jackson.core.filter.TokenFilter

Methods:
- TokenFilter filterStartObject()
- TokenFilter includeElement(int)
- String toString()
- TokenFilter includeProperty(String)
- TokenFilter filterStartArray()

### Class: com.fasterxml.jackson.core.filter.TokenFilter
Type: Class

Methods:
- TokenFilter includeRootValue(int)
- boolean includeRawValue()
- boolean includeEmbeddedValue(Object)
- boolean includeBinary()
- TokenFilter includeElement(int)
- boolean includeBoolean(boolean)
- boolean includeValue(JsonParser) throws IOException
- boolean includeEmptyObject(boolean)
- boolean includeNull()
- TokenFilter filterStartArray()
- TokenFilter filterStartObject()
- boolean includeString(String)
- boolean includeString(Reader, int)
- void filterFinishArray()
- String toString()
- boolean includeEmptyArray(boolean)
- void filterFinishObject()
- TokenFilter includeProperty(String)
- boolean includeNumber(int)
- boolean includeNumber(long)
- boolean includeNumber(float)
- boolean includeNumber(double)
- boolean includeNumber(BigDecimal)
- boolean includeNumber(BigInteger)

### Class: com.fasterxml.jackson.core.filter.TokenFilter$Inclusion
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TokenFilter$Inclusion valueOf(String)
- **static** TokenFilter$Inclusion[] values()

### Class: com.fasterxml.jackson.core.filter.TokenFilterContext
Type: Class
Extends: com.fasterxml.jackson.core.JsonStreamContext

Methods:
- boolean isStartHandled()
- TokenFilterContext getParent()
- JsonStreamContext getParent()
- boolean hasCurrentName()
- void skipParentChecks()
- **static** TokenFilterContext createRootContext(TokenFilter)
- TokenFilter setFieldName(String) throws JsonProcessingException
- String getCurrentName()
- void ensureFieldNameWritten(JsonGenerator) throws IOException
- TokenFilterContext createChildArrayContext(TokenFilter, boolean)
- TokenFilterContext createChildObjectContext(TokenFilter, boolean)
- TokenFilterContext closeObject(JsonGenerator) throws IOException
- void writePath(JsonGenerator) throws IOException
- TokenFilter getFilter()
- TokenFilterContext findChildOf(TokenFilterContext)
- Object getCurrentValue()
- TokenFilterContext closeArray(JsonGenerator) throws IOException
- String toString()
- JsonToken nextTokenToRead()
- TokenFilter checkValue(TokenFilter)
- void setCurrentValue(Object)

## Package: com.fasterxml.jackson.core.format

### Class: com.fasterxml.jackson.core.format.InputAccessor
Type: Interface

Methods:
- byte nextByte() throws IOException
- void reset()
- boolean hasMoreBytes() throws IOException

### Class: com.fasterxml.jackson.core.format.DataFormatMatcher
Type: Class

Methods:
- String getMatchedFormatName()
- JsonFactory getMatch()
- boolean hasMatch()
- JsonParser createParserWithMatch() throws IOException
- InputStream getDataStream()
- MatchStrength getMatchStrength()

### Class: com.fasterxml.jackson.core.format.InputAccessor$Std
Type: Class
Implements: com.fasterxml.jackson.core.format.InputAccessor

Methods:
- DataFormatMatcher createMatcher(JsonFactory, MatchStrength)
- byte nextByte() throws IOException
- void reset()
- boolean hasMoreBytes() throws IOException

### Class: com.fasterxml.jackson.core.format.MatchStrength
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** MatchStrength valueOf(String)
- **static** MatchStrength[] values()

## Package: com.fasterxml.jackson.core.io

### Class: com.fasterxml.jackson.core.io.BigDecimalParser
Type: Class

Methods:
- **static** BigDecimal parseWithFastParser(String)
- **static** BigDecimal parseWithFastParser(char[], int, int)
- **static** BigDecimal parse(String)
- **static** BigDecimal parse(char[], int, int)
- **static** BigDecimal parse(char[])

### Class: com.fasterxml.jackson.core.io.BigIntegerParser
Type: Class

Methods:
- **static** BigInteger parseWithFastParser(String)
- **static** BigInteger parseWithFastParser(String, int)

### Class: com.fasterxml.jackson.core.io.CharTypes
Type: Class

Methods:
- **static** int[] get7BitOutputEscapes()
- **static** int[] get7BitOutputEscapes(int)
- **static** int[] getInputCodeUtf8()
- **static** int[] getInputCodeLatin1()
- **static** char[] copyHexChars()
- **static** char[] copyHexChars(boolean)
- **static** int[] getInputCodeUtf8JsNames()
- **static** int charToHex(int)
- **static** int[] getInputCodeWS()
- **static** byte[] copyHexBytes()
- **static** byte[] copyHexBytes(boolean)
- **static** int[] getInputCodeLatin1JsNames()
- **static** char hexToChar(int)
- **static** int[] getInputCodeComment()
- **static** void appendQuoted(StringBuilder, String)

### Class: com.fasterxml.jackson.core.io.CharacterEscapes
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- SerializableString getEscapeSequence(int)
- **static** int[] standardAsciiEscapesForJSON()
- int[] getEscapeCodesForAscii()

### Class: com.fasterxml.jackson.core.io.ContentReference
Type: Class
Implements: java.io.Serializable

Methods:
- int contentOffset()
- boolean hasTextualContent()
- StringBuilder appendSourceDescription(StringBuilder)
- String buildSourceDescription()
- int hashCode()
- boolean equals(Object)
- **static** ContentReference rawReference(boolean, Object)
- **static** ContentReference rawReference(Object)
- Object getRawContent()
- int contentLength()
- **static** ContentReference construct(boolean, Object)
- **static** ContentReference construct(boolean, Object, int, int)
- **static** ContentReference unknown()

### Class: com.fasterxml.jackson.core.io.DataOutputAsStream
Type: Class
Extends: java.io.OutputStream

Methods:
- void write(int) throws IOException
- void write(byte[]) throws IOException
- void write(byte[], int, int) throws IOException

### Class: com.fasterxml.jackson.core.io.IOContext
Type: Class

Methods:
- boolean isResourceManaged()
- void releaseTokenBuffer(char[])
- void setEncoding(JsonEncoding)
- void releaseBase64Buffer(byte[])
- byte[] allocBase64Buffer()
- byte[] allocBase64Buffer(int)
- Object getSourceReference()
- char[] allocConcatBuffer()
- StreamReadConstraints streamReadConstraints()
- void releaseNameCopyBuffer(char[])
- TextBuffer constructTextBuffer()
- void releaseReadIOBuffer(byte[])
- char[] allocTokenBuffer()
- char[] allocTokenBuffer(int)
- TextBuffer constructReadConstrainedTextBuffer()
- JsonEncoding getEncoding()
- byte[] allocReadIOBuffer()
- byte[] allocReadIOBuffer(int)
- ContentReference contentReference()
- void releaseConcatBuffer(char[])
- IOContext withEncoding(JsonEncoding)
- char[] allocNameCopyBuffer(int)
- byte[] allocWriteEncodingBuffer()
- byte[] allocWriteEncodingBuffer(int)
- void releaseWriteEncodingBuffer(byte[])

### Class: com.fasterxml.jackson.core.io.InputDecorator
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- InputStream decorate(IOContext, InputStream) throws IOException
- InputStream decorate(IOContext, byte[], int, int) throws IOException
- DataInput decorate(IOContext, DataInput) throws IOException
- Reader decorate(IOContext, Reader) throws IOException

### Class: com.fasterxml.jackson.core.io.JsonEOFException
Type: Class
Extends: com.fasterxml.jackson.core.JsonParseException

Methods:
- JsonToken getTokenBeingDecoded()

### Class: com.fasterxml.jackson.core.io.JsonStringEncoder
Type: Class

Methods:
- char[] quoteAsString(String)
- char[] quoteAsString(CharSequence)
- void quoteAsString(CharSequence, StringBuilder)
- byte[] encodeAsUTF8(String)
- byte[] encodeAsUTF8(CharSequence)
- byte[] quoteAsUTF8(String)
- **static** JsonStringEncoder getInstance()

### Class: com.fasterxml.jackson.core.io.MergedStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[]) throws IOException
- int read(byte[], int, int) throws IOException
- boolean markSupported()
- int available() throws IOException
- void reset() throws IOException
- long skip(long) throws IOException
- void close() throws IOException
- void mark(int)

### Class: com.fasterxml.jackson.core.io.NumberInput
Type: Class

Methods:
- **static** double parseDouble(String) throws NumberFormatException
- **static** double parseDouble(String, boolean) throws NumberFormatException
- **static** int parseInt(char[], int, int)
- **static** int parseInt(String)
- **static** BigInteger parseBigInteger(String) throws NumberFormatException
- **static** BigInteger parseBigInteger(String, boolean) throws NumberFormatException
- **static** float parseFloat(String) throws NumberFormatException
- **static** float parseFloat(String, boolean) throws NumberFormatException
- **static** long parseLong(char[], int, int)
- **static** long parseLong(String)
- **static** BigInteger parseBigIntegerWithRadix(String, int, boolean) throws NumberFormatException
- **static** long parseAsLong(String, long)
- **static** double parseAsDouble(String, double)
- **static** double parseAsDouble(String, double, boolean)
- **static** BigDecimal parseBigDecimal(String) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(String, boolean) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(char[], int, int) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(char[], int, int, boolean) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(char[]) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(char[], boolean) throws NumberFormatException
- **static** boolean inLongRange(char[], int, int, boolean)
- **static** boolean inLongRange(String, boolean)
- **static** int parseAsInt(String, int)
- **static** long parseLong19(char[], int, boolean)

### Class: com.fasterxml.jackson.core.io.NumberOutput
Type: Class

Methods:
- **static** int outputLong(long, char[], int)
- **static** int outputLong(long, byte[], int)
- **static** int outputInt(int, char[], int)
- **static** int outputInt(int, byte[], int)
- **static** boolean notFinite(double)
- **static** boolean notFinite(float)
- **static** String toString(int)
- **static** String toString(long)
- **static** String toString(double)
- **static** String toString(double, boolean)
- **static** String toString(float)
- **static** String toString(float, boolean)

### Class: com.fasterxml.jackson.core.io.OutputDecorator
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- OutputStream decorate(IOContext, OutputStream) throws IOException
- Writer decorate(IOContext, Writer) throws IOException

### Class: com.fasterxml.jackson.core.io.SegmentedStringWriter
Type: Class
Extends: java.io.Writer

Methods:
- void flush()
- String getAndClear() throws IOException
- void write(char[]) throws IOException
- void write(char[], int, int) throws IOException
- void write(int) throws IOException
- void write(String) throws IOException
- void write(String, int, int) throws IOException
- void close()
- Writer append(char) throws IOException
- Writer append(CharSequence) throws IOException
- Writer append(CharSequence, int, int) throws IOException
- Appendable append(char) throws IOException
- Appendable append(CharSequence, int, int) throws IOException
- Appendable append(CharSequence) throws IOException

### Class: com.fasterxml.jackson.core.io.SerializedString
Type: Class
Implements: com.fasterxml.jackson.core.SerializableString, java.io.Serializable

Methods:
- int charLength()
- int putUnquotedUTF8(ByteBuffer)
- byte[] asUnquotedUTF8()
- int writeQuotedUTF8(OutputStream) throws IOException
- byte[] asQuotedUTF8()
- char[] asQuotedChars()
- int appendQuoted(char[], int)
- int appendQuotedUTF8(byte[], int)
- String getValue()
- int appendUnquotedUTF8(byte[], int)
- int writeUnquotedUTF8(OutputStream) throws IOException
- int hashCode()
- boolean equals(Object)
- int putQuotedUTF8(ByteBuffer)
- int appendUnquoted(char[], int)
- String toString()

### Class: com.fasterxml.jackson.core.io.UTF32Reader
Type: Class
Extends: java.io.Reader

Methods:
- int read() throws IOException
- int read(char[], int, int) throws IOException
- void close() throws IOException

### Class: com.fasterxml.jackson.core.io.UTF8Writer
Type: Class
Extends: java.io.Writer

Methods:
- void flush() throws IOException
- void write(char[]) throws IOException
- void write(char[], int, int) throws IOException
- void write(int) throws IOException
- void write(String) throws IOException
- void write(String, int, int) throws IOException
- void close() throws IOException
- Writer append(char) throws IOException
- Appendable append(char) throws IOException

## Package: com.fasterxml.jackson.core.io.doubleparser

### Class: com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalParser
Type: Class

Methods:
- **static** BigDecimal parseBigDecimal(CharSequence) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(CharSequence, int, int) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(byte[]) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(byte[], int, int) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(char[]) throws NumberFormatException
- **static** BigDecimal parseBigDecimal(char[], int, int) throws NumberFormatException

### Class: com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerParser
Type: Class

Methods:
- **static** BigInteger parseBigInteger(CharSequence)
- **static** BigInteger parseBigInteger(CharSequence, int)
- **static** BigInteger parseBigInteger(CharSequence, int, int)
- **static** BigInteger parseBigInteger(CharSequence, int, int, int)
- **static** BigInteger parseBigInteger(byte[])
- **static** BigInteger parseBigInteger(byte[], int)
- **static** BigInteger parseBigInteger(byte[], int, int)
- **static** BigInteger parseBigInteger(byte[], int, int, int)
- **static** BigInteger parseBigInteger(char[])
- **static** BigInteger parseBigInteger(char[], int)
- **static** BigInteger parseBigInteger(char[], int, int)
- **static** BigInteger parseBigInteger(char[], int, int, int)

### Class: com.fasterxml.jackson.core.io.doubleparser.JavaDoubleParser
Type: Class

Methods:
- **static** double parseDouble(CharSequence) throws NumberFormatException
- **static** double parseDouble(CharSequence, int, int) throws NumberFormatException
- **static** double parseDouble(byte[]) throws NumberFormatException
- **static** double parseDouble(byte[], int, int) throws NumberFormatException
- **static** double parseDouble(char[]) throws NumberFormatException
- **static** double parseDouble(char[], int, int) throws NumberFormatException

### Class: com.fasterxml.jackson.core.io.doubleparser.JavaFloatParser
Type: Class

Methods:
- **static** float parseFloat(CharSequence) throws NumberFormatException
- **static** float parseFloat(CharSequence, int, int) throws NumberFormatException
- **static** float parseFloat(byte[]) throws NumberFormatException
- **static** float parseFloat(byte[], int, int) throws NumberFormatException
- **static** float parseFloat(char[]) throws NumberFormatException
- **static** float parseFloat(char[], int, int) throws NumberFormatException

## Package: com.fasterxml.jackson.core.io.schubfach

### Class: com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal
Type: Class

Methods:
- **static** String toString(double)

### Class: com.fasterxml.jackson.core.io.schubfach.FloatToDecimal
Type: Class

Methods:
- **static** String toString(float)

## Package: com.fasterxml.jackson.core.json

### Class: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper
Type: Class

Methods:
- **static** MatchStrength hasJSONFormat(InputAccessor) throws IOException
- **static** int skipUTF8BOM(DataInput) throws IOException
- JsonParser constructParser(int, ObjectCodec, ByteQuadsCanonicalizer, CharsToNameCanonicalizer, int) throws IOException
- Reader constructReader() throws IOException
- JsonEncoding detectEncoding() throws IOException

### Class: com.fasterxml.jackson.core.json.DupDetector
Type: Class

Methods:
- Object getSource()
- JsonLocation findLocation()
- boolean isDup(String) throws JsonParseException
- void reset()
- **static** DupDetector rootDetector(JsonParser)
- **static** DupDetector rootDetector(JsonGenerator)
- DupDetector child()

### Class: com.fasterxml.jackson.core.json.JsonGeneratorImpl
Type: Abstract Class
Extends: com.fasterxml.jackson.core.base.GeneratorBase

Methods:
- JacksonFeatureSet getWriteCapabilities()
- int getHighestEscapedChar()
- JsonGenerator setCharacterEscapes(CharacterEscapes)
- JsonGenerator disable(JsonGenerator$Feature)
- JsonGenerator enable(JsonGenerator$Feature)
- JsonGenerator setRootValueSeparator(SerializableString)
- JsonGenerator setHighestNonEscapedChar(int)
- Version version()
- CharacterEscapes getCharacterEscapes()

### Class: com.fasterxml.jackson.core.json.JsonReadContext
Type: Class
Extends: com.fasterxml.jackson.core.JsonStreamContext

Methods:
- JsonLocation getStartLocation(Object)
- JsonReadContext getParent()
- JsonStreamContext getParent()
- boolean hasCurrentName()
- **static** JsonReadContext createRootContext(int, int, DupDetector)
- **static** JsonReadContext createRootContext(DupDetector)
- JsonReadContext clearAndGetParent()
- String getCurrentName()
- JsonReadContext createChildArrayContext(int, int)
- JsonReadContext createChildObjectContext(int, int)
- JsonReadContext withDupDetector(DupDetector)
- void setCurrentName(String) throws JsonProcessingException
- DupDetector getDupDetector()
- boolean expectComma()
- JsonLocation startLocation(ContentReference)
- Object getCurrentValue()
- void reset(int, int, int)
- void setCurrentValue(Object)

### Class: com.fasterxml.jackson.core.json.JsonReadFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.FormatFeature

Methods:
- int getMask()
- **static** JsonReadFeature valueOf(String)
- **static** JsonReadFeature[] values()
- boolean enabledByDefault()
- JsonParser$Feature mappedFeature()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.json.JsonWriteContext
Type: Class
Extends: com.fasterxml.jackson.core.JsonStreamContext

Methods:
- JsonWriteContext getParent()
- JsonStreamContext getParent()
- boolean hasCurrentName()
- **static** JsonWriteContext createRootContext()
- **static** JsonWriteContext createRootContext(DupDetector)
- int writeFieldName(String) throws JsonProcessingException
- JsonWriteContext clearAndGetParent()
- String getCurrentName()
- JsonWriteContext createChildArrayContext()
- JsonWriteContext createChildArrayContext(Object)
- JsonWriteContext createChildObjectContext()
- JsonWriteContext createChildObjectContext(Object)
- JsonWriteContext withDupDetector(DupDetector)
- DupDetector getDupDetector()
- Object getCurrentValue()
- JsonWriteContext reset(int)
- JsonWriteContext reset(int, Object)
- void setCurrentValue(Object)
- int writeValue()

### Class: com.fasterxml.jackson.core.json.JsonWriteFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.FormatFeature

Methods:
- int getMask()
- **static** JsonWriteFeature valueOf(String)
- **static** JsonWriteFeature[] values()
- boolean enabledByDefault()
- JsonGenerator$Feature mappedFeature()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.json.PackageVersion
Type: Class
Implements: com.fasterxml.jackson.core.Versioned

Methods:
- Version version()

### Class: com.fasterxml.jackson.core.json.ReaderBasedJsonParser
Type: Class
Extends: com.fasterxml.jackson.core.base.ParserBase

Methods:
- String nextTextValue() throws IOException
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- boolean nextFieldName(SerializableString) throws IOException
- String nextFieldName() throws IOException
- ObjectCodec getCodec()
- String getText() throws IOException
- int getText(Writer) throws IOException
- void setCodec(ObjectCodec)
- int nextIntValue(int) throws IOException
- long nextLongValue(long) throws IOException
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- Boolean nextBooleanValue() throws IOException
- char[] getTextCharacters() throws IOException
- int getTextLength() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset() throws IOException
- JsonToken nextToken() throws IOException
- JsonLocation getCurrentLocation()
- Object getInputSource()
- void finishToken() throws IOException
- byte[] getBinaryValue(Base64Variant) throws IOException
- int releaseBuffered(Writer) throws IOException
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser
Type: Class
Extends: com.fasterxml.jackson.core.base.ParserBase

Methods:
- String nextTextValue() throws IOException
- int getValueAsInt() throws IOException
- int getValueAsInt(int) throws IOException
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- String nextFieldName() throws IOException
- ObjectCodec getCodec()
- String getText() throws IOException
- int getText(Writer) throws IOException
- void setCodec(ObjectCodec)
- int nextIntValue(int) throws IOException
- long nextLongValue(long) throws IOException
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- Boolean nextBooleanValue() throws IOException
- char[] getTextCharacters() throws IOException
- int getTextLength() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset() throws IOException
- JsonToken nextToken() throws IOException
- JsonLocation getCurrentLocation()
- Object getInputSource()
- void finishToken() throws IOException
- byte[] getBinaryValue(Base64Variant) throws IOException
- int releaseBuffered(OutputStream) throws IOException
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.json.UTF8JsonGenerator
Type: Class
Extends: com.fasterxml.jackson.core.json.JsonGeneratorImpl

Methods:
- void writeRawUTF8String(byte[], int, int) throws IOException
- void writeRawValue(SerializableString) throws IOException
- void writeFieldName(String) throws IOException
- void writeFieldName(SerializableString) throws IOException
- void writeStartObject() throws IOException
- void writeStartObject(Object) throws IOException
- void writeStartObject(Object, int) throws IOException
- void writeStartArray() throws IOException
- void writeStartArray(Object) throws IOException
- void writeStartArray(Object, int) throws IOException
- void writeEndObject() throws IOException
- void writeNull() throws IOException
- void writeBinary(Base64Variant, byte[], int, int) throws IOException, JsonGenerationException
- int writeBinary(Base64Variant, InputStream, int) throws IOException, JsonGenerationException
- int getOutputBuffered()
- void flush() throws IOException
- void writeNumber(short) throws IOException
- void writeNumber(int) throws IOException
- void writeNumber(long) throws IOException
- void writeNumber(BigInteger) throws IOException
- void writeNumber(double) throws IOException
- void writeNumber(float) throws IOException
- void writeNumber(BigDecimal) throws IOException
- void writeNumber(String) throws IOException
- void writeNumber(char[], int, int) throws IOException
- void writeUTF8String(byte[], int, int) throws IOException
- void writeRaw(String) throws IOException
- void writeRaw(String, int, int) throws IOException
- void writeRaw(SerializableString) throws IOException
- void writeRaw(char[], int, int) throws IOException
- void writeRaw(char) throws IOException
- void writeEndArray() throws IOException
- void close() throws IOException
- void writeString(String) throws IOException
- void writeString(Reader, int) throws IOException
- void writeString(char[], int, int) throws IOException
- void writeString(SerializableString) throws IOException
- void writeBoolean(boolean) throws IOException
- Object getOutputTarget()

### Class: com.fasterxml.jackson.core.json.UTF8StreamJsonParser
Type: Class
Extends: com.fasterxml.jackson.core.base.ParserBase

Methods:
- String nextTextValue() throws IOException
- int getValueAsInt() throws IOException
- int getValueAsInt(int) throws IOException
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- boolean nextFieldName(SerializableString) throws IOException
- String nextFieldName() throws IOException
- ObjectCodec getCodec()
- String getText() throws IOException
- int getText(Writer) throws IOException
- void setCodec(ObjectCodec)
- int nextIntValue(int) throws IOException
- long nextLongValue(long) throws IOException
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- Boolean nextBooleanValue() throws IOException
- char[] getTextCharacters() throws IOException
- int getTextLength() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset() throws IOException
- JsonToken nextToken() throws IOException
- JsonLocation getCurrentLocation()
- Object getInputSource()
- void finishToken() throws IOException
- byte[] getBinaryValue(Base64Variant) throws IOException
- int releaseBuffered(OutputStream) throws IOException
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator
Type: Class
Extends: com.fasterxml.jackson.core.json.JsonGeneratorImpl

Methods:
- void writeRawUTF8String(byte[], int, int) throws IOException
- void writeFieldName(String) throws IOException
- void writeFieldName(SerializableString) throws IOException
- void writeStartObject() throws IOException
- void writeStartObject(Object) throws IOException
- void writeStartObject(Object, int) throws IOException
- void writeStartArray() throws IOException
- void writeStartArray(Object) throws IOException
- void writeStartArray(Object, int) throws IOException
- void writeEndObject() throws IOException
- void writeNull() throws IOException
- void writeBinary(Base64Variant, byte[], int, int) throws IOException, JsonGenerationException
- int writeBinary(Base64Variant, InputStream, int) throws IOException, JsonGenerationException
- int getOutputBuffered()
- void flush() throws IOException
- void writeNumber(short) throws IOException
- void writeNumber(int) throws IOException
- void writeNumber(long) throws IOException
- void writeNumber(BigInteger) throws IOException
- void writeNumber(double) throws IOException
- void writeNumber(float) throws IOException
- void writeNumber(BigDecimal) throws IOException
- void writeNumber(String) throws IOException
- void writeNumber(char[], int, int) throws IOException
- void writeUTF8String(byte[], int, int) throws IOException
- boolean canWriteFormattedNumbers()
- void writeRaw(String) throws IOException
- void writeRaw(String, int, int) throws IOException
- void writeRaw(SerializableString) throws IOException
- void writeRaw(char[], int, int) throws IOException
- void writeRaw(char) throws IOException
- void writeEndArray() throws IOException
- void close() throws IOException
- void writeString(String) throws IOException
- void writeString(Reader, int) throws IOException
- void writeString(char[], int, int) throws IOException
- void writeString(SerializableString) throws IOException
- void writeBoolean(boolean) throws IOException
- Object getOutputTarget()

## Package: com.fasterxml.jackson.core.json.async

### Class: com.fasterxml.jackson.core.json.async.NonBlockingByteBufferJsonParser
Type: Class
Extends: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
Implements: com.fasterxml.jackson.core.async.ByteBufferFeeder

Methods:
- void feedInput(ByteBuffer) throws IOException
- NonBlockingInputFeeder getNonBlockingInputFeeder()
- int releaseBuffered(OutputStream) throws IOException

### Class: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser
Type: Class
Extends: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
Implements: com.fasterxml.jackson.core.async.ByteArrayFeeder

Methods:
- void feedInput(byte[], int, int) throws IOException
- ByteArrayFeeder getNonBlockingInputFeeder()
- NonBlockingInputFeeder getNonBlockingInputFeeder()
- int releaseBuffered(OutputStream) throws IOException

### Class: com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase
Type: Abstract Class
Extends: com.fasterxml.jackson.core.base.ParserBase

Methods:
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- ObjectCodec getCodec()
- String getText() throws IOException
- int getText(Writer) throws IOException
- void setCodec(ObjectCodec)
- Object getEmbeddedObject() throws IOException
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- boolean canParseAsync()
- char[] getTextCharacters() throws IOException
- boolean hasTextCharacters()
- int getTextLength() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset() throws IOException
- JsonLocation getCurrentLocation()
- Object getInputSource()
- byte[] getBinaryValue(Base64Variant) throws IOException
- int releaseBuffered(OutputStream) throws IOException
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
Type: Abstract Class
Extends: com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase

Methods:
- void endOfInput()
- boolean needMoreInput()
- JsonToken nextToken() throws IOException

## Package: com.fasterxml.jackson.core.sym

### Class: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer
Type: Class

Methods:
- int tertiaryCount()
- int primaryCount()
- ByteQuadsCanonicalizer makeChild(int)
- String findName(int)
- String findName(int, int)
- String findName(int, int, int)
- String findName(int[], int)
- **static** ByteQuadsCanonicalizer createRoot()
- void release()
- boolean maybeDirty()
- String addName(String, int) throws StreamConstraintsException
- String addName(String, int, int) throws StreamConstraintsException
- String addName(String, int, int, int) throws StreamConstraintsException
- String addName(String, int[], int) throws StreamConstraintsException
- int secondaryCount()
- int hashSeed()
- int totalCount()
- int spilloverCount()
- int calcHash(int)
- int calcHash(int, int)
- int calcHash(int, int, int)
- int calcHash(int[], int)
- int size()
- ByteQuadsCanonicalizer makeChildOrPlaceholder(int)
- boolean isCanonicalizing()
- int bucketCount()
- String toString()

### Class: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer
Type: Class

Methods:
- int calcHash(char[], int, int)
- int calcHash(String)
- String findSymbol(char[], int, int, int) throws IOException
- int _hashToIndex(int)
- int size()
- CharsToNameCanonicalizer makeChild(int)
- **static** CharsToNameCanonicalizer createRoot()
- void release()
- boolean maybeDirty()
- int bucketCount()
- int collisionCount()
- int hashSeed()
- int maxCollisionLength()

## Package: com.fasterxml.jackson.core.type

### Class: com.fasterxml.jackson.core.type.ResolvedType
Type: Abstract Class

Methods:
- boolean hasRawClass(Class)
- String containedTypeName(int)
- boolean isArrayType()
- boolean isMapLikeType()
- boolean isContainerType()
- boolean isAbstract()
- int containedTypeCount()
- Class getParameterSource()
- boolean hasGenericTypes()
- boolean isEnumType()
- boolean isReferenceType()
- ResolvedType getKeyType()
- boolean isCollectionLikeType()
- boolean isThrowable()
- boolean isConcrete()
- String toCanonical()
- Class getRawClass()
- ResolvedType getReferencedType()
- ResolvedType getContentType()
- ResolvedType containedType(int)
- boolean isFinal()
- boolean isPrimitive()
- boolean isInterface()

### Class: com.fasterxml.jackson.core.type.TypeReference
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- Type getType()
- int compareTo(TypeReference)
- int compareTo(Object)

### Class: com.fasterxml.jackson.core.type.WritableTypeId
Type: Class

No public methods found

### Class: com.fasterxml.jackson.core.type.WritableTypeId$Inclusion
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean requiresObjectContext()
- **static** WritableTypeId$Inclusion valueOf(String)
- **static** WritableTypeId$Inclusion[] values()

## Package: com.fasterxml.jackson.core.util

### Class: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter
Type: Interface

Methods:
- boolean isInline()
- void writeIndentation(JsonGenerator, int) throws IOException

### Class: com.fasterxml.jackson.core.util.Instantiatable
Type: Interface

Methods:
- Object createInstance()

### Class: com.fasterxml.jackson.core.util.JacksonFeature
Type: Interface

Methods:
- int getMask()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.core.util.BufferRecycler
Type: Class

Methods:
- void releaseCharBuffer(int, char[])
- byte[] allocByteBuffer(int)
- byte[] allocByteBuffer(int, int)
- char[] allocCharBuffer(int)
- char[] allocCharBuffer(int, int)
- void releaseByteBuffer(int, byte[])

### Class: com.fasterxml.jackson.core.util.BufferRecyclers
Type: Class

Methods:
- **static** byte[] quoteAsJsonUTF8(String)
- **static** JsonStringEncoder getJsonStringEncoder()
- **static** char[] quoteAsJsonText(String)
- **static** void quoteAsJsonText(CharSequence, StringBuilder)
- **static** int releaseBuffers()
- **static** byte[] encodeAsUTF8(String)
- **static** BufferRecycler getBufferRecycler()

### Class: com.fasterxml.jackson.core.util.ByteArrayBuilder
Type: Class
Extends: java.io.OutputStream

Methods:
- byte[] resetAndGetFirstSegment()
- **static** ByteArrayBuilder fromInitial(byte[], int)
- int getCurrentSegmentLength()
- void setCurrentSegmentLength(int)
- void release()
- byte[] finishCurrentSegment()
- byte[] getCurrentSegment()
- byte[] completeAndCoalesce(int)
- void flush()
- int size()
- void appendFourBytes(int)
- byte[] toByteArray()
- void appendThreeBytes(int)
- void reset()
- void close()
- void write(byte[])
- void write(byte[], int, int)
- void write(int)
- void append(int)
- void appendTwoBytes(int)

### Class: com.fasterxml.jackson.core.util.DefaultIndenter
Type: Class
Extends: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter

Methods:
- String getIndent()
- String getEol()
- DefaultIndenter withIndent(String)
- boolean isInline()
- DefaultIndenter withLinefeed(String)
- void writeIndentation(JsonGenerator, int) throws IOException

### Class: com.fasterxml.jackson.core.util.DefaultPrettyPrinter
Type: Class
Implements: com.fasterxml.jackson.core.PrettyPrinter, com.fasterxml.jackson.core.util.Instantiatable, java.io.Serializable

Methods:
- DefaultPrettyPrinter createInstance()
- Object createInstance()
- DefaultPrettyPrinter withoutSpacesInObjectEntries()
- void writeObjectEntrySeparator(JsonGenerator) throws IOException
- DefaultPrettyPrinter withRootSeparator(SerializableString)
- DefaultPrettyPrinter withRootSeparator(String)
- void writeStartObject(JsonGenerator) throws IOException
- void writeStartArray(JsonGenerator) throws IOException
- void writeObjectFieldValueSeparator(JsonGenerator) throws IOException
- void writeEndObject(JsonGenerator, int) throws IOException
- DefaultPrettyPrinter withObjectIndenter(DefaultPrettyPrinter$Indenter)
- void writeArrayValueSeparator(JsonGenerator) throws IOException
- void beforeObjectEntries(JsonGenerator) throws IOException
- void writeRootValueSeparator(JsonGenerator) throws IOException
- DefaultPrettyPrinter withArrayIndenter(DefaultPrettyPrinter$Indenter)
- void indentArraysWith(DefaultPrettyPrinter$Indenter)
- DefaultPrettyPrinter withSeparators(Separators)
- void writeEndArray(JsonGenerator, int) throws IOException
- DefaultPrettyPrinter withSpacesInObjectEntries()
- void beforeArrayValues(JsonGenerator) throws IOException
- void indentObjectsWith(DefaultPrettyPrinter$Indenter)

### Class: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter
Type: Class
Extends: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter

Methods:
- boolean isInline()
- void writeIndentation(JsonGenerator, int) throws IOException

### Class: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter
Type: Class
Implements: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter, java.io.Serializable

Methods:
- boolean isInline()
- void writeIndentation(JsonGenerator, int) throws IOException

### Class: com.fasterxml.jackson.core.util.InternCache
Type: Class
Extends: java.util.concurrent.ConcurrentHashMap

Methods:
- String intern(String)

### Class: com.fasterxml.jackson.core.util.JacksonFeatureSet
Type: Class

Methods:
- **static** JacksonFeatureSet fromDefaults(JacksonFeature[])
- JacksonFeatureSet with(JacksonFeature)
- **static** JacksonFeatureSet fromBitmask(int)
- int asBitmask()
- boolean isEnabled(JacksonFeature)
- JacksonFeatureSet without(JacksonFeature)

### Class: com.fasterxml.jackson.core.util.JsonParserDelegate
Type: Class
Extends: com.fasterxml.jackson.core.JsonParser

Methods:
- JsonParser setFeatureMask(int)
- int getValueAsInt() throws IOException
- int getValueAsInt(int) throws IOException
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- boolean isExpectedNumberIntToken()
- void clearCurrentToken()
- void setCodec(ObjectCodec)
- boolean isExpectedStartArrayToken()
- double getDoubleValue() throws IOException
- boolean isExpectedStartObjectToken()
- boolean hasTokenId(int)
- boolean isNaN() throws IOException
- Object getTypeId() throws IOException
- void setSchema(FormatSchema)
- Object getObjectId() throws IOException
- int getTextOffset() throws IOException
- int getCurrentTokenId()
- JsonToken getCurrentToken()
- Object getCurrentValue()
- int getFeatureMask()
- JsonParser enable(JsonParser$Feature)
- long getLongValue() throws IOException
- Object getNumberValueDeferred() throws IOException
- boolean getBooleanValue() throws IOException
- BigInteger getBigIntegerValue() throws IOException
- JsonLocation getCurrentLocation()
- Object getInputSource()
- void finishToken() throws IOException
- byte[] getBinaryValue(Base64Variant) throws IOException
- boolean getValueAsBoolean() throws IOException
- boolean getValueAsBoolean(boolean) throws IOException
- boolean canReadTypeId()
- JsonToken getLastClearedToken()
- ObjectCodec getCodec()
- JsonParser skipChildren() throws IOException
- String getText() throws IOException
- int getText(Writer) throws IOException, UnsupportedOperationException
- boolean requiresCustomCodec()
- Version version()
- JsonParser overrideStdFeatures(int, int)
- Number getNumberValueExact() throws IOException
- int getTextLength() throws IOException
- JsonToken nextToken() throws IOException
- byte getByteValue() throws IOException
- int currentTokenId()
- boolean isEnabled(JsonParser$Feature)
- boolean hasToken(JsonToken)
- JsonToken nextValue() throws IOException
- Number getNumberValue() throws IOException
- void setCurrentValue(Object)
- boolean canReadObjectId()
- int getIntValue() throws IOException
- String getCurrentName() throws IOException
- StreamReadConstraints streamReadConstraints()
- String getValueAsString() throws IOException
- String getValueAsString(String) throws IOException
- BigDecimal getDecimalValue() throws IOException
- JsonParser delegate()
- char[] getTextCharacters() throws IOException
- JacksonFeatureSet getReadCapabilities()
- short getShortValue() throws IOException
- void close() throws IOException
- JsonLocation currentTokenLocation()
- Object getEmbeddedObject() throws IOException
- double getValueAsDouble() throws IOException
- double getValueAsDouble(double) throws IOException
- JsonLocation currentLocation()
- FormatSchema getSchema()
- JsonToken currentToken()
- boolean hasTextCharacters()
- void assignCurrentValue(Object)
- JsonParser overrideFormatFeatures(int, int)
- boolean isClosed()
- float getFloatValue() throws IOException
- JsonParser disable(JsonParser$Feature)
- String currentName() throws IOException
- JsonStreamContext getParsingContext()
- JsonParser$NumberType getNumberType() throws IOException
- boolean canUseSchema(FormatSchema)
- boolean hasCurrentToken()
- Object currentValue()
- void overrideCurrentName(String)
- long getValueAsLong() throws IOException
- long getValueAsLong(long) throws IOException
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.core.util.JsonParserSequence
Type: Class
Extends: com.fasterxml.jackson.core.util.JsonParserDelegate

Methods:
- JsonParser skipChildren() throws IOException
- JsonToken nextToken() throws IOException
- **static** JsonParserSequence createFlattened(boolean, JsonParser, JsonParser)
- **static** JsonParserSequence createFlattened(JsonParser, JsonParser)
- int containedParsersCount()
- void close() throws IOException

### Class: com.fasterxml.jackson.core.util.MinimalPrettyPrinter
Type: Class
Implements: com.fasterxml.jackson.core.PrettyPrinter, java.io.Serializable

Methods:
- void writeArrayValueSeparator(JsonGenerator) throws IOException
- void beforeObjectEntries(JsonGenerator) throws IOException
- void writeRootValueSeparator(JsonGenerator) throws IOException
- void writeObjectEntrySeparator(JsonGenerator) throws IOException
- void writeStartObject(JsonGenerator) throws IOException
- MinimalPrettyPrinter setSeparators(Separators)
- void writeEndArray(JsonGenerator, int) throws IOException
- void writeStartArray(JsonGenerator) throws IOException
- void writeObjectFieldValueSeparator(JsonGenerator) throws IOException
- void beforeArrayValues(JsonGenerator) throws IOException
- void writeEndObject(JsonGenerator, int) throws IOException
- void setRootValueSeparator(String)

### Class: com.fasterxml.jackson.core.util.ReadConstrainedTextBuffer
Type: Class
Extends: com.fasterxml.jackson.core.util.TextBuffer

No public methods found

### Class: com.fasterxml.jackson.core.util.RequestPayload
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()
- Object getRawPayload()

### Class: com.fasterxml.jackson.core.util.Separators
Type: Class
Implements: java.io.Serializable

Methods:
- char getObjectFieldValueSeparator()
- **static** Separators createDefaultInstance()
- Separators withArrayValueSeparator(char)
- char getObjectEntrySeparator()
- Separators withObjectFieldValueSeparator(char)
- Separators withObjectEntrySeparator(char)
- char getArrayValueSeparator()

### Class: com.fasterxml.jackson.core.util.TextBuffer
Type: Class

Methods:
- char[] getBufferWithoutReset()
- **static** TextBuffer fromInitial(char[])
- char[] expandCurrentSegment()
- char[] expandCurrentSegment(int)
- char[] getCurrentSegment()
- long contentsAsLong(boolean)
- BigDecimal contentsAsDecimal() throws NumberFormatException
- char[] emptyAndGetCurrentSegment()
- double contentsAsDouble(boolean) throws NumberFormatException
- double contentsAsDouble() throws NumberFormatException
- float contentsAsFloat() throws NumberFormatException
- float contentsAsFloat(boolean) throws NumberFormatException
- void resetWithShared(char[], int, int)
- int getTextOffset()
- void resetWith(char)
- void setCurrentLength(int)
- char[] finishCurrentSegment() throws IOException
- char[] getTextBuffer() throws IOException
- int getCurrentSegmentSize()
- void resetWithCopy(char[], int, int) throws IOException
- void resetWithCopy(String, int, int) throws IOException
- void ensureNotShared()
- int contentsToWriter(Writer) throws IOException
- char[] contentsAsArray() throws IOException
- void resetWithEmpty()
- int size()
- void releaseBuffers()
- boolean hasTextAsCharacters()
- String finishAndReturn(int, boolean) throws IOException
- String contentsAsString() throws IOException
- String setCurrentAndReturn(int) throws IOException
- String toString()
- int contentsAsInt(boolean)
- void resetWithString(String) throws IOException
- void append(char) throws IOException
- void append(char[], int, int) throws IOException
- void append(String, int, int) throws IOException

### Class: com.fasterxml.jackson.core.util.VersionUtil
Type: Class

Methods:
- **static** void throwInternal()
- **static** Version packageVersionFor(Class)
- **static** Version parseVersion(String, String, String)
- **static** Version versionFor(Class)
- **static** Version mavenVersionFor(ClassLoader, String, String)
- Version version()

## Package: com.fasterxml.jackson.databind

### Class: com.fasterxml.jackson.databind.AnnotationIntrospector$XmlExtensions
Type: Interface

Methods:
- Boolean isOutputAsAttribute(MapperConfig, Annotated)
- Boolean isOutputAsCData(MapperConfig, Annotated)
- String findNamespace(MapperConfig, Annotated)
- Boolean isOutputAsText(MapperConfig, Annotated)

### Class: com.fasterxml.jackson.databind.BeanProperty
Type: Interface
Implements: com.fasterxml.jackson.databind.util.Named

Methods:
- boolean isRequired()
- PropertyMetadata getMetadata()
- PropertyName getWrapperName()
- String getName()
- AnnotatedMember getMember()
- Annotation getContextAnnotation(Class)
- JsonInclude$Value findPropertyInclusion(MapperConfig, Class)
- JsonFormat$Value findFormatOverrides(AnnotationIntrospector)
- List findAliases(MapperConfig)
- Annotation getAnnotation(Class)
- JavaType getType()
- JsonFormat$Value findPropertyFormat(MapperConfig, Class)
- boolean isVirtual()
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- PropertyName getFullName()

### Class: com.fasterxml.jackson.databind.JsonSerializable
Type: Interface

Methods:
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException

### Class: com.fasterxml.jackson.databind.Module$SetupContext
Type: Interface

Methods:
- TypeFactory getTypeFactory()
- void addDeserializationProblemHandler(DeserializationProblemHandler)
- void appendAnnotationIntrospector(AnnotationIntrospector)
- void setMixInAnnotations(Class, Class)
- void addDeserializers(Deserializers)
- MutableConfigOverride configOverride(Class)
- ObjectCodec getOwner()
- void registerSubtypes(Class[])
- void registerSubtypes(NamedType[])
- void registerSubtypes(Collection)
- void addBeanDeserializerModifier(BeanDeserializerModifier)
- void setNamingStrategy(PropertyNamingStrategy)
- void addKeySerializers(Serializers)
- void addTypeModifier(TypeModifier)
- void addBeanSerializerModifier(BeanSerializerModifier)
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DeserializationFeature)
- boolean isEnabled(SerializationFeature)
- boolean isEnabled(JsonFactory$Feature)
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(JsonGenerator$Feature)
- void addValueInstantiators(ValueInstantiators)
- void setClassIntrospector(ClassIntrospector)
- void addSerializers(Serializers)
- void insertAnnotationIntrospector(AnnotationIntrospector)
- void addKeyDeserializers(KeyDeserializers)
- Version getMapperVersion()
- void addAbstractTypeResolver(AbstractTypeResolver)

### Class: com.fasterxml.jackson.databind.AbstractTypeResolver
Type: Abstract Class

Methods:
- JavaType resolveAbstractType(DeserializationConfig, JavaType)
- JavaType resolveAbstractType(DeserializationConfig, BeanDescription)
- JavaType findTypeMapping(DeserializationConfig, JavaType)

### Class: com.fasterxml.jackson.databind.AnnotationIntrospector
Type: Abstract Class
Implements: com.fasterxml.jackson.core.Versioned, java.io.Serializable

Methods:
- Object findSerializationContentConverter(AnnotatedMember)
- JsonCreator$Mode findCreatorBinding(Annotated)
- Boolean findIgnoreUnknownProperties(AnnotatedClass)
- String[] findPropertiesToIgnore(Annotated, boolean)
- boolean hasAnyGetterAnnotation(AnnotatedMethod)
- Enum findDefaultEnumValue(Class)
- Object findContentDeserializer(Annotated)
- TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)
- JsonInclude$Include findSerializationInclusion(Annotated, JsonInclude$Include)
- JsonInclude$Include findSerializationInclusionForContent(Annotated, JsonInclude$Include)
- JsonInclude$Value findPropertyInclusion(Annotated)
- JsonIncludeProperties$Value findPropertyInclusionByName(MapperConfig, Annotated)
- AnnotationIntrospector$ReferenceProperty findReferenceType(AnnotatedMember)
- Boolean isIgnorableType(AnnotatedClass)
- PropertyName findNameForDeserialization(Annotated)
- boolean hasIgnoreMarker(AnnotatedMember)
- String findPropertyDefaultValue(Annotated)
- ObjectIdInfo findObjectReferenceInfo(Annotated, ObjectIdInfo)
- ObjectIdInfo findObjectIdInfo(Annotated)
- boolean hasAnySetterAnnotation(AnnotatedMethod)
- PropertyName findRootName(AnnotatedClass)
- Boolean findMergeInfo(Annotated)
- Object findDeserializationConverter(Annotated)
- Boolean hasRequiredMarker(AnnotatedMember)
- TypeResolverBuilder findTypeResolver(MapperConfig, AnnotatedClass, JavaType)
- String[] findEnumValues(Class, Enum[], String[])
- JsonCreator$Mode findCreatorAnnotation(MapperConfig, Annotated)
- NameTransformer findUnwrappingNameTransformer(AnnotatedMember)
- Class findSerializationType(Annotated)
- Class[] findViews(Annotated)
- JavaType refineDeserializationType(MapperConfig, Annotated, JavaType) throws JsonMappingException
- Object findSerializationConverter(Annotated)
- Object findNullSerializer(Annotated)
- Version version()
- Boolean hasAnyGetter(Annotated)
- Object findFilterId(Annotated)
- Object findKeySerializer(Annotated)
- PropertyName findWrapperName(Annotated)
- boolean hasCreatorAnnotation(Annotated)
- JsonIgnoreProperties$Value findPropertyIgnorals(Annotated)
- Class findDeserializationContentType(Annotated, JavaType)
- Class findSerializationContentType(Annotated, JavaType)
- JsonSerialize$Typing findSerializationTyping(Annotated)
- Boolean hasAnySetter(Annotated)
- PropertyName findNameForSerialization(Annotated)
- boolean isAnnotationBundle(Annotation)
- Class findDeserializationType(Annotated, JavaType)
- Boolean findSerializationSortAlphabetically(Annotated)
- Boolean isTypeId(AnnotatedMember)
- TypeResolverBuilder findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)
- String findClassDescription(AnnotatedClass)
- AnnotatedMethod resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)
- JsonSetter$Value findSetterInfo(Annotated)
- List findPropertyAliases(Annotated)
- Integer findPropertyIndex(Annotated)
- Object findValueInstantiator(AnnotatedClass)
- Class findSerializationKeyType(Annotated, JavaType)
- String findTypeName(AnnotatedClass)
- void findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)
- JsonFormat$Value findFormat(Annotated)
- String[] findSerializationPropertyOrder(AnnotatedClass)
- Object findSerializer(Annotated)
- void findEnumAliases(Class, Enum[], String[][])
- Object findInjectableValueId(AnnotatedMember)
- Boolean hasAsValue(Annotated)
- List findSubtypes(Annotated)
- PropertyName findRenameByField(MapperConfig, AnnotatedField, PropertyName)
- boolean hasAsValueAnnotation(AnnotatedMethod)
- Class findPOJOBuilder(AnnotatedClass)
- Object findContentSerializer(Annotated)
- String findEnumValue(Enum)
- String findPropertyDescription(Annotated)
- Object findNamingStrategy(AnnotatedClass)
- Boolean hasAsKey(MapperConfig, Annotated)
- JacksonInject$Value findInjectableValue(AnnotatedMember)
- **static** AnnotationIntrospector pair(AnnotationIntrospector, AnnotationIntrospector)
- Object findDeserializer(Annotated)
- Object findKeyDeserializer(Annotated)
- JsonIgnoreProperties$Value findPropertyIgnoralByName(MapperConfig, Annotated)
- JsonProperty$Access findPropertyAccess(Annotated)
- JavaType refineSerializationType(MapperConfig, Annotated, JavaType) throws JsonMappingException
- JsonPOJOBuilder$Value findPOJOBuilderConfig(AnnotatedClass)
- Class findDeserializationKeyType(Annotated, JavaType)
- Object findDeserializationContentConverter(AnnotatedMember)
- **static** AnnotationIntrospector nopInstance()
- VisibilityChecker findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)
- Collection allIntrospectors()
- Collection allIntrospectors(Collection)
- String findImplicitPropertyName(AnnotatedMember)

### Class: com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty
Type: Class

Methods:
- boolean isBackReference()
- String getName()
- AnnotationIntrospector$ReferenceProperty$Type getType()
- **static** AnnotationIntrospector$ReferenceProperty managed(String)
- **static** AnnotationIntrospector$ReferenceProperty back(String)
- boolean isManagedReference()

### Class: com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** AnnotationIntrospector$ReferenceProperty$Type valueOf(String)
- **static** AnnotationIntrospector$ReferenceProperty$Type[] values()

### Class: com.fasterxml.jackson.databind.BeanDescription
Type: Abstract Class

Methods:
- List findBackReferences()
- AnnotatedClass getClassInfo()
- Map findBackReferenceProperties()
- AnnotatedMember findJsonValueAccessor()
- String findClassDescription()
- Constructor findSingleArgConstructor(Class[])
- AnnotatedConstructor findDefaultConstructor()
- JsonInclude$Value findPropertyInclusion(JsonInclude$Value)
- boolean isNonStaticInnerClass()
- AnnotatedMethod findMethod(String, Class[])
- List getConstructors()
- TypeBindings bindingsForBeanType()
- AnnotatedMember findAnySetterAccessor()
- Annotations getClassAnnotations()
- Class[] findDefaultViews()
- AnnotatedMember findAnySetterField()
- JsonFormat$Value findExpectedFormat(JsonFormat$Value)
- List getFactoryMethods()
- JavaType resolveType(Type)
- Converter findDeserializationConverter()
- AnnotatedMethod findJsonValueMethod()
- AnnotatedMember findJsonKeyAccessor()
- Method findFactoryMethod(Class[])
- Class findPOJOBuilder()
- Map findInjectables()
- Set getIgnoredPropertyNames()
- List findProperties()
- Converter findSerializationConverter()
- Object instantiateBean(boolean)
- List getConstructorsWithMode()
- AnnotatedMethod findAnySetter()
- List getFactoryMethodsWithMode()
- ObjectIdInfo getObjectIdInfo()
- JavaType getType()
- Class getBeanClass()
- AnnotatedMember findAnyGetter()
- JsonPOJOBuilder$Value findPOJOBuilderConfig()
- boolean hasKnownClassAnnotations()

### Class: com.fasterxml.jackson.databind.BeanProperty$Bogus
Type: Class
Implements: com.fasterxml.jackson.databind.BeanProperty

Methods:
- boolean isRequired()
- PropertyMetadata getMetadata()
- PropertyName getWrapperName()
- String getName()
- AnnotatedMember getMember()
- Annotation getContextAnnotation(Class)
- JsonInclude$Value findPropertyInclusion(MapperConfig, Class)
- JsonFormat$Value findFormatOverrides(AnnotationIntrospector)
- List findAliases(MapperConfig)
- Annotation getAnnotation(Class)
- JavaType getType()
- JsonFormat$Value findPropertyFormat(MapperConfig, Class)
- boolean isVirtual()
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- PropertyName getFullName()

### Class: com.fasterxml.jackson.databind.BeanProperty$Std
Type: Class
Implements: com.fasterxml.jackson.databind.BeanProperty, java.io.Serializable

Methods:
- boolean isRequired()
- PropertyMetadata getMetadata()
- PropertyName getWrapperName()
- String getName()
- AnnotatedMember getMember()
- Annotation getContextAnnotation(Class)
- BeanProperty$Std withType(JavaType)
- JsonInclude$Value findPropertyInclusion(MapperConfig, Class)
- JsonFormat$Value findFormatOverrides(AnnotationIntrospector)
- List findAliases(MapperConfig)
- JavaType getType()
- Annotation getAnnotation(Class)
- boolean isVirtual()
- JsonFormat$Value findPropertyFormat(MapperConfig, Class)
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)
- PropertyName getFullName()

### Class: com.fasterxml.jackson.databind.DatabindContext
Type: Abstract Class

Methods:
- JavaType constructType(Type)
- JsonFormat$Value getDefaultPropertyFormat(Class)
- TypeFactory getTypeFactory()
- JavaType resolveAndValidateSubType(JavaType, String, PolymorphicTypeValidator) throws JsonMappingException
- TimeZone getTimeZone()
- AnnotationIntrospector getAnnotationIntrospector()
- boolean canOverrideAccessModifiers()
- JavaType resolveSubType(JavaType, String) throws JsonMappingException
- ObjectIdResolver objectIdResolverInstance(Annotated, ObjectIdInfo)
- MapperConfig getConfig()
- ObjectIdGenerator objectIdGeneratorInstance(Annotated, ObjectIdInfo) throws JsonMappingException
- Converter converterInstance(Annotated, Object) throws JsonMappingException
- DatabindContext setAttribute(Object, Object)
- Object getAttribute(Object)
- Class getActiveView()
- JavaType constructSpecializedType(JavaType, Class)
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DatatypeFeature)
- Locale getLocale()
- Object reportBadDefinition(JavaType, String) throws JsonMappingException
- Object reportBadDefinition(Class, String) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.DatabindException
Type: Abstract Class
Extends: com.fasterxml.jackson.core.JsonProcessingException

Methods:
- void prependPath(Object, String)
- void prependPath(Object, int)

### Class: com.fasterxml.jackson.databind.DeserializationConfig
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.MapperConfigBase
Implements: java.io.Serializable

Methods:
- boolean hasSomeOfFeatures(int)
- DeserializationConfig withoutFeatures(DeserializationFeature[])
- DeserializationConfig withoutFeatures(JsonParser$Feature[])
- DeserializationConfig withoutFeatures(FormatFeature[])
- BeanDescription introspectForCreation(JavaType)
- BeanDescription introspect(JavaType)
- DeserializationConfig withView(Class)
- MapperConfigBase withView(Class)
- BeanDescription introspectForBuilder(JavaType, BeanDescription)
- BeanDescription introspectForBuilder(JavaType)
- DeserializationConfig withRootName(PropertyName)
- MapperConfigBase withRootName(PropertyName)
- DeserializationConfig withHandler(DeserializationProblemHandler)
- CoercionAction findCoercionFromBlankString(LogicalType, Class, CoercionAction)
- DeserializationConfig withNoProblemHandlers()
- int getDeserializationFeatures()
- DeserializationConfig without(DeserializationFeature)
- DeserializationConfig without(DeserializationFeature, DeserializationFeature[])
- DeserializationConfig without(JsonParser$Feature)
- DeserializationConfig without(FormatFeature)
- ConstructorDetector getConstructorDetector()
- DeserializationConfig with(SubtypeResolver)
- DeserializationConfig with(ContextAttributes)
- DeserializationConfig with(DeserializationFeature)
- DeserializationConfig with(DeserializationFeature, DeserializationFeature[])
- DeserializationConfig with(JsonParser$Feature)
- DeserializationConfig with(FormatFeature)
- DeserializationConfig with(JsonNodeFactory)
- DeserializationConfig with(ConstructorDetector)
- MapperConfigBase with(SubtypeResolver)
- MapperConfigBase with(ContextAttributes)
- boolean useRootWrapping()
- LinkedNode getProblemHandlers()
- boolean isEnabled(DeserializationFeature)
- boolean isEnabled(JsonParser$Feature, JsonFactory)
- boolean isEnabled(DatatypeFeature)
- CoercionAction findCoercionAction(LogicalType, Class, CoercionInputShape)
- JsonNodeFactory getNodeFactory()
- boolean requiresFullValue()
- JsonParser initialize(JsonParser)
- JsonParser initialize(JsonParser, FormatSchema)
- boolean hasDeserializationFeatures(int)
- TypeDeserializer findTypeDeserializer(JavaType) throws JsonMappingException
- DeserializationConfig withFeatures(DeserializationFeature[])
- DeserializationConfig withFeatures(JsonParser$Feature[])
- DeserializationConfig withFeatures(FormatFeature[])

### Class: com.fasterxml.jackson.databind.DeserializationContext
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.DatabindContext
Implements: java.io.Serializable

Methods:
- JavaType handleMissingTypeId(JavaType, TypeIdResolver, String) throws IOException
- TimeZone getTimeZone()
- Object reportPropertyInputMismatch(Class, String, String, Object[]) throws JsonMappingException
- Object reportPropertyInputMismatch(JavaType, String, String, Object[]) throws JsonMappingException
- KeyDeserializer keyDeserializerInstance(Annotated, Object) throws JsonMappingException
- TokenBuffer bufferForInputBuffering(JsonParser)
- TokenBuffer bufferForInputBuffering()
- boolean canOverrideAccessModifiers()
- Object reportBadTypeDefinition(BeanDescription, String, Object[]) throws JsonMappingException
- boolean handleUnknownProperty(JsonParser, JsonDeserializer, Object, String) throws IOException
- ReadableObjectId findObjectId(Object, ObjectIdGenerator, ObjectIdResolver)
- int getDeserializationFeatures()
- Base64Variant getBase64Variant()
- void reportWrongTokenException(JsonDeserializer, JsonToken, String, Object[]) throws JsonMappingException
- void reportWrongTokenException(JavaType, JsonToken, String, Object[]) throws JsonMappingException
- void reportWrongTokenException(Class, JsonToken, String, Object[]) throws JsonMappingException
- void reportWrongTokenException(JsonParser, JsonToken, String, Object[]) throws JsonMappingException
- Object handleInstantiationProblem(Class, Object, Throwable) throws IOException
- JsonMappingException instantiationException(Class, Throwable)
- JsonMappingException instantiationException(Class, String)
- Object handleMissingInstantiator(Class, ValueInstantiator, JsonParser, String, Object[]) throws IOException
- Object readTreeAsValue(JsonNode, Class) throws IOException
- Object readTreeAsValue(JsonNode, JavaType) throws IOException
- TokenBuffer bufferAsCopyOfValue(JsonParser) throws IOException
- Object reportBadDefinition(JavaType, String) throws JsonMappingException
- JsonNode readTree(JsonParser) throws IOException
- TypeFactory getTypeFactory()
- void reportMappingException(String, Object[]) throws JsonMappingException
- JsonDeserializer findRootValueDeserializer(JavaType) throws JsonMappingException
- JsonMappingException mappingException(String)
- JsonMappingException mappingException(String, Object[])
- JsonMappingException mappingException(Class)
- JsonMappingException mappingException(Class, JsonToken)
- AnnotationIntrospector getAnnotationIntrospector()
- Class findClass(String) throws ClassNotFoundException
- Object reportUnresolvedObjectId(ObjectIdReader, Object) throws JsonMappingException
- JsonMappingException weirdKeyException(Class, String, String)
- JsonDeserializer handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType) throws JsonMappingException
- JavaType getContextualType()
- JsonMappingException invalidTypeIdException(JavaType, String, String)
- Object handleUnexpectedToken(Class, JsonParser) throws IOException
- Object handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[]) throws IOException
- Object handleUnexpectedToken(JavaType, JsonParser) throws IOException
- Object handleUnexpectedToken(JavaType, JsonToken, JsonParser, String, Object[]) throws IOException
- Date parseDate(String) throws IllegalArgumentException
- void reportMissingContent(String, Object[]) throws JsonMappingException
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DatatypeFeature)
- boolean isEnabled(DeserializationFeature)
- boolean isEnabled(StreamReadCapability)
- void handleBadMerge(JsonDeserializer) throws JsonMappingException
- JsonDeserializer findNonContextualValueDeserializer(JavaType) throws JsonMappingException
- boolean hasDeserializationFeatures(int)
- Object handleWeirdStringValue(Class, String, String, Object[]) throws IOException
- JsonMappingException weirdNativeValueException(Object, Class)
- JavaType constructType(Class)
- JsonFormat$Value getDefaultPropertyFormat(Class)
- ArrayBuilders getArrayBuilders()
- ObjectBuffer leaseObjectBuffer()
- JsonMappingException wrongTokenException(JsonParser, JavaType, JsonToken, String)
- JsonMappingException wrongTokenException(JsonParser, Class, JsonToken, String)
- JsonMappingException wrongTokenException(JsonParser, JsonToken, String)
- Object handleWeirdNumberValue(Class, Number, String, Object[]) throws IOException
- JsonMappingException missingTypeIdException(JavaType, String)
- JsonDeserializer findContextualValueDeserializer(JavaType, BeanProperty) throws JsonMappingException
- JsonDeserializer handlePrimaryContextualization(JsonDeserializer, BeanProperty, JavaType) throws JsonMappingException
- CoercionAction findCoercionFromBlankString(LogicalType, Class, CoercionAction)
- Calendar constructCalendar(Date)
- void checkUnresolvedObjectId() throws UnresolvedForwardReference
- boolean hasValueDeserializerFor(JavaType, AtomicReference)
- DeserializationContext setAttribute(Object, Object)
- DatabindContext setAttribute(Object, Object)
- JsonMappingException endOfInputException(Class)
- Object getAttribute(Object)
- Class getActiveView()
- JavaType constructSpecializedType(JavaType, Class) throws IllegalArgumentException
- JsonParser getParser()
- CoercionAction findCoercionAction(LogicalType, Class, CoercionInputShape)
- Object handleWeirdNativeValue(JavaType, Object, JsonParser) throws IOException
- JsonNodeFactory getNodeFactory()
- Object reportTrailingTokens(Class, JsonParser, JsonToken) throws JsonMappingException
- Object readValue(JsonParser, Class) throws IOException
- Object readValue(JsonParser, JavaType) throws IOException
- boolean hasSomeOfFeatures(int)
- JsonMappingException weirdNumberException(Number, Class, String)
- JsonMappingException weirdStringException(String, Class, String)
- JsonMappingException unknownTypeException(JavaType, String, String)
- Object reportBadCoercion(JsonDeserializer, Class, Object, String, Object[]) throws JsonMappingException
- JavaType handleUnknownTypeId(JavaType, String, TypeIdResolver, String) throws IOException
- Object readPropertyValue(JsonParser, BeanProperty, Class) throws IOException
- Object readPropertyValue(JsonParser, BeanProperty, JavaType) throws IOException
- DeserializerFactory getFactory()
- Object reportBadMerge(JsonDeserializer) throws JsonMappingException
- Object findInjectableValue(Object, BeanProperty, Object) throws JsonMappingException
- DeserializationConfig getConfig()
- MapperConfig getConfig()
- Object reportBadPropertyDefinition(BeanDescription, BeanPropertyDefinition, String, Object[]) throws JsonMappingException
- KeyDeserializer findKeyDeserializer(JavaType, BeanProperty) throws JsonMappingException
- void returnObjectBuffer(ObjectBuffer)
- void reportUnknownProperty(Object, String, JsonDeserializer) throws JsonMappingException
- JsonDeserializer deserializerInstance(Annotated, Object) throws JsonMappingException
- Object handleWeirdKey(Class, String, String, Object[]) throws IOException
- String extractScalarFromObject(JsonParser, JsonDeserializer, Class) throws IOException
- Object reportInputMismatch(JsonDeserializer, String, Object[]) throws JsonMappingException
- Object reportInputMismatch(Class, String, Object[]) throws JsonMappingException
- Object reportInputMismatch(JavaType, String, Object[]) throws JsonMappingException
- Object reportInputMismatch(BeanProperty, String, Object[]) throws JsonMappingException
- Locale getLocale()

### Class: com.fasterxml.jackson.databind.DeserializationFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.databind.cfg.ConfigFeature

Methods:
- int getMask()
- **static** DeserializationFeature valueOf(String)
- **static** DeserializationFeature[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.databind.InjectableValues
Type: Abstract Class

Methods:
- Object findInjectableValue(Object, DeserializationContext, BeanProperty, Object) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.InjectableValues$Std
Type: Class
Extends: com.fasterxml.jackson.databind.InjectableValues
Implements: java.io.Serializable

Methods:
- Object findInjectableValue(Object, DeserializationContext, BeanProperty, Object) throws JsonMappingException
- InjectableValues$Std addValue(String, Object)
- InjectableValues$Std addValue(Class, Object)

### Class: com.fasterxml.jackson.databind.JavaType
Type: Abstract Class
Extends: com.fasterxml.jackson.core.type.ResolvedType
Implements: java.io.Serializable, java.lang.reflect.Type

Methods:
- Object getTypeHandler()
- JavaType withValueHandler(Object)
- JavaType withTypeHandler(Object)
- boolean useStaticType()
- Object getContentTypeHandler()
- boolean hasGenericTypes()
- JavaType withContentType(JavaType)
- Object getValueHandler()
- boolean isInterface()
- boolean hasContentType()
- JavaType withContentValueHandler(Object)
- boolean hasRawClass(Class)
- JavaType containedTypeOrUnknown(int)
- JavaType[] findTypeParameters(Class)
- String getErasedSignature()
- StringBuilder getErasedSignature(StringBuilder)
- List getInterfaces()
- boolean hasValueHandler()
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- boolean isContainerType()
- Class getParameterSource()
- JavaType getKeyType()
- ResolvedType getKeyType()
- boolean isConcrete()
- JavaType getContentType()
- ResolvedType getContentType()
- JavaType containedType(int)
- ResolvedType containedType(int)
- JavaType findSuperType(Class)
- boolean isPrimitive()
- String getGenericSignature()
- StringBuilder getGenericSignature(StringBuilder)
- JavaType forcedNarrowBy(Class)
- String containedTypeName(int)
- JavaType withStaticTyping()
- boolean isEnumImplType()
- boolean isMapLikeType()
- boolean isRecordType()
- int containedTypeCount()
- boolean isCollectionLikeType()
- boolean isThrowable()
- int hashCode()
- boolean hasHandlers()
- JavaType withHandlersFrom(JavaType)
- JavaType getReferencedType()
- ResolvedType getReferencedType()
- boolean isFinal()
- boolean isTypeOrSuperTypeOf(Class)
- Object getContentValueHandler()
- TypeBindings getBindings()
- boolean isArrayType()
- JavaType withContentTypeHandler(Object)
- boolean isJavaLangObject()
- boolean isAbstract()
- boolean isTypeOrSubTypeOf(Class)
- boolean isEnumType()
- Class getRawClass()
- boolean equals(Object)
- String toString()
- JavaType getSuperClass()

### Class: com.fasterxml.jackson.databind.JsonDeserializer
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.deser.NullValueProvider

Methods:
- Object getNullValue(DeserializationContext) throws JsonMappingException
- Object getNullValue()
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- Object getEmptyValue()
- LogicalType logicalType()
- Collection getKnownPropertyNames()
- Class handledType()
- JsonDeserializer replaceDelegatee(JsonDeserializer)
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException, JacksonException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer, Object) throws IOException, JacksonException
- Boolean supportsUpdate(DeserializationConfig)
- ObjectIdReader getObjectIdReader()
- AccessPattern getNullAccessPattern()
- boolean isCachable()
- JsonDeserializer getDelegatee()
- Object getAbsentValue(DeserializationContext) throws JsonMappingException
- AccessPattern getEmptyAccessPattern()
- SettableBeanProperty findBackReference(String)
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.JsonDeserializer$None
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JsonDeserializer

No public methods found

### Class: com.fasterxml.jackson.databind.JsonMappingException
Type: Class
Extends: com.fasterxml.jackson.databind.DatabindException

Methods:
- Object getProcessor()
- JsonMappingException withCause(Throwable)
- **static** JsonMappingException wrapWithPath(Throwable, Object, String)
- **static** JsonMappingException wrapWithPath(Throwable, Object, int)
- **static** JsonMappingException wrapWithPath(Throwable, JsonMappingException$Reference)
- void prependPath(Object, String)
- void prependPath(Object, int)
- void prependPath(JsonMappingException$Reference)
- String getLocalizedMessage()
- String getPathReference()
- StringBuilder getPathReference(StringBuilder)
- **static** JsonMappingException fromUnexpectedIOE(IOException)
- List getPath()
- String getMessage()
- String toString()
- **static** JsonMappingException from(JsonParser, String)
- **static** JsonMappingException from(JsonParser, String, Throwable)
- **static** JsonMappingException from(JsonGenerator, String)
- **static** JsonMappingException from(JsonGenerator, String, Throwable)
- **static** JsonMappingException from(DeserializationContext, String)
- **static** JsonMappingException from(DeserializationContext, String, Throwable)
- **static** JsonMappingException from(SerializerProvider, String)
- **static** JsonMappingException from(SerializerProvider, String, Throwable)

### Class: com.fasterxml.jackson.databind.JsonMappingException$Reference
Type: Class
Implements: java.io.Serializable

Methods:
- int getIndex()
- String toString()
- String getFieldName()
- String getDescription()
- Object getFrom()

### Class: com.fasterxml.jackson.databind.JsonNode
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JsonSerializable$Base
Implements: com.fasterxml.jackson.core.TreeNode, java.lang.Iterable

Methods:
- Iterator fieldNames()
- JsonNode withArray(String)
- ArrayNode withArray(String, JsonNode$OverwriteMode, boolean)
- ArrayNode withArray(JsonPointer)
- ArrayNode withArray(JsonPointer, JsonNode$OverwriteMode, boolean)
- ObjectNode withObject(String)
- ObjectNode withObject(String, JsonNode$OverwriteMode, boolean)
- ObjectNode withObject(JsonPointer)
- ObjectNode withObject(JsonPointer, JsonNode$OverwriteMode, boolean)
- JsonNode required(String) throws IllegalArgumentException
- JsonNode required(int) throws IllegalArgumentException
- JsonNode path(String)
- JsonNode path(int)
- TreeNode path(int)
- TreeNode path(String)
- Iterator iterator()
- boolean isNumber()
- boolean isInt()
- JsonNodeType getNodeType()
- List findParents(String)
- List findParents(String, List)
- short shortValue()
- boolean has(String)
- boolean has(int)
- boolean isShort()
- boolean isValueNode()
- JsonNode findValue(String)
- boolean isBigDecimal()
- boolean isObject()
- boolean canConvertToExactIntegral()
- float floatValue()
- boolean isBinary()
- JsonNode require() throws IllegalArgumentException
- double doubleValue()
- long asLong()
- long asLong(long)
- BigInteger bigIntegerValue()
- JsonNode at(JsonPointer)
- JsonNode at(String)
- TreeNode at(String) throws IllegalArgumentException
- TreeNode at(JsonPointer)
- boolean isMissingNode()
- int size()
- double asDouble()
- double asDouble(double)
- boolean booleanValue()
- boolean isArray()
- Iterator fields()
- boolean asBoolean()
- boolean asBoolean(boolean)
- byte[] binaryValue() throws IOException
- boolean isDouble()
- boolean isIntegralNumber()
- List findValuesAsText(String)
- List findValuesAsText(String, List)
- boolean canConvertToLong()
- JsonNode requiredAt(String) throws IllegalArgumentException
- JsonNode requiredAt(JsonPointer) throws IllegalArgumentException
- BigDecimal decimalValue()
- boolean isBigInteger()
- long longValue()
- int asInt()
- int asInt(int)
- boolean isBoolean()
- boolean isFloatingPointNumber()
- boolean hasNonNull(String)
- boolean hasNonNull(int)
- JsonNode findParent(String)
- JsonNode get(int)
- JsonNode get(String)
- TreeNode get(int)
- TreeNode get(String)
- JsonNode requireNonNull() throws IllegalArgumentException
- Number numberValue()
- boolean isContainerNode()
- boolean isLong()
- String textValue()
- boolean canConvertToInt()
- int intValue()
- boolean isTextual()
- boolean isEmpty()
- boolean isPojo()
- boolean isFloat()
- JsonNode deepCopy()
- JsonNode with(String)
- List findValues(String)
- List findValues(String, List)
- boolean equals(Comparator, JsonNode)
- boolean equals(Object)
- Iterator elements()
- boolean isNull()
- String toPrettyString()
- String toString()
- JsonNode findPath(String)
- String asText()
- String asText(String)

### Class: com.fasterxml.jackson.databind.JsonNode$OverwriteMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonNode$OverwriteMode valueOf(String)
- **static** JsonNode$OverwriteMode[] values()

### Class: com.fasterxml.jackson.databind.JsonSerializable$Base
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.JsonSerializable

Methods:
- boolean isEmpty(SerializerProvider)

### Class: com.fasterxml.jackson.databind.JsonSerializer
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- boolean usesObjectId()
- JsonSerializer unwrappingSerializer(NameTransformer)
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isUnwrappingSerializer()
- boolean isEmpty(Object)
- boolean isEmpty(SerializerProvider, Object)
- JsonSerializer getDelegatee()
- JsonSerializer withFilterId(Object)
- Class handledType()
- JsonSerializer replaceDelegatee(JsonSerializer)
- Iterator properties()

### Class: com.fasterxml.jackson.databind.JsonSerializer$None
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JsonSerializer

No public methods found

### Class: com.fasterxml.jackson.databind.KeyDeserializer
Type: Abstract Class

Methods:
- Object deserializeKey(String, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.KeyDeserializer$None
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.KeyDeserializer

No public methods found

### Class: com.fasterxml.jackson.databind.MapperFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.databind.cfg.ConfigFeature

Methods:
- int getMask()
- **static** long collectLongDefaults()
- **static** MapperFeature valueOf(String)
- **static** MapperFeature[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)
- boolean enabledIn(long)
- long getLongMask()

### Class: com.fasterxml.jackson.databind.MappingIterator
Type: Class
Implements: java.util.Iterator, java.io.Closeable

Methods:
- Object next()
- **static** MappingIterator emptyIterator()
- JsonParser getParser()
- boolean hasNext()
- JsonLocation getCurrentLocation()
- Object nextValue() throws IOException
- boolean hasNextValue() throws IOException
- void close() throws IOException
- FormatSchema getParserSchema()
- List readAll() throws IOException
- List readAll(List) throws IOException
- Collection readAll(Collection) throws IOException
- void remove()

### Class: com.fasterxml.jackson.databind.MappingJsonFactory
Type: Class
Extends: com.fasterxml.jackson.core.JsonFactory

Methods:
- MatchStrength hasFormat(InputAccessor) throws IOException
- String getFormatName()
- ObjectMapper getCodec()
- ObjectCodec getCodec()
- JsonFactory copy()

### Class: com.fasterxml.jackson.databind.Module
Type: Abstract Class
Implements: com.fasterxml.jackson.core.Versioned

Methods:
- void setupModule(Module$SetupContext)
- Iterable getDependencies()
- Object getTypeId()
- Version version()
- String getModuleName()

### Class: com.fasterxml.jackson.databind.ObjectMapper
Type: Class
Extends: com.fasterxml.jackson.core.ObjectCodec
Implements: com.fasterxml.jackson.core.Versioned, java.io.Serializable

Methods:
- ObjectReader readerForListOf(Class)
- ObjectMapper setSerializerProvider(DefaultSerializerProvider)
- ObjectMapper findAndRegisterModules()
- ObjectMapper copyWith(JsonFactory)
- void addMixInAnnotations(Class, Class)
- ObjectMapper setAccessorNaming(AccessorNamingStrategy$Provider)
- DeserializationContext getDeserializationContext()
- PropertyNamingStrategy getPropertyNamingStrategy()
- ObjectReader readerForMapOf(Class)
- MutableConfigOverride configOverride(Class)
- SerializationConfig getSerializationConfig()
- ObjectMapper setSerializationInclusion(JsonInclude$Include)
- ObjectReader readerForArrayOf(Class)
- ObjectMapper setVisibility(VisibilityChecker)
- ObjectMapper setVisibility(PropertyAccessor, JsonAutoDetect$Visibility)
- ObjectMapper registerModules(Module[])
- ObjectMapper registerModules(Iterable)
- ObjectMapper setBase64Variant(Base64Variant)
- ObjectMapper clearProblemHandlers()
- ObjectMapper enable(MapperFeature[])
- ObjectMapper enable(SerializationFeature)
- ObjectMapper enable(SerializationFeature, SerializationFeature[])
- ObjectMapper enable(DeserializationFeature)
- ObjectMapper enable(DeserializationFeature, DeserializationFeature[])
- ObjectMapper enable(JsonParser$Feature[])
- ObjectMapper enable(JsonGenerator$Feature[])
- InjectableValues getInjectableValues()
- JsonSchema generateJsonSchema(Class) throws JsonMappingException
- ObjectMapper setDefaultMergeable(Boolean)
- TreeNode readTree(JsonParser) throws IOException
- JsonNode readTree(InputStream) throws IOException
- JsonNode readTree(Reader) throws IOException
- JsonNode readTree(String) throws JsonProcessingException, JsonMappingException
- JsonNode readTree(byte[]) throws IOException
- JsonNode readTree(byte[], int, int) throws IOException
- JsonNode readTree(File) throws IOException
- JsonNode readTree(URL) throws IOException
- SerializerProvider getSerializerProviderInstance()
- ObjectMapper setInjectableValues(InjectableValues)
- ObjectMapper setAnnotationIntrospector(AnnotationIntrospector)
- ObjectReader readerForUpdating(Object)
- TypeFactory getTypeFactory()
- ObjectMapper setFilterProvider(FilterProvider)
- ObjectMapper setDefaultSetterInfo(JsonSetter$Value)
- ObjectMapper setPropertyInclusion(JsonInclude$Value)
- ObjectMapper registerModule(Module)
- JsonParser createNonBlockingByteArrayParser() throws IOException
- PolymorphicTypeValidator getPolymorphicTypeValidator()
- MutableCoercionConfig coercionConfigDefaults()
- Version version()
- void writeTree(JsonGenerator, TreeNode) throws IOException
- void writeTree(JsonGenerator, JsonNode) throws IOException
- byte[] writeValueAsBytes(Object) throws JsonProcessingException
- Object treeToValue(TreeNode, Class) throws IllegalArgumentException, JsonProcessingException
- Object treeToValue(TreeNode, JavaType) throws IllegalArgumentException, JsonProcessingException
- ObjectMapper setConstructorDetector(ConstructorDetector)
- ObjectWriter writerWithView(Class)
- boolean isEnabled(MapperFeature)
- boolean isEnabled(SerializationFeature)
- boolean isEnabled(DeserializationFeature)
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(JsonGenerator$Feature)
- boolean isEnabled(JsonFactory$Feature)
- boolean isEnabled(StreamReadFeature)
- boolean isEnabled(StreamWriteFeature)
- ObjectReader readerWithView(Class)
- JavaType constructType(Type)
- JavaType constructType(TypeReference)
- Object convertValue(Object, Class) throws IllegalArgumentException
- Object convertValue(Object, TypeReference) throws IllegalArgumentException
- Object convertValue(Object, JavaType) throws IllegalArgumentException
- ObjectMapper activateDefaultTyping(PolymorphicTypeValidator)
- ObjectMapper activateDefaultTyping(PolymorphicTypeValidator, ObjectMapper$DefaultTyping)
- ObjectMapper activateDefaultTyping(PolymorphicTypeValidator, ObjectMapper$DefaultTyping, JsonTypeInfo$As)
- ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector, AnnotationIntrospector)
- ObjectMapper setSubtypeResolver(SubtypeResolver)
- ObjectMapper setTimeZone(TimeZone)
- JsonParser createParser(File) throws IOException
- JsonParser createParser(URL) throws IOException
- JsonParser createParser(InputStream) throws IOException
- JsonParser createParser(Reader) throws IOException
- JsonParser createParser(byte[]) throws IOException
- JsonParser createParser(byte[], int, int) throws IOException
- JsonParser createParser(String) throws IOException
- JsonParser createParser(char[]) throws IOException
- JsonParser createParser(char[], int, int) throws IOException
- JsonParser createParser(DataInput) throws IOException
- ObjectMapper copy()
- void writeValue(JsonGenerator, Object) throws IOException, StreamWriteException, DatabindException
- void writeValue(File, Object) throws IOException, StreamWriteException, DatabindException
- void writeValue(OutputStream, Object) throws IOException, StreamWriteException, DatabindException
- void writeValue(DataOutput, Object) throws IOException
- void writeValue(Writer, Object) throws IOException, StreamWriteException, DatabindException
- DeserializationConfig getDeserializationConfig()
- Object readValue(JsonParser, Class) throws IOException, StreamReadException, DatabindException
- Object readValue(JsonParser, TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(JsonParser, ResolvedType) throws IOException, StreamReadException, DatabindException
- Object readValue(JsonParser, JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(File, Class) throws IOException, StreamReadException, DatabindException
- Object readValue(File, TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(File, JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(URL, Class) throws IOException, StreamReadException, DatabindException
- Object readValue(URL, TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(URL, JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(String, Class) throws JsonProcessingException, JsonMappingException
- Object readValue(String, TypeReference) throws JsonProcessingException, JsonMappingException
- Object readValue(String, JavaType) throws JsonProcessingException, JsonMappingException
- Object readValue(Reader, Class) throws IOException, StreamReadException, DatabindException
- Object readValue(Reader, TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(Reader, JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(InputStream, Class) throws IOException, StreamReadException, DatabindException
- Object readValue(InputStream, TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(InputStream, JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(byte[], Class) throws IOException, StreamReadException, DatabindException
- Object readValue(byte[], int, int, Class) throws IOException, StreamReadException, DatabindException
- Object readValue(byte[], TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(byte[], int, int, TypeReference) throws IOException, StreamReadException, DatabindException
- Object readValue(byte[], JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(byte[], int, int, JavaType) throws IOException, StreamReadException, DatabindException
- Object readValue(DataInput, Class) throws IOException
- Object readValue(DataInput, JavaType) throws IOException
- ObjectMapper addHandler(DeserializationProblemHandler)
- Object updateValue(Object, Object) throws JsonMappingException
- MappingIterator readValues(JsonParser, ResolvedType) throws IOException
- MappingIterator readValues(JsonParser, JavaType) throws IOException
- MappingIterator readValues(JsonParser, Class) throws IOException
- MappingIterator readValues(JsonParser, TypeReference) throws IOException
- Iterator readValues(JsonParser, ResolvedType) throws IOException
- Iterator readValues(JsonParser, TypeReference) throws IOException
- Iterator readValues(JsonParser, Class) throws IOException
- ObjectWriter writerFor(Class)
- ObjectWriter writerFor(TypeReference)
- ObjectWriter writerFor(JavaType)
- JsonFactory getFactory()
- MutableCoercionConfig coercionConfigFor(LogicalType)
- MutableCoercionConfig coercionConfigFor(Class)
- ObjectMapper setMixInResolver(ClassIntrospector$MixInResolver)
- ObjectWriter writerWithDefaultPrettyPrinter()
- **static** List findModules()
- **static** List findModules(ClassLoader)
- JsonNode nullNode()
- TreeNode nullNode()
- ObjectMapper disable(MapperFeature[])
- ObjectMapper disable(SerializationFeature)
- ObjectMapper disable(SerializationFeature, SerializationFeature[])
- ObjectMapper disable(DeserializationFeature)
- ObjectMapper disable(DeserializationFeature, DeserializationFeature[])
- ObjectMapper disable(JsonParser$Feature[])
- ObjectMapper disable(JsonGenerator$Feature[])
- void setFilters(FilterProvider)
- void acceptJsonFormatVisitor(Class, JsonFormatVisitorWrapper) throws JsonMappingException
- void acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper) throws JsonMappingException
- ObjectMapper enableDefaultTyping()
- ObjectMapper enableDefaultTyping(ObjectMapper$DefaultTyping)
- ObjectMapper enableDefaultTyping(ObjectMapper$DefaultTyping, JsonTypeInfo$As)
- ObjectReader reader()
- ObjectReader reader(DeserializationFeature)
- ObjectReader reader(DeserializationFeature, DeserializationFeature[])
- ObjectReader reader(JsonNodeFactory)
- ObjectReader reader(FormatSchema)
- ObjectReader reader(InjectableValues)
- ObjectReader reader(Base64Variant)
- ObjectReader reader(ContextAttributes)
- ObjectReader reader(JavaType)
- ObjectReader reader(Class)
- ObjectReader reader(TypeReference)
- void registerSubtypes(Class[])
- void registerSubtypes(NamedType[])
- void registerSubtypes(Collection)
- Set getRegisteredModuleIds()
- ObjectWriter writerWithType(Class)
- ObjectWriter writerWithType(TypeReference)
- ObjectWriter writerWithType(JavaType)
- ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator)
- ObjectMapper disableDefaultTyping()
- ObjectNode createObjectNode()
- TreeNode createObjectNode()
- ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator, ObjectMapper$DefaultTyping, String)
- ObjectMapper setDefaultLeniency(Boolean)
- JsonParser treeAsTokens(TreeNode)
- JsonFactory tokenStreamFactory()
- ObjectMapper setDefaultAttributes(ContextAttributes)
- ObjectMapper setDefaultPrettyPrinter(PrettyPrinter)
- DateFormat getDateFormat()
- String writeValueAsString(Object) throws JsonProcessingException
- ObjectMapper setLocale(Locale)
- ObjectMapper setMixIns(Map)
- ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy)
- boolean canDeserialize(JavaType)
- boolean canDeserialize(JavaType, AtomicReference)
- int mixInCount()
- ObjectMapper enableDefaultTypingAsProperty(ObjectMapper$DefaultTyping, String)
- Object setHandlerInstantiator(HandlerInstantiator)
- ObjectMapper setConfig(DeserializationConfig)
- ObjectMapper setConfig(SerializationConfig)
- JsonNode missingNode()
- TreeNode missingNode()
- ObjectMapper setTypeFactory(TypeFactory)
- ObjectMapper addMixIn(Class, Class)
- ObjectMapper setDefaultVisibility(JsonAutoDetect$Value)
- ObjectMapper setDefaultPropertyInclusion(JsonInclude$Value)
- ObjectMapper setDefaultPropertyInclusion(JsonInclude$Include)
- SubtypeResolver getSubtypeResolver()
- JsonNodeFactory getNodeFactory()
- boolean canSerialize(Class)
- boolean canSerialize(Class, AtomicReference)
- ObjectMapper deactivateDefaultTyping()
- SerializerProvider getSerializerProvider()
- ObjectMapper setDateFormat(DateFormat)
- ArrayNode createArrayNode()
- TreeNode createArrayNode()
- Class findMixInClassFor(Class)
- ObjectMapper setNodeFactory(JsonNodeFactory)
- VisibilityChecker getVisibilityChecker()
- SerializerFactory getSerializerFactory()
- ObjectMapper configure(MapperFeature, boolean)
- ObjectMapper configure(SerializationFeature, boolean)
- ObjectMapper configure(DeserializationFeature, boolean)
- ObjectMapper configure(DatatypeFeature, boolean)
- ObjectMapper configure(JsonParser$Feature, boolean)
- ObjectMapper configure(JsonGenerator$Feature, boolean)
- void setMixInAnnotations(Map)
- ObjectMapper setDefaultTyping(TypeResolverBuilder)
- JsonGenerator createGenerator(OutputStream) throws IOException
- JsonGenerator createGenerator(OutputStream, JsonEncoding) throws IOException
- JsonGenerator createGenerator(Writer) throws IOException
- JsonGenerator createGenerator(File, JsonEncoding) throws IOException
- JsonGenerator createGenerator(DataOutput) throws IOException
- ObjectReader readerFor(JavaType)
- ObjectReader readerFor(Class)
- ObjectReader readerFor(TypeReference)
- ObjectMapper setSerializerFactory(SerializerFactory)
- void setVisibilityChecker(VisibilityChecker)
- ObjectWriter writer()
- ObjectWriter writer(SerializationFeature)
- ObjectWriter writer(SerializationFeature, SerializationFeature[])
- ObjectWriter writer(DateFormat)
- ObjectWriter writer(PrettyPrinter)
- ObjectWriter writer(FilterProvider)
- ObjectWriter writer(FormatSchema)
- ObjectWriter writer(Base64Variant)
- ObjectWriter writer(CharacterEscapes)
- ObjectWriter writer(ContextAttributes)
- JsonNode valueToTree(Object) throws IllegalArgumentException

### Class: com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
Implements: java.io.Serializable

Methods:
- ObjectMapper$DefaultTypeResolverBuilder withDefaultImpl(Class)
- StdTypeResolverBuilder withDefaultImpl(Class)
- TypeResolverBuilder withDefaultImpl(Class)
- TypeDeserializer buildTypeDeserializer(DeserializationConfig, JavaType, Collection)
- PolymorphicTypeValidator subTypeValidator(MapperConfig)
- **static** ObjectMapper$DefaultTypeResolverBuilder construct(ObjectMapper$DefaultTyping, PolymorphicTypeValidator)
- boolean useForType(JavaType)
- TypeSerializer buildTypeSerializer(SerializationConfig, JavaType, Collection)

### Class: com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ObjectMapper$DefaultTyping valueOf(String)
- **static** ObjectMapper$DefaultTyping[] values()

### Class: com.fasterxml.jackson.databind.ObjectReader
Type: Class
Extends: com.fasterxml.jackson.core.ObjectCodec
Implements: com.fasterxml.jackson.core.Versioned, java.io.Serializable

Methods:
- ObjectReader withAttributes(Map)
- ObjectReader withAttribute(Object, Object)
- ObjectReader withValueToUpdate(Object)
- ObjectReader withHandler(DeserializationProblemHandler)
- ObjectReader withType(JavaType)
- ObjectReader withType(Class)
- ObjectReader withType(Type)
- ObjectReader withType(TypeReference)
- ObjectReader without(DeserializationFeature)
- ObjectReader without(DeserializationFeature, DeserializationFeature[])
- ObjectReader without(DatatypeFeature)
- ObjectReader without(JsonParser$Feature)
- ObjectReader without(StreamReadFeature)
- ObjectReader without(FormatFeature)
- JsonNode missingNode()
- TreeNode missingNode()
- InjectableValues getInjectableValues()
- ObjectReader withoutRootName()
- ObjectReader withFormatDetection(ObjectReader[])
- ObjectReader withFormatDetection(DataFormatReaders)
- JsonParser createParser(File) throws IOException
- JsonParser createParser(URL) throws IOException
- JsonParser createParser(InputStream) throws IOException
- JsonParser createParser(Reader) throws IOException
- JsonParser createParser(byte[]) throws IOException
- JsonParser createParser(byte[], int, int) throws IOException
- JsonParser createParser(String) throws IOException
- JsonParser createParser(char[]) throws IOException
- JsonParser createParser(char[], int, int) throws IOException
- JsonParser createParser(DataInput) throws IOException
- void writeValue(JsonGenerator, Object) throws IOException
- JavaType getValueType()
- TreeNode readTree(JsonParser) throws IOException
- JsonNode readTree(InputStream) throws IOException
- JsonNode readTree(Reader) throws IOException
- JsonNode readTree(String) throws JsonProcessingException, JsonMappingException
- JsonNode readTree(byte[]) throws IOException
- JsonNode readTree(byte[], int, int) throws IOException
- JsonNode readTree(DataInput) throws IOException
- JsonNode createObjectNode()
- TreeNode createObjectNode()
- ObjectReader withFeatures(DeserializationFeature[])
- ObjectReader withFeatures(DatatypeFeature[])
- ObjectReader withFeatures(JsonParser$Feature[])
- ObjectReader withFeatures(FormatFeature[])
- ObjectReader withoutAttribute(Object)
- Object readValue(JsonParser) throws IOException
- Object readValue(JsonParser, Class) throws IOException
- Object readValue(JsonParser, TypeReference) throws IOException
- Object readValue(JsonParser, ResolvedType) throws IOException
- Object readValue(JsonParser, JavaType) throws IOException
- Object readValue(InputStream) throws IOException
- Object readValue(InputStream, Class) throws IOException
- Object readValue(Reader) throws IOException
- Object readValue(Reader, Class) throws IOException
- Object readValue(String) throws JsonProcessingException, JsonMappingException
- Object readValue(String, Class) throws IOException
- Object readValue(byte[]) throws IOException
- Object readValue(byte[], Class) throws IOException
- Object readValue(byte[], int, int) throws IOException
- Object readValue(byte[], int, int, Class) throws IOException
- Object readValue(File) throws IOException
- Object readValue(File, Class) throws IOException
- Object readValue(URL) throws IOException
- Object readValue(URL, Class) throws IOException
- Object readValue(JsonNode) throws IOException
- Object readValue(JsonNode, Class) throws IOException
- Object readValue(DataInput) throws IOException
- Object readValue(DataInput, Class) throws IOException
- ObjectReader withoutFeatures(DeserializationFeature[])
- ObjectReader withoutFeatures(DatatypeFeature[])
- ObjectReader withoutFeatures(JsonParser$Feature[])
- ObjectReader withoutFeatures(FormatFeature[])
- TypeFactory getTypeFactory()
- ContextAttributes getAttributes()
- JsonParser treeAsTokens(TreeNode)
- JsonNode createArrayNode()
- TreeNode createArrayNode()
- ObjectReader withView(Class)
- Iterator readValues(JsonParser, Class) throws IOException
- Iterator readValues(JsonParser, TypeReference) throws IOException
- Iterator readValues(JsonParser, ResolvedType) throws IOException
- Iterator readValues(JsonParser, JavaType) throws IOException
- MappingIterator readValues(JsonParser) throws IOException
- MappingIterator readValues(InputStream) throws IOException
- MappingIterator readValues(Reader) throws IOException
- MappingIterator readValues(String) throws IOException
- MappingIterator readValues(byte[], int, int) throws IOException
- MappingIterator readValues(byte[]) throws IOException
- MappingIterator readValues(File) throws IOException
- MappingIterator readValues(URL) throws IOException
- MappingIterator readValues(DataInput) throws IOException
- ObjectReader withRootName(String)
- ObjectReader withRootName(PropertyName)
- JsonParser createNonBlockingByteArrayParser() throws IOException
- JsonFactory getFactory()
- Version version()
- DeserializationConfig getConfig()
- void writeTree(JsonGenerator, TreeNode)
- ObjectReader with(DeserializationFeature)
- ObjectReader with(DeserializationFeature, DeserializationFeature[])
- ObjectReader with(DatatypeFeature)
- ObjectReader with(JsonParser$Feature)
- ObjectReader with(StreamReadFeature)
- ObjectReader with(FormatFeature)
- ObjectReader with(DeserializationConfig)
- ObjectReader with(InjectableValues)
- ObjectReader with(JsonNodeFactory)
- ObjectReader with(JsonFactory)
- ObjectReader with(FormatSchema)
- ObjectReader with(Locale)
- ObjectReader with(TimeZone)
- ObjectReader with(Base64Variant)
- ObjectReader with(ContextAttributes)
- Object treeToValue(TreeNode, Class) throws JsonProcessingException
- Object treeToValue(TreeNode, JavaType) throws JsonProcessingException
- ObjectReader at(String)
- ObjectReader at(JsonPointer)
- JsonNode nullNode()
- TreeNode nullNode()
- boolean isEnabled(DeserializationFeature)
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DatatypeFeature)
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(StreamReadFeature)
- ObjectReader forType(JavaType)
- ObjectReader forType(Class)
- ObjectReader forType(TypeReference)

### Class: com.fasterxml.jackson.databind.ObjectWriter
Type: Class
Implements: com.fasterxml.jackson.core.Versioned, java.io.Serializable

Methods:
- ObjectWriter withAttributes(Map)
- ObjectWriter withAttribute(Object, Object)
- boolean hasPrefetchedSerializer()
- ObjectWriter withSchema(FormatSchema)
- ObjectWriter withType(JavaType)
- ObjectWriter withType(Class)
- ObjectWriter withType(TypeReference)
- ObjectWriter without(SerializationFeature)
- ObjectWriter without(SerializationFeature, SerializationFeature[])
- ObjectWriter without(DatatypeFeature)
- ObjectWriter without(JsonGenerator$Feature)
- ObjectWriter without(StreamWriteFeature)
- ObjectWriter without(FormatFeature)
- ObjectWriter withRootValueSeparator(String)
- ObjectWriter withRootValueSeparator(SerializableString)
- ObjectWriter withoutRootName()
- ObjectWriter withDefaultPrettyPrinter()
- boolean canSerialize(Class)
- boolean canSerialize(Class, AtomicReference)
- void writeValue(JsonGenerator, Object) throws IOException
- void writeValue(File, Object) throws IOException, StreamWriteException, DatabindException
- void writeValue(OutputStream, Object) throws IOException, StreamWriteException, DatabindException
- void writeValue(Writer, Object) throws IOException, StreamWriteException, DatabindException
- void writeValue(DataOutput, Object) throws IOException, StreamWriteException, DatabindException
- SequenceWriter writeValues(File) throws IOException
- SequenceWriter writeValues(JsonGenerator) throws IOException
- SequenceWriter writeValues(Writer) throws IOException
- SequenceWriter writeValues(OutputStream) throws IOException
- SequenceWriter writeValues(DataOutput) throws IOException
- SequenceWriter writeValuesAsArray(File) throws IOException
- SequenceWriter writeValuesAsArray(JsonGenerator) throws IOException
- SequenceWriter writeValuesAsArray(Writer) throws IOException
- SequenceWriter writeValuesAsArray(OutputStream) throws IOException
- SequenceWriter writeValuesAsArray(DataOutput) throws IOException
- ObjectWriter withFeatures(SerializationFeature[])
- ObjectWriter withFeatures(DatatypeFeature[])
- ObjectWriter withFeatures(JsonGenerator$Feature[])
- ObjectWriter withFeatures(FormatFeature[])
- ObjectWriter withoutAttribute(Object)
- ObjectWriter withoutFeatures(SerializationFeature[])
- ObjectWriter withoutFeatures(DatatypeFeature[])
- ObjectWriter withoutFeatures(JsonGenerator$Feature[])
- ObjectWriter withoutFeatures(FormatFeature[])
- TypeFactory getTypeFactory()
- ContextAttributes getAttributes()
- ObjectWriter withView(Class)
- ObjectWriter withRootName(String)
- ObjectWriter withRootName(PropertyName)
- JsonFactory getFactory()
- Version version()
- SerializationConfig getConfig()
- byte[] writeValueAsBytes(Object) throws JsonProcessingException
- JsonGenerator createGenerator(OutputStream) throws IOException
- JsonGenerator createGenerator(OutputStream, JsonEncoding) throws IOException
- JsonGenerator createGenerator(Writer) throws IOException
- JsonGenerator createGenerator(File, JsonEncoding) throws IOException
- JsonGenerator createGenerator(DataOutput) throws IOException
- ObjectWriter with(SerializationFeature)
- ObjectWriter with(SerializationFeature, SerializationFeature[])
- ObjectWriter with(DatatypeFeature)
- ObjectWriter with(JsonGenerator$Feature)
- ObjectWriter with(StreamWriteFeature)
- ObjectWriter with(FormatFeature)
- ObjectWriter with(DateFormat)
- ObjectWriter with(FilterProvider)
- ObjectWriter with(PrettyPrinter)
- ObjectWriter with(FormatSchema)
- ObjectWriter with(Locale)
- ObjectWriter with(TimeZone)
- ObjectWriter with(Base64Variant)
- ObjectWriter with(CharacterEscapes)
- ObjectWriter with(JsonFactory)
- ObjectWriter with(ContextAttributes)
- void acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper) throws JsonMappingException
- void acceptJsonFormatVisitor(Class, JsonFormatVisitorWrapper) throws JsonMappingException
- boolean isEnabled(SerializationFeature)
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DatatypeFeature)
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(JsonGenerator$Feature)
- boolean isEnabled(StreamWriteFeature)
- ObjectWriter forType(JavaType)
- ObjectWriter forType(Class)
- ObjectWriter forType(TypeReference)
- String writeValueAsString(Object) throws JsonProcessingException

### Class: com.fasterxml.jackson.databind.ObjectWriter$GeneratorSettings
Type: Class
Implements: java.io.Serializable

Methods:
- ObjectWriter$GeneratorSettings with(PrettyPrinter)
- ObjectWriter$GeneratorSettings with(FormatSchema)
- ObjectWriter$GeneratorSettings with(CharacterEscapes)
- void initialize(JsonGenerator)
- ObjectWriter$GeneratorSettings withRootValueSeparator(String)
- ObjectWriter$GeneratorSettings withRootValueSeparator(SerializableString)

### Class: com.fasterxml.jackson.databind.ObjectWriter$Prefetch
Type: Class
Implements: java.io.Serializable

Methods:
- JsonSerializer getValueSerializer()
- void serialize(JsonGenerator, Object, DefaultSerializerProvider) throws IOException
- TypeSerializer getTypeSerializer()
- ObjectWriter$Prefetch forRootType(ObjectWriter, JavaType)
- boolean hasSerializer()

### Class: com.fasterxml.jackson.databind.PropertyMetadata
Type: Class
Implements: java.io.Serializable

Methods:
- boolean hasDefaultValue()
- boolean isRequired()
- PropertyMetadata withIndex(Integer)
- PropertyMetadata withMergeInfo(PropertyMetadata$MergeInfo)
- Integer getIndex()
- PropertyMetadata withRequired(Boolean)
- PropertyMetadata withDescription(String)
- **static** PropertyMetadata construct(Boolean, String, Integer, String)
- **static** PropertyMetadata construct(boolean, String, Integer, String)
- Nulls getValueNulls()
- String getDescription()
- String getDefaultValue()
- Nulls getContentNulls()
- PropertyMetadata withNulls(Nulls, Nulls)
- PropertyMetadata$MergeInfo getMergeInfo()
- boolean hasIndex()
- Boolean getRequired()
- PropertyMetadata withDefaultValue(String)

### Class: com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo
Type: Class

Methods:
- **static** PropertyMetadata$MergeInfo createForPropertyOverride(AnnotatedMember)
- **static** PropertyMetadata$MergeInfo createForTypeOverride(AnnotatedMember)
- **static** PropertyMetadata$MergeInfo createForDefaults(AnnotatedMember)

### Class: com.fasterxml.jackson.databind.PropertyName
Type: Class
Implements: java.io.Serializable

Methods:
- PropertyName withNamespace(String)
- String getNamespace()
- int hashCode()
- boolean hasSimpleName()
- boolean hasSimpleName(String)
- boolean equals(Object)
- boolean hasNamespace()
- boolean isEmpty()
- PropertyName internSimpleName()
- String toString()
- String getSimpleName()
- SerializableString simpleAsEncoded(MapperConfig)
- PropertyName withSimpleName(String)
- **static** PropertyName construct(String)
- **static** PropertyName construct(String, String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy
Type: Class
Implements: java.io.Serializable

Methods:
- String nameForGetterMethod(MapperConfig, AnnotatedMethod, String)
- String nameForField(MapperConfig, AnnotatedField, String)
- String nameForSetterMethod(MapperConfig, AnnotatedMethod, String)
- String nameForConstructorParameter(MapperConfig, AnnotatedParameter, String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$KebabCaseStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase

Methods:
- String translate(String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase

Methods:
- String translate(String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$SnakeCaseStrategy

No public methods found

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerDotCaseStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase

Methods:
- String translate(String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$PascalCaseStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$UpperCamelCaseStrategy

No public methods found

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy

Methods:
- String nameForGetterMethod(MapperConfig, AnnotatedMethod, String)
- String nameForField(MapperConfig, AnnotatedField, String)
- String nameForSetterMethod(MapperConfig, AnnotatedMethod, String)
- String translate(String)
- String nameForConstructorParameter(MapperConfig, AnnotatedParameter, String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$SnakeCaseStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase

Methods:
- String translate(String)

### Class: com.fasterxml.jackson.databind.PropertyNamingStrategy$UpperCamelCaseStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase

Methods:
- String translate(String)

### Class: com.fasterxml.jackson.databind.RuntimeJsonMappingException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.fasterxml.jackson.databind.SequenceWriter
Type: Class
Implements: com.fasterxml.jackson.core.Versioned, java.io.Closeable, java.io.Flushable

Methods:
- SequenceWriter init(boolean) throws IOException
- SequenceWriter writeAll(Object[]) throws IOException
- SequenceWriter writeAll(Collection) throws IOException
- SequenceWriter writeAll(Iterable) throws IOException
- void flush() throws IOException
- void close() throws IOException
- SequenceWriter write(Object) throws IOException
- SequenceWriter write(Object, JavaType) throws IOException
- Version version()

### Class: com.fasterxml.jackson.databind.SerializationConfig
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.MapperConfigBase
Implements: java.io.Serializable

Methods:
- SerializationConfig withFilters(FilterProvider)
- SerializationConfig withoutFeatures(SerializationFeature[])
- SerializationConfig withoutFeatures(JsonGenerator$Feature[])
- SerializationConfig withoutFeatures(FormatFeature[])
- BeanDescription introspect(JavaType)
- boolean hasSerializationFeatures(int)
- SerializationConfig withView(Class)
- MapperConfigBase withView(Class)
- FilterProvider getFilterProvider()
- SerializationConfig withRootName(PropertyName)
- MapperConfigBase withRootName(PropertyName)
- SerializationConfig withPropertyInclusion(JsonInclude$Value)
- SerializationConfig without(SerializationFeature)
- SerializationConfig without(SerializationFeature, SerializationFeature[])
- SerializationConfig without(JsonGenerator$Feature)
- SerializationConfig without(FormatFeature)
- SerializationConfig with(SubtypeResolver)
- SerializationConfig with(ContextAttributes)
- SerializationConfig with(DateFormat)
- SerializationConfig with(SerializationFeature)
- SerializationConfig with(SerializationFeature, SerializationFeature[])
- SerializationConfig with(JsonGenerator$Feature)
- SerializationConfig with(FormatFeature)
- MapperConfigBase with(SubtypeResolver)
- MapperConfigBase with(DateFormat)
- MapperConfigBase with(ContextAttributes)
- boolean useRootWrapping()
- PrettyPrinter getDefaultPrettyPrinter()
- int getSerializationFeatures()
- boolean isEnabled(SerializationFeature)
- boolean isEnabled(JsonGenerator$Feature, JsonFactory)
- boolean isEnabled(DatatypeFeature)
- SerializationConfig withDefaultPrettyPrinter(PrettyPrinter)
- void initialize(JsonGenerator)
- PrettyPrinter constructDefaultPrettyPrinter()
- JsonInclude$Include getSerializationInclusion()
- SerializationConfig withFeatures(SerializationFeature[])
- SerializationConfig withFeatures(JsonGenerator$Feature[])
- SerializationConfig withFeatures(FormatFeature[])

### Class: com.fasterxml.jackson.databind.SerializationFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.databind.cfg.ConfigFeature

Methods:
- int getMask()
- **static** SerializationFeature valueOf(String)
- **static** SerializationFeature[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.databind.SerializerProvider
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.DatabindContext

Methods:
- JsonSerializer findNullKeySerializer(JavaType, BeanProperty) throws JsonMappingException
- TimeZone getTimeZone()
- TypeSerializer findTypeSerializer(JavaType) throws JsonMappingException
- JsonSerializer findContentValueSerializer(JavaType, BeanProperty) throws JsonMappingException
- JsonSerializer findContentValueSerializer(Class, BeanProperty) throws JsonMappingException
- JsonSerializer getDefaultNullKeySerializer()
- boolean canOverrideAccessModifiers()
- Object reportBadTypeDefinition(BeanDescription, String, Object[]) throws JsonMappingException
- WritableObjectId findObjectId(Object, ObjectIdGenerator)
- void defaultSerializeField(String, Object, JsonGenerator) throws IOException
- JsonGenerator getGenerator()
- JsonSerializer findNullValueSerializer(BeanProperty) throws JsonMappingException
- void setDefaultKeySerializer(JsonSerializer)
- void setNullKeySerializer(JsonSerializer)
- Object reportBadDefinition(JavaType, String) throws JsonMappingException
- Object reportBadDefinition(JavaType, String, Throwable) throws JsonMappingException
- Object reportBadDefinition(Class, String, Throwable) throws JsonMappingException
- TypeFactory getTypeFactory()
- JsonSerializer findValueSerializer(Class, BeanProperty) throws JsonMappingException
- JsonSerializer findValueSerializer(JavaType, BeanProperty) throws JsonMappingException
- JsonSerializer findValueSerializer(Class) throws JsonMappingException
- JsonSerializer findValueSerializer(JavaType) throws JsonMappingException
- boolean hasSerializationFeatures(int)
- JsonMappingException mappingException(String, Object[])
- AnnotationIntrospector getAnnotationIntrospector()
- void defaultSerializeNull(JsonGenerator) throws IOException
- JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty) throws JsonMappingException
- JsonMappingException invalidTypeIdException(JavaType, String, String)
- JsonSerializer findPrimaryPropertySerializer(JavaType, BeanProperty) throws JsonMappingException
- JsonSerializer findPrimaryPropertySerializer(Class, BeanProperty) throws JsonMappingException
- void setNullValueSerializer(JsonSerializer)
- JsonSerializer findKeySerializer(JavaType, BeanProperty) throws JsonMappingException
- JsonSerializer findKeySerializer(Class, BeanProperty) throws JsonMappingException
- JsonSerializer getUnknownTypeSerializer(Class)
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DatatypeFeature)
- boolean isEnabled(SerializationFeature)
- JsonSerializer getDefaultNullValueSerializer()
- JsonFormat$Value getDefaultPropertyFormat(Class)
- FilterProvider getFilterProvider()
- Object includeFilterInstance(BeanPropertyDefinition, Class) throws JsonMappingException
- JsonSerializer serializerInstance(Annotated, Object) throws JsonMappingException
- boolean includeFilterSuppressNulls(Object) throws JsonMappingException
- JsonSerializer handlePrimaryContextualization(JsonSerializer, BeanProperty) throws JsonMappingException
- JsonSerializer findTypedValueSerializer(Class, boolean, BeanProperty) throws JsonMappingException
- JsonSerializer findTypedValueSerializer(JavaType, boolean, BeanProperty) throws JsonMappingException
- void defaultSerializeDateValue(long, JsonGenerator) throws IOException
- void defaultSerializeDateValue(Date, JsonGenerator) throws IOException
- SerializerProvider setAttribute(Object, Object)
- DatabindContext setAttribute(Object, Object)
- Object getAttribute(Object)
- Class getActiveView()
- JavaType constructSpecializedType(JavaType, Class) throws IllegalArgumentException
- void reportMappingProblem(String, Object[]) throws JsonMappingException
- void reportMappingProblem(Throwable, String, Object[]) throws JsonMappingException
- SerializationConfig getConfig()
- MapperConfig getConfig()
- Object reportBadPropertyDefinition(BeanDescription, BeanPropertyDefinition, String, Object[]) throws JsonMappingException
- void defaultSerializeValue(Object, JsonGenerator) throws IOException
- void defaultSerializeDateKey(long, JsonGenerator) throws IOException
- void defaultSerializeDateKey(Date, JsonGenerator) throws IOException
- boolean isUnknownTypeSerializer(JsonSerializer)
- TokenBuffer bufferForValueConversion(ObjectCodec)
- TokenBuffer bufferForValueConversion()
- Locale getLocale()
- JsonInclude$Value getDefaultPropertyInclusion(Class)

## Package: com.fasterxml.jackson.databind.annotation

### Class: com.fasterxml.jackson.databind.annotation.JacksonStdImpl
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.fasterxml.jackson.databind.annotation.JsonAppend
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean prepend()
- JsonAppend$Prop[] props()
- JsonAppend$Attr[] attrs()

### Class: com.fasterxml.jackson.databind.annotation.JsonAppend$Attr
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonInclude$Include include()
- String propNamespace()
- String propName()
- String value()
- boolean required()

### Class: com.fasterxml.jackson.databind.annotation.JsonAppend$Prop
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonInclude$Include include()
- String namespace()
- String name()
- Class type()
- Class value()
- boolean required()

### Class: com.fasterxml.jackson.databind.annotation.JsonDeserialize
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class keyAs()
- Class as()
- Class using()
- Class contentConverter()
- Class keyUsing()
- Class contentAs()
- Class converter()
- Class builder()
- Class contentUsing()

### Class: com.fasterxml.jackson.databind.annotation.JsonNaming
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String buildMethodName()
- String withPrefix()

### Class: com.fasterxml.jackson.databind.annotation.JsonSerialize
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- JsonSerialize$Inclusion include()
- Class keyAs()
- Class as()
- Class using()
- Class contentConverter()
- Class keyUsing()
- Class converter()
- Class contentAs()
- JsonSerialize$Typing typing()
- Class contentUsing()
- Class nullsUsing()

### Class: com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: com.fasterxml.jackson.databind.annotation.JsonTypeResolver
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: com.fasterxml.jackson.databind.annotation.JsonValueInstantiator
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value
Type: Class

No public methods found

### Class: com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonSerialize$Inclusion valueOf(String)
- **static** JsonSerialize$Inclusion[] values()

### Class: com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonSerialize$Typing valueOf(String)
- **static** JsonSerialize$Typing[] values()

### Class: com.fasterxml.jackson.databind.annotation.NoClass
Type: Class

No public methods found

## Package: com.fasterxml.jackson.databind.cfg

### Class: com.fasterxml.jackson.databind.cfg.ConfigFeature
Type: Interface

Methods:
- int getMask()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.databind.cfg.DatatypeFeature
Type: Interface
Implements: com.fasterxml.jackson.core.util.JacksonFeature

Methods:
- int featureIndex()

### Class: com.fasterxml.jackson.databind.cfg.BaseSettings
Type: Class
Implements: java.io.Serializable

Methods:
- TypeFactory getTypeFactory()
- BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector)
- TimeZone getTimeZone()
- boolean hasExplicitTimeZone()
- BaseSettings withTypeFactory(TypeFactory)
- AccessorNamingStrategy$Provider getAccessorNaming()
- BaseSettings withTypeResolverBuilder(TypeResolverBuilder)
- AnnotationIntrospector getAnnotationIntrospector()
- PropertyNamingStrategy getPropertyNamingStrategy()
- PolymorphicTypeValidator getPolymorphicTypeValidator()
- BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy)
- BaseSettings withAnnotationIntrospector(AnnotationIntrospector)
- BaseSettings withClassIntrospector(ClassIntrospector)
- Base64Variant getBase64Variant()
- BaseSettings with(Locale)
- BaseSettings with(TimeZone)
- BaseSettings with(Base64Variant)
- BaseSettings with(PolymorphicTypeValidator)
- HandlerInstantiator getHandlerInstantiator()
- DateFormat getDateFormat()
- ClassIntrospector getClassIntrospector()
- BaseSettings withDateFormat(DateFormat)
- BaseSettings copy()
- BaseSettings withHandlerInstantiator(HandlerInstantiator)
- BaseSettings withAccessorNaming(AccessorNamingStrategy$Provider)
- Locale getLocale()
- TypeResolverBuilder getTypeResolverBuilder()
- BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector)

### Class: com.fasterxml.jackson.databind.cfg.CoercionAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CoercionAction valueOf(String)
- **static** CoercionAction[] values()

### Class: com.fasterxml.jackson.databind.cfg.CoercionConfig
Type: Class
Implements: java.io.Serializable

Methods:
- CoercionAction findAction(CoercionInputShape)
- Boolean getAcceptBlankAsEmpty()

### Class: com.fasterxml.jackson.databind.cfg.CoercionConfigs
Type: Class
Implements: java.io.Serializable

Methods:
- MutableCoercionConfig defaultCoercions()
- CoercionAction findCoercion(DeserializationConfig, LogicalType, Class, CoercionInputShape)
- CoercionConfigs copy()
- CoercionAction findCoercionFromBlankString(DeserializationConfig, LogicalType, Class, CoercionAction)
- MutableCoercionConfig findOrCreateCoercion(LogicalType)
- MutableCoercionConfig findOrCreateCoercion(Class)

### Class: com.fasterxml.jackson.databind.cfg.CoercionInputShape
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CoercionInputShape valueOf(String)
- **static** CoercionInputShape[] values()

### Class: com.fasterxml.jackson.databind.cfg.ConfigOverride
Type: Abstract Class

Methods:
- Boolean getMergeable()
- JsonInclude$Value getInclude()
- JsonIgnoreProperties$Value getIgnorals()
- JsonFormat$Value getFormat()
- Boolean getIsIgnoredType()
- JsonAutoDetect$Value getVisibility()
- JsonSetter$Value getSetterInfo()
- JsonInclude$Value getIncludeAsProperty()
- **static** ConfigOverride empty()

### Class: com.fasterxml.jackson.databind.cfg.ConfigOverrides
Type: Class
Implements: java.io.Serializable

Methods:
- void setDefaultLeniency(Boolean)
- Boolean getDefaultLeniency()
- void setDefaultSetterInfo(JsonSetter$Value)
- void setDefaultInclusion(JsonInclude$Value)
- Boolean getDefaultMergeable()
- JsonSetter$Value getDefaultSetterInfo()
- JsonInclude$Value getDefaultInclusion()
- VisibilityChecker getDefaultVisibility()
- void setDefaultVisibility(VisibilityChecker)
- JsonFormat$Value findFormatDefaults(Class)
- ConfigOverride findOverride(Class)
- void setDefaultMergeable(Boolean)
- ConfigOverrides copy()
- MutableConfigOverride findOrCreateOverride(Class)

### Class: com.fasterxml.jackson.databind.cfg.ConstructorDetector
Type: Class
Implements: java.io.Serializable

Methods:
- ConstructorDetector withAllowJDKTypeConstructors(boolean)
- boolean singleArgCreatorDefaultsToProperties()
- boolean allowJDKTypeConstructors()
- ConstructorDetector withSingleArgMode(ConstructorDetector$SingleArgConstructor)
- ConstructorDetector withRequireAnnotation(boolean)
- boolean singleArgCreatorDefaultsToDelegating()
- boolean requireCtorAnnotation()
- ConstructorDetector$SingleArgConstructor singleArgMode()
- boolean shouldIntrospectorImplicitConstructors(Class)

### Class: com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ConstructorDetector$SingleArgConstructor valueOf(String)
- **static** ConstructorDetector$SingleArgConstructor[] values()

### Class: com.fasterxml.jackson.databind.cfg.ContextAttributes
Type: Abstract Class

Methods:
- Object getAttribute(Object)
- ContextAttributes withSharedAttributes(Map)
- ContextAttributes withSharedAttribute(Object, Object)
- **static** ContextAttributes getEmpty()
- ContextAttributes withPerCallAttribute(Object, Object)
- ContextAttributes withoutSharedAttribute(Object)

### Class: com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.ContextAttributes
Implements: java.io.Serializable

Methods:
- Object getAttribute(Object)
- ContextAttributes withSharedAttributes(Map)
- ContextAttributes withSharedAttribute(Object, Object)
- **static** ContextAttributes getEmpty()
- ContextAttributes withPerCallAttribute(Object, Object)
- ContextAttributes withoutSharedAttribute(Object)

### Class: com.fasterxml.jackson.databind.cfg.DatatypeFeatures
Type: Class
Implements: java.io.Serializable

Methods:
- DatatypeFeatures withoutFeatures(DatatypeFeature[])
- DatatypeFeatures with(DatatypeFeature)
- boolean isExplicitlySet(DatatypeFeature)
- boolean isEnabled(DatatypeFeature)
- Boolean getExplicitState(DatatypeFeature)
- **static** DatatypeFeatures defaultFeatures()
- DatatypeFeatures without(DatatypeFeature)
- DatatypeFeatures withFeatures(DatatypeFeature[])

### Class: com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig
Type: Class
Implements: java.io.Serializable

Methods:
- DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers)
- DeserializerFactoryConfig withAdditionalDeserializers(Deserializers)
- boolean hasAbstractTypeResolvers()
- DeserializerFactoryConfig withAbstractTypeResolver(AbstractTypeResolver)
- Iterable keyDeserializers()
- Iterable deserializers()
- boolean hasDeserializerModifiers()
- boolean hasDeserializers()
- Iterable valueInstantiators()
- DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier)
- boolean hasValueInstantiators()
- Iterable abstractTypeResolvers()
- boolean hasKeyDeserializers()
- Iterable deserializerModifiers()
- DeserializerFactoryConfig withValueInstantiators(ValueInstantiators)

### Class: com.fasterxml.jackson.databind.cfg.EnumFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.databind.cfg.DatatypeFeature

Methods:
- int getMask()
- int featureIndex()
- **static** EnumFeature valueOf(String)
- **static** EnumFeature[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.databind.cfg.HandlerInstantiator
Type: Abstract Class

Methods:
- Converter converterInstance(MapperConfig, Annotated, Class)
- ObjectIdResolver resolverIdGeneratorInstance(MapperConfig, Annotated, Class)
- JsonDeserializer deserializerInstance(DeserializationConfig, Annotated, Class)
- Object includeFilterInstance(SerializationConfig, BeanPropertyDefinition, Class)
- JsonSerializer serializerInstance(SerializationConfig, Annotated, Class)
- VirtualBeanPropertyWriter virtualPropertyWriterInstance(MapperConfig, Class)
- TypeIdResolver typeIdResolverInstance(MapperConfig, Annotated, Class)
- KeyDeserializer keyDeserializerInstance(DeserializationConfig, Annotated, Class)
- TypeResolverBuilder typeResolverBuilderInstance(MapperConfig, Annotated, Class)
- PropertyNamingStrategy namingStrategyInstance(MapperConfig, Annotated, Class)
- ValueInstantiator valueInstantiatorInstance(MapperConfig, Annotated, Class)
- ObjectIdGenerator objectIdGeneratorInstance(MapperConfig, Annotated, Class)

### Class: com.fasterxml.jackson.databind.cfg.JsonNodeFeature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.databind.cfg.DatatypeFeature

Methods:
- int getMask()
- int featureIndex()
- **static** JsonNodeFeature valueOf(String)
- **static** JsonNodeFeature[] values()
- boolean enabledByDefault()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.databind.cfg.MapperBuilder
Type: Abstract Class

Methods:
- MapperBuilder addModules(Module[])
- MapperBuilder addModules(Iterable)
- MapperBuilder defaultBase64Variant(Base64Variant)
- MapperBuilder defaultDateFormat(DateFormat)
- MapperBuilder removeMixIn(Class)
- MapperBuilder polymorphicTypeValidator(PolymorphicTypeValidator)
- MapperBuilder accessorNaming(AccessorNamingStrategy$Provider)
- MapperBuilder withCoercionConfigDefaults(Consumer)
- MapperBuilder withCoercionConfig(LogicalType, Consumer)
- MapperBuilder withCoercionConfig(Class, Consumer)
- MapperBuilder registerSubtypes(Class[])
- MapperBuilder registerSubtypes(NamedType[])
- MapperBuilder registerSubtypes(Collection)
- MapperBuilder serializerFactory(SerializerFactory)
- MapperBuilder defaultSetterInfo(JsonSetter$Value)
- MapperBuilder propertyNamingStrategy(PropertyNamingStrategy)
- MapperBuilder activateDefaultTyping(PolymorphicTypeValidator)
- MapperBuilder activateDefaultTyping(PolymorphicTypeValidator, ObjectMapper$DefaultTyping)
- MapperBuilder activateDefaultTyping(PolymorphicTypeValidator, ObjectMapper$DefaultTyping, JsonTypeInfo$As)
- MapperBuilder addMixIn(Class, Class)
- MapperBuilder clearProblemHandlers()
- MapperBuilder constructorDetector(ConstructorDetector)
- MapperBuilder enable(MapperFeature[])
- MapperBuilder enable(SerializationFeature[])
- MapperBuilder enable(DeserializationFeature[])
- MapperBuilder enable(DatatypeFeature[])
- MapperBuilder enable(JsonParser$Feature[])
- MapperBuilder enable(JsonGenerator$Feature[])
- MapperBuilder enable(StreamReadFeature[])
- MapperBuilder enable(StreamWriteFeature[])
- MapperBuilder handlerInstantiator(HandlerInstantiator)
- MapperBuilder deactivateDefaultTyping()
- MapperBuilder defaultPrettyPrinter(PrettyPrinter)
- MapperBuilder activateDefaultTypingAsProperty(PolymorphicTypeValidator, ObjectMapper$DefaultTyping, String)
- MapperBuilder addHandler(DeserializationProblemHandler)
- MapperBuilder defaultMergeable(Boolean)
- MapperBuilder visibility(VisibilityChecker)
- MapperBuilder visibility(PropertyAccessor, JsonAutoDetect$Visibility)
- MapperBuilder filterProvider(FilterProvider)
- MapperBuilder defaultAttributes(ContextAttributes)
- MapperBuilder configure(MapperFeature, boolean)
- MapperBuilder configure(SerializationFeature, boolean)
- MapperBuilder configure(DeserializationFeature, boolean)
- MapperBuilder configure(DatatypeFeature, boolean)
- MapperBuilder configure(JsonParser$Feature, boolean)
- MapperBuilder configure(JsonGenerator$Feature, boolean)
- MapperBuilder configure(StreamReadFeature, boolean)
- MapperBuilder configure(StreamWriteFeature, boolean)
- MapperBuilder setDefaultTyping(TypeResolverBuilder)
- MapperBuilder defaultLeniency(Boolean)
- MapperBuilder addModule(Module)
- MapperBuilder defaultLocale(Locale)
- MapperBuilder annotationIntrospector(AnnotationIntrospector)
- MapperBuilder findAndAddModules()
- MapperBuilder defaultPropertyInclusion(JsonInclude$Value)
- MapperBuilder subtypeResolver(SubtypeResolver)
- MapperBuilder typeFactory(TypeFactory)
- MapperBuilder defaultTimeZone(TimeZone)
- **static** List findModules()
- **static** List findModules(ClassLoader)
- TokenStreamFactory streamFactory()
- MapperBuilder withConfigOverride(Class, Consumer)
- ObjectMapper build()
- MapperBuilder injectableValues(InjectableValues)
- MapperBuilder disable(MapperFeature[])
- MapperBuilder disable(SerializationFeature[])
- MapperBuilder disable(DeserializationFeature[])
- MapperBuilder disable(DatatypeFeature[])
- MapperBuilder disable(JsonParser$Feature[])
- MapperBuilder disable(JsonGenerator$Feature[])
- MapperBuilder disable(StreamReadFeature[])
- MapperBuilder disable(StreamWriteFeature[])
- boolean isEnabled(MapperFeature)
- boolean isEnabled(DeserializationFeature)
- boolean isEnabled(SerializationFeature)
- boolean isEnabled(JsonParser$Feature)
- boolean isEnabled(JsonGenerator$Feature)
- MapperBuilder nodeFactory(JsonNodeFactory)
- MapperBuilder serializationInclusion(JsonInclude$Include)

### Class: com.fasterxml.jackson.databind.cfg.MapperConfig
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver, java.io.Serializable

Methods:
- JsonFormat$Value getDefaultPropertyFormat(Class)
- JavaType constructType(Class)
- JavaType constructType(TypeReference)
- boolean shouldSortPropertiesAlphabetically()
- TimeZone getTimeZone()
- JsonIgnoreProperties$Value getDefaultPropertyIgnorals(Class)
- JsonIgnoreProperties$Value getDefaultPropertyIgnorals(Class, AnnotatedClass)
- PropertyNamingStrategy getPropertyNamingStrategy()
- TypeIdResolver typeIdResolverInstance(Annotated, Class)
- Boolean getDefaultMergeable()
- Boolean getDefaultMergeable(Class)
- boolean canOverrideAccessModifiers()
- JsonSetter$Value getDefaultSetterInfo()
- JsonInclude$Value getDefaultInclusion(Class, Class)
- JsonInclude$Value getDefaultInclusion(Class, Class, JsonInclude$Value)
- BeanDescription introspectClassAnnotations(Class)
- BeanDescription introspectClassAnnotations(JavaType)
- MapperConfig without(MapperFeature[])
- JsonIncludeProperties$Value getDefaultPropertyInclusions(Class, AnnotatedClass)
- Base64Variant getBase64Variant()
- boolean useRootWrapping()
- Class getActiveView()
- JavaType constructSpecializedType(JavaType, Class)
- HandlerInstantiator getHandlerInstantiator()
- SubtypeResolver getSubtypeResolver()
- ClassIntrospector getClassIntrospector()
- ConfigOverride getConfigOverride(Class)
- ConfigOverride findConfigOverride(Class)
- PropertyName findRootName(JavaType)
- PropertyName findRootName(Class)
- TypeFactory getTypeFactory()
- ContextAttributes getAttributes()
- boolean hasExplicitTimeZone()
- VisibilityChecker getDefaultVisibilityChecker()
- VisibilityChecker getDefaultVisibilityChecker(Class, AnnotatedClass)
- AccessorNamingStrategy$Provider getAccessorNaming()
- AnnotationIntrospector getAnnotationIntrospector()
- PolymorphicTypeValidator getPolymorphicTypeValidator()
- boolean hasMapperFeatures(int)
- MapperConfig with(MapperFeature[])
- MapperConfig with(MapperFeature, boolean)
- **static** int collectFeatureDefaults(Class)
- SerializableString compileString(String)
- boolean isEnabled(MapperFeature)
- BeanDescription introspectDirectClassAnnotations(Class)
- BeanDescription introspectDirectClassAnnotations(JavaType)
- DateFormat getDateFormat()
- TypeResolverBuilder getDefaultTyper(JavaType)
- TypeResolverBuilder typeResolverBuilderInstance(Annotated, Class)
- Locale getLocale()
- JsonInclude$Value getDefaultPropertyInclusion()
- JsonInclude$Value getDefaultPropertyInclusion(Class)
- JsonInclude$Value getDefaultPropertyInclusion(Class, JsonInclude$Value)
- boolean isAnnotationProcessingEnabled()

### Class: com.fasterxml.jackson.databind.cfg.MapperConfigBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.cfg.MapperConfig
Implements: java.io.Serializable

Methods:
- MapperConfigBase withAttributes(Map)
- JsonFormat$Value getDefaultPropertyFormat(Class)
- MapperConfigBase withAttribute(Object, Object)
- MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector)
- JsonIgnoreProperties$Value getDefaultPropertyIgnorals(Class)
- JsonIgnoreProperties$Value getDefaultPropertyIgnorals(Class, AnnotatedClass)
- int mixInCount()
- Boolean getDefaultMergeable()
- Boolean getDefaultMergeable(Class)
- JsonSetter$Value getDefaultSetterInfo()
- JsonInclude$Value getDefaultInclusion(Class, Class)
- MapperConfigBase without(MapperFeature[])
- MapperConfigBase without(DatatypeFeature)
- MapperConfig without(MapperFeature[])
- JsonIncludeProperties$Value getDefaultPropertyInclusions(Class, AnnotatedClass)
- Class getActiveView()
- SubtypeResolver getSubtypeResolver()
- ClassIntrospector$MixInResolver copy()
- ConfigOverride getConfigOverride(Class)
- ConfigOverride findConfigOverride(Class)
- MapperConfigBase withFeatures(DatatypeFeature[])
- MapperConfigBase withoutAttribute(Object)
- MapperConfigBase withoutFeatures(DatatypeFeature[])
- PropertyName findRootName(JavaType)
- PropertyName findRootName(Class)
- ContextAttributes getAttributes()
- MapperConfigBase withView(Class)
- Class findMixInClassFor(Class)
- VisibilityChecker getDefaultVisibilityChecker()
- VisibilityChecker getDefaultVisibilityChecker(Class, AnnotatedClass)
- String getRootName()
- MapperConfigBase withRootName(PropertyName)
- MapperConfigBase withRootName(String)
- MapperConfigBase with(MapperFeature[])
- MapperConfigBase with(MapperFeature, boolean)
- MapperConfigBase with(DatatypeFeature)
- MapperConfigBase with(DatatypeFeature, boolean)
- MapperConfigBase with(AnnotationIntrospector)
- MapperConfigBase with(ClassIntrospector)
- MapperConfigBase with(ContextAttributes)
- MapperConfigBase with(TypeFactory)
- MapperConfigBase with(TypeResolverBuilder)
- MapperConfigBase with(PropertyNamingStrategy)
- MapperConfigBase with(AccessorNamingStrategy$Provider)
- MapperConfigBase with(HandlerInstantiator)
- MapperConfigBase with(Base64Variant)
- MapperConfigBase with(DateFormat)
- MapperConfigBase with(Locale)
- MapperConfigBase with(TimeZone)
- MapperConfigBase with(SubtypeResolver)
- MapperConfig with(MapperFeature, boolean)
- MapperConfig with(MapperFeature[])
- PropertyName getFullRootName()
- MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector)
- JsonInclude$Value getDefaultPropertyInclusion()
- JsonInclude$Value getDefaultPropertyInclusion(Class)

### Class: com.fasterxml.jackson.databind.cfg.MutableCoercionConfig
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.CoercionConfig
Implements: java.io.Serializable

Methods:
- MutableCoercionConfig setAcceptBlankAsEmpty(Boolean)
- MutableCoercionConfig setCoercion(CoercionInputShape, CoercionAction)
- MutableCoercionConfig copy()

### Class: com.fasterxml.jackson.databind.cfg.MutableConfigOverride
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.ConfigOverride
Implements: java.io.Serializable

Methods:
- MutableConfigOverride setMergeable(Boolean)
- MutableConfigOverride setIgnorals(JsonIgnoreProperties$Value)
- MutableConfigOverride setIncludeAsProperty(JsonInclude$Value)
- MutableConfigOverride setInclude(JsonInclude$Value)
- MutableConfigOverride setFormat(JsonFormat$Value)
- MutableConfigOverride setIsIgnoredType(Boolean)
- MutableConfigOverride copy()
- MutableConfigOverride setVisibility(JsonAutoDetect$Value)
- MutableConfigOverride setSetterInfo(JsonSetter$Value)

### Class: com.fasterxml.jackson.databind.cfg.PackageVersion
Type: Class
Implements: com.fasterxml.jackson.core.Versioned

Methods:
- Version version()

### Class: com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig
Type: Class
Implements: java.io.Serializable

Methods:
- SerializerFactoryConfig withSerializerModifier(BeanSerializerModifier)
- Iterable serializers()
- SerializerFactoryConfig withAdditionalKeySerializers(Serializers)
- SerializerFactoryConfig withAdditionalSerializers(Serializers)
- Iterable serializerModifiers()
- Iterable keySerializers()
- boolean hasKeySerializers()
- boolean hasSerializerModifiers()
- boolean hasSerializers()

## Package: com.fasterxml.jackson.databind.deser

### Class: com.fasterxml.jackson.databind.deser.ContextualDeserializer
Type: Interface

Methods:
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer
Type: Interface

Methods:
- KeyDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.Deserializers
Type: Interface

Methods:
- JsonDeserializer findMapLikeDeserializer(MapLikeType, DeserializationConfig, BeanDescription, KeyDeserializer, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findEnumDeserializer(Class, DeserializationConfig, BeanDescription) throws JsonMappingException
- JsonDeserializer findBeanDeserializer(JavaType, DeserializationConfig, BeanDescription) throws JsonMappingException
- boolean hasDeserializerFor(DeserializationConfig, Class)
- JsonDeserializer findTreeNodeDeserializer(Class, DeserializationConfig, BeanDescription) throws JsonMappingException
- JsonDeserializer findCollectionDeserializer(CollectionType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findMapDeserializer(MapType, DeserializationConfig, BeanDescription, KeyDeserializer, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findReferenceDeserializer(ReferenceType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findArrayDeserializer(ArrayType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.KeyDeserializers
Type: Interface

Methods:
- KeyDeserializer findKeyDeserializer(JavaType, DeserializationConfig, BeanDescription) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.NullValueProvider
Type: Interface

Methods:
- Object getNullValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Object getAbsentValue(DeserializationContext) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.ResolvableDeserializer
Type: Interface

Methods:
- void resolve(DeserializationContext) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.ValueInstantiator$Gettable
Type: Interface

Methods:
- ValueInstantiator getValueInstantiator()

### Class: com.fasterxml.jackson.databind.deser.ValueInstantiators
Type: Interface

Methods:
- ValueInstantiator findValueInstantiator(DeserializationConfig, BeanDescription, ValueInstantiator)

### Class: com.fasterxml.jackson.databind.deser.AbstractDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.JsonDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer, java.io.Serializable

Methods:
- LogicalType logicalType()
- **static** AbstractDeserializer constructForNonPOJO(BeanDescription)
- ObjectIdReader getObjectIdReader()
- Boolean supportsUpdate(DeserializationConfig)
- boolean isCachable()
- Class handledType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- SettableBeanProperty findBackReference(String)

### Class: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.DeserializerFactory
Implements: java.io.Serializable

Methods:
- JsonDeserializer createCollectionDeserializer(DeserializationContext, CollectionType, BeanDescription) throws JsonMappingException
- DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers)
- JsonDeserializer createArrayDeserializer(DeserializationContext, ArrayType, BeanDescription) throws JsonMappingException
- JsonDeserializer createReferenceDeserializer(DeserializationContext, ReferenceType, BeanDescription) throws JsonMappingException
- JsonDeserializer createCollectionLikeDeserializer(DeserializationContext, CollectionLikeType, BeanDescription) throws JsonMappingException
- DeserializerFactory withAdditionalDeserializers(Deserializers)
- TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig, JavaType, AnnotatedMember) throws JsonMappingException
- DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver)
- JsonDeserializer createTreeDeserializer(DeserializationConfig, JavaType, BeanDescription) throws JsonMappingException
- JsonDeserializer createMapDeserializer(DeserializationContext, MapType, BeanDescription) throws JsonMappingException
- KeyDeserializer createKeyDeserializer(DeserializationContext, JavaType) throws JsonMappingException
- JsonDeserializer createEnumDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException
- DeserializerFactoryConfig getFactoryConfig()
- boolean hasExplicitDeserializerFor(DeserializationConfig, Class)
- JsonDeserializer findDefaultDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException
- JavaType mapAbstractType(DeserializationConfig, JavaType) throws JsonMappingException
- ValueInstantiator findValueInstantiator(DeserializationContext, BeanDescription) throws JsonMappingException
- JsonDeserializer createMapLikeDeserializer(DeserializationContext, MapLikeType, BeanDescription) throws JsonMappingException
- TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig, JavaType, AnnotatedMember) throws JsonMappingException
- ValueInstantiator _valueInstantiatorInstance(DeserializationConfig, Annotated, Object) throws JsonMappingException
- DeserializerFactory withDeserializerModifier(BeanDeserializerModifier)
- TypeDeserializer findTypeDeserializer(DeserializationConfig, JavaType) throws JsonMappingException
- DeserializerFactory withValueInstantiators(ValueInstantiators)

### Class: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$ContainerDefaultMappings
Type: Class

Methods:
- **static** Class findCollectionFallback(JavaType)
- **static** Class findMapFallback(JavaType)

### Class: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$CreatorCollectionState
Type: Class

Methods:
- AnnotationIntrospector annotationIntrospector()
- boolean hasExplicitFactories()
- void increaseExplicitConstructorCount()
- void addImplicitConstructorCandidate(CreatorCandidate)
- List implicitConstructorCandidates()
- void increaseExplicitFactoryCount()
- void addImplicitFactoryCandidate(CreatorCandidate)
- List implicitFactoryCandidates()
- boolean hasImplicitFactoryCandidates()
- boolean hasExplicitConstructors()
- boolean hasImplicitConstructorCandidates()

### Class: com.fasterxml.jackson.databind.deser.BeanDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.BeanDeserializerBase
Implements: java.io.Serializable

Methods:
- BeanDeserializer withObjectIdReader(ObjectIdReader)
- BeanDeserializerBase withObjectIdReader(ObjectIdReader)
- BeanDeserializerBase withBeanProperties(BeanPropertyMap)
- Object deserializeFromObject(JsonParser, DeserializationContext) throws IOException
- BeanDeserializer withByNameInclusion(Set, Set)
- BeanDeserializerBase withByNameInclusion(Set, Set)
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- BeanDeserializerBase withIgnoreAllUnknown(boolean)
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.BeanDeserializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer, com.fasterxml.jackson.databind.deser.ResolvableDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator$Gettable, java.io.Serializable

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- void resolve(DeserializationContext) throws JsonMappingException
- void wrapAndThrow(Throwable, Object, String, DeserializationContext) throws IOException
- Object deserializeFromNumber(JsonParser, DeserializationContext) throws IOException
- Object deserializeFromString(JsonParser, DeserializationContext) throws IOException
- Object deserializeFromBoolean(JsonParser, DeserializationContext) throws IOException
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- BeanDeserializerBase withIgnoreAllUnknown(boolean)
- BeanDeserializerBase withObjectIdReader(ObjectIdReader)
- int getPropertyCount()
- boolean hasViews()
- BeanDeserializerBase withIgnorableProperties(Set)
- void replaceProperty(SettableBeanProperty, SettableBeanProperty)
- Boolean supportsUpdate(DeserializationConfig)
- AccessPattern getNullAccessPattern()
- JavaType getValueType()
- AccessPattern getEmptyAccessPattern()
- SettableBeanProperty findBackReference(String)
- ValueInstantiator getValueInstantiator()
- BeanDeserializerBase withBeanProperties(BeanPropertyMap)
- Iterator creatorProperties()
- Collection getKnownPropertyNames()
- SettableBeanProperty findProperty(PropertyName)
- SettableBeanProperty findProperty(String)
- SettableBeanProperty findProperty(int)
- boolean isCaseInsensitive()
- BeanDeserializerBase withByNameInclusion(Set, Set)
- Class handledType()
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- boolean hasProperty(String)
- Object deserializeFromDouble(JsonParser, DeserializationContext) throws IOException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserializeFromObject(JsonParser, DeserializationContext) throws IOException
- Class getBeanClass()
- ObjectIdReader getObjectIdReader()
- boolean isCachable()
- Object deserializeFromEmbedded(JsonParser, DeserializationContext) throws IOException
- Object deserializeFromArray(JsonParser, DeserializationContext) throws IOException
- Iterator properties()

### Class: com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder
Type: Class

Methods:
- void addBackReferenceProperty(String, SettableBeanProperty) throws JsonMappingException
- void setValueInstantiator(ValueInstantiator)
- SettableAnyProperty getAnySetter()
- JsonDeserializer buildBuilderBased(JavaType, String) throws JsonMappingException
- void addIgnorable(String)
- ValueInstantiator getValueInstantiator()
- void setPOJOBuilder(AnnotatedMethod, JsonPOJOBuilder$Value)
- void setAnySetter(SettableAnyProperty)
- AnnotatedMethod getBuildMethod()
- void addOrReplaceProperty(SettableBeanProperty, boolean)
- void addInjectable(PropertyName, JavaType, Annotations, AnnotatedMember, Object) throws JsonMappingException
- Iterator getProperties()
- void addCreatorProperty(SettableBeanProperty)
- SettableBeanProperty findProperty(PropertyName)
- boolean hasIgnorable(String)
- List getInjectables()
- boolean hasProperty(PropertyName)
- void addProperty(SettableBeanProperty)
- void setIgnoreUnknownProperties(boolean)
- AbstractDeserializer buildAbstract()
- JsonDeserializer build() throws JsonMappingException
- ObjectIdReader getObjectIdReader()
- JsonPOJOBuilder$Value getBuilderConfig()
- void addIncludable(String)
- SettableBeanProperty removeProperty(PropertyName)
- void setObjectIdReader(ObjectIdReader)

### Class: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory
Type: Class
Extends: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
Implements: java.io.Serializable

Methods:
- JsonDeserializer buildThrowableDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException
- DeserializerFactory withConfig(DeserializerFactoryConfig)
- JsonDeserializer buildBeanDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException
- JsonDeserializer createBuilderBasedDeserializer(DeserializationContext, JavaType, BeanDescription, Class) throws JsonMappingException
- JsonDeserializer createBeanDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.BeanDeserializerModifier
Type: Abstract Class

Methods:
- JsonDeserializer modifyEnumDeserializer(DeserializationConfig, JavaType, BeanDescription, JsonDeserializer)
- JsonDeserializer modifyCollectionDeserializer(DeserializationConfig, CollectionType, BeanDescription, JsonDeserializer)
- JsonDeserializer modifyReferenceDeserializer(DeserializationConfig, ReferenceType, BeanDescription, JsonDeserializer)
- JsonDeserializer modifyMapDeserializer(DeserializationConfig, MapType, BeanDescription, JsonDeserializer)
- KeyDeserializer modifyKeyDeserializer(DeserializationConfig, JavaType, KeyDeserializer)
- List updateProperties(DeserializationConfig, BeanDescription, List)
- JsonDeserializer modifyArrayDeserializer(DeserializationConfig, ArrayType, BeanDescription, JsonDeserializer)
- JsonDeserializer modifyMapLikeDeserializer(DeserializationConfig, MapLikeType, BeanDescription, JsonDeserializer)
- JsonDeserializer modifyCollectionLikeDeserializer(DeserializationConfig, CollectionLikeType, BeanDescription, JsonDeserializer)
- BeanDeserializerBuilder updateBuilder(DeserializationConfig, BeanDescription, BeanDeserializerBuilder)
- JsonDeserializer modifyDeserializer(DeserializationConfig, BeanDescription, JsonDeserializer)

### Class: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.BeanDeserializerBase

Methods:
- BeanDeserializerBase withObjectIdReader(ObjectIdReader)
- BeanDeserializerBase withBeanProperties(BeanPropertyMap)
- Object deserializeFromObject(JsonParser, DeserializationContext) throws IOException
- Boolean supportsUpdate(DeserializationConfig)
- BeanDeserializerBase withByNameInclusion(Set, Set)
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- BeanDeserializerBase withIgnoreAllUnknown(boolean)
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.CreatorProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- void fixAccess(DeserializationConfig)
- PropertyMetadata getMetadata()
- void setFallbackSetter(SettableBeanProperty)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- void markAsIgnorable()
- **static** CreatorProperty construct(PropertyName, JavaType, PropertyName, TypeDeserializer, Annotations, AnnotatedParameter, int, JacksonInject$Value, PropertyMetadata)
- Object findInjectableValue(DeserializationContext, Object) throws JsonMappingException
- boolean isIgnorable()
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- boolean isInjectionOnly()
- Annotation getAnnotation(Class)
- Object setAndReturn(Object, Object) throws IOException
- String toString()
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)
- int getCreatorIndex()
- void inject(DeserializationContext, Object) throws IOException
- Object getInjectableValueId()

### Class: com.fasterxml.jackson.databind.deser.DataFormatReaders
Type: Class

Methods:
- DataFormatReaders with(ObjectReader[])
- DataFormatReaders with(DeserializationConfig)
- DataFormatReaders$Match findFormat(InputStream) throws IOException
- DataFormatReaders$Match findFormat(byte[]) throws IOException
- DataFormatReaders$Match findFormat(byte[], int, int) throws IOException
- DataFormatReaders withMaxInputLookahead(int)
- String toString()
- DataFormatReaders withOptimalMatch(MatchStrength)
- DataFormatReaders withType(JavaType)
- DataFormatReaders withMinimalMatch(MatchStrength)

### Class: com.fasterxml.jackson.databind.deser.DataFormatReaders$AccessorForReader
Type: Class
Extends: com.fasterxml.jackson.core.format.InputAccessor$Std

Methods:
- DataFormatReaders$Match createMatcher(ObjectReader, MatchStrength)

### Class: com.fasterxml.jackson.databind.deser.DataFormatReaders$Match
Type: Class

Methods:
- String getMatchedFormatName()
- ObjectReader getReader()
- boolean hasMatch()
- JsonParser createParserWithMatch() throws IOException
- InputStream getDataStream()
- MatchStrength getMatchStrength()

### Class: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.DeserializationContext
Implements: java.io.Serializable

Methods:
- DefaultDeserializationContext with(DeserializerFactory)
- DefaultDeserializationContext createInstance(DeserializationConfig, JsonParser, InjectableValues)
- JsonDeserializer deserializerInstance(Annotated, Object) throws JsonMappingException
- KeyDeserializer keyDeserializerInstance(Annotated, Object) throws JsonMappingException
- DefaultDeserializationContext copy()
- DefaultDeserializationContext createDummyInstance(DeserializationConfig)
- Object readRootValue(JsonParser, JavaType, JsonDeserializer, Object) throws IOException
- ReadableObjectId findObjectId(Object, ObjectIdGenerator, ObjectIdResolver)
- void checkUnresolvedObjectId() throws UnresolvedForwardReference

### Class: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl
Type: Class
Extends: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext

Methods:
- DefaultDeserializationContext with(DeserializerFactory)
- DefaultDeserializationContext createInstance(DeserializationConfig, JsonParser, InjectableValues)
- DefaultDeserializationContext copy()
- DefaultDeserializationContext createDummyInstance(DeserializationConfig)

### Class: com.fasterxml.jackson.databind.deser.DeserializationProblemHandler
Type: Abstract Class

Methods:
- Object handleUnexpectedToken(DeserializationContext, Class, JsonToken, JsonParser, String) throws IOException
- Object handleUnexpectedToken(DeserializationContext, JavaType, JsonToken, JsonParser, String) throws IOException
- JavaType handleMissingTypeId(DeserializationContext, JavaType, TypeIdResolver, String) throws IOException
- Object handleInstantiationProblem(DeserializationContext, Class, Object, Throwable) throws IOException
- Object handleWeirdNumberValue(DeserializationContext, Class, Number, String) throws IOException
- Object handleMissingInstantiator(DeserializationContext, Class, ValueInstantiator, JsonParser, String) throws IOException
- Object handleMissingInstantiator(DeserializationContext, Class, JsonParser, String) throws IOException
- Object handleWeirdNativeValue(DeserializationContext, JavaType, Object, JsonParser) throws IOException
- Object handleWeirdKey(DeserializationContext, Class, String, String) throws IOException
- JavaType handleUnknownTypeId(DeserializationContext, JavaType, String, TypeIdResolver, String) throws IOException
- boolean handleUnknownProperty(DeserializationContext, JsonParser, JsonDeserializer, Object, String) throws IOException
- Object handleWeirdStringValue(DeserializationContext, Class, String, String) throws IOException

### Class: com.fasterxml.jackson.databind.deser.DeserializerCache
Type: Class
Implements: java.io.Serializable

Methods:
- void flushCachedDeserializers()
- KeyDeserializer findKeyDeserializer(DeserializationContext, DeserializerFactory, JavaType) throws JsonMappingException
- int cachedDeserializersCount()
- JsonDeserializer findValueDeserializer(DeserializationContext, DeserializerFactory, JavaType) throws JsonMappingException
- boolean hasValueDeserializerFor(DeserializationContext, DeserializerFactory, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.DeserializerFactory
Type: Abstract Class

Methods:
- JsonDeserializer createCollectionDeserializer(DeserializationContext, CollectionType, BeanDescription) throws JsonMappingException
- DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers)
- JsonDeserializer createArrayDeserializer(DeserializationContext, ArrayType, BeanDescription) throws JsonMappingException
- JsonDeserializer createReferenceDeserializer(DeserializationContext, ReferenceType, BeanDescription) throws JsonMappingException
- JsonDeserializer createCollectionLikeDeserializer(DeserializationContext, CollectionLikeType, BeanDescription) throws JsonMappingException
- DeserializerFactory withAdditionalDeserializers(Deserializers)
- JsonDeserializer createBuilderBasedDeserializer(DeserializationContext, JavaType, BeanDescription, Class) throws JsonMappingException
- DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver)
- JsonDeserializer createTreeDeserializer(DeserializationConfig, JavaType, BeanDescription) throws JsonMappingException
- JsonDeserializer createMapDeserializer(DeserializationContext, MapType, BeanDescription) throws JsonMappingException
- KeyDeserializer createKeyDeserializer(DeserializationContext, JavaType) throws JsonMappingException
- JsonDeserializer createEnumDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException
- boolean hasExplicitDeserializerFor(DeserializationConfig, Class)
- JavaType mapAbstractType(DeserializationConfig, JavaType) throws JsonMappingException
- ValueInstantiator findValueInstantiator(DeserializationContext, BeanDescription) throws JsonMappingException
- JsonDeserializer createMapLikeDeserializer(DeserializationContext, MapLikeType, BeanDescription) throws JsonMappingException
- JsonDeserializer createBeanDeserializer(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException
- DeserializerFactory withDeserializerModifier(BeanDeserializerModifier)
- TypeDeserializer findTypeDeserializer(DeserializationConfig, JavaType) throws JsonMappingException
- DeserializerFactory withValueInstantiators(ValueInstantiators)

### Class: com.fasterxml.jackson.databind.deser.Deserializers$Base
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.deser.Deserializers

Methods:
- JsonDeserializer findMapLikeDeserializer(MapLikeType, DeserializationConfig, BeanDescription, KeyDeserializer, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findEnumDeserializer(Class, DeserializationConfig, BeanDescription) throws JsonMappingException
- JsonDeserializer findBeanDeserializer(JavaType, DeserializationConfig, BeanDescription) throws JsonMappingException
- JsonDeserializer findTreeNodeDeserializer(Class, DeserializationConfig, BeanDescription) throws JsonMappingException
- JsonDeserializer findCollectionDeserializer(CollectionType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findMapDeserializer(MapType, DeserializationConfig, BeanDescription, KeyDeserializer, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findReferenceDeserializer(ReferenceType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException
- JsonDeserializer findArrayDeserializer(ArrayType, DeserializationConfig, BeanDescription, TypeDeserializer, JsonDeserializer) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.SettableAnyProperty
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- SettableAnyProperty withValueDeserializer(JsonDeserializer)
- void fixAccess(DeserializationConfig)
- **static** SettableAnyProperty constructForJsonNodeField(DeserializationContext, BeanProperty, AnnotatedMember, JavaType, JsonDeserializer)
- void set(Object, Object, Object) throws IOException
- BeanProperty getProperty()
- void deserializeAndSet(JsonParser, DeserializationContext, Object, String) throws IOException
- JavaType getType()
- **static** SettableAnyProperty constructForMapField(DeserializationContext, BeanProperty, AnnotatedMember, JavaType, KeyDeserializer, JsonDeserializer, TypeDeserializer)
- **static** SettableAnyProperty constructForMethod(DeserializationContext, BeanProperty, AnnotatedMember, JavaType, KeyDeserializer, JsonDeserializer, TypeDeserializer)
- String toString()
- boolean hasValueDeserializer()
- String getPropertyName()
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.SettableAnyProperty$JsonNodeFieldAnyProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableAnyProperty
Implements: java.io.Serializable

Methods:
- SettableAnyProperty withValueDeserializer(JsonDeserializer)
- void deserializeAndSet(JsonParser, DeserializationContext, Object, String) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.SettableAnyProperty$MapFieldAnyProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableAnyProperty
Implements: java.io.Serializable

Methods:
- SettableAnyProperty withValueDeserializer(JsonDeserializer)

### Class: com.fasterxml.jackson.databind.deser.SettableAnyProperty$MethodAnyProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableAnyProperty
Implements: java.io.Serializable

Methods:
- SettableAnyProperty withValueDeserializer(JsonDeserializer)

### Class: com.fasterxml.jackson.databind.deser.SettableBeanProperty
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
Implements: java.io.Serializable

Methods:
- void fixAccess(DeserializationConfig)
- PropertyName getWrapperName()
- String getName()
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- JsonDeserializer getValueDeserializer()
- Object deserializeWith(JsonParser, DeserializationContext, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- boolean visibleInView(Class)
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- boolean isInjectionOnly()
- boolean hasViews()
- void setManagedReferenceName(String)
- NullValueProvider getNullValueProvider()
- SettableBeanProperty withName(PropertyName)
- boolean hasValueTypeDeserializer()
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- PropertyName getFullName()
- void setObjectIdInfo(ObjectIdInfo)
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object getInjectableValueId()
- void set(Object, Object) throws IOException
- int getPropertyIndex()
- TypeDeserializer getValueTypeDeserializer()
- void markAsIgnorable()
- Annotation getContextAnnotation(Class)
- void assignIndex(int)
- boolean isIgnorable()
- String getManagedReferenceName()
- ObjectIdInfo getObjectIdInfo()
- Annotation getAnnotation(Class)
- JavaType getType()
- Object setAndReturn(Object, Object) throws IOException
- void setViews(Class[])
- String toString()
- boolean hasValueDeserializer()
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withSimpleName(String)
- int getCreatorIndex()

### Class: com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- void fixAccess(DeserializationConfig)
- void set(Object, Object) throws IOException
- int getPropertyIndex()
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- JsonDeserializer getValueDeserializer()
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- SettableBeanProperty getDelegate()
- TypeDeserializer getValueTypeDeserializer()
- void assignIndex(int)
- boolean visibleInView(Class)
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- boolean isInjectionOnly()
- String getManagedReferenceName()
- Annotation getAnnotation(Class)
- boolean hasViews()
- ObjectIdInfo getObjectIdInfo()
- Object setAndReturn(Object, Object) throws IOException
- boolean hasValueDeserializer()
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)
- boolean hasValueTypeDeserializer()
- int getCreatorIndex()
- Object getInjectableValueId()

### Class: com.fasterxml.jackson.databind.deser.UnresolvedForwardReference
Type: Class
Extends: com.fasterxml.jackson.databind.JsonMappingException

Methods:
- void addUnresolvedId(Object, Class, JsonLocation)
- List getUnresolvedIds()
- Object getUnresolvedId()
- UnresolvedForwardReference withStackTrace()
- String getMessage()
- ReadableObjectId getRoid()
- UnresolvedForwardReference fillInStackTrace()
- Throwable fillInStackTrace()

### Class: com.fasterxml.jackson.databind.deser.UnresolvedId
Type: Class

Methods:
- JsonLocation getLocation()
- Class getType()
- String toString()
- Object getId()

### Class: com.fasterxml.jackson.databind.deser.ValueInstantiator
Type: Abstract Class

Methods:
- SettableBeanProperty[] getFromObjectArguments(DeserializationConfig)
- boolean canCreateFromBigDecimal()
- Class getValueClass()
- boolean canCreateUsingDelegate()
- boolean canCreateUsingArrayDelegate()
- boolean canCreateFromObjectWith()
- ValueInstantiator createContextual(DeserializationContext, BeanDescription) throws JsonMappingException
- Object createFromBoolean(DeserializationContext, boolean) throws IOException
- Object createFromObjectWith(DeserializationContext, Object[]) throws IOException
- Object createFromObjectWith(DeserializationContext, SettableBeanProperty[], PropertyValueBuffer) throws IOException
- Object createUsingArrayDelegate(DeserializationContext, Object) throws IOException
- Object createFromString(DeserializationContext, String) throws IOException
- JavaType getDelegateType(DeserializationConfig)
- boolean canCreateFromDouble()
- boolean canCreateFromLong()
- AnnotatedWithParams getDelegateCreator()
- AnnotatedWithParams getArrayDelegateCreator()
- Object createFromDouble(DeserializationContext, double) throws IOException
- String getValueTypeDesc()
- boolean canCreateFromInt()
- boolean canInstantiate()
- Object createFromLong(DeserializationContext, long) throws IOException
- AnnotatedWithParams getWithArgsCreator()
- Object createUsingDefault(DeserializationContext) throws IOException
- boolean canCreateUsingDefault()
- Object createFromBigInteger(DeserializationContext, BigInteger) throws IOException
- Object createFromInt(DeserializationContext, int) throws IOException
- Object createFromBigDecimal(DeserializationContext, BigDecimal) throws IOException
- Object createUsingDelegate(DeserializationContext, Object) throws IOException
- boolean canCreateFromBoolean()
- JavaType getArrayDelegateType(DeserializationConfig)
- AnnotatedWithParams getDefaultCreator()
- boolean canCreateFromBigInteger()
- boolean canCreateFromString()

### Class: com.fasterxml.jackson.databind.deser.ValueInstantiator$Base
Type: Class
Extends: com.fasterxml.jackson.databind.deser.ValueInstantiator
Implements: java.io.Serializable

Methods:
- Class getValueClass()
- String getValueTypeDesc()

### Class: com.fasterxml.jackson.databind.deser.ValueInstantiator$Delegating
Type: Class
Extends: com.fasterxml.jackson.databind.deser.ValueInstantiator
Implements: java.io.Serializable

Methods:
- SettableBeanProperty[] getFromObjectArguments(DeserializationConfig)
- Class getValueClass()
- boolean canCreateUsingDelegate()
- boolean canCreateUsingArrayDelegate()
- boolean canCreateFromObjectWith()
- ValueInstantiator createContextual(DeserializationContext, BeanDescription) throws JsonMappingException
- Object createFromBoolean(DeserializationContext, boolean) throws IOException
- Object createFromObjectWith(DeserializationContext, Object[]) throws IOException
- Object createFromObjectWith(DeserializationContext, SettableBeanProperty[], PropertyValueBuffer) throws IOException
- Object createUsingArrayDelegate(DeserializationContext, Object) throws IOException
- Object createFromString(DeserializationContext, String) throws IOException
- JavaType getDelegateType(DeserializationConfig)
- boolean canCreateFromDouble()
- boolean canCreateFromLong()
- AnnotatedWithParams getDelegateCreator()
- AnnotatedWithParams getArrayDelegateCreator()
- Object createFromDouble(DeserializationContext, double) throws IOException
- String getValueTypeDesc()
- boolean canCreateFromInt()
- boolean canInstantiate()
- Object createFromLong(DeserializationContext, long) throws IOException
- AnnotatedWithParams getWithArgsCreator()
- Object createUsingDefault(DeserializationContext) throws IOException
- boolean canCreateUsingDefault()
- Object createFromBigInteger(DeserializationContext, BigInteger) throws IOException
- Object createFromInt(DeserializationContext, int) throws IOException
- Object createFromBigDecimal(DeserializationContext, BigDecimal) throws IOException
- Object createUsingDelegate(DeserializationContext, Object) throws IOException
- boolean canCreateFromBoolean()
- JavaType getArrayDelegateType(DeserializationConfig)
- AnnotatedWithParams getDefaultCreator()
- boolean canCreateFromString()

### Class: com.fasterxml.jackson.databind.deser.ValueInstantiators$Base
Type: Class
Implements: com.fasterxml.jackson.databind.deser.ValueInstantiators

Methods:
- ValueInstantiator findValueInstantiator(DeserializationConfig, BeanDescription, ValueInstantiator)

## Package: com.fasterxml.jackson.databind.deser.impl

### Class: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.BeanDeserializerBase

Methods:
- BeanDeserializerBase withObjectIdReader(ObjectIdReader)
- BeanDeserializerBase withBeanProperties(BeanPropertyMap)
- Object deserializeFromObject(JsonParser, DeserializationContext) throws IOException
- Boolean supportsUpdate(DeserializationConfig)
- BeanDeserializerBase withByNameInclusion(Set, Set)
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- BeanDeserializerBase withIgnoreAllUnknown(boolean)
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.BeanDeserializerBase

Methods:
- BeanDeserializerBase withObjectIdReader(ObjectIdReader)
- BeanDeserializerBase withBeanProperties(BeanPropertyMap)
- Object deserializeFromObject(JsonParser, DeserializationContext) throws IOException
- BeanDeserializerBase withByNameInclusion(Set, Set)
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- BeanDeserializerBase withIgnoreAllUnknown(boolean)
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap
Type: Class
Implements: java.lang.Iterable, java.io.Serializable

Methods:
- boolean hasAliases()
- BeanPropertyMap withProperty(SettableBeanProperty)
- boolean findDeserializeAndSet(JsonParser, DeserializationContext, Object, String) throws IOException
- void replace(SettableBeanProperty, SettableBeanProperty)
- boolean isCaseInsensitive()
- BeanPropertyMap withoutProperties(Collection)
- BeanPropertyMap withoutProperties(Collection, Collection)
- **static** BeanPropertyMap construct(MapperConfig, Collection, Map, boolean)
- **static** BeanPropertyMap construct(MapperConfig, Collection, Map)
- **static** BeanPropertyMap construct(Collection, boolean, Map)
- void remove(SettableBeanProperty)
- BeanPropertyMap withCaseInsensitivity(boolean)
- BeanPropertyMap renameAll(NameTransformer)
- Iterator iterator()
- int size()
- BeanPropertyMap assignIndexes()
- SettableBeanProperty find(int)
- SettableBeanProperty find(String)
- SettableBeanProperty[] getPropertiesInInsertionOrder()
- String toString()

### Class: com.fasterxml.jackson.databind.deser.impl.CreatorCandidate
Type: Class

Methods:
- PropertyName findImplicitParamName(int)
- AnnotatedWithParams creator()
- int findOnlyParamWithoutInjection()
- int paramCount()
- AnnotatedParameter parameter(int)
- String toString()
- BeanPropertyDefinition propertyDef(int)
- PropertyName explicitParamName(int)
- PropertyName paramName(int)
- **static** CreatorCandidate construct(AnnotationIntrospector, AnnotatedWithParams, BeanPropertyDefinition[])
- JacksonInject$Value injection(int)

### Class: com.fasterxml.jackson.databind.deser.impl.CreatorCandidate$Param
Type: Class

Methods:
- boolean hasFullName()
- PropertyName fullName()

### Class: com.fasterxml.jackson.databind.deser.impl.CreatorCollector
Type: Class

Methods:
- void addDelegatingCreator(AnnotatedWithParams, boolean, SettableBeanProperty[], int)
- boolean hasPropertyBasedCreator()
- void addBigDecimalCreator(AnnotatedWithParams, boolean)
- boolean hasDefaultCreator()
- void addPropertyCreator(AnnotatedWithParams, boolean, SettableBeanProperty[])
- void addDoubleCreator(AnnotatedWithParams, boolean)
- void addBigIntegerCreator(AnnotatedWithParams, boolean)
- void addStringCreator(AnnotatedWithParams, boolean)
- void addLongCreator(AnnotatedWithParams, boolean)
- boolean hasDelegatingCreator()
- void addIntCreator(AnnotatedWithParams, boolean)
- void addBooleanCreator(AnnotatedWithParams, boolean)
- void setDefaultCreator(AnnotatedWithParams)
- ValueInstantiator constructValueInstantiator(DeserializationContext) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.JsonDeserializer

Methods:
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler
Type: Class

Methods:
- ExternalTypeHandler start()
- **static** ExternalTypeHandler$Builder builder(JavaType)
- boolean handlePropertyValue(JsonParser, DeserializationContext, String, Object) throws IOException
- Object complete(JsonParser, DeserializationContext, Object) throws IOException
- Object complete(JsonParser, DeserializationContext, PropertyValueBuffer, PropertyBasedCreator) throws IOException
- boolean handleTypePropertyValue(JsonParser, DeserializationContext, String, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder
Type: Class

Methods:
- ExternalTypeHandler build(BeanPropertyMap)
- void addExternal(SettableBeanProperty, TypeDeserializer)

### Class: com.fasterxml.jackson.databind.deser.impl.FailingDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer

Methods:
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.FieldProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- void fixAccess(DeserializationConfig)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Annotation getAnnotation(Class)
- Object setAndReturn(Object, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)

### Class: com.fasterxml.jackson.databind.deser.impl.InnerClassProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating

Methods:
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators
Type: Abstract Class

Methods:
- **static** ValueInstantiator findStdValueInstantiator(DeserializationConfig, Class)

### Class: com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers
Type: Abstract Class

Methods:
- **static** JsonDeserializer findForMap(DeserializationContext, JavaType) throws JsonMappingException
- **static** JsonDeserializer findForCollection(DeserializationContext, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating

Methods:
- void fixAccess(DeserializationConfig)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Object setAndReturn(Object, Object) throws IOException
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating

Methods:
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Object setAndReturn(Object, Object) throws IOException
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- **static** MergingSettableBeanProperty construct(SettableBeanProperty, AnnotatedMember)

### Class: com.fasterxml.jackson.databind.deser.impl.MethodProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- void fixAccess(DeserializationConfig)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Annotation getAnnotation(Class)
- Object setAndReturn(Object, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)

### Class: com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider
Type: Class
Implements: com.fasterxml.jackson.databind.deser.NullValueProvider, java.io.Serializable

Methods:
- Object getNullValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()

### Class: com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider
Type: Class
Implements: com.fasterxml.jackson.databind.deser.NullValueProvider, java.io.Serializable

Methods:
- Object getNullValue(DeserializationContext)
- **static** NullsConstantProvider skipper()
- **static** boolean isSkipper(NullValueProvider)
- **static** NullsConstantProvider forValue(Object)
- AccessPattern getNullAccessPattern()
- **static** boolean isNuller(NullValueProvider)
- **static** NullsConstantProvider nuller()

### Class: com.fasterxml.jackson.databind.deser.impl.NullsFailProvider
Type: Class
Implements: com.fasterxml.jackson.databind.deser.NullValueProvider, java.io.Serializable

Methods:
- Object getNullValue(DeserializationContext) throws JsonMappingException
- **static** NullsFailProvider constructForRootValue(JavaType)
- AccessPattern getNullAccessPattern()
- **static** NullsFailProvider constructForProperty(BeanProperty)
- **static** NullsFailProvider constructForProperty(BeanProperty, JavaType)

### Class: com.fasterxml.jackson.databind.deser.impl.ObjectIdReader
Type: Class
Implements: java.io.Serializable

Methods:
- JsonDeserializer getDeserializer()
- boolean isValidReferencePropertyName(String, JsonParser)
- boolean maySerializeAsObject()
- JavaType getIdType()
- Object readObjectReference(JsonParser, DeserializationContext) throws IOException
- **static** ObjectIdReader construct(JavaType, PropertyName, ObjectIdGenerator, JsonDeserializer, SettableBeanProperty, ObjectIdResolver)

### Class: com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- void fixAccess(DeserializationConfig)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Annotation getAnnotation(Class)
- Object setAndReturn(Object, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)
- int getCreatorIndex()

### Class: com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty$PropertyReferring
Type: Class
Extends: com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring

Methods:
- void handleResolvedForwardReference(Object, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Annotation getAnnotation(Class)
- Object setAndReturn(Object, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)

### Class: com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator
Type: Class

Methods:
- Object build(DeserializationContext, PropertyValueBuffer) throws IOException
- SettableBeanProperty findCreatorProperty(String)
- SettableBeanProperty findCreatorProperty(int)
- PropertyValueBuffer startBuilding(JsonParser, DeserializationContext, ObjectIdReader)
- **static** PropertyBasedCreator construct(DeserializationContext, ValueInstantiator, SettableBeanProperty[], BeanPropertyMap) throws JsonMappingException
- **static** PropertyBasedCreator construct(DeserializationContext, ValueInstantiator, SettableBeanProperty[], boolean) throws JsonMappingException
- **static** PropertyBasedCreator construct(DeserializationContext, ValueInstantiator, SettableBeanProperty[]) throws JsonMappingException
- Collection properties()

### Class: com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator
Type: Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator

Methods:
- ObjectIdGenerator newForSerialization(Object)
- Object generateId(Object)
- ObjectIdGenerator$IdKey key(Object)
- ObjectIdGenerator forScope(Class)

### Class: com.fasterxml.jackson.databind.deser.impl.PropertyValue
Type: Abstract Class

Methods:
- void assign(Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer
Type: Class

Methods:
- Object handleIdValue(DeserializationContext, Object) throws IOException
- void bufferAnyProperty(SettableAnyProperty, String, Object)
- Object[] getParameters(SettableBeanProperty[]) throws JsonMappingException
- boolean readIdProperty(String) throws IOException
- boolean assignParameter(SettableBeanProperty, Object)
- void bufferMapProperty(Object, Object)
- void bufferProperty(SettableBeanProperty, Object)
- boolean hasParameter(SettableBeanProperty)
- boolean isComplete()
- Object getParameter(SettableBeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.impl.ReadableObjectId
Type: Class

Methods:
- ObjectIdGenerator$IdKey getKey()
- void setResolver(ObjectIdResolver)
- boolean tryToResolveUnresolved(DeserializationContext)
- Iterator referringProperties()
- Object resolve()
- String toString()
- void bindItem(Object) throws IOException
- void appendReferring(ReadableObjectId$Referring)
- ObjectIdResolver getResolver()
- boolean hasReferringProperties()

### Class: com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring
Type: Abstract Class

Methods:
- boolean hasId(Object)
- JsonLocation getLocation()
- Class getBeanType()
- void handleResolvedForwardReference(Object, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.SetterlessProperty
Type: Class
Extends: com.fasterxml.jackson.databind.deser.SettableBeanProperty

Methods:
- SettableBeanProperty withValueDeserializer(JsonDeserializer)
- void fixAccess(DeserializationConfig)
- void set(Object, Object) throws IOException
- void deserializeAndSet(JsonParser, DeserializationContext, Object) throws IOException
- Annotation getAnnotation(Class)
- Object setAndReturn(Object, Object) throws IOException
- AnnotatedMember getMember()
- Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object) throws IOException
- SettableBeanProperty withNullProvider(NullValueProvider)
- SettableBeanProperty withName(PropertyName)

### Class: com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.JsonDeserializer
Implements: java.io.Serializable

Methods:
- Object getNullValue(DeserializationContext) throws JsonMappingException
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- Collection getKnownPropertyNames()
- Boolean supportsUpdate(DeserializationConfig)
- JsonDeserializer getDelegatee()
- Class handledType()
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer

Methods:
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler
Type: Class

Methods:
- UnwrappedPropertyHandler renameAll(NameTransformer)
- Object processUnwrapped(JsonParser, DeserializationContext, Object, TokenBuffer) throws IOException
- void addProperty(SettableBeanProperty)

### Class: com.fasterxml.jackson.databind.deser.impl.ValueInjector
Type: Class
Extends: com.fasterxml.jackson.databind.BeanProperty$Std

Methods:
- Object findValue(DeserializationContext, Object) throws JsonMappingException
- void inject(DeserializationContext, Object) throws IOException

## Package: com.fasterxml.jackson.databind.deser.std

### Class: com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer

Methods:
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- AtomicBoolean deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- AtomicInteger deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- AtomicLong deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer

Methods:
- AtomicReference getNullValue(DeserializationContext) throws JsonMappingException
- Object getNullValue(DeserializationContext) throws JsonMappingException
- Object getReferenced(AtomicReference)
- Object getReferenced(Object)
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AtomicReference updateReference(AtomicReference, Object)
- Object updateReference(Object, Object)
- Boolean supportsUpdate(DeserializationConfig)
- AtomicReferenceDeserializer withResolved(TypeDeserializer, JsonDeserializer)
- ReferenceTypeDeserializer withResolved(TypeDeserializer, JsonDeserializer)
- Object getAbsentValue(DeserializationContext) throws JsonMappingException
- AtomicReference referenceValue(Object)
- Object referenceValue(Object)

### Class: com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- LogicalType logicalType()
- ByteBuffer deserialize(JsonParser, DeserializationContext) throws IOException
- ByteBuffer deserialize(JsonParser, DeserializationContext, ByteBuffer) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- ValueInstantiator getValueInstantiator()
- LogicalType logicalType()
- boolean isCachable()
- JsonDeserializer getContentDeserializer()
- CollectionDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Collection deserialize(JsonParser, DeserializationContext) throws IOException
- Collection deserialize(JsonParser, DeserializationContext, Collection) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$CollectionReferringAccumulator
Type: Class

Methods:
- void add(Object)
- ReadableObjectId$Referring handleUnresolvedReference(UnresolvedForwardReference)
- void resolveForwardReference(Object, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ValueInstantiator$Gettable

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- Boolean supportsUpdate(DeserializationConfig)
- JavaType getContentType()
- JsonDeserializer getContentDeserializer()
- JavaType getValueType()
- AccessPattern getEmptyAccessPattern()
- SettableBeanProperty findBackReference(String)

### Class: com.fasterxml.jackson.databind.deser.std.DateDeserializers
Type: Class

Methods:
- **static** boolean hasDeserializerFor(Class)
- **static** JsonDeserializer find(Class, String)

### Class: com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)
- LogicalType logicalType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Calendar deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- LogicalType logicalType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)
- LogicalType logicalType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Date deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)
- LogicalType logicalType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Date deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)
- LogicalType logicalType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Timestamp deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.EnumDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- **static** JsonDeserializer deserializerForNoArgsCreator(DeserializationConfig, Class, AnnotatedMethod)
- boolean isCachable()
- EnumDeserializer withResolved(Boolean)
- **static** JsonDeserializer deserializerForCreator(DeserializationConfig, Class, AnnotatedMethod)
- **static** JsonDeserializer deserializerForCreator(DeserializationConfig, Class, AnnotatedMethod, ValueInstantiator, SettableBeanProperty[])
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer, com.fasterxml.jackson.databind.deser.ResolvableDeserializer

Methods:
- ValueInstantiator getValueInstantiator()
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- void resolve(DeserializationContext) throws JsonMappingException
- EnumMap _deserializeUsingProperties(JsonParser, DeserializationContext) throws IOException
- boolean isCachable()
- EnumMapDeserializer withResolved(KeyDeserializer, JsonDeserializer, TypeDeserializer, NullValueProvider)
- JsonDeserializer getContentDeserializer()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- EnumMap deserialize(JsonParser, DeserializationContext) throws IOException
- EnumMap deserialize(JsonParser, DeserializationContext, EnumMap) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- EnumSetDeserializer withDeserializer(JsonDeserializer)
- Boolean supportsUpdate(DeserializationConfig)
- boolean isCachable()
- EnumSetDeserializer withResolved(JsonDeserializer, Boolean)
- EnumSetDeserializer withResolved(JsonDeserializer, NullValueProvider, Boolean)
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- AccessPattern getEmptyAccessPattern()
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- EnumSet deserialize(JsonParser, DeserializationContext) throws IOException
- EnumSet deserialize(JsonParser, DeserializationContext, EnumSet) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- **static** FromStringDeserializer findDeserializer(Class)
- **static** Class[] types()
- LogicalType logicalType()
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.std.JdkDeserializers
Type: Class

Methods:
- **static** boolean hasDeserializerFor(Class)
- **static** JsonDeserializer find(Class, String) throws JsonMappingException
- **static** JsonDeserializer find(DeserializationContext, Class, String) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator
Type: Class
Extends: com.fasterxml.jackson.databind.deser.ValueInstantiator$Base

Methods:
- SettableBeanProperty[] getFromObjectArguments(DeserializationConfig)
- Object createFromObjectWith(DeserializationContext, Object[])
- boolean canCreateFromObjectWith()

### Class: com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer

Methods:
- JsonNode getNullValue(DeserializationContext)
- Object getNullValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- **static** JsonDeserializer getDeserializer(Class)
- boolean isCachable()
- Boolean supportsUpdate(DeserializationConfig)
- Object getAbsentValue(DeserializationContext)
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- JsonNode deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.MapDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer, com.fasterxml.jackson.databind.deser.ResolvableDeserializer

Methods:
- ValueInstantiator getValueInstantiator()
- LogicalType logicalType()
- void resolve(DeserializationContext) throws JsonMappingException
- void setIgnorableProperties(String[])
- void setIgnorableProperties(Set)
- Class getMapClass()
- void setIncludableProperties(Set)
- Map _deserializeUsingCreator(JsonParser, DeserializationContext) throws IOException
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- boolean isCachable()
- JsonDeserializer getContentDeserializer()
- JavaType getValueType()
- Map deserialize(JsonParser, DeserializationContext) throws IOException
- Map deserialize(JsonParser, DeserializationContext, Map) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- LogicalType logicalType()
- JavaType getContentType()
- JsonDeserializer getContentDeserializer()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Map$Entry deserialize(JsonParser, DeserializationContext) throws IOException
- Map$Entry deserialize(JsonParser, DeserializationContext, Map$Entry) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer

Methods:
- Boolean supportsUpdate(DeserializationConfig)
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers
Type: Class

Methods:
- **static** JsonDeserializer find(Class, String)

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)
- LogicalType logicalType()
- BigDecimal deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)
- LogicalType logicalType()
- BigInteger deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Boolean deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Boolean deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Byte deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Character deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Double deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Double deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Float deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- boolean isCachable()
- Integer deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Integer deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- boolean isCachable()
- Long deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- LogicalType logicalType()
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getNullValue(DeserializationContext) throws JsonMappingException
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- AccessPattern getNullAccessPattern()

### Class: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- AccessPattern getNullAccessPattern()
- Short deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- ObjectArrayDeserializer withDeserializer(TypeDeserializer, JsonDeserializer)
- boolean isCachable()
- ObjectArrayDeserializer withResolved(TypeDeserializer, JsonDeserializer, NullValueProvider, Boolean)
- JsonDeserializer getContentDeserializer()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- AccessPattern getEmptyAccessPattern()
- Object[] deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object[] deserialize(JsonParser, DeserializationContext) throws IOException
- Object[] deserialize(JsonParser, DeserializationContext, Object[]) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- **static** JsonDeserializer forType(Class)
- Boolean supportsUpdate(DeserializationConfig)
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- AccessPattern getEmptyAccessPattern()
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- ValueInstantiator getValueInstantiator()
- Object getNullValue(DeserializationContext) throws JsonMappingException
- Object getReferenced(Object)
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object updateReference(Object, Object)
- Boolean supportsUpdate(DeserializationConfig)
- AccessPattern getNullAccessPattern()
- JavaType getValueType()
- AccessPattern getEmptyAccessPattern()
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException
- Object referenceValue(Object)

### Class: com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- **static** JsonDeserializer construct(DeserializationContext) throws JsonMappingException
- StackTraceElement deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer$Adapter
Type: Class

No public methods found

### Class: com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer, com.fasterxml.jackson.databind.deser.ResolvableDeserializer

Methods:
- LogicalType logicalType()
- void resolve(DeserializationContext) throws JsonMappingException
- Boolean supportsUpdate(DeserializationConfig)
- JsonDeserializer getDelegatee()
- Class handledType()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JsonDeserializer
Implements: java.io.Serializable, com.fasterxml.jackson.databind.deser.ValueInstantiator$Gettable

Methods:
- ValueInstantiator getValueInstantiator()
- Class getValueClass()
- Class handledType()
- JavaType getValueType()
- JavaType getValueType(DeserializationContext)
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.KeyDeserializer
Implements: java.io.Serializable

Methods:
- Class getKeyClass()
- **static** StdKeyDeserializer forType(Class)
- Object deserializeKey(String, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers
Type: Class
Implements: com.fasterxml.jackson.databind.deser.KeyDeserializers, java.io.Serializable

Methods:
- **static** KeyDeserializer constructEnumKeyDeserializer(EnumResolver)
- **static** KeyDeserializer constructEnumKeyDeserializer(EnumResolver, AnnotatedMethod)
- KeyDeserializer findKeyDeserializer(JavaType, DeserializationConfig, BeanDescription) throws JsonMappingException
- **static** KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig, JavaType) throws JsonMappingException
- **static** KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig, JavaType, JsonDeserializer)

### Class: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer

Methods:
- LogicalType logicalType()
- AccessPattern getNullAccessPattern()
- Boolean supportsUpdate(DeserializationConfig)
- AccessPattern getEmptyAccessPattern()
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.StdValueInstantiator
Type: Class
Extends: com.fasterxml.jackson.databind.deser.ValueInstantiator
Implements: java.io.Serializable

Methods:
- SettableBeanProperty[] getFromObjectArguments(DeserializationConfig)
- boolean canCreateFromBigDecimal()
- Class getValueClass()
- boolean canCreateUsingDelegate()
- boolean canCreateUsingArrayDelegate()
- void configureFromBooleanCreator(AnnotatedWithParams)
- boolean canCreateFromObjectWith()
- void configureFromLongCreator(AnnotatedWithParams)
- void configureFromBigIntegerCreator(AnnotatedWithParams)
- Object createFromBoolean(DeserializationContext, boolean) throws IOException
- Object createFromObjectWith(DeserializationContext, Object[]) throws IOException
- Object createUsingArrayDelegate(DeserializationContext, Object) throws IOException
- Object createFromString(DeserializationContext, String) throws IOException
- JavaType getDelegateType(DeserializationConfig)
- boolean canCreateFromDouble()
- boolean canCreateFromLong()
- AnnotatedWithParams getDelegateCreator()
- void configureFromArraySettings(AnnotatedWithParams, JavaType, SettableBeanProperty[])
- AnnotatedWithParams getArrayDelegateCreator()
- Object createFromDouble(DeserializationContext, double) throws IOException
- String getValueTypeDesc()
- void configureFromIntCreator(AnnotatedWithParams)
- boolean canCreateFromInt()
- boolean canInstantiate()
- void configureFromDoubleCreator(AnnotatedWithParams)
- Object createFromLong(DeserializationContext, long) throws IOException
- void configureFromBigDecimalCreator(AnnotatedWithParams)
- AnnotatedWithParams getWithArgsCreator()
- Object createUsingDefault(DeserializationContext) throws IOException
- void configureFromStringCreator(AnnotatedWithParams)
- boolean canCreateUsingDefault()
- Object createFromBigInteger(DeserializationContext, BigInteger) throws IOException
- Object createFromInt(DeserializationContext, int) throws IOException
- Object createFromBigDecimal(DeserializationContext, BigDecimal) throws IOException
- Object createUsingDelegate(DeserializationContext, Object) throws IOException
- boolean canCreateFromBoolean()
- JavaType getArrayDelegateType(DeserializationConfig)
- AnnotatedWithParams getDefaultCreator()
- boolean canCreateFromBigInteger()
- boolean canCreateFromString()
- void configureFromObjectSettings(AnnotatedWithParams, AnnotatedWithParams, JavaType, SettableBeanProperty[], AnnotatedWithParams, SettableBeanProperty[])

### Class: com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- Boolean supportsUpdate(DeserializationConfig)
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- AccessPattern getEmptyAccessPattern()
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- String[] deserialize(JsonParser, DeserializationContext) throws IOException
- String[] deserialize(JsonParser, DeserializationContext, String[]) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
Implements: com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- ValueInstantiator getValueInstantiator()
- LogicalType logicalType()
- boolean isCachable()
- JsonDeserializer getContentDeserializer()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Collection deserialize(JsonParser, DeserializationContext) throws IOException
- Collection deserialize(JsonParser, DeserializationContext, Collection) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException, JacksonException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.StringDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- Object getEmptyValue(DeserializationContext) throws JsonMappingException
- LogicalType logicalType()
- boolean isCachable()
- String deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- String deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.BeanDeserializer

Methods:
- Object deserializeFromObject(JsonParser, DeserializationContext) throws IOException
- JsonDeserializer unwrappingDeserializer(NameTransformer)
- **static** ThrowableDeserializer construct(DeserializationContext, BeanDeserializer)

### Class: com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

Methods:
- LogicalType logicalType()
- TokenBuffer deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException, JacksonException

### Class: com.fasterxml.jackson.databind.deser.std.UUIDDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer

Methods:
- Object getEmptyValue(DeserializationContext)

### Class: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer
Implements: com.fasterxml.jackson.databind.deser.ResolvableDeserializer, com.fasterxml.jackson.databind.deser.ContextualDeserializer

Methods:
- LogicalType logicalType()
- void resolve(DeserializationContext) throws JsonMappingException
- Boolean supportsUpdate(DeserializationConfig)
- boolean isCachable()
- JsonDeserializer createContextual(DeserializationContext, BeanProperty) throws JsonMappingException
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

### Class: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla
Type: Class
Extends: com.fasterxml.jackson.databind.deser.std.StdDeserializer

Methods:
- LogicalType logicalType()
- **static** UntypedObjectDeserializer$Vanilla instance(boolean)
- Boolean supportsUpdate(DeserializationConfig)
- Object deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer) throws IOException
- Object deserialize(JsonParser, DeserializationContext) throws IOException
- Object deserialize(JsonParser, DeserializationContext, Object) throws IOException

## Package: com.fasterxml.jackson.databind.exc

### Class: com.fasterxml.jackson.databind.exc.IgnoredPropertyException
Type: Class
Extends: com.fasterxml.jackson.databind.exc.PropertyBindingException

Methods:
- **static** IgnoredPropertyException from(JsonParser, Object, String, Collection)

### Class: com.fasterxml.jackson.databind.exc.InvalidDefinitionException
Type: Class
Extends: com.fasterxml.jackson.databind.JsonMappingException

Methods:
- BeanPropertyDefinition getProperty()
- JavaType getType()
- **static** InvalidDefinitionException from(JsonParser, String, BeanDescription, BeanPropertyDefinition)
- **static** InvalidDefinitionException from(JsonParser, String, JavaType)
- **static** InvalidDefinitionException from(JsonGenerator, String, BeanDescription, BeanPropertyDefinition)
- **static** InvalidDefinitionException from(JsonGenerator, String, JavaType)
- BeanDescription getBeanDescription()

### Class: com.fasterxml.jackson.databind.exc.InvalidFormatException
Type: Class
Extends: com.fasterxml.jackson.databind.exc.MismatchedInputException

Methods:
- Object getValue()
- **static** InvalidFormatException from(JsonParser, String, Object, Class)

### Class: com.fasterxml.jackson.databind.exc.InvalidNullException
Type: Class
Extends: com.fasterxml.jackson.databind.exc.MismatchedInputException

Methods:
- **static** InvalidNullException from(DeserializationContext, PropertyName, JavaType)
- PropertyName getPropertyName()

### Class: com.fasterxml.jackson.databind.exc.InvalidTypeIdException
Type: Class
Extends: com.fasterxml.jackson.databind.exc.MismatchedInputException

Methods:
- **static** InvalidTypeIdException from(JsonParser, String, JavaType, String)
- String getTypeId()
- JavaType getBaseType()

### Class: com.fasterxml.jackson.databind.exc.MismatchedInputException
Type: Class
Extends: com.fasterxml.jackson.databind.JsonMappingException

Methods:
- Class getTargetType()
- **static** MismatchedInputException from(JsonParser, String)
- **static** MismatchedInputException from(JsonParser, JavaType, String)
- **static** MismatchedInputException from(JsonParser, Class, String)
- MismatchedInputException setTargetType(JavaType)

### Class: com.fasterxml.jackson.databind.exc.PropertyBindingException
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.exc.MismatchedInputException

Methods:
- Class getReferringClass()
- Collection getKnownPropertyIds()
- String getMessageSuffix()
- String getPropertyName()

### Class: com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException
Type: Class
Extends: com.fasterxml.jackson.databind.exc.PropertyBindingException

Methods:
- **static** UnrecognizedPropertyException from(JsonParser, Object, String, Collection)

### Class: com.fasterxml.jackson.databind.exc.ValueInstantiationException
Type: Class
Extends: com.fasterxml.jackson.databind.JsonMappingException

Methods:
- JavaType getType()
- **static** ValueInstantiationException from(JsonParser, String, JavaType)
- **static** ValueInstantiationException from(JsonParser, String, JavaType, Throwable)

## Package: com.fasterxml.jackson.databind.ext

### Class: com.fasterxml.jackson.databind.ext.Java7Handlers
Type: Abstract Class

Methods:
- **static** Java7Handlers instance()
- Class getClassJavaNioFilePath()
- JsonSerializer getSerializerForJavaNioFilePath(Class)
- JsonDeserializer getDeserializerForJavaNioFilePath(Class)

### Class: com.fasterxml.jackson.databind.ext.Java7Support
Type: Abstract Class

Methods:
- **static** Java7Support instance()
- PropertyName findConstructorName(AnnotatedParameter)
- Boolean hasCreatorAnnotation(Annotated)
- Boolean findTransient(Annotated)

### Class: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
Type: Class
Implements: java.io.Serializable

Methods:
- JsonDeserializer findDeserializer(JavaType, DeserializationConfig, BeanDescription) throws JsonMappingException
- boolean hasDeserializerFor(Class)
- JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)

## Package: com.fasterxml.jackson.databind.introspect

### Class: com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver
Type: Interface

Methods:
- Class findMixInClassFor(Class)
- ClassIntrospector$MixInResolver copy()

### Class: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$BaseNameValidator
Type: Interface

Methods:
- boolean accept(char, String, int)

### Class: com.fasterxml.jackson.databind.introspect.TypeResolutionContext
Type: Interface

Methods:
- JavaType resolveType(Type)

### Class: com.fasterxml.jackson.databind.introspect.VisibilityChecker
Type: Interface

Methods:
- boolean isSetterVisible(Method)
- boolean isSetterVisible(AnnotatedMethod)
- VisibilityChecker withCreatorVisibility(JsonAutoDetect$Visibility)
- boolean isFieldVisible(Field)
- boolean isFieldVisible(AnnotatedField)
- VisibilityChecker withGetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker with(JsonAutoDetect)
- VisibilityChecker with(JsonAutoDetect$Visibility)
- boolean isIsGetterVisible(Method)
- boolean isIsGetterVisible(AnnotatedMethod)
- boolean isGetterVisible(Method)
- boolean isGetterVisible(AnnotatedMethod)
- VisibilityChecker withIsGetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withFieldVisibility(JsonAutoDetect$Visibility)
- boolean isCreatorVisible(Member)
- boolean isCreatorVisible(AnnotatedMember)
- VisibilityChecker withOverrides(JsonAutoDetect$Value)
- VisibilityChecker withSetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withVisibility(PropertyAccessor, JsonAutoDetect$Visibility)

### Class: com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
Type: Abstract Class

Methods:
- String findNameForIsGetter(AnnotatedMethod, String)
- String findNameForMutator(AnnotatedMethod, String)
- String modifyFieldName(AnnotatedField, String)
- String findNameForRegularGetter(AnnotatedMethod, String)

### Class: com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Base
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
Implements: java.io.Serializable

Methods:
- String findNameForIsGetter(AnnotatedMethod, String)
- String findNameForMutator(AnnotatedMethod, String)
- String modifyFieldName(AnnotatedField, String)
- String findNameForRegularGetter(AnnotatedMethod, String)

### Class: com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Provider
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- AccessorNamingStrategy forRecord(MapperConfig, AnnotatedClass)
- AccessorNamingStrategy forBuilder(MapperConfig, AnnotatedClass, BeanDescription)
- AccessorNamingStrategy forPOJO(MapperConfig, AnnotatedClass)

### Class: com.fasterxml.jackson.databind.introspect.Annotated
Type: Abstract Class

Methods:
- boolean hasAnnotation(Class)
- Class getRawType()
- String getName()
- boolean hasOneOf(Class[])
- JavaType getType()
- Annotation getAnnotation(Class)
- int hashCode()
- AnnotatedElement getAnnotated()
- boolean equals(Object)
- Iterable annotations()
- boolean isPublic()
- String toString()

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata
Type: Class

Methods:
- **static** AnnotatedAndMetadata of(Annotated, Object)

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedClass
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.Annotated
Implements: com.fasterxml.jackson.databind.introspect.TypeResolutionContext

Methods:
- boolean hasAnnotation(Class)
- Class getRawType()
- String getName()
- boolean hasAnnotations()
- Iterable annotations()
- **static** AnnotatedClass construct(JavaType, MapperConfig)
- **static** AnnotatedClass construct(JavaType, MapperConfig, ClassIntrospector$MixInResolver)
- AnnotatedConstructor getDefaultConstructor()
- List getStaticMethods()
- boolean isNonStaticInnerClass()
- AnnotatedMethod findMethod(String, Class[])
- List getConstructors()
- int hashCode()
- int getModifiers()
- List getFactoryMethods()
- boolean hasOneOf(Class[])
- JavaType resolveType(Type)
- Class getAnnotated()
- AnnotatedElement getAnnotated()
- Iterable memberMethods()
- Annotations getAnnotations()
- **static** AnnotatedClass constructWithoutSuperTypes(Class, MapperConfig)
- **static** AnnotatedClass constructWithoutSuperTypes(Class, MapperConfig, ClassIntrospector$MixInResolver)
- int getMemberMethodCount()
- JavaType getType()
- Annotation getAnnotation(Class)
- boolean equals(Object)
- String toString()
- Iterable fields()
- int getFieldCount()

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators
Type: Class

No public methods found

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver
Type: Class

Methods:
- **static** AnnotatedClass resolve(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- **static** AnnotatedClass resolveWithoutSuperTypes(MapperConfig, Class)
- **static** AnnotatedClass resolveWithoutSuperTypes(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- **static** AnnotatedClass resolveWithoutSuperTypes(MapperConfig, Class, ClassIntrospector$MixInResolver)

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AnnotatedWithParams

Methods:
- Class getRawType()
- String getName()
- int getParameterCount()
- Constructor getAnnotated()
- AnnotatedElement getAnnotated()
- Member getMember()
- AnnotatedConstructor withAnnotations(AnnotationMap)
- Annotated withAnnotations(AnnotationMap)
- Type getGenericParameterType(int)
- JavaType getParameterType(int)
- Object call() throws Exception
- Object call(Object[]) throws Exception
- Object getValue(Object) throws UnsupportedOperationException
- Class getDeclaringClass()
- Object call1(Object) throws Exception
- JavaType getType()
- int hashCode()
- boolean equals(Object)
- void setValue(Object, Object) throws UnsupportedOperationException
- String toString()
- Class getRawParameterType(int)
- int getModifiers()

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedField
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AnnotatedMember
Implements: java.io.Serializable

Methods:
- Class getRawType()
- String getName()
- Field getAnnotated()
- AnnotatedElement getAnnotated()
- Member getMember()
- AnnotatedField withAnnotations(AnnotationMap)
- Annotated withAnnotations(AnnotationMap)
- int getAnnotationCount()
- Object getValue(Object) throws IllegalArgumentException
- Class getDeclaringClass()
- JavaType getType()
- int hashCode()
- boolean equals(Object)
- void setValue(Object, Object) throws IllegalArgumentException
- String toString()
- int getModifiers()
- boolean isTransient()

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.CollectorBase

Methods:
- **static** List collectFields(AnnotationIntrospector, TypeResolutionContext, ClassIntrospector$MixInResolver, TypeFactory, JavaType, boolean)

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedMember
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.introspect.Annotated
Implements: java.io.Serializable

Methods:
- Object getValue(Object) throws UnsupportedOperationException, IllegalArgumentException
- void fixAccess(boolean)
- boolean hasAnnotation(Class)
- Class getDeclaringClass()
- boolean hasOneOf(Class[])
- Annotation getAnnotation(Class)
- void setValue(Object, Object) throws UnsupportedOperationException, IllegalArgumentException
- AnnotationMap getAllAnnotations()
- Iterable annotations()
- Member getMember()
- Annotated withAnnotations(AnnotationMap)
- TypeResolutionContext getTypeContext()
- String getFullName()

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedMethod
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
Implements: java.io.Serializable

Methods:
- Class getRawReturnType()
- Class getRawType()
- String getName()
- int getParameterCount()
- boolean hasReturnType()
- Method getMember()
- Member getMember()
- JavaType getParameterType(int)
- Class getDeclaringClass()
- int hashCode()
- int getModifiers()
- String getFullName()
- Object callOn(Object) throws Exception
- Method getAnnotated()
- AnnotatedElement getAnnotated()
- AnnotatedMethod withAnnotations(AnnotationMap)
- Annotated withAnnotations(AnnotationMap)
- Type getGenericParameterType(int)
- Object call() throws Exception
- Object call(Object[]) throws Exception
- Object getValue(Object) throws IllegalArgumentException
- Type[] getGenericParameterTypes()
- Object call1(Object) throws Exception
- JavaType getType()
- boolean equals(Object)
- void setValue(Object, Object) throws IllegalArgumentException
- Object callOnWith(Object, Object[]) throws Exception
- String toString()
- Class[] getRawParameterTypes()
- Class getRawParameterType(int)

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.CollectorBase

Methods:
- **static** AnnotatedMethodMap collectMethods(AnnotationIntrospector, TypeResolutionContext, ClassIntrospector$MixInResolver, TypeFactory, JavaType, List, Class, boolean)

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()
- int size()
- AnnotatedMethod find(String, Class[])
- AnnotatedMethod find(Method)

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedParameter
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AnnotatedMember

Methods:
- Class getRawType()
- String getName()
- int getIndex()
- AnnotatedElement getAnnotated()
- Member getMember()
- AnnotatedParameter withAnnotations(AnnotationMap)
- Annotated withAnnotations(AnnotationMap)
- AnnotatedWithParams getOwner()
- Type getParameterType()
- Object getValue(Object) throws UnsupportedOperationException
- Class getDeclaringClass()
- JavaType getType()
- int hashCode()
- boolean equals(Object)
- void setValue(Object, Object) throws UnsupportedOperationException
- String toString()
- int getModifiers()

### Class: com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.introspect.AnnotatedMember

Methods:
- Object call() throws Exception
- Object call(Object[]) throws Exception
- Object call1(Object) throws Exception
- int getParameterCount()
- void addOrOverrideParam(int, Annotation)
- Class getRawParameterType(int)
- Type getGenericParameterType(int)
- AnnotationMap getParameterAnnotations(int)
- int getAnnotationCount()
- JavaType getParameterType(int)
- AnnotatedParameter getParameter(int)

### Class: com.fasterxml.jackson.databind.introspect.AnnotationCollector
Type: Abstract Class

Methods:
- **static** AnnotationCollector emptyCollector()
- **static** AnnotationCollector emptyCollector(Object)
- AnnotationCollector addOrOverride(Annotation)
- AnnotationMap asAnnotationMap()
- boolean isPresent(Annotation)
- **static** Annotations emptyAnnotations()
- Annotations asAnnotations()
- Object getData()

### Class: com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations
Type: Class
Implements: com.fasterxml.jackson.databind.util.Annotations, java.io.Serializable

Methods:
- boolean hasOneOf(Class[])
- int size()
- Annotation get(Class)
- boolean has(Class)

### Class: com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation
Type: Class
Implements: com.fasterxml.jackson.databind.util.Annotations, java.io.Serializable

Methods:
- boolean hasOneOf(Class[])
- int size()
- Annotation get(Class)
- boolean has(Class)

### Class: com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations
Type: Class
Implements: com.fasterxml.jackson.databind.util.Annotations, java.io.Serializable

Methods:
- boolean hasOneOf(Class[])
- int size()
- Annotation get(Class)
- boolean has(Class)

### Class: com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair
Type: Class
Extends: com.fasterxml.jackson.databind.AnnotationIntrospector
Implements: java.io.Serializable

Methods:
- Object findSerializationContentConverter(AnnotatedMember)
- JsonCreator$Mode findCreatorBinding(Annotated)
- Boolean findIgnoreUnknownProperties(AnnotatedClass)
- String[] findPropertiesToIgnore(Annotated, boolean)
- boolean hasAnyGetterAnnotation(AnnotatedMethod)
- Enum findDefaultEnumValue(Class)
- Object findContentDeserializer(Annotated)
- TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)
- JsonInclude$Include findSerializationInclusion(Annotated, JsonInclude$Include)
- JsonInclude$Include findSerializationInclusionForContent(Annotated, JsonInclude$Include)
- JsonInclude$Value findPropertyInclusion(Annotated)
- JsonIncludeProperties$Value findPropertyInclusionByName(MapperConfig, Annotated)
- AnnotationIntrospector$ReferenceProperty findReferenceType(AnnotatedMember)
- Boolean isIgnorableType(AnnotatedClass)
- **static** AnnotationIntrospector create(AnnotationIntrospector, AnnotationIntrospector)
- PropertyName findNameForDeserialization(Annotated)
- boolean hasIgnoreMarker(AnnotatedMember)
- String findPropertyDefaultValue(Annotated)
- ObjectIdInfo findObjectReferenceInfo(Annotated, ObjectIdInfo)
- ObjectIdInfo findObjectIdInfo(Annotated)
- boolean hasAnySetterAnnotation(AnnotatedMethod)
- PropertyName findRootName(AnnotatedClass)
- Boolean findMergeInfo(Annotated)
- Object findDeserializationConverter(Annotated)
- Boolean hasRequiredMarker(AnnotatedMember)
- TypeResolverBuilder findTypeResolver(MapperConfig, AnnotatedClass, JavaType)
- String[] findEnumValues(Class, Enum[], String[])
- JsonCreator$Mode findCreatorAnnotation(MapperConfig, Annotated)
- NameTransformer findUnwrappingNameTransformer(AnnotatedMember)
- Class findSerializationType(Annotated)
- Class[] findViews(Annotated)
- JavaType refineDeserializationType(MapperConfig, Annotated, JavaType) throws JsonMappingException
- Object findSerializationConverter(Annotated)
- Object findNullSerializer(Annotated)
- Version version()
- Boolean hasAnyGetter(Annotated)
- Object findFilterId(Annotated)
- Object findKeySerializer(Annotated)
- PropertyName findWrapperName(Annotated)
- boolean hasCreatorAnnotation(Annotated)
- JsonIgnoreProperties$Value findPropertyIgnorals(Annotated)
- Class findDeserializationContentType(Annotated, JavaType)
- Class findSerializationContentType(Annotated, JavaType)
- JsonSerialize$Typing findSerializationTyping(Annotated)
- Boolean hasAnySetter(Annotated)
- PropertyName findNameForSerialization(Annotated)
- boolean isAnnotationBundle(Annotation)
- Class findDeserializationType(Annotated, JavaType)
- Boolean findSerializationSortAlphabetically(Annotated)
- Boolean isTypeId(AnnotatedMember)
- TypeResolverBuilder findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)
- String findClassDescription(AnnotatedClass)
- AnnotatedMethod resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)
- JsonSetter$Value findSetterInfo(Annotated)
- List findPropertyAliases(Annotated)
- Integer findPropertyIndex(Annotated)
- Object findValueInstantiator(AnnotatedClass)
- Class findSerializationKeyType(Annotated, JavaType)
- String findTypeName(AnnotatedClass)
- void findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)
- JsonFormat$Value findFormat(Annotated)
- String[] findSerializationPropertyOrder(AnnotatedClass)
- Object findSerializer(Annotated)
- void findEnumAliases(Class, Enum[], String[][])
- Object findInjectableValueId(AnnotatedMember)
- Boolean hasAsValue(Annotated)
- List findSubtypes(Annotated)
- PropertyName findRenameByField(MapperConfig, AnnotatedField, PropertyName)
- boolean hasAsValueAnnotation(AnnotatedMethod)
- Class findPOJOBuilder(AnnotatedClass)
- Object findContentSerializer(Annotated)
- String findEnumValue(Enum)
- String findPropertyDescription(Annotated)
- Object findNamingStrategy(AnnotatedClass)
- Boolean hasAsKey(MapperConfig, Annotated)
- JacksonInject$Value findInjectableValue(AnnotatedMember)
- Object findDeserializer(Annotated)
- Object findKeyDeserializer(Annotated)
- JsonIgnoreProperties$Value findPropertyIgnoralByName(MapperConfig, Annotated)
- JsonProperty$Access findPropertyAccess(Annotated)
- JavaType refineSerializationType(MapperConfig, Annotated, JavaType) throws JsonMappingException
- JsonPOJOBuilder$Value findPOJOBuilderConfig(AnnotatedClass)
- Class findDeserializationKeyType(Annotated, JavaType)
- Object findDeserializationContentConverter(AnnotatedMember)
- VisibilityChecker findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)
- Collection allIntrospectors()
- Collection allIntrospectors(Collection)
- String findImplicitPropertyName(AnnotatedMember)

### Class: com.fasterxml.jackson.databind.introspect.AnnotationMap
Type: Class
Implements: com.fasterxml.jackson.databind.util.Annotations

Methods:
- boolean add(Annotation)
- boolean hasOneOf(Class[])
- int size()
- boolean addIfNotPresent(Annotation)
- **static** AnnotationMap merge(AnnotationMap, AnnotationMap)
- Annotation get(Class)
- **static** AnnotationMap of(Class, Annotation)
- Iterable annotations()
- String toString()
- boolean has(Class)

### Class: com.fasterxml.jackson.databind.introspect.BasicBeanDescription
Type: Class
Extends: com.fasterxml.jackson.databind.BeanDescription

Methods:
- List findBackReferences()
- **static** BasicBeanDescription forSerialization(POJOPropertiesCollector)
- **static** BasicBeanDescription forDeserialization(POJOPropertiesCollector)
- AnnotatedClass getClassInfo()
- Map findBackReferenceProperties()
- AnnotatedMember findJsonValueAccessor()
- String findClassDescription()
- Constructor findSingleArgConstructor(Class[])
- AnnotatedConstructor findDefaultConstructor()
- JsonInclude$Value findPropertyInclusion(JsonInclude$Value)
- AnnotatedMethod findMethod(String, Class[])
- List getConstructors()
- TypeBindings bindingsForBeanType()
- AnnotatedMember findAnySetterAccessor() throws IllegalArgumentException
- Annotations getClassAnnotations()
- Class[] findDefaultViews()
- JsonFormat$Value findExpectedFormat(JsonFormat$Value)
- List getFactoryMethods()
- JavaType resolveType(Type)
- Converter findDeserializationConverter()
- Method findFactoryMethod(Class[])
- AnnotatedMethod findJsonValueMethod()
- AnnotatedMember findJsonKeyAccessor()
- Class findPOJOBuilder()
- Map findInjectables()
- BeanPropertyDefinition findProperty(PropertyName)
- Set getIgnoredPropertyNames()
- List findProperties()
- Converter findSerializationConverter()
- Object instantiateBean(boolean)
- boolean hasProperty(PropertyName)
- boolean addProperty(BeanPropertyDefinition)
- List getConstructorsWithMode()
- List getFactoryMethodsWithMode()
- ObjectIdInfo getObjectIdInfo()
- AnnotatedMember findAnyGetter() throws IllegalArgumentException
- JsonPOJOBuilder$Value findPOJOBuilderConfig()
- boolean hasKnownClassAnnotations()
- LinkedHashMap _findPropertyFields(Collection, boolean)
- **static** BasicBeanDescription forOtherUse(MapperConfig, JavaType, AnnotatedClass)
- boolean removeProperty(String)

### Class: com.fasterxml.jackson.databind.introspect.BasicClassIntrospector
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.ClassIntrospector
Implements: java.io.Serializable

Methods:
- BasicBeanDescription forSerialization(SerializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forSerialization(SerializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BasicBeanDescription forDeserialization(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forDeserialization(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BasicBeanDescription forCreation(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forCreation(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BasicBeanDescription forClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- BasicBeanDescription forDirectClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forDirectClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- ClassIntrospector copy()
- BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver, BeanDescription)
- BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver, BeanDescription)

### Class: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.util.Named

Methods:
- Class getRawPrimaryType()
- PropertyName getWrapperName()
- boolean hasName(PropertyName)
- boolean isTypeId()
- String getName()
- JavaType getPrimaryType()
- String findReferenceName()
- AnnotatedMember getPrimaryMember()
- boolean isExplicitlyIncluded()
- boolean hasSetter()
- Iterator getConstructorParameters()
- AnnotationIntrospector$ReferenceProperty findReferenceType()
- AnnotatedMember getAccessor()
- BeanPropertyDefinition withName(PropertyName)
- ObjectIdInfo findObjectIdInfo()
- boolean isExplicitlyNamed()
- PropertyName getFullName()
- boolean couldDeserialize()
- AnnotatedParameter getConstructorParameter()
- AnnotatedMethod getGetter()
- boolean isRequired()
- PropertyMetadata getMetadata()
- JsonInclude$Value findInclusion()
- AnnotatedMember getMutator()
- AnnotatedField getField()
- Class[] findViews()
- boolean couldSerialize()
- boolean hasConstructorParameter()
- AnnotatedMethod getSetter()
- String getInternalName()
- AnnotatedMember getNonConstructorMutator()
- BeanPropertyDefinition withSimpleName(String)
- boolean hasGetter()
- boolean hasField()

### Class: com.fasterxml.jackson.databind.introspect.ClassIntrospector
Type: Abstract Class

Methods:
- BeanDescription forSerialization(SerializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forDeserialization(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forCreation(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- BeanDescription forDirectClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)
- ClassIntrospector copy()
- BeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver, BeanDescription)
- BeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)

### Class: com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.BeanProperty, java.io.Serializable

Methods:
- JsonInclude$Value findPropertyInclusion(MapperConfig, Class)
- boolean isRequired()
- PropertyMetadata getMetadata()
- JsonFormat$Value findFormatOverrides(AnnotationIntrospector)
- List findAliases(MapperConfig)
- JsonFormat$Value findPropertyFormat(MapperConfig, Class)
- boolean isVirtual()

### Class: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy

Methods:
- String findNameForIsGetter(AnnotatedMethod, String)
- String findNameForMutator(AnnotatedMethod, String)
- String modifyFieldName(AnnotatedField, String)
- String findNameForRegularGetter(AnnotatedMethod, String)

### Class: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$FirstCharBasedValidator
Type: Class
Implements: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$BaseNameValidator

Methods:
- **static** DefaultAccessorNamingStrategy$BaseNameValidator forFirstNameRule(boolean, boolean)
- boolean accept(char, String, int)

### Class: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$Provider
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Provider
Implements: java.io.Serializable

Methods:
- AccessorNamingStrategy forRecord(MapperConfig, AnnotatedClass)
- AccessorNamingStrategy forBuilder(MapperConfig, AnnotatedClass, BeanDescription)
- DefaultAccessorNamingStrategy$Provider withBuilderPrefix(String)
- DefaultAccessorNamingStrategy$Provider withGetterPrefix(String)
- DefaultAccessorNamingStrategy$Provider withBaseNameValidator(DefaultAccessorNamingStrategy$BaseNameValidator)
- DefaultAccessorNamingStrategy$Provider withFirstCharAcceptance(boolean, boolean)
- AccessorNamingStrategy forPOJO(MapperConfig, AnnotatedClass)
- DefaultAccessorNamingStrategy$Provider withIsGetterPrefix(String)
- DefaultAccessorNamingStrategy$Provider withSetterPrefix(String)

### Class: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$RecordNaming
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy

Methods:
- String findNameForRegularGetter(AnnotatedMethod, String)

### Class: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector
Type: Class
Extends: com.fasterxml.jackson.databind.AnnotationIntrospector
Implements: java.io.Serializable

Methods:
- Object findSerializationContentConverter(AnnotatedMember)
- JsonCreator$Mode findCreatorBinding(Annotated)
- boolean hasAnyGetterAnnotation(AnnotatedMethod)
- Enum findDefaultEnumValue(Class)
- Object findContentDeserializer(Annotated)
- TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)
- JsonInclude$Value findPropertyInclusion(Annotated)
- JsonIncludeProperties$Value findPropertyInclusionByName(MapperConfig, Annotated)
- AnnotationIntrospector$ReferenceProperty findReferenceType(AnnotatedMember)
- Boolean isIgnorableType(AnnotatedClass)
- PropertyName findNameForDeserialization(Annotated)
- boolean hasIgnoreMarker(AnnotatedMember)
- ObjectIdInfo findObjectReferenceInfo(Annotated, ObjectIdInfo)
- String findPropertyDefaultValue(Annotated)
- ObjectIdInfo findObjectIdInfo(Annotated)
- boolean hasAnySetterAnnotation(AnnotatedMethod)
- PropertyName findRootName(AnnotatedClass)
- Boolean findMergeInfo(Annotated)
- Object findDeserializationConverter(Annotated)
- TypeResolverBuilder findTypeResolver(MapperConfig, AnnotatedClass, JavaType)
- Boolean hasRequiredMarker(AnnotatedMember)
- String[] findEnumValues(Class, Enum[], String[])
- JsonCreator$Mode findCreatorAnnotation(MapperConfig, Annotated)
- NameTransformer findUnwrappingNameTransformer(AnnotatedMember)
- Class findSerializationType(Annotated)
- Class[] findViews(Annotated)
- JavaType refineDeserializationType(MapperConfig, Annotated, JavaType) throws JsonMappingException
- Object findSerializationConverter(Annotated)
- Object findNullSerializer(Annotated)
- Version version()
- Boolean hasAnyGetter(Annotated)
- Object findFilterId(Annotated)
- Object findKeySerializer(Annotated)
- boolean hasCreatorAnnotation(Annotated)
- JsonIgnoreProperties$Value findPropertyIgnorals(Annotated)
- Class findDeserializationContentType(Annotated, JavaType)
- Class findSerializationContentType(Annotated, JavaType)
- JsonSerialize$Typing findSerializationTyping(Annotated)
- Boolean hasAnySetter(Annotated)
- PropertyName findNameForSerialization(Annotated)
- boolean isAnnotationBundle(Annotation)
- Class findDeserializationType(Annotated, JavaType)
- Boolean findSerializationSortAlphabetically(Annotated)
- Boolean isTypeId(AnnotatedMember)
- TypeResolverBuilder findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)
- JacksonAnnotationIntrospector setConstructorPropertiesImpliesCreator(boolean)
- String findClassDescription(AnnotatedClass)
- AnnotatedMethod resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)
- JsonSetter$Value findSetterInfo(Annotated)
- List findPropertyAliases(Annotated)
- Integer findPropertyIndex(Annotated)
- Object findValueInstantiator(AnnotatedClass)
- Class findSerializationKeyType(Annotated, JavaType)
- String findTypeName(AnnotatedClass)
- void findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)
- JsonFormat$Value findFormat(Annotated)
- String[] findSerializationPropertyOrder(AnnotatedClass)
- Object findSerializer(Annotated)
- Object findInjectableValueId(AnnotatedMember)
- void findEnumAliases(Class, Enum[], String[][])
- Boolean hasAsValue(Annotated)
- List findSubtypes(Annotated)
- PropertyName findRenameByField(MapperConfig, AnnotatedField, PropertyName)
- boolean hasAsValueAnnotation(AnnotatedMethod)
- Class findPOJOBuilder(AnnotatedClass)
- Object findContentSerializer(Annotated)
- String findPropertyDescription(Annotated)
- String findEnumValue(Enum)
- Object findNamingStrategy(AnnotatedClass)
- Boolean hasAsKey(MapperConfig, Annotated)
- JacksonInject$Value findInjectableValue(AnnotatedMember)
- Object findDeserializer(Annotated)
- Object findKeyDeserializer(Annotated)
- JsonIgnoreProperties$Value findPropertyIgnoralByName(MapperConfig, Annotated)
- JsonProperty$Access findPropertyAccess(Annotated)
- JavaType refineSerializationType(MapperConfig, Annotated, JavaType) throws JsonMappingException
- JsonPOJOBuilder$Value findPOJOBuilderConfig(AnnotatedClass)
- Class findDeserializationKeyType(Annotated, JavaType)
- Object findDeserializationContentConverter(AnnotatedMember)
- VisibilityChecker findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)
- String findImplicitPropertyName(AnnotatedMember)

### Class: com.fasterxml.jackson.databind.introspect.MemberKey
Type: Class

Methods:
- String getName()
- int hashCode()
- int argCount()
- boolean equals(Object)
- String toString()

### Class: com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.AnnotationIntrospector
Implements: java.io.Serializable

Methods:
- Version version()

### Class: com.fasterxml.jackson.databind.introspect.ObjectIdInfo
Type: Class

Methods:
- Class getGeneratorType()
- String toString()
- boolean getAlwaysAsId()
- ObjectIdInfo withAlwaysAsId(boolean)
- Class getResolverType()
- Class getScope()
- PropertyName getPropertyName()
- **static** ObjectIdInfo empty()

### Class: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector
Type: Class

Methods:
- AnnotatedMethod getJsonValueMethod()
- List getProperties()
- AnnotationIntrospector getAnnotationIntrospector()
- Set getIgnoredPropertyNames()
- Map getInjectables()
- MapperConfig getConfig()
- AnnotatedMember getJsonValueAccessor()
- AnnotatedMethod getAnySetterMethod()
- AnnotatedMember getAnyGetterMethod()
- ObjectIdInfo getObjectIdInfo()
- JavaType getType()
- AnnotatedMember getJsonKeyAccessor()
- AnnotatedMember getAnyGetterField()
- AnnotatedClass getClassDef()
- AnnotatedMember getAnySetterField()
- AnnotatedMember getAnyGetter()
- Class findPOJOBuilderClass()

### Class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
Implements: java.lang.Comparable

Methods:
- Class getRawPrimaryType()
- PropertyName getWrapperName()
- boolean hasName(PropertyName)
- boolean isTypeId()
- String getName()
- boolean anyExplicitsWithoutIgnoral()
- JavaType getPrimaryType()
- AnnotatedMember getPrimaryMember()
- boolean isExplicitlyIncluded()
- boolean hasSetter()
- int compareTo(POJOPropertyBuilder)
- int compareTo(Object)
- boolean anyIgnorals()
- void addGetter(AnnotatedMethod, PropertyName, boolean, boolean, boolean)
- Iterator getConstructorParameters()
- boolean anyVisible()
- AnnotationIntrospector$ReferenceProperty findReferenceType()
- Collection explode(Collection)
- void addCtor(AnnotatedParameter, PropertyName, boolean, boolean, boolean)
- void mergeAnnotations(boolean)
- void removeIgnored()
- POJOPropertyBuilder withName(PropertyName)
- BeanPropertyDefinition withName(PropertyName)
- ObjectIdInfo findObjectIdInfo()
- boolean isExplicitlyNamed()
- PropertyName getFullName()
- boolean couldDeserialize()
- AnnotatedParameter getConstructorParameter()
- AnnotatedMethod getGetter()
- PropertyMetadata getMetadata()
- void removeConstructors()
- JsonInclude$Value findInclusion()
- void addField(AnnotatedField, PropertyName, boolean, boolean, boolean)
- AnnotatedField getField()
- Class[] findViews()
- boolean couldSerialize()
- JsonProperty$Access findAccess()
- boolean hasConstructorParameter()
- AnnotatedMethod getSetter()
- JsonProperty$Access removeNonVisible(boolean)
- JsonProperty$Access removeNonVisible(boolean, POJOPropertiesCollector)
- void addAll(POJOPropertyBuilder)
- String getInternalName()
- Set findExplicitNames()
- void trimByVisibility()
- String toString()
- void addSetter(AnnotatedMethod, PropertyName, boolean, boolean, boolean)
- POJOPropertyBuilder withSimpleName(String)
- BeanPropertyDefinition withSimpleName(String)
- boolean hasGetter()
- boolean hasField()

### Class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked
Type: Class

Methods:
- POJOPropertyBuilder$Linked withNext(POJOPropertyBuilder$Linked)
- POJOPropertyBuilder$Linked withValue(Object)
- POJOPropertyBuilder$Linked withoutNext()
- POJOPropertyBuilder$Linked trimByVisibility()
- POJOPropertyBuilder$Linked withoutNonVisible()
- String toString()
- POJOPropertyBuilder$Linked withoutIgnored()

### Class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator
Type: Class
Implements: java.util.Iterator

Methods:
- AnnotatedMember next()
- Object next()
- boolean hasNext()
- void remove()

### Class: com.fasterxml.jackson.databind.introspect.SimpleMixInResolver
Type: Class
Implements: com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver, java.io.Serializable

Methods:
- SimpleMixInResolver withoutLocalDefinitions()
- void setLocalDefinitions(Map)
- int localSize()
- Class findMixInClassFor(Class)
- void addLocalDefinition(Class, Class)
- SimpleMixInResolver copy()
- ClassIntrospector$MixInResolver copy()
- SimpleMixInResolver withOverrides(ClassIntrospector$MixInResolver)
- boolean hasMixIns()

### Class: com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic
Type: Class
Implements: com.fasterxml.jackson.databind.introspect.TypeResolutionContext

Methods:
- JavaType resolveType(Type)

### Class: com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Empty
Type: Class
Implements: com.fasterxml.jackson.databind.introspect.TypeResolutionContext

Methods:
- JavaType resolveType(Type)

### Class: com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.AnnotatedMember
Implements: java.io.Serializable

Methods:
- Class getRawType()
- String getName()
- Field getAnnotated()
- AnnotatedElement getAnnotated()
- Member getMember()
- Annotated withAnnotations(AnnotationMap)
- int getAnnotationCount()
- Object getValue(Object) throws IllegalArgumentException
- Class getDeclaringClass()
- JavaType getType()
- int hashCode()
- boolean equals(Object)
- void setValue(Object, Object) throws IllegalArgumentException
- String toString()
- int getModifiers()

### Class: com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std
Type: Class
Implements: com.fasterxml.jackson.databind.introspect.VisibilityChecker, java.io.Serializable

Methods:
- boolean isSetterVisible(Method)
- boolean isSetterVisible(AnnotatedMethod)
- VisibilityChecker$Std withCreatorVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withCreatorVisibility(JsonAutoDetect$Visibility)
- **static** VisibilityChecker$Std construct(JsonAutoDetect$Value)
- boolean isFieldVisible(Field)
- boolean isFieldVisible(AnnotatedField)
- VisibilityChecker$Std withGetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withGetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker$Std with(JsonAutoDetect)
- VisibilityChecker$Std with(JsonAutoDetect$Visibility)
- VisibilityChecker with(JsonAutoDetect$Visibility)
- VisibilityChecker with(JsonAutoDetect)
- **static** VisibilityChecker$Std allPublicInstance()
- boolean isIsGetterVisible(Method)
- boolean isIsGetterVisible(AnnotatedMethod)
- boolean isGetterVisible(Method)
- boolean isGetterVisible(AnnotatedMethod)
- VisibilityChecker$Std withIsGetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withIsGetterVisibility(JsonAutoDetect$Visibility)
- **static** VisibilityChecker$Std defaultInstance()
- String toString()
- VisibilityChecker$Std withFieldVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withFieldVisibility(JsonAutoDetect$Visibility)
- boolean isCreatorVisible(Member)
- boolean isCreatorVisible(AnnotatedMember)
- VisibilityChecker$Std withOverrides(JsonAutoDetect$Value)
- VisibilityChecker withOverrides(JsonAutoDetect$Value)
- VisibilityChecker$Std withSetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker withSetterVisibility(JsonAutoDetect$Visibility)
- VisibilityChecker$Std withVisibility(PropertyAccessor, JsonAutoDetect$Visibility)
- VisibilityChecker withVisibility(PropertyAccessor, JsonAutoDetect$Visibility)

## Package: com.fasterxml.jackson.databind.jdk14

### Class: com.fasterxml.jackson.databind.jdk14.JDK14Util
Type: Class

Methods:
- **static** String[] getRecordFieldNames(Class)
- **static** AnnotatedConstructor findRecordConstructor(DeserializationContext, BeanDescription, List)

## Package: com.fasterxml.jackson.databind.json

### Class: com.fasterxml.jackson.databind.json.JsonMapper
Type: Class
Extends: com.fasterxml.jackson.databind.ObjectMapper

Methods:
- JsonMapper$Builder rebuild()
- boolean isEnabled(JsonReadFeature)
- boolean isEnabled(JsonWriteFeature)
- **static** JsonMapper$Builder builder()
- **static** JsonMapper$Builder builder(JsonFactory)
- JsonMapper copy()
- ObjectMapper copy()
- JsonFactory getFactory()
- Version version()

### Class: com.fasterxml.jackson.databind.json.JsonMapper$Builder
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.MapperBuilder

Methods:
- JsonMapper$Builder disable(JsonReadFeature[])
- JsonMapper$Builder disable(JsonWriteFeature[])
- JsonMapper$Builder enable(JsonReadFeature[])
- JsonMapper$Builder enable(JsonWriteFeature[])
- JsonMapper$Builder configure(JsonReadFeature, boolean)
- JsonMapper$Builder configure(JsonWriteFeature, boolean)

## Package: com.fasterxml.jackson.databind.jsonFormatVisitors

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor
Type: Interface

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider

Methods:
- void itemsFormat(JsonFormatVisitable, JavaType) throws JsonMappingException
- void itemsFormat(JsonFormatTypes) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
Type: Interface

Methods:
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
Type: Interface

Methods:
- void setProvider(SerializerProvider)
- SerializerProvider getProvider()

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider

Methods:
- JsonArrayFormatVisitor expectArrayFormat(JavaType) throws JsonMappingException
- JsonIntegerFormatVisitor expectIntegerFormat(JavaType) throws JsonMappingException
- JsonMapFormatVisitor expectMapFormat(JavaType) throws JsonMappingException
- JsonNullFormatVisitor expectNullFormat(JavaType) throws JsonMappingException
- JsonObjectFormatVisitor expectObjectFormat(JavaType) throws JsonMappingException
- JsonNumberFormatVisitor expectNumberFormat(JavaType) throws JsonMappingException
- JsonStringFormatVisitor expectStringFormat(JavaType) throws JsonMappingException
- JsonAnyFormatVisitor expectAnyFormat(JavaType) throws JsonMappingException
- JsonBooleanFormatVisitor expectBooleanFormat(JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor

Methods:
- void numberType(JsonParser$NumberType)

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider

Methods:
- void keyFormat(JsonFormatVisitable, JavaType) throws JsonMappingException
- void valueFormat(JsonFormatVisitable, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor
Type: Interface

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor

Methods:
- void numberType(JsonParser$NumberType)

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider

Methods:
- void optionalProperty(BeanProperty) throws JsonMappingException
- void optionalProperty(String, JsonFormatVisitable, JavaType) throws JsonMappingException
- void property(BeanProperty) throws JsonMappingException
- void property(String, JsonFormatVisitable, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor
Type: Interface
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor
Type: Interface

Methods:
- void format(JsonValueFormat)
- void enumTypes(Set)

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor

Methods:
- void itemsFormat(JsonFormatVisitable, JavaType) throws JsonMappingException
- void itemsFormat(JsonFormatTypes) throws JsonMappingException
- void setProvider(SerializerProvider)
- SerializerProvider getProvider()

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor$Base
Type: Class
Extends: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor$Base
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonFormatTypes forValue(String)
- **static** JsonFormatTypes valueOf(String)
- **static** JsonFormatTypes[] values()
- String value()

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper

Methods:
- JsonArrayFormatVisitor expectArrayFormat(JavaType) throws JsonMappingException
- JsonIntegerFormatVisitor expectIntegerFormat(JavaType) throws JsonMappingException
- JsonMapFormatVisitor expectMapFormat(JavaType) throws JsonMappingException
- void setProvider(SerializerProvider)
- JsonNullFormatVisitor expectNullFormat(JavaType) throws JsonMappingException
- JsonObjectFormatVisitor expectObjectFormat(JavaType) throws JsonMappingException
- SerializerProvider getProvider()
- JsonNumberFormatVisitor expectNumberFormat(JavaType) throws JsonMappingException
- JsonStringFormatVisitor expectStringFormat(JavaType) throws JsonMappingException
- JsonAnyFormatVisitor expectAnyFormat(JavaType) throws JsonMappingException
- JsonBooleanFormatVisitor expectBooleanFormat(JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor$Base
Type: Class
Extends: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor$Base
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor

Methods:
- void numberType(JsonParser$NumberType)

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor

Methods:
- void keyFormat(JsonFormatVisitable, JavaType) throws JsonMappingException
- void setProvider(SerializerProvider)
- void valueFormat(JsonFormatVisitable, JavaType) throws JsonMappingException
- SerializerProvider getProvider()

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor$Base
Type: Class
Extends: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor$Base
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor

Methods:
- void numberType(JsonParser$NumberType)

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor

Methods:
- void optionalProperty(BeanProperty) throws JsonMappingException
- void optionalProperty(String, JsonFormatVisitable, JavaType) throws JsonMappingException
- void setProvider(SerializerProvider)
- void property(BeanProperty) throws JsonMappingException
- void property(String, JsonFormatVisitable, JavaType) throws JsonMappingException
- SerializerProvider getProvider()

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor$Base
Type: Class
Extends: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor$Base
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor

No public methods found

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonValueFormat valueOf(String)
- **static** JsonValueFormat[] values()
- String toString()

### Class: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor$Base
Type: Class
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor

Methods:
- void format(JsonValueFormat)
- void enumTypes(Set)

## Package: com.fasterxml.jackson.databind.jsonschema

### Class: com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String schemaObjectPropertiesDefinition()
- String schemaType()
- String schemaItemDefinition()
- String id()

### Class: com.fasterxml.jackson.databind.jsonschema.SchemaAware
Type: Interface

Methods:
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type, boolean) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsonschema.JsonSchema
Type: Class

Methods:
- **static** JsonNode getDefaultSchemaNode()
- int hashCode()
- boolean equals(Object)
- ObjectNode getSchemaNode()
- String toString()

## Package: com.fasterxml.jackson.databind.jsontype

### Class: com.fasterxml.jackson.databind.jsontype.TypeIdResolver
Type: Interface

Methods:
- JsonTypeInfo$Id getMechanism()
- void init(JavaType)
- String getDescForKnownTypeIds()
- JavaType typeFromId(DatabindContext, String) throws IOException
- String idFromBaseType()
- String idFromValueAndType(Object, Class)
- String idFromValue(Object)

### Class: com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
Type: Interface

Methods:
- TypeResolverBuilder inclusion(JsonTypeInfo$As)
- TypeResolverBuilder init(JsonTypeInfo$Id, TypeIdResolver)
- TypeResolverBuilder withDefaultImpl(Class)
- TypeDeserializer buildTypeDeserializer(DeserializationConfig, JavaType, Collection)
- TypeResolverBuilder typeIdVisibility(boolean)
- TypeResolverBuilder defaultImpl(Class)
- Class getDefaultImpl()
- TypeResolverBuilder typeProperty(String)
- TypeSerializer buildTypeSerializer(SerializationConfig, JavaType, Collection)

### Class: com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
Implements: java.io.Serializable

Methods:
- PolymorphicTypeValidator$Validity validateBaseType(MapperConfig, JavaType)
- PolymorphicTypeValidator$Validity validateSubClassName(MapperConfig, JavaType, String)
- PolymorphicTypeValidator$Validity validateSubType(MapperConfig, JavaType, JavaType)

### Class: com.fasterxml.jackson.databind.jsontype.NamedType
Type: Class
Implements: java.io.Serializable

Methods:
- void setName(String)
- boolean hasName()
- String getName()
- Class getType()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- PolymorphicTypeValidator$Validity validateBaseType(MapperConfig, JavaType)
- PolymorphicTypeValidator$Validity validateSubClassName(MapperConfig, JavaType, String) throws JsonMappingException
- PolymorphicTypeValidator$Validity validateSubType(MapperConfig, JavaType, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Base
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
Implements: java.io.Serializable

Methods:
- PolymorphicTypeValidator$Validity validateBaseType(MapperConfig, JavaType)
- PolymorphicTypeValidator$Validity validateSubClassName(MapperConfig, JavaType, String) throws JsonMappingException
- PolymorphicTypeValidator$Validity validateSubType(MapperConfig, JavaType, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Validity
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PolymorphicTypeValidator$Validity valueOf(String)
- **static** PolymorphicTypeValidator$Validity[] values()

### Class: com.fasterxml.jackson.databind.jsontype.SubtypeResolver
Type: Abstract Class

Methods:
- Collection collectAndResolveSubtypes(AnnotatedMember, MapperConfig, AnnotationIntrospector, JavaType)
- Collection collectAndResolveSubtypes(AnnotatedClass, MapperConfig, AnnotationIntrospector)
- Collection collectAndResolveSubtypesByTypeId(MapperConfig, AnnotatedMember, JavaType)
- Collection collectAndResolveSubtypesByTypeId(MapperConfig, AnnotatedClass)
- SubtypeResolver copy()
- void registerSubtypes(NamedType[])
- void registerSubtypes(Class[])
- void registerSubtypes(Collection)
- Collection collectAndResolveSubtypesByClass(MapperConfig, AnnotatedMember, JavaType)
- Collection collectAndResolveSubtypesByClass(MapperConfig, AnnotatedClass)

### Class: com.fasterxml.jackson.databind.jsontype.TypeDeserializer
Type: Abstract Class

Methods:
- JsonTypeInfo$As getTypeInclusion()
- Object deserializeTypedFromAny(JsonParser, DeserializationContext) throws IOException
- boolean hasDefaultImpl()
- Object deserializeTypedFromArray(JsonParser, DeserializationContext) throws IOException
- TypeDeserializer forProperty(BeanProperty)
- TypeIdResolver getTypeIdResolver()
- **static** Object deserializeIfNatural(JsonParser, DeserializationContext, JavaType) throws IOException
- **static** Object deserializeIfNatural(JsonParser, DeserializationContext, Class) throws IOException
- Object deserializeTypedFromScalar(JsonParser, DeserializationContext) throws IOException
- Object deserializeTypedFromObject(JsonParser, DeserializationContext) throws IOException
- Class getDefaultImpl()
- String getPropertyName()

### Class: com.fasterxml.jackson.databind.jsontype.TypeSerializer
Type: Abstract Class

Methods:
- void writeTypePrefixForArray(Object, JsonGenerator) throws IOException
- void writeTypePrefixForArray(Object, JsonGenerator, Class) throws IOException
- void writeTypePrefixForObject(Object, JsonGenerator) throws IOException
- void writeTypePrefixForObject(Object, JsonGenerator, Class) throws IOException
- void writeCustomTypePrefixForObject(Object, JsonGenerator, String) throws IOException
- TypeSerializer forProperty(BeanProperty)
- void writeCustomTypePrefixForArray(Object, JsonGenerator, String) throws IOException
- WritableTypeId writeTypeSuffix(JsonGenerator, WritableTypeId) throws IOException
- void writeTypeSuffixForScalar(Object, JsonGenerator) throws IOException
- void writeCustomTypeSuffixForScalar(Object, JsonGenerator, String) throws IOException
- JsonTypeInfo$As getTypeInclusion()
- void writeCustomTypeSuffixForObject(Object, JsonGenerator, String) throws IOException
- void writeTypeSuffixForArray(Object, JsonGenerator) throws IOException
- WritableTypeId writeTypePrefix(JsonGenerator, WritableTypeId) throws IOException
- TypeIdResolver getTypeIdResolver()
- void writeTypeSuffixForObject(Object, JsonGenerator) throws IOException
- WritableTypeId typeId(Object, JsonToken)
- WritableTypeId typeId(Object, JsonToken, Object)
- WritableTypeId typeId(Object, Class, JsonToken)
- void writeTypePrefixForScalar(Object, JsonGenerator) throws IOException
- void writeTypePrefixForScalar(Object, JsonGenerator, Class) throws IOException
- void writeCustomTypePrefixForScalar(Object, JsonGenerator, String) throws IOException
- String getPropertyName()
- void writeCustomTypeSuffixForArray(Object, JsonGenerator, String) throws IOException

## Package: com.fasterxml.jackson.databind.jsontype.impl

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase
Implements: java.io.Serializable

Methods:
- JsonTypeInfo$As getTypeInclusion()
- Object deserializeTypedFromAny(JsonParser, DeserializationContext) throws IOException
- Object deserializeTypedFromArray(JsonParser, DeserializationContext) throws IOException
- TypeDeserializer forProperty(BeanProperty)
- Object deserializeTypedFromScalar(JsonParser, DeserializationContext) throws IOException
- Object deserializeTypedFromObject(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase

Methods:
- JsonTypeInfo$As getTypeInclusion()
- AsArrayTypeSerializer forProperty(BeanProperty)
- TypeSerializer forProperty(BeanProperty)

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer

Methods:
- TypeDeserializer forProperty(BeanProperty)
- Object deserializeTypedFromObject(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer

Methods:
- JsonTypeInfo$As getTypeInclusion()
- AsExistingPropertyTypeSerializer forProperty(BeanProperty)
- AsPropertyTypeSerializer forProperty(BeanProperty)
- AsArrayTypeSerializer forProperty(BeanProperty)
- TypeSerializer forProperty(BeanProperty)

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer

Methods:
- JsonTypeInfo$As getTypeInclusion()
- TypeDeserializer forProperty(BeanProperty)

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase

Methods:
- JsonTypeInfo$As getTypeInclusion()
- AsExternalTypeSerializer forProperty(BeanProperty)
- TypeSerializer forProperty(BeanProperty)
- String getPropertyName()

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer

Methods:
- JsonTypeInfo$As getTypeInclusion()
- Object deserializeTypedFromAny(JsonParser, DeserializationContext) throws IOException
- TypeDeserializer forProperty(BeanProperty)
- Object deserializeTypedFromObject(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer

Methods:
- JsonTypeInfo$As getTypeInclusion()
- AsPropertyTypeSerializer forProperty(BeanProperty)
- AsArrayTypeSerializer forProperty(BeanProperty)
- TypeSerializer forProperty(BeanProperty)
- String getPropertyName()

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase
Implements: java.io.Serializable

Methods:
- JsonTypeInfo$As getTypeInclusion()
- Object deserializeTypedFromAny(JsonParser, DeserializationContext) throws IOException
- Object deserializeTypedFromArray(JsonParser, DeserializationContext) throws IOException
- TypeDeserializer forProperty(BeanProperty)
- Object deserializeTypedFromScalar(JsonParser, DeserializationContext) throws IOException
- Object deserializeTypedFromObject(JsonParser, DeserializationContext) throws IOException

### Class: com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase

Methods:
- JsonTypeInfo$As getTypeInclusion()
- AsWrapperTypeSerializer forProperty(BeanProperty)
- TypeSerializer forProperty(BeanProperty)

### Class: com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase

Methods:
- JsonTypeInfo$Id getMechanism()
- String getDescForKnownTypeIds()
- JavaType typeFromId(DatabindContext, String) throws IOException
- String idFromValueAndType(Object, Class)
- String idFromValue(Object)
- **static** ClassNameIdResolver construct(JavaType, MapperConfig, PolymorphicTypeValidator)
- void registerSubtype(Class, String)

### Class: com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Base

Methods:
- PolymorphicTypeValidator$Validity validateBaseType(MapperConfig, JavaType)
- PolymorphicTypeValidator$Validity validateSubClassName(MapperConfig, JavaType, String)
- PolymorphicTypeValidator$Validity validateSubType(MapperConfig, JavaType, JavaType)

### Class: com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver

Methods:
- JsonTypeInfo$Id getMechanism()
- String idFromValue(Object)
- **static** MinimalClassNameIdResolver construct(JavaType, MapperConfig, PolymorphicTypeValidator)

### Class: com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.SubtypeResolver
Implements: java.io.Serializable

Methods:
- Collection collectAndResolveSubtypesByTypeId(MapperConfig, AnnotatedMember, JavaType)
- Collection collectAndResolveSubtypesByTypeId(MapperConfig, AnnotatedClass)
- SubtypeResolver copy()
- void registerSubtypes(NamedType[])
- void registerSubtypes(Class[])
- void registerSubtypes(Collection)
- Collection collectAndResolveSubtypesByClass(MapperConfig, AnnotatedMember, JavaType)
- Collection collectAndResolveSubtypesByClass(MapperConfig, AnnotatedClass)

### Class: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
Type: Class
Implements: com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder

Methods:
- StdTypeResolverBuilder init(JsonTypeInfo$Id, TypeIdResolver)
- TypeResolverBuilder init(JsonTypeInfo$Id, TypeIdResolver)
- StdTypeResolverBuilder withDefaultImpl(Class)
- TypeResolverBuilder withDefaultImpl(Class)
- TypeDeserializer buildTypeDeserializer(DeserializationConfig, JavaType, Collection)
- PolymorphicTypeValidator subTypeValidator(MapperConfig)
- StdTypeResolverBuilder typeIdVisibility(boolean)
- TypeResolverBuilder typeIdVisibility(boolean)
- Class getDefaultImpl()
- StdTypeResolverBuilder defaultImpl(Class)
- TypeResolverBuilder defaultImpl(Class)
- StdTypeResolverBuilder typeProperty(String)
- TypeResolverBuilder typeProperty(String)
- StdTypeResolverBuilder inclusion(JsonTypeInfo$As)
- TypeResolverBuilder inclusion(JsonTypeInfo$As)
- boolean isTypeIdVisible()
- **static** StdTypeResolverBuilder noTypeInfoBuilder()
- String getTypeProperty()
- TypeSerializer buildTypeSerializer(SerializationConfig, JavaType, Collection)

### Class: com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator
Type: Class

Methods:
- **static** SubTypeValidator instance()
- void validateSubType(DeserializationContext, JavaType, BeanDescription) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.jsontype.TypeDeserializer
Implements: java.io.Serializable

Methods:
- JsonTypeInfo$As getTypeInclusion()
- boolean hasDefaultImpl()
- TypeDeserializer forProperty(BeanProperty)
- TypeIdResolver getTypeIdResolver()
- String baseTypeName()
- String toString()
- Class getDefaultImpl()
- String getPropertyName()
- JavaType baseType()

### Class: com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.jsontype.TypeIdResolver

Methods:
- void init(JavaType)
- String getDescForKnownTypeIds()
- JavaType typeFromId(DatabindContext, String) throws IOException
- String idFromBaseType()

### Class: com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver
Type: Class
Extends: com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase

Methods:
- JsonTypeInfo$Id getMechanism()
- String getDescForKnownTypeIds()
- JavaType typeFromId(DatabindContext, String)
- String toString()
- String idFromValueAndType(Object, Class)
- String idFromValue(Object)
- **static** TypeNameIdResolver construct(MapperConfig, JavaType, Collection, boolean, boolean)

### Class: com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.jsontype.TypeSerializer

Methods:
- JsonTypeInfo$As getTypeInclusion()
- WritableTypeId writeTypePrefix(JsonGenerator, WritableTypeId) throws IOException
- TypeIdResolver getTypeIdResolver()
- WritableTypeId writeTypeSuffix(JsonGenerator, WritableTypeId) throws IOException
- String getPropertyName()

## Package: com.fasterxml.jackson.databind.node

### Class: com.fasterxml.jackson.databind.node.JsonNodeCreator
Type: Interface

Methods:
- ValueNode binaryNode(byte[])
- ValueNode binaryNode(byte[], int, int)
- ValueNode textNode(String)
- ValueNode booleanNode(boolean)
- ObjectNode objectNode()
- ArrayNode arrayNode()
- ArrayNode arrayNode(int)
- ValueNode nullNode()
- ValueNode numberNode(byte)
- ValueNode numberNode(Byte)
- ValueNode numberNode(short)
- ValueNode numberNode(Short)
- ValueNode numberNode(int)
- ValueNode numberNode(Integer)
- ValueNode numberNode(long)
- ValueNode numberNode(Long)
- ValueNode numberNode(BigInteger)
- ValueNode numberNode(float)
- ValueNode numberNode(Float)
- ValueNode numberNode(double)
- ValueNode numberNode(Double)
- ValueNode numberNode(BigDecimal)
- ValueNode rawValueNode(RawValue)
- ValueNode pojoNode(Object)

### Class: com.fasterxml.jackson.databind.node.ArrayNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ContainerNode
Implements: java.io.Serializable

Methods:
- ArrayNode addRawValue(RawValue)
- List findValuesAsText(String, List)
- ArrayNode setNull(int)
- ObjectNode insertObject(int)
- ArrayNode insert(int, JsonNode)
- ArrayNode insert(int, short)
- ArrayNode insert(int, Short)
- ArrayNode insert(int, int)
- ArrayNode insert(int, Integer)
- ArrayNode insert(int, long)
- ArrayNode insert(int, Long)
- ArrayNode insert(int, float)
- ArrayNode insert(int, Float)
- ArrayNode insert(int, double)
- ArrayNode insert(int, Double)
- ArrayNode insert(int, BigDecimal)
- ArrayNode insert(int, BigInteger)
- ArrayNode insert(int, String)
- ArrayNode insert(int, boolean)
- ArrayNode insert(int, Boolean)
- ArrayNode insert(int, byte[])
- ArrayNode withArray(String)
- JsonNode withArray(String)
- JsonNode remove(int)
- JsonNode required(int)
- ArrayNode addNull()
- JsonNode path(String)
- JsonNode path(int)
- TreeNode path(int)
- TreeNode path(String)
- ArrayNode insertArray(int)
- ArrayNode removeAll()
- ContainerNode removeAll()
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- int hashCode()
- ArrayNode addArray()
- ObjectNode findParent(String)
- JsonNode findParent(String)
- JsonNode get(int)
- JsonNode get(String)
- TreeNode get(int)
- TreeNode get(String)
- ArrayNode insertRawValue(int, RawValue)
- JsonNodeType getNodeType()
- List findParents(String, List)
- ArrayNode add(JsonNode)
- ArrayNode add(short)
- ArrayNode add(Short)
- ArrayNode add(int)
- ArrayNode add(Integer)
- ArrayNode add(long)
- ArrayNode add(Long)
- ArrayNode add(float)
- ArrayNode add(Float)
- ArrayNode add(double)
- ArrayNode add(Double)
- ArrayNode add(BigDecimal)
- ArrayNode add(BigInteger)
- ArrayNode add(String)
- ArrayNode add(boolean)
- ArrayNode add(Boolean)
- ArrayNode add(byte[])
- ArrayNode addPOJO(Object)
- JsonNode set(int, JsonNode)
- ArrayNode set(int, short)
- ArrayNode set(int, Short)
- ArrayNode set(int, int)
- ArrayNode set(int, Integer)
- ArrayNode set(int, long)
- ArrayNode set(int, Long)
- ArrayNode set(int, float)
- ArrayNode set(int, Float)
- ArrayNode set(int, double)
- ArrayNode set(int, Double)
- ArrayNode set(int, BigDecimal)
- ArrayNode set(int, BigInteger)
- ArrayNode set(int, String)
- ArrayNode set(int, boolean)
- ArrayNode set(int, Boolean)
- ArrayNode set(int, byte[])
- JsonNode findValue(String)
- ArrayNode setRawValue(int, RawValue)
- ArrayNode setPOJO(int, Object)
- boolean isEmpty(SerializerProvider)
- boolean isEmpty()
- ArrayNode insertPOJO(int, Object)
- JsonToken asToken()
- ArrayNode deepCopy()
- JsonNode deepCopy()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- ObjectNode with(String)
- JsonNode with(String)
- ArrayNode insertNull(int)
- List findValues(String, List)
- int size()
- ArrayNode addAll(ArrayNode)
- ArrayNode addAll(Collection)
- boolean equals(Comparator, JsonNode)
- boolean equals(Object)
- Iterator elements()
- ObjectNode addObject()
- boolean isArray()

### Class: com.fasterxml.jackson.databind.node.BaseJsonNode
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JsonNode
Implements: java.io.Serializable

Methods:
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- JsonParser traverse()
- JsonParser traverse(ObjectCodec)
- JsonParser$NumberType numberType()
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- int hashCode()
- String toPrettyString()
- String toString()
- JsonToken asToken()
- ArrayNode withArray(JsonPointer, JsonNode$OverwriteMode, boolean)
- JsonNode findPath(String)
- ObjectNode withObject(JsonPointer, JsonNode$OverwriteMode, boolean)
- JsonNode required(String)
- JsonNode required(int)

### Class: com.fasterxml.jackson.databind.node.BigIntegerNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- **static** BigIntegerNode valueOf(BigInteger)
- BigDecimal decimalValue()
- boolean isBigInteger()
- float floatValue()
- JsonToken asToken()
- double doubleValue()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- int hashCode()
- boolean equals(Object)
- short shortValue()
- Number numberValue()
- String asText()
- boolean asBoolean(boolean)
- boolean isIntegralNumber()

### Class: com.fasterxml.jackson.databind.node.BinaryNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- int hashCode()
- **static** BinaryNode valueOf(byte[])
- **static** BinaryNode valueOf(byte[], int, int)
- boolean equals(Object)
- JsonNodeType getNodeType()
- JsonToken asToken()
- String asText()
- byte[] binaryValue()

### Class: com.fasterxml.jackson.databind.node.BooleanNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- **static** BooleanNode getTrue()
- **static** BooleanNode getFalse()
- **static** BooleanNode valueOf(boolean)
- JsonToken asToken()
- long asLong(long)
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- int asInt(int)
- int hashCode()
- boolean equals(Object)
- double asDouble(double)
- JsonNodeType getNodeType()
- boolean booleanValue()
- String asText()
- boolean asBoolean()
- boolean asBoolean(boolean)

### Class: com.fasterxml.jackson.databind.node.ContainerNode
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.node.BaseJsonNode
Implements: com.fasterxml.jackson.databind.node.JsonNodeCreator

Methods:
- BinaryNode binaryNode(byte[])
- BinaryNode binaryNode(byte[], int, int)
- ValueNode binaryNode(byte[], int, int)
- ValueNode binaryNode(byte[])
- TextNode textNode(String)
- ValueNode textNode(String)
- JsonToken asToken()
- JsonNode missingNode()
- ContainerNode removeAll()
- BooleanNode booleanNode(boolean)
- ValueNode booleanNode(boolean)
- int size()
- ObjectNode objectNode()
- ArrayNode arrayNode()
- ArrayNode arrayNode(int)
- NullNode nullNode()
- ValueNode nullNode()
- NumericNode numberNode(byte)
- NumericNode numberNode(short)
- NumericNode numberNode(int)
- NumericNode numberNode(long)
- NumericNode numberNode(float)
- NumericNode numberNode(double)
- ValueNode numberNode(BigInteger)
- ValueNode numberNode(BigDecimal)
- ValueNode numberNode(Byte)
- ValueNode numberNode(Short)
- ValueNode numberNode(Integer)
- ValueNode numberNode(Long)
- ValueNode numberNode(Float)
- ValueNode numberNode(Double)
- ValueNode numberNode(double)
- ValueNode numberNode(float)
- ValueNode numberNode(long)
- ValueNode numberNode(int)
- ValueNode numberNode(short)
- ValueNode numberNode(byte)
- JsonNode get(int)
- JsonNode get(String)
- TreeNode get(int)
- TreeNode get(String)
- ValueNode rawValueNode(RawValue)
- ValueNode pojoNode(Object)
- String asText()

### Class: com.fasterxml.jackson.databind.node.DecimalNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- boolean isBigDecimal()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- boolean canConvertToExactIntegral()
- **static** DecimalNode valueOf(BigDecimal)
- BigDecimal decimalValue()
- float floatValue()
- JsonToken asToken()
- double doubleValue()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- boolean isFloatingPointNumber()
- int hashCode()
- boolean equals(Object)
- short shortValue()
- Number numberValue()
- String asText()

### Class: com.fasterxml.jackson.databind.node.DoubleNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- boolean canConvertToExactIntegral()
- **static** DoubleNode valueOf(double)
- BigDecimal decimalValue()
- float floatValue()
- JsonToken asToken()
- double doubleValue()
- boolean isNaN()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- boolean isFloatingPointNumber()
- int hashCode()
- boolean equals(Object)
- short shortValue()
- Number numberValue()
- String asText()
- boolean isDouble()

### Class: com.fasterxml.jackson.databind.node.FloatNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- boolean canConvertToExactIntegral()
- **static** FloatNode valueOf(float)
- BigDecimal decimalValue()
- float floatValue()
- boolean isFloat()
- JsonToken asToken()
- double doubleValue()
- boolean isNaN()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- boolean isFloatingPointNumber()
- int hashCode()
- boolean equals(Object)
- short shortValue()
- Number numberValue()
- String asText()

### Class: com.fasterxml.jackson.databind.node.IntNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- **static** IntNode valueOf(int)
- BigDecimal decimalValue()
- float floatValue()
- JsonToken asToken()
- double doubleValue()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- int hashCode()
- boolean equals(Object)
- boolean isInt()
- short shortValue()
- Number numberValue()
- String asText()
- boolean asBoolean(boolean)
- boolean isIntegralNumber()

### Class: com.fasterxml.jackson.databind.node.InternalNodeMapper$WrapperForSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.JsonSerializable$Base

Methods:
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException

### Class: com.fasterxml.jackson.databind.node.JsonNodeFactory
Type: Class
Implements: java.io.Serializable, com.fasterxml.jackson.databind.node.JsonNodeCreator

Methods:
- BinaryNode binaryNode(byte[])
- BinaryNode binaryNode(byte[], int, int)
- ValueNode binaryNode(byte[], int, int)
- ValueNode binaryNode(byte[])
- JsonNode missingNode()
- TextNode textNode(String)
- ValueNode textNode(String)
- BooleanNode booleanNode(boolean)
- ValueNode booleanNode(boolean)
- ObjectNode objectNode()
- ArrayNode arrayNode()
- ArrayNode arrayNode(int)
- NullNode nullNode()
- ValueNode nullNode()
- NumericNode numberNode(byte)
- ValueNode numberNode(Byte)
- NumericNode numberNode(short)
- ValueNode numberNode(Short)
- NumericNode numberNode(int)
- ValueNode numberNode(Integer)
- NumericNode numberNode(long)
- ValueNode numberNode(Long)
- ValueNode numberNode(BigInteger)
- NumericNode numberNode(float)
- ValueNode numberNode(Float)
- NumericNode numberNode(double)
- ValueNode numberNode(Double)
- ValueNode numberNode(BigDecimal)
- ValueNode numberNode(double)
- ValueNode numberNode(float)
- ValueNode numberNode(long)
- ValueNode numberNode(int)
- ValueNode numberNode(short)
- ValueNode numberNode(byte)
- ValueNode rawValueNode(RawValue)
- ValueNode pojoNode(Object)
- **static** JsonNodeFactory withExactBigDecimals(boolean)
- int getMaxElementIndexForInsert()

### Class: com.fasterxml.jackson.databind.node.JsonNodeType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JsonNodeType valueOf(String)
- **static** JsonNodeType[] values()

### Class: com.fasterxml.jackson.databind.node.LongNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- boolean isLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- **static** LongNode valueOf(long)
- BigDecimal decimalValue()
- float floatValue()
- JsonToken asToken()
- double doubleValue()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- int hashCode()
- boolean equals(Object)
- short shortValue()
- Number numberValue()
- String asText()
- boolean asBoolean(boolean)
- boolean isIntegralNumber()

### Class: com.fasterxml.jackson.databind.node.MissingNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- JsonNode require()
- JsonToken asToken()
- JsonNode deepCopy()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- boolean isMissingNode()
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- int hashCode()
- boolean equals(Object)
- JsonNode requireNonNull()
- String toPrettyString()
- JsonNodeType getNodeType()
- String toString()
- **static** MissingNode getInstance()
- String asText()
- String asText(String)

### Class: com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor
Type: Class
Extends: com.fasterxml.jackson.databind.node.NodeCursor

Methods:
- NodeCursor startObject()
- JsonStreamContext getParent()
- NodeCursor startArray()
- JsonToken nextToken()
- JsonNode currentNode()

### Class: com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor
Type: Class
Extends: com.fasterxml.jackson.databind.node.NodeCursor

Methods:
- NodeCursor startObject()
- JsonStreamContext getParent()
- NodeCursor startArray()
- JsonToken nextToken()
- JsonNode currentNode()

### Class: com.fasterxml.jackson.databind.node.NodeCursor$RootCursor
Type: Class
Extends: com.fasterxml.jackson.databind.node.NodeCursor

Methods:
- NodeCursor startObject()
- JsonStreamContext getParent()
- NodeCursor startArray()
- JsonToken nextToken()
- JsonNode currentNode()
- void overrideCurrentName(String)

### Class: com.fasterxml.jackson.databind.node.NullNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- int hashCode()
- boolean equals(Object)
- JsonNode requireNonNull()
- JsonNodeType getNodeType()
- JsonToken asToken()
- **static** NullNode getInstance()
- String asText(String)
- String asText()

### Class: com.fasterxml.jackson.databind.node.NumericNode
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- boolean canConvertToLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- BigDecimal decimalValue()
- double doubleValue()
- boolean isNaN()
- long longValue()
- long asLong()
- long asLong(long)
- int asInt()
- int asInt(int)
- BigInteger bigIntegerValue()
- double asDouble()
- double asDouble(double)
- JsonNodeType getNodeType()
- Number numberValue()
- String asText()

### Class: com.fasterxml.jackson.databind.node.ObjectNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ContainerNode
Implements: java.io.Serializable

Methods:
- List findValuesAsText(String, List)
- Iterator fieldNames()
- ObjectNode retain(Collection)
- ObjectNode retain(String[])
- JsonNode replace(String, JsonNode)
- ArrayNode withArray(String)
- JsonNode withArray(String)
- JsonNode remove(String)
- ObjectNode remove(Collection)
- JsonNode put(String, JsonNode)
- ObjectNode put(String, short)
- ObjectNode put(String, Short)
- ObjectNode put(String, int)
- ObjectNode put(String, Integer)
- ObjectNode put(String, long)
- ObjectNode put(String, Long)
- ObjectNode put(String, float)
- ObjectNode put(String, Float)
- ObjectNode put(String, double)
- ObjectNode put(String, Double)
- ObjectNode put(String, BigDecimal)
- ObjectNode put(String, BigInteger)
- ObjectNode put(String, String)
- ObjectNode put(String, boolean)
- ObjectNode put(String, Boolean)
- ObjectNode put(String, byte[])
- JsonNode without(String)
- JsonNode without(Collection)
- JsonNode required(String)
- JsonNode path(int)
- JsonNode path(String)
- TreeNode path(int)
- TreeNode path(String)
- ObjectNode removeAll()
- ContainerNode removeAll()
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- int hashCode()
- JsonNode putAll(Map)
- JsonNode putAll(ObjectNode)
- ObjectNode findParent(String)
- JsonNode findParent(String)
- JsonNode get(int)
- JsonNode get(String)
- TreeNode get(int)
- TreeNode get(String)
- JsonNodeType getNodeType()
- List findParents(String, List)
- JsonNode setAll(Map)
- JsonNode setAll(ObjectNode)
- ObjectNode putNull(String)
- ObjectNode putRawValue(String, RawValue)
- JsonNode set(String, JsonNode)
- JsonNode findValue(String)
- boolean isObject()
- boolean isEmpty(SerializerProvider)
- boolean isEmpty()
- JsonToken asToken()
- ObjectNode deepCopy()
- JsonNode deepCopy()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- ObjectNode with(String)
- JsonNode with(String)
- ArrayNode putArray(String)
- List findValues(String, List)
- int size()
- boolean equals(Comparator, JsonNode)
- boolean equals(Object)
- Iterator elements()
- ObjectNode putPOJO(String, Object)
- ObjectNode putObject(String)
- Iterator fields()
- JsonNode putIfAbsent(String, JsonNode)

### Class: com.fasterxml.jackson.databind.node.POJONode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- long asLong(long)
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- int asInt(int)
- int hashCode()
- boolean equals(Object)
- double asDouble(double)
- Object getPojo()
- JsonNodeType getNodeType()
- JsonToken asToken()
- String asText()
- String asText(String)
- boolean asBoolean(boolean)
- byte[] binaryValue() throws IOException

### Class: com.fasterxml.jackson.databind.node.ShortNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.NumericNode

Methods:
- boolean canConvertToLong()
- JsonParser$NumberType numberType()
- boolean canConvertToInt()
- int intValue()
- **static** ShortNode valueOf(short)
- BigDecimal decimalValue()
- float floatValue()
- JsonToken asToken()
- double doubleValue()
- long longValue()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- BigInteger bigIntegerValue()
- int hashCode()
- boolean equals(Object)
- short shortValue()
- Number numberValue()
- boolean isShort()
- String asText()
- boolean asBoolean(boolean)
- boolean isIntegralNumber()

### Class: com.fasterxml.jackson.databind.node.TextNode
Type: Class
Extends: com.fasterxml.jackson.databind.node.ValueNode

Methods:
- String textValue()
- **static** TextNode valueOf(String)
- JsonToken asToken()
- long asLong(long)
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- int asInt(int)
- int hashCode()
- boolean equals(Object)
- double asDouble(double)
- JsonNodeType getNodeType()
- byte[] getBinaryValue(Base64Variant) throws IOException
- String asText()
- String asText(String)
- boolean asBoolean(boolean)
- byte[] binaryValue() throws IOException

### Class: com.fasterxml.jackson.databind.node.TreeTraversingParser
Type: Class
Extends: com.fasterxml.jackson.core.base.ParserMinimalBase

Methods:
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- int getIntValue() throws IOException
- void setCodec(ObjectCodec)
- String getCurrentName()
- double getDoubleValue() throws IOException
- boolean isNaN()
- BigDecimal getDecimalValue() throws IOException
- char[] getTextCharacters() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset() throws IOException
- long getLongValue() throws IOException
- BigInteger getBigIntegerValue() throws IOException
- JsonLocation getCurrentLocation()
- byte[] getBinaryValue(Base64Variant) throws IOException
- void close() throws IOException
- ObjectCodec getCodec()
- String getText()
- JsonParser skipChildren() throws IOException
- Object getEmbeddedObject()
- Version version()
- boolean hasTextCharacters()
- int getTextLength() throws IOException
- boolean isClosed()
- float getFloatValue() throws IOException
- JsonToken nextToken() throws IOException
- JsonStreamContext getParsingContext()
- JsonParser$NumberType getNumberType() throws IOException
- Number getNumberValue() throws IOException
- void overrideCurrentName(String)
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.databind.node.ValueNode
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.node.BaseJsonNode

Methods:
- List findValuesAsText(String, List)
- JsonNode findValue(String)
- boolean isEmpty()
- JsonToken asToken()
- JsonNode deepCopy()
- JsonNode path(int)
- JsonNode path(String)
- TreeNode path(int)
- TreeNode path(String)
- List findValues(String, List)
- boolean hasNonNull(int)
- boolean hasNonNull(String)
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- ObjectNode findParent(String)
- JsonNode findParent(String)
- JsonNode get(int)
- JsonNode get(String)
- TreeNode get(int)
- TreeNode get(String)
- List findParents(String, List)
- boolean has(int)
- boolean has(String)

## Package: com.fasterxml.jackson.databind.ser

### Class: com.fasterxml.jackson.databind.ser.BeanPropertyFilter
Type: Interface

Methods:
- void depositSchemaProperty(BeanPropertyWriter, ObjectNode, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(BeanPropertyWriter, JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void serializeAsField(Object, JsonGenerator, SerializerProvider, BeanPropertyWriter) throws Exception

### Class: com.fasterxml.jackson.databind.ser.ContextualSerializer
Type: Interface

Methods:
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.PropertyFilter
Type: Interface

Methods:
- void depositSchemaProperty(PropertyWriter, ObjectNode, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(PropertyWriter, JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void serializeAsElement(Object, JsonGenerator, SerializerProvider, PropertyWriter) throws Exception
- void serializeAsField(Object, JsonGenerator, SerializerProvider, PropertyWriter) throws Exception

### Class: com.fasterxml.jackson.databind.ser.ResolvableSerializer
Type: Interface

Methods:
- void resolve(SerializerProvider) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.Serializers
Type: Interface

Methods:
- JsonSerializer findCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)
- JsonSerializer findReferenceSerializer(SerializationConfig, ReferenceType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)
- JsonSerializer findArraySerializer(SerializationConfig, ArrayType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)

### Class: com.fasterxml.jackson.databind.ser.AnyGetterWriter
Type: Class

Methods:
- void getAndFilter(Object, JsonGenerator, SerializerProvider, PropertyFilter) throws Exception
- void fixAccess(SerializationConfig)
- void resolve(SerializerProvider) throws JsonMappingException
- void getAndSerialize(Object, JsonGenerator, SerializerProvider) throws Exception

### Class: com.fasterxml.jackson.databind.ser.BasicSerializerFactory
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.SerializerFactory
Implements: java.io.Serializable

Methods:
- SerializerFactory withSerializerModifier(BeanSerializerModifier)
- JsonSerializer buildEnumSetSerializer(JavaType)
- SerializerFactory withConfig(SerializerFactoryConfig)
- SerializerFactory withAdditionalKeySerializers(Serializers)
- SerializerFactoryConfig getFactoryConfig()
- JsonSerializer findReferenceSerializer(SerializerProvider, ReferenceType, BeanDescription, boolean) throws JsonMappingException
- SerializerFactory withAdditionalSerializers(Serializers)
- JsonSerializer createSerializer(SerializerProvider, JavaType) throws JsonMappingException
- TypeSerializer createTypeSerializer(SerializationConfig, JavaType)
- ContainerSerializer buildIndexedListSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)
- JsonSerializer createKeySerializer(SerializerProvider, JavaType, JsonSerializer) throws JsonMappingException
- JsonSerializer createKeySerializer(SerializationConfig, JavaType, JsonSerializer)
- ContainerSerializer buildCollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)

### Class: com.fasterxml.jackson.databind.ser.BeanPropertyWriter
Type: Class
Extends: com.fasterxml.jackson.databind.ser.PropertyWriter
Implements: java.io.Serializable

Methods:
- void fixAccess(SerializationConfig)
- void assignSerializer(JsonSerializer)
- Type getGenericPropertyType()
- PropertyName getWrapperName()
- String getName()
- TypeSerializer getTypeSerializer()
- AnnotatedMember getMember()
- Class getRawSerializationType()
- Class getPropertyType()
- Object getInternalSetting(Object)
- void assignNullSerializer(JsonSerializer)
- boolean wouldConflictWithName(PropertyName)
- JsonSerializer getSerializer()
- boolean hasNullSerializer()
- Object get(Object) throws Exception
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(ObjectNode, SerializerProvider) throws JsonMappingException
- void serializeAsField(Object, JsonGenerator, SerializerProvider) throws Exception
- PropertyName getFullName()
- boolean isUnwrapping()
- void setNonTrivialBaseType(JavaType)
- boolean willSuppressNulls()
- void assignTypeSerializer(TypeSerializer)
- void serializeAsElement(Object, JsonGenerator, SerializerProvider) throws Exception
- Annotation getContextAnnotation(Class)
- BeanPropertyWriter unwrappingWriter(NameTransformer)
- JavaType getSerializationType()
- Object setInternalSetting(Object, Object)
- void serializeAsOmittedField(Object, JsonGenerator, SerializerProvider) throws Exception
- Class[] getViews()
- Object removeInternalSetting(Object)
- Annotation getAnnotation(Class)
- JavaType getType()
- BeanPropertyWriter rename(NameTransformer)
- void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider) throws Exception
- String toString()
- SerializableString getSerializedName()
- boolean hasSerializer()

### Class: com.fasterxml.jackson.databind.ser.BeanSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- **static** BeanSerializer createDummy(JavaType)
- **static** BeanSerializer createDummy(JavaType, BeanSerializerBuilder)
- BeanSerializerBase withObjectIdWriter(ObjectIdWriter)
- JsonSerializer unwrappingSerializer(NameTransformer)
- String toString()
- BeanSerializerBase withFilterId(Object)
- JsonSerializer withFilterId(Object)

### Class: com.fasterxml.jackson.databind.ser.BeanSerializerBuilder
Type: Class

Methods:
- void setFilteredProperties(BeanPropertyWriter[])
- BeanPropertyWriter[] getFilteredProperties()
- void setFilterId(Object)
- AnnotatedClass getClassInfo()
- void setAnyGetter(AnyGetterWriter)
- List getProperties()
- void setProperties(List)
- void setObjectIdWriter(ObjectIdWriter)
- boolean hasProperties()
- void setTypeId(AnnotatedMember)
- ObjectIdWriter getObjectIdWriter()
- BeanDescription getBeanDescription()
- AnnotatedMember getTypeId()
- BeanSerializer createDummy()
- JsonSerializer build()
- Object getFilterId()
- AnyGetterWriter getAnyGetter()

### Class: com.fasterxml.jackson.databind.ser.BeanSerializerFactory
Type: Class
Extends: com.fasterxml.jackson.databind.ser.BasicSerializerFactory
Implements: java.io.Serializable

Methods:
- SerializerFactory withConfig(SerializerFactoryConfig)
- TypeSerializer findPropertyContentTypeSerializer(JavaType, SerializationConfig, AnnotatedMember) throws JsonMappingException
- JsonSerializer createSerializer(SerializerProvider, JavaType) throws JsonMappingException
- JsonSerializer findBeanOrAddOnSerializer(SerializerProvider, JavaType, BeanDescription, boolean) throws JsonMappingException
- JsonSerializer findBeanSerializer(SerializerProvider, JavaType, BeanDescription) throws JsonMappingException
- TypeSerializer findPropertyTypeSerializer(JavaType, SerializationConfig, AnnotatedMember) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.BeanSerializerModifier
Type: Abstract Class

Methods:
- JsonSerializer modifySerializer(SerializationConfig, BeanDescription, JsonSerializer)
- JsonSerializer modifyMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer)
- List orderProperties(SerializationConfig, BeanDescription, List)
- JsonSerializer modifyMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer)
- JsonSerializer modifyCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, JsonSerializer)
- List changeProperties(SerializationConfig, BeanDescription, List)
- JsonSerializer modifyArraySerializer(SerializationConfig, ArrayType, BeanDescription, JsonSerializer)
- JsonSerializer modifyEnumSerializer(SerializationConfig, JavaType, BeanDescription, JsonSerializer)
- BeanSerializerBuilder updateBuilder(SerializationConfig, BeanDescription, BeanSerializerBuilder)
- JsonSerializer modifyKeySerializer(SerializationConfig, JavaType, BeanDescription, JsonSerializer)
- JsonSerializer modifyCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, JsonSerializer)

### Class: com.fasterxml.jackson.databind.ser.ContainerSerializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- ContainerSerializer withValueTypeSerializer(TypeSerializer)
- JsonSerializer getContentSerializer()
- JavaType getContentType()
- boolean hasSingleElement(Object)

### Class: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.SerializerProvider
Implements: java.io.Serializable

Methods:
- DefaultSerializerProvider createInstance(SerializationConfig, SerializerFactory)
- boolean hasSerializerFor(Class, AtomicReference)
- Object includeFilterInstance(BeanPropertyDefinition, Class)
- JsonSerializer serializerInstance(Annotated, Object) throws JsonMappingException
- boolean includeFilterSuppressNulls(Object) throws JsonMappingException
- WritableObjectId findObjectId(Object, ObjectIdGenerator)
- void flushCachedSerializers()
- void serializeValue(JsonGenerator, Object) throws IOException
- void serializeValue(JsonGenerator, Object, JavaType) throws IOException
- void serializeValue(JsonGenerator, Object, JavaType, JsonSerializer) throws IOException
- JsonGenerator getGenerator()
- int cachedSerializersCount()
- void acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper) throws JsonMappingException
- JsonSchema generateJsonSchema(Class) throws JsonMappingException
- void serializePolymorphic(JsonGenerator, Object, JavaType, JsonSerializer, TypeSerializer) throws IOException
- DefaultSerializerProvider copy()

### Class: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl
Type: Class
Extends: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider

Methods:
- DefaultSerializerProvider$Impl createInstance(SerializationConfig, SerializerFactory)
- DefaultSerializerProvider createInstance(SerializationConfig, SerializerFactory)
- DefaultSerializerProvider copy()

### Class: com.fasterxml.jackson.databind.ser.FilterProvider
Type: Abstract Class

Methods:
- PropertyFilter findPropertyFilter(Object, Object)
- BeanPropertyFilter findFilter(Object)

### Class: com.fasterxml.jackson.databind.ser.PropertyBuilder
Type: Class

Methods:
- Annotations getClassAnnotations()

### Class: com.fasterxml.jackson.databind.ser.PropertyWriter
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
Implements: java.io.Serializable

Methods:
- Annotation findAnnotation(Class)
- void serializeAsOmittedField(Object, JsonGenerator, SerializerProvider) throws Exception
- String getName()
- Annotation getAnnotation(Class)
- void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider) throws Exception
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(ObjectNode, SerializerProvider) throws JsonMappingException
- void serializeAsElement(Object, JsonGenerator, SerializerProvider) throws Exception
- void serializeAsField(Object, JsonGenerator, SerializerProvider) throws Exception
- Annotation getContextAnnotation(Class)
- PropertyName getFullName()

### Class: com.fasterxml.jackson.databind.ser.SerializerCache
Type: Class

Methods:
- void addTypedSerializer(JavaType, JsonSerializer)
- void addTypedSerializer(Class, JsonSerializer)
- void flush()
- JsonSerializer typedValueSerializer(JavaType)
- JsonSerializer typedValueSerializer(Class)
- int size()
- void addAndResolveNonTypedSerializer(Class, JsonSerializer, SerializerProvider) throws JsonMappingException
- void addAndResolveNonTypedSerializer(JavaType, JsonSerializer, SerializerProvider) throws JsonMappingException
- void addAndResolveNonTypedSerializer(Class, JavaType, JsonSerializer, SerializerProvider) throws JsonMappingException
- JsonSerializer untypedValueSerializer(Class)
- JsonSerializer untypedValueSerializer(JavaType)
- ReadOnlyClassToSerializerMap getReadOnlyLookupMap()

### Class: com.fasterxml.jackson.databind.ser.SerializerFactory
Type: Abstract Class

Methods:
- SerializerFactory withSerializerModifier(BeanSerializerModifier)
- SerializerFactory withAdditionalKeySerializers(Serializers)
- SerializerFactory withAdditionalSerializers(Serializers)
- JsonSerializer createSerializer(SerializerProvider, JavaType) throws JsonMappingException
- TypeSerializer createTypeSerializer(SerializationConfig, JavaType) throws JsonMappingException
- JsonSerializer createKeySerializer(SerializerProvider, JavaType, JsonSerializer) throws JsonMappingException
- JsonSerializer createKeySerializer(SerializationConfig, JavaType, JsonSerializer) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.Serializers$Base
Type: Class
Implements: com.fasterxml.jackson.databind.ser.Serializers

Methods:
- JsonSerializer findCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)
- JsonSerializer findReferenceSerializer(SerializationConfig, ReferenceType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)
- JsonSerializer findArraySerializer(SerializationConfig, ArrayType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, TypeSerializer, JsonSerializer)
- JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)

### Class: com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.BeanPropertyWriter
Implements: java.io.Serializable

Methods:
- VirtualBeanPropertyWriter withConfig(MapperConfig, AnnotatedClass, BeanPropertyDefinition, JavaType)
- boolean isVirtual()
- void serializeAsElement(Object, JsonGenerator, SerializerProvider) throws Exception
- void serializeAsField(Object, JsonGenerator, SerializerProvider) throws Exception

## Package: com.fasterxml.jackson.databind.ser.impl

### Class: com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter
Type: Class
Extends: com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter

Methods:
- VirtualBeanPropertyWriter withConfig(MapperConfig, AnnotatedClass, BeanPropertyDefinition, JavaType)
- **static** AttributePropertyWriter construct(String, BeanPropertyDefinition, Annotations, JavaType)

### Class: com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- BeanSerializerBase withObjectIdWriter(ObjectIdWriter)
- JsonSerializer unwrappingSerializer(NameTransformer)
- boolean isUnwrappingSerializer()
- String toString()
- BeanSerializerBase withFilterId(Object)
- JsonSerializer withFilterId(Object)

### Class: com.fasterxml.jackson.databind.ser.impl.FailingSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter
Type: Abstract Class

Methods:
- **static** BeanPropertyWriter constructViewBased(BeanPropertyWriter, Class[])

### Class: com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase

Methods:
- void serialize(List, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeTypedContents(List, JsonGenerator, SerializerProvider) throws IOException
- boolean isEmpty(SerializerProvider, List)
- boolean isEmpty(SerializerProvider, Object)
- IndexedListSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- boolean hasSingleElement(List)
- boolean hasSingleElement(Object)
- void serializeContents(List, JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeContentsUsing(List, JsonGenerator, SerializerProvider, JsonSerializer) throws IOException
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase

Methods:
- void serialize(List, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(List, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Collection, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer _withResolved(BeanProperty, Boolean)

### Class: com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase

Methods:
- void serialize(Iterator, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- boolean isEmpty(SerializerProvider, Iterator)
- boolean isEmpty(SerializerProvider, Object)
- IteratorSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- boolean hasSingleElement(Iterator)
- boolean hasSingleElement(Object)
- void serializeContents(Iterator, JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.ContainerSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Map$Entry, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Map$Entry, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer getContentSerializer()
- boolean isEmpty(SerializerProvider, Map$Entry)
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- MapEntrySerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer, Object, boolean)
- boolean hasSingleElement(Map$Entry)
- boolean hasSingleElement(Object)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- MapEntrySerializer withContentInclusion(Object, boolean)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter
Type: Class

Methods:
- ObjectIdWriter withSerializer(JsonSerializer)
- ObjectIdWriter withAlwaysAsId(boolean)
- **static** ObjectIdWriter construct(JavaType, PropertyName, ObjectIdGenerator, boolean)

### Class: com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator
Type: Class
Extends: com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator

Methods:
- ObjectIdGenerator newForSerialization(Object)
- boolean canUseFor(ObjectIdGenerator)
- Object generateId(Object)
- ObjectIdGenerator$IdKey key(Object)
- ObjectIdGenerator forScope(Class)

### Class: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
Type: Abstract Class

Methods:
- JsonSerializer serializerFor(Class)
- PropertySerializerMap$SerializerAndMapResult findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty) throws JsonMappingException
- PropertySerializerMap$SerializerAndMapResult findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty) throws JsonMappingException
- PropertySerializerMap$SerializerAndMapResult findAndAddKeySerializer(Class, SerializerProvider, BeanProperty) throws JsonMappingException
- **static** PropertySerializerMap emptyForRootValues()
- PropertySerializerMap$SerializerAndMapResult findAndAddRootValueSerializer(Class, SerializerProvider) throws JsonMappingException
- PropertySerializerMap$SerializerAndMapResult findAndAddRootValueSerializer(JavaType, SerializerProvider) throws JsonMappingException
- PropertySerializerMap newWith(Class, JsonSerializer)
- PropertySerializerMap$SerializerAndMapResult findAndAddPrimarySerializer(Class, SerializerProvider, BeanProperty) throws JsonMappingException
- PropertySerializerMap$SerializerAndMapResult findAndAddPrimarySerializer(JavaType, SerializerProvider, BeanProperty) throws JsonMappingException
- **static** PropertySerializerMap emptyForProperties()
- PropertySerializerMap$SerializerAndMapResult addSerializer(Class, JsonSerializer)
- PropertySerializerMap$SerializerAndMapResult addSerializer(JavaType, JsonSerializer)

### Class: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult
Type: Class

No public methods found

### Class: com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap
Type: Class

Methods:
- JsonSerializer typedValueSerializer(JavaType)
- JsonSerializer typedValueSerializer(Class)
- int size()
- JsonSerializer untypedValueSerializer(JavaType)
- JsonSerializer untypedValueSerializer(Class)
- **static** ReadOnlyClassToSerializerMap from(LRUMap)

### Class: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
Type: Class
Implements: com.fasterxml.jackson.databind.ser.BeanPropertyFilter, com.fasterxml.jackson.databind.ser.PropertyFilter

Methods:
- **static** SimpleBeanPropertyFilter serializeAll()
- **static** SimpleBeanPropertyFilter serializeAll(Set)
- **static** SimpleBeanPropertyFilter serializeAllExcept(Set)
- **static** SimpleBeanPropertyFilter serializeAllExcept(String[])
- **static** SimpleBeanPropertyFilter filterOutAllExcept(Set)
- **static** SimpleBeanPropertyFilter filterOutAllExcept(String[])
- **static** PropertyFilter from(BeanPropertyFilter)
- void serializeAsElement(Object, JsonGenerator, SerializerProvider, PropertyWriter) throws Exception
- void depositSchemaProperty(BeanPropertyWriter, ObjectNode, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(BeanPropertyWriter, JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(PropertyWriter, ObjectNode, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(PropertyWriter, JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void serializeAsField(Object, JsonGenerator, SerializerProvider, BeanPropertyWriter) throws Exception
- void serializeAsField(Object, JsonGenerator, SerializerProvider, PropertyWriter) throws Exception

### Class: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter
Type: Class
Extends: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
Implements: java.io.Serializable

No public methods found

### Class: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter
Type: Class
Extends: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
Implements: java.io.Serializable

No public methods found

### Class: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(String[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, String[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(String[])
- boolean hasSingleElement(Object)
- void serializeContents(String[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase

Methods:
- void serialize(Collection, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Collection, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer _withResolved(BeanProperty, Boolean)

### Class: com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.JsonSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- TypeSerializer typeSerializer()
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer valueSerializer()
- Class handledType()
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.impl.UnknownSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException

### Class: com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter
Type: Class
Extends: com.fasterxml.jackson.databind.ser.BeanPropertyWriter
Implements: java.io.Serializable

Methods:
- void assignSerializer(JsonSerializer)
- boolean isUnwrapping()
- UnwrappingBeanPropertyWriter rename(NameTransformer)
- BeanPropertyWriter rename(NameTransformer)
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void serializeAsField(Object, JsonGenerator, SerializerProvider) throws Exception

### Class: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
Implements: java.io.Serializable

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- BeanSerializerBase withObjectIdWriter(ObjectIdWriter)
- JsonSerializer unwrappingSerializer(NameTransformer)
- boolean isUnwrappingSerializer()
- String toString()
- BeanSerializerBase withFilterId(Object)
- JsonSerializer withFilterId(Object)

### Class: com.fasterxml.jackson.databind.ser.impl.WritableObjectId
Type: Class

Methods:
- void writeAsField(JsonGenerator, SerializerProvider, ObjectIdWriter) throws IOException
- Object generateId(Object)
- boolean writeAsId(JsonGenerator, SerializerProvider, ObjectIdWriter) throws IOException

## Package: com.fasterxml.jackson.databind.ser.std

### Class: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.ContainerSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer _withResolved(BeanProperty, Boolean)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.ContainerSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JavaType getContentType()
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer)
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer

Methods:
- ReferenceTypeSerializer withContentInclusion(Object, boolean)

### Class: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer, com.fasterxml.jackson.databind.ser.ResolvableSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, com.fasterxml.jackson.databind.jsonschema.SchemaAware

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void resolve(SerializerProvider) throws JsonMappingException
- boolean usesObjectId()
- BeanSerializerBase withObjectIdWriter(ObjectIdWriter)
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- BeanSerializerBase withFilterId(Object)
- JsonSerializer withFilterId(Object)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- Iterator properties()
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.BooleanSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.ByteArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(byte[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(byte[], JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, byte[])
- boolean isEmpty(SerializerProvider, Object)
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(ByteBuffer, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.CalendarSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase

Methods:
- void serialize(Calendar, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- CalendarSerializer withFormat(Boolean, DateFormat)
- DateTimeSerializerBase withFormat(Boolean, DateFormat)

### Class: com.fasterxml.jackson.databind.ser.std.ClassSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(Class, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.CollectionSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase

Methods:
- void serialize(Collection, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- boolean isEmpty(SerializerProvider, Collection)
- boolean isEmpty(SerializerProvider, Object)
- CollectionSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- boolean hasSingleElement(Collection)
- boolean hasSingleElement(Object)
- void serializeContents(Collection, JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeContentsUsing(Collection, JsonGenerator, SerializerProvider, JsonSerializer) throws IOException
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.DateSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase

Methods:
- void serialize(Date, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- DateSerializer withFormat(Boolean, DateFormat)
- DateTimeSerializerBase withFormat(Boolean, DateFormat)

### Class: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- DateTimeSerializerBase withFormat(Boolean, DateFormat)
- boolean isEmpty(SerializerProvider, Object)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.EnumSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Enum, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- EnumValues getEnumValues()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- **static** EnumSerializer construct(Class, SerializationConfig, BeanDescription, JsonFormat$Value)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase

Methods:
- void serialize(EnumSet, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- boolean isEmpty(SerializerProvider, EnumSet)
- boolean isEmpty(SerializerProvider, Object)
- EnumSetSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- boolean hasSingleElement(EnumSet)
- boolean hasSingleElement(Object)
- void serializeContents(EnumSet, JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- EnumSetSerializer _withValueTypeSerializer(TypeSerializer)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.FileSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(File, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(InetAddress, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(InetAddress, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(InetSocketAddress, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(InetSocketAddress, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.IterableSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase

Methods:
- void serialize(Iterable, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- boolean isEmpty(SerializerProvider, Iterable)
- boolean isEmpty(SerializerProvider, Object)
- IterableSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- boolean hasSingleElement(Iterable)
- boolean hasSingleElement(Object)
- void serializeContents(Iterable, JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, com.fasterxml.jackson.databind.jsonschema.SchemaAware

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, Object)
- String toString()
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.MapProperty
Type: Class
Extends: com.fasterxml.jackson.databind.ser.PropertyWriter

Methods:
- PropertyName getWrapperName()
- String getName()
- AnnotatedMember getMember()
- void serializeAsElement(Object, JsonGenerator, SerializerProvider) throws Exception
- Annotation getContextAnnotation(Class)
- Object getValue()
- void serializeAsOmittedField(Object, JsonGenerator, SerializerProvider) throws Exception
- JavaType getType()
- Annotation getAnnotation(Class)
- void setValue(Object)
- void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider) throws Exception
- void reset(Object, Object, JsonSerializer, JsonSerializer)
- void reset(Object, JsonSerializer, JsonSerializer)
- void depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider) throws JsonMappingException
- void depositSchemaProperty(ObjectNode, SerializerProvider) throws JsonMappingException
- void serializeAsField(Object, JsonGenerator, SerializerProvider) throws IOException
- PropertyName getFullName()

### Class: com.fasterxml.jackson.databind.ser.std.MapSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.ContainerSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- JsonSerializer getKeySerializer()
- void serializeTypedFields(Map, JsonGenerator, SerializerProvider, Object) throws IOException
- void serializeOptionalFields(Map, JsonGenerator, SerializerProvider, Object) throws IOException
- boolean isEmpty(SerializerProvider, Map)
- boolean isEmpty(SerializerProvider, Object)
- MapSerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer, Set, Set, boolean)
- MapSerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer, Set, boolean)
- MapSerializer withFilterId(Object)
- JsonSerializer withFilterId(Object)
- **static** MapSerializer construct(Set, Set, JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)
- **static** MapSerializer construct(Set, JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)
- **static** MapSerializer construct(String[], JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)
- void serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object) throws IOException
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)
- void serializeFieldsUsing(Map, JsonGenerator, SerializerProvider, JsonSerializer) throws IOException
- void serialize(Map, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeFields(Map, JsonGenerator, SerializerProvider) throws IOException
- void serializeFilteredAnyProperties(SerializerProvider, JsonGenerator, Object, Map, PropertyFilter, Object) throws IOException
- void serializeWithType(Map, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JavaType getContentType()
- boolean hasSingleElement(Map)
- boolean hasSingleElement(Object)
- void serializeWithoutTypeInfo(Map, JsonGenerator, SerializerProvider) throws IOException
- MapSerializer withContentInclusion(Object, boolean)
- MapSerializer withContentInclusion(Object)
- MapSerializer _withValueTypeSerializer(TypeSerializer)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.NullSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Number, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- **static** JsonSerializer bigDecimalAsStringSerializer()
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers
Type: Class

Methods:
- **static** void addAll(Map)

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- **static** boolean notFinite(double)

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- boolean isEmpty(SerializerProvider, Object[])
- boolean isEmpty(SerializerProvider, Object)
- ObjectArraySerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)
- JsonSerializer _withResolved(BeanProperty, Boolean)
- void serializeContents(Object[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- void serializeContentsUsing(Object[], JsonGenerator, SerializerProvider, JsonSerializer) throws IOException
- void serialize(Object[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeTypedContents(Object[], JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JavaType getContentType()
- boolean hasSingleElement(Object[])
- boolean hasSingleElement(Object)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.RawSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JsonSerializer unwrappingSerializer(NameTransformer)
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isUnwrappingSerializer()
- boolean isEmpty(SerializerProvider, Object)
- JavaType getReferredType()
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- ReferenceTypeSerializer withContentInclusion(Object, boolean)

### Class: com.fasterxml.jackson.databind.ser.std.SerializableSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(JsonSerializable, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(JsonSerializable, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, JsonSerializable)
- boolean isEmpty(SerializerProvider, Object)

### Class: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serializeWithType(Collection, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, Collection)
- boolean isEmpty(SerializerProvider, Object)
- JsonSerializer _withResolved(BeanProperty, Boolean)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers
Type: Class

Methods:
- **static** JsonSerializer findStandardImpl(Class)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase

Methods:
- void serialize(boolean[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, boolean[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(boolean[])
- boolean hasSingleElement(Object)
- void serializeContents(boolean[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonNode getSchema(SerializerProvider, Type)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(char[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(char[], JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, char[])
- boolean isEmpty(SerializerProvider, Object)
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase

Methods:
- void serialize(double[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, double[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(double[])
- boolean hasSingleElement(Object)
- void serializeContents(double[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonNode getSchema(SerializerProvider, Type)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$TypedPrimitiveArraySerializer

Methods:
- void serialize(float[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, float[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(float[])
- boolean hasSingleElement(Object)
- void serializeContents(float[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase

Methods:
- void serialize(int[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, int[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(int[])
- boolean hasSingleElement(Object)
- void serializeContents(int[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonNode getSchema(SerializerProvider, Type)
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$TypedPrimitiveArraySerializer

Methods:
- void serialize(long[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, long[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(long[])
- boolean hasSingleElement(Object)
- void serializeContents(long[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$TypedPrimitiveArraySerializer

Methods:
- void serialize(short[], JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonSerializer getContentSerializer()
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, short[])
- boolean isEmpty(SerializerProvider, Object)
- JavaType getContentType()
- JsonSerializer _withResolved(BeanProperty, Boolean)
- boolean hasSingleElement(short[])
- boolean hasSingleElement(Object)
- void serializeContents(short[], JsonGenerator, SerializerProvider) throws IOException
- void serializeContents(Object, JsonGenerator, SerializerProvider) throws IOException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$TypedPrimitiveArraySerializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase

Methods:
- ContainerSerializer _withValueTypeSerializer(TypeSerializer)

### Class: com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer, com.fasterxml.jackson.databind.ser.ResolvableSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, com.fasterxml.jackson.databind.jsonschema.SchemaAware

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void resolve(SerializerProvider) throws JsonMappingException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, Object)
- JsonSerializer getDelegatee()
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type, boolean) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.StdJdkSerializers
Type: Class

Methods:
- **static** Collection all()

### Class: com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(AtomicBoolean, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(AtomicInteger, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(AtomicLong, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.StdKeySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers
Type: Abstract Class

Methods:
- **static** JsonSerializer getStdKeySerializer(SerializationConfig, Class, boolean)
- **static** JsonSerializer getDefault()
- **static** JsonSerializer getFallbackKeySerializer(SerializationConfig, Class)

### Class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- **static** StdKeySerializers$EnumKeySerializer construct(Class, EnumValues)

### Class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.StdSerializer
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JsonSerializer
Implements: com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, com.fasterxml.jackson.databind.jsonschema.SchemaAware, java.io.Serializable

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void wrapAndThrow(SerializerProvider, Throwable, Object, String) throws IOException
- void wrapAndThrow(SerializerProvider, Throwable, Object, int) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- Class handledType()
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type, boolean) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.StringSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, Object)
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer

Methods:
- void serialize(TimeZone, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(TimeZone, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException

### Class: com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, Object)
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.ToStringSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase

Methods:
- String valueToString(Object)

### Class: com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, Object)
- String valueToString(Object)
- JsonNode getSchema(SerializerProvider, Type) throws JsonMappingException

### Class: com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdSerializer

Methods:
- void serialize(TokenBuffer, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void serializeWithType(TokenBuffer, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- JsonNode getSchema(SerializerProvider, Type)

### Class: com.fasterxml.jackson.databind.ser.std.UUIDSerializer
Type: Class
Extends: com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
Implements: com.fasterxml.jackson.databind.ser.ContextualSerializer

Methods:
- void serialize(UUID, JsonGenerator, SerializerProvider) throws IOException
- void serialize(Object, JsonGenerator, SerializerProvider) throws IOException
- void acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType) throws JsonMappingException
- boolean isEmpty(SerializerProvider, UUID)
- boolean isEmpty(SerializerProvider, Object)
- JsonSerializer createContextual(SerializerProvider, BeanProperty) throws JsonMappingException

## Package: com.fasterxml.jackson.databind.type

### Class: com.fasterxml.jackson.databind.type.ArrayType
Type: Class
Extends: com.fasterxml.jackson.databind.type.TypeBase

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- ArrayType withStaticTyping()
- JavaType withStaticTyping()
- Object getContentValueHandler()
- ArrayType withValueHandler(Object)
- JavaType withValueHandler(Object)
- ArrayType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- StringBuilder getErasedSignature(StringBuilder)
- boolean isArrayType()
- ArrayType withContentTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- **static** ArrayType construct(JavaType, TypeBindings)
- **static** ArrayType construct(JavaType, TypeBindings, Object, Object)
- Object getContentTypeHandler()
- boolean isContainerType()
- boolean isAbstract()
- boolean hasGenericTypes()
- boolean isConcrete()
- Object[] getEmptyArray()
- JavaType withContentType(JavaType)
- boolean equals(Object)
- boolean hasHandlers()
- JavaType getContentType()
- ResolvedType getContentType()
- String toString()
- ArrayType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.ClassKey
Type: Class
Implements: java.lang.Comparable, java.io.Serializable

Methods:
- int hashCode()
- boolean equals(Object)
- void reset(Class)
- String toString()
- int compareTo(ClassKey)
- int compareTo(Object)

### Class: com.fasterxml.jackson.databind.type.ClassStack
Type: Class

Methods:
- void resolveSelfReferences(JavaType)
- void addSelfReference(ResolvedRecursiveType)
- ClassStack find(Class)
- String toString()
- ClassStack child(Class)

### Class: com.fasterxml.jackson.databind.type.CollectionLikeType
Type: Class
Extends: com.fasterxml.jackson.databind.type.TypeBase

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- **static** CollectionLikeType upgradeFrom(JavaType, JavaType)
- CollectionLikeType withStaticTyping()
- JavaType withStaticTyping()
- Object getContentValueHandler()
- CollectionLikeType withValueHandler(Object)
- JavaType withValueHandler(Object)
- CollectionLikeType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- StringBuilder getErasedSignature(StringBuilder)
- CollectionLikeType withContentTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- boolean isTrueCollectionType()
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- **static** CollectionLikeType construct(Class, TypeBindings, JavaType, JavaType[], JavaType)
- **static** CollectionLikeType construct(Class, JavaType)
- Object getContentTypeHandler()
- boolean isContainerType()
- boolean isCollectionLikeType()
- JavaType withContentType(JavaType)
- boolean equals(Object)
- boolean hasHandlers()
- JavaType withHandlersFrom(JavaType)
- JavaType getContentType()
- ResolvedType getContentType()
- String toString()
- CollectionLikeType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.CollectionType
Type: Class
Extends: com.fasterxml.jackson.databind.type.CollectionLikeType

Methods:
- CollectionType withStaticTyping()
- CollectionLikeType withStaticTyping()
- JavaType withStaticTyping()
- JavaType withContentType(JavaType)
- CollectionType withValueHandler(Object)
- CollectionLikeType withValueHandler(Object)
- JavaType withValueHandler(Object)
- CollectionType withTypeHandler(Object)
- CollectionLikeType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- CollectionType withContentTypeHandler(Object)
- CollectionLikeType withContentTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- String toString()
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- **static** CollectionType construct(Class, TypeBindings, JavaType, JavaType[], JavaType)
- **static** CollectionType construct(Class, JavaType)
- CollectionType withContentValueHandler(Object)
- CollectionLikeType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.LogicalType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LogicalType valueOf(String)
- **static** LogicalType[] values()
- **static** LogicalType fromClass(Class, LogicalType)

### Class: com.fasterxml.jackson.databind.type.MapLikeType
Type: Class
Extends: com.fasterxml.jackson.databind.type.TypeBase

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- boolean isTrueMapType()
- MapLikeType withStaticTyping()
- JavaType withStaticTyping()
- MapLikeType withValueHandler(Object)
- JavaType withValueHandler(Object)
- MapLikeType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- **static** MapLikeType construct(Class, JavaType, JavaType)
- Object getContentTypeHandler()
- boolean isMapLikeType()
- MapLikeType withKeyTypeHandler(Object)
- JavaType withContentType(JavaType)
- boolean hasHandlers()
- JavaType withHandlersFrom(JavaType)
- MapLikeType withKeyType(JavaType)
- MapLikeType withKeyValueHandler(Object)
- MapLikeType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)
- **static** MapLikeType upgradeFrom(JavaType, JavaType, JavaType)
- Object getContentValueHandler()
- StringBuilder getErasedSignature(StringBuilder)
- MapLikeType withContentTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- boolean isContainerType()
- JavaType getKeyType()
- ResolvedType getKeyType()
- boolean equals(Object)
- JavaType getContentType()
- ResolvedType getContentType()
- String toString()

### Class: com.fasterxml.jackson.databind.type.MapType
Type: Class
Extends: com.fasterxml.jackson.databind.type.MapLikeType

Methods:
- MapType withKeyTypeHandler(Object)
- MapLikeType withKeyTypeHandler(Object)
- MapType withStaticTyping()
- MapLikeType withStaticTyping()
- JavaType withStaticTyping()
- JavaType withContentType(JavaType)
- MapType withValueHandler(Object)
- MapLikeType withValueHandler(Object)
- JavaType withValueHandler(Object)
- MapType withTypeHandler(Object)
- MapLikeType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- MapType withContentTypeHandler(Object)
- MapLikeType withContentTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- String toString()
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- MapType withKeyType(JavaType)
- MapLikeType withKeyType(JavaType)
- **static** MapType construct(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType)
- **static** MapType construct(Class, JavaType, JavaType)
- MapType withKeyValueHandler(Object)
- MapLikeType withKeyValueHandler(Object)
- MapType withContentValueHandler(Object)
- MapLikeType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.PlaceholderForType
Type: Class
Extends: com.fasterxml.jackson.databind.type.TypeBase

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- JavaType withStaticTyping()
- JavaType actualType()
- void actualType(JavaType)
- JavaType withContentType(JavaType)
- JavaType withValueHandler(Object)
- JavaType withTypeHandler(Object)
- boolean equals(Object)
- JavaType withContentTypeHandler(Object)
- StringBuilder getErasedSignature(StringBuilder)
- String toString()
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- boolean isContainerType()
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.ReferenceType
Type: Class
Extends: com.fasterxml.jackson.databind.type.SimpleType

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- **static** ReferenceType upgradeFrom(JavaType, JavaType)
- boolean isAnchorType()
- ReferenceType withStaticTyping()
- SimpleType withStaticTyping()
- JavaType withStaticTyping()
- ReferenceType withValueHandler(Object)
- SimpleType withValueHandler(Object)
- JavaType withValueHandler(Object)
- ReferenceType withTypeHandler(Object)
- SimpleType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- StringBuilder getErasedSignature(StringBuilder)
- ReferenceType withContentTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- **static** ReferenceType construct(Class, TypeBindings, JavaType, JavaType[], JavaType)
- **static** ReferenceType construct(Class, JavaType)
- boolean isReferenceType()
- JavaType getAnchorType()
- JavaType withContentType(JavaType)
- boolean equals(Object)
- JavaType getReferencedType()
- ResolvedType getReferencedType()
- JavaType getContentType()
- ResolvedType getContentType()
- String toString()
- boolean hasContentType()
- ReferenceType withContentValueHandler(Object)
- SimpleType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.ResolvedRecursiveType
Type: Class
Extends: com.fasterxml.jackson.databind.type.TypeBase

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- JavaType withStaticTyping()
- JavaType withValueHandler(Object)
- JavaType withTypeHandler(Object)
- JavaType withContentTypeHandler(Object)
- StringBuilder getErasedSignature(StringBuilder)
- TypeBindings getBindings()
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- JavaType getSelfReferencedType()
- boolean isContainerType()
- JavaType withContentType(JavaType)
- void setReference(JavaType)
- boolean equals(Object)
- String toString()
- JavaType getSuperClass()
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.SimpleType
Type: Class
Extends: com.fasterxml.jackson.databind.type.TypeBase

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- SimpleType withStaticTyping()
- JavaType withStaticTyping()
- SimpleType withValueHandler(Object)
- JavaType withValueHandler(Object)
- SimpleType withTypeHandler(Object)
- JavaType withTypeHandler(Object)
- StringBuilder getErasedSignature(StringBuilder)
- JavaType withContentTypeHandler(Object)
- JavaType refine(Class, TypeBindings, JavaType, JavaType[])
- **static** SimpleType construct(Class)
- **static** SimpleType constructUnsafe(Class)
- boolean isContainerType()
- JavaType withContentType(JavaType)
- boolean equals(Object)
- String toString()
- boolean hasContentType()
- SimpleType withContentValueHandler(Object)
- JavaType withContentValueHandler(Object)

### Class: com.fasterxml.jackson.databind.type.TypeBase
Type: Abstract Class
Extends: com.fasterxml.jackson.databind.JavaType
Implements: com.fasterxml.jackson.databind.JsonSerializable

Methods:
- StringBuilder getGenericSignature(StringBuilder)
- JavaType[] findTypeParameters(Class)
- String containedTypeName(int)
- TypeBindings getBindings()
- StringBuilder getErasedSignature(StringBuilder)
- List getInterfaces()
- int containedTypeCount()
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- String toCanonical()
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- JavaType getSuperClass()
- JavaType containedType(int)
- ResolvedType containedType(int)
- JavaType findSuperType(Class)

### Class: com.fasterxml.jackson.databind.type.TypeBindings
Type: Class
Implements: java.io.Serializable

Methods:
- boolean hasUnbound(String)
- Object asKey(Class)
- **static** TypeBindings createIfNeeded(Class, JavaType)
- **static** TypeBindings createIfNeeded(Class, JavaType[])
- String getBoundName(int)
- boolean isEmpty()
- TypeBindings withUnboundVariable(String)
- int size()
- int hashCode()
- boolean equals(Object)
- **static** TypeBindings create(Class, List)
- **static** TypeBindings create(Class, JavaType[])
- **static** TypeBindings create(Class, JavaType)
- **static** TypeBindings create(Class, JavaType, JavaType)
- **static** TypeBindings create(List, List)
- String toString()
- List getTypeParameters()
- JavaType getBoundType(int)
- JavaType findBoundType(String)
- **static** TypeBindings emptyBindings()

### Class: com.fasterxml.jackson.databind.type.TypeFactory
Type: Class
Implements: java.io.Serializable

Methods:
- CollectionLikeType constructRawCollectionLikeType(Class)
- JavaType constructType(Type)
- JavaType constructType(TypeReference)
- JavaType constructType(Type, TypeBindings)
- JavaType constructType(Type, Class)
- JavaType constructType(Type, JavaType)
- JavaType constructFromCanonical(String) throws IllegalArgumentException
- **static** Class rawClass(Type)
- ArrayType constructArrayType(Class)
- ArrayType constructArrayType(JavaType)
- ClassLoader getClassLoader()
- void clearCache()
- JavaType constructSimpleType(Class, JavaType[])
- JavaType constructSimpleType(Class, Class, JavaType[])
- TypeFactory withCache(LRUMap)
- TypeFactory withCache(LookupCache)
- JavaType constructSpecializedType(JavaType, Class) throws IllegalArgumentException
- JavaType constructSpecializedType(JavaType, Class, boolean) throws IllegalArgumentException
- TypeFactory withClassLoader(ClassLoader)
- **static** TypeFactory defaultInstance()
- CollectionLikeType constructCollectionLikeType(Class, Class)
- CollectionLikeType constructCollectionLikeType(Class, JavaType)
- JavaType uncheckedSimpleType(Class)
- JavaType constructParametrizedType(Class, Class, JavaType[])
- JavaType constructParametrizedType(Class, Class, Class[])
- MapType constructRawMapType(Class)
- JavaType constructReferenceType(Class, JavaType)
- JavaType[] findTypeParameters(JavaType, Class)
- JavaType[] findTypeParameters(Class, Class, TypeBindings)
- JavaType[] findTypeParameters(Class, Class)
- TypeFactory withModifier(TypeModifier)
- CollectionType constructCollectionType(Class, Class)
- CollectionType constructCollectionType(Class, JavaType)
- JavaType constructGeneralizedType(JavaType, Class)
- JavaType moreSpecificType(JavaType, JavaType)
- Class findClass(String) throws ClassNotFoundException
- MapType constructMapType(Class, Class, Class)
- MapType constructMapType(Class, JavaType, JavaType)
- JavaType constructParametricType(Class, Class[])
- JavaType constructParametricType(Class, JavaType[])
- JavaType constructParametricType(Class, TypeBindings)
- **static** JavaType unknownType()
- JavaType resolveMemberType(Type, TypeBindings)
- MapLikeType constructMapLikeType(Class, Class, Class)
- MapLikeType constructMapLikeType(Class, JavaType, JavaType)
- MapLikeType constructRawMapLikeType(Class)
- CollectionType constructRawCollectionType(Class)

### Class: com.fasterxml.jackson.databind.type.TypeModifier
Type: Abstract Class

Methods:
- JavaType modifyType(JavaType, Type, TypeBindings, TypeFactory)

### Class: com.fasterxml.jackson.databind.type.TypeParser
Type: Class
Implements: java.io.Serializable

Methods:
- TypeParser withFactory(TypeFactory)
- JavaType parse(String) throws IllegalArgumentException

## Package: com.fasterxml.jackson.databind.util

### Class: com.fasterxml.jackson.databind.util.Annotations
Type: Interface

Methods:
- boolean hasOneOf(Class[])
- int size()
- Annotation get(Class)
- boolean has(Class)

### Class: com.fasterxml.jackson.databind.util.Converter
Type: Interface

Methods:
- JavaType getOutputType(TypeFactory)
- JavaType getInputType(TypeFactory)
- Object convert(Object)

### Class: com.fasterxml.jackson.databind.util.LookupCache
Type: Interface

Methods:
- int size()
- Object get(Object)
- void clear()
- Object putIfAbsent(Object, Object)
- Object put(Object, Object)

### Class: com.fasterxml.jackson.databind.util.Named
Type: Interface

Methods:
- String getName()

### Class: com.fasterxml.jackson.databind.util.AccessPattern
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** AccessPattern valueOf(String)
- **static** AccessPattern[] values()

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders
Type: Class

Methods:
- **static** Object[] insertInListNoDup(Object[], Object)
- **static** HashSet arrayToSet(Object[])
- ArrayBuilders$ByteBuilder getByteBuilder()
- ArrayBuilders$FloatBuilder getFloatBuilder()
- **static** Object getArrayComparator(Object)
- ArrayBuilders$ShortBuilder getShortBuilder()
- ArrayBuilders$DoubleBuilder getDoubleBuilder()
- ArrayBuilders$LongBuilder getLongBuilder()
- ArrayBuilders$IntBuilder getIntBuilder()
- ArrayBuilders$BooleanBuilder getBooleanBuilder()

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- boolean[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- byte[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- double[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- float[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- int[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- long[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder
Type: Class
Extends: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder

Methods:
- short[] _constructArray(int)
- Object _constructArray(int)

### Class: com.fasterxml.jackson.databind.util.ArrayIterator
Type: Class
Implements: java.util.Iterator, java.lang.Iterable

Methods:
- Object next()
- Iterator iterator()
- boolean hasNext()
- void remove()

### Class: com.fasterxml.jackson.databind.util.BeanUtil
Type: Class

Methods:
- **static** String okNameForSetter(AnnotatedMethod, boolean)
- **static** String okNameForGetter(AnnotatedMethod, boolean)
- **static** String checkUnsupportedType(JavaType)
- **static** String stdManglePropertyName(String, int)
- **static** String okNameForMutator(AnnotatedMethod, String, boolean)
- **static** String okNameForRegularGetter(AnnotatedMethod, String, boolean)
- **static** String okNameForIsGetter(AnnotatedMethod, String, boolean)
- **static** boolean isJava8TimeClass(Class)
- **static** boolean isJodaTimeClass(Class)
- **static** Object getDefaultValue(JavaType)

### Class: com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int available()

### Class: com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream
Type: Class
Extends: java.io.OutputStream

Methods:
- void write(int) throws IOException
- void write(byte[], int, int) throws IOException

### Class: com.fasterxml.jackson.databind.util.ClassUtil
Type: Class

Methods:
- **static** Iterator emptyIterator()
- **static** Object defaultValue(Class)
- **static** String getTypeDescription(JavaType)
- **static** boolean hasEnclosingMethod(Class)
- **static** Object throwAsMappingException(DeserializationContext, IOException) throws JsonMappingException
- **static** Annotation[] findClassAnnotations(Class)
- **static** Class classOf(Object)
- **static** Throwable throwIfError(Throwable)
- **static** Field[] getDeclaredFields(Class)
- **static** boolean isCollectionMapOrArray(Class)
- **static** Method[] getClassMethods(Class)
- **static** Class wrapperType(Class)
- **static** Class getOuterClass(Class)
- **static** List findRawSuperTypes(Class, Class, boolean)
- **static** Object createInstance(Class, boolean) throws IllegalArgumentException
- **static** Throwable throwRootCauseIfIOE(Throwable) throws IOException
- **static** boolean hasClass(Object, Class)
- **static** boolean isJDKClass(Class)
- **static** Throwable throwIfIOE(Throwable) throws IOException
- **static** boolean isConcrete(Class)
- **static** boolean isConcrete(Member)
- **static** Throwable throwIfRTE(Throwable)
- **static** List findSuperClasses(Class, Class, boolean)
- **static** String canBeABeanType(Class)
- **static** String name(String)
- **static** String name(PropertyName)
- **static** String getPackageName(Class)
- **static** String nonNullString(String)
- **static** List findSuperTypes(JavaType, Class, boolean)
- **static** List findSuperTypes(Class, Class)
- **static** List findSuperTypes(Class, Class, List)
- **static** Class rawClass(JavaType)
- **static** String classNameOf(Object)
- **static** Type[] getGenericInterfaces(Class)
- **static** boolean isJacksonStdImpl(Object)
- **static** boolean isJacksonStdImpl(Class)
- **static** void checkAndFixAccess(Member)
- **static** void checkAndFixAccess(Member, boolean)
- **static** boolean hasGetterSignature(Method)
- **static** boolean isRecordType(Class)
- **static** void closeOnFailAndThrowAsIOE(JsonGenerator, Exception) throws IOException
- **static** void closeOnFailAndThrowAsIOE(JsonGenerator, Closeable, Exception) throws IOException
- **static** Constructor findConstructor(Class, boolean) throws IllegalArgumentException
- **static** Class getDeclaringClass(Class)
- **static** Method[] getDeclaredMethods(Class)
- **static** boolean isNonStaticInnerClass(Class)
- **static** ClassUtil$Ctor[] getConstructors(Class)
- **static** Throwable getRootCause(Throwable)
- **static** String isLocalType(Class, boolean)
- **static** Class primitiveType(Class)
- **static** String apostrophed(String)
- **static** String exceptionMessage(Throwable)
- **static** boolean isProxyType(Class)
- **static** String backticked(String)
- **static** void unwrapAndThrowAsIAE(Throwable)
- **static** void unwrapAndThrowAsIAE(Throwable, String)
- **static** void verifyMustOverride(Class, Object, String)
- **static** boolean isBogusClass(Class)
- **static** boolean isEnumType(Class)
- **static** String quotedOr(Object, String)
- **static** boolean isObjectOrPrimitive(Class)
- **static** Enum findFirstAnnotatedEnumValue(Class, Class)
- **static** Class findEnumType(EnumSet)
- **static** Class findEnumType(EnumMap)
- **static** Class findEnumType(Enum)
- **static** Class findEnumType(Class)
- **static** String getClassDescription(Object)
- **static** String nullOrToString(Object)
- **static** Class getEnclosingClass(Class)
- **static** Type getGenericSuperclass(Class)
- **static** String nameOf(Class)
- **static** String nameOf(Named)
- **static** void throwAsIAE(Throwable)
- **static** void throwAsIAE(Throwable, String)
- **static** Object nonNull(Object, Object)

### Class: com.fasterxml.jackson.databind.util.ClassUtil$Ctor
Type: Class

Methods:
- Class getDeclaringClass()
- Annotation[][] getParameterAnnotations()
- Constructor getConstructor()
- Annotation[] getDeclaredAnnotations()
- int getParamCount()

### Class: com.fasterxml.jackson.databind.util.CompactStringObjectMap
Type: Class
Implements: java.io.Serializable

Methods:
- Object findCaseInsensitive(String)
- List keys()
- Object find(String)
- **static** CompactStringObjectMap construct(Map)

### Class: com.fasterxml.jackson.databind.util.Converter$None
Type: Abstract Class
Implements: com.fasterxml.jackson.databind.util.Converter

No public methods found

### Class: com.fasterxml.jackson.databind.util.EnumResolver
Type: Class
Implements: java.io.Serializable

Methods:
- int lastValidIndex()
- Enum findEnum(String)
- **static** EnumResolver constructUnsafeUsingMethod(Class, AnnotatedMember, AnnotationIntrospector)
- **static** EnumResolver constructUnsafeUsingToString(Class, AnnotationIntrospector)
- Enum getEnum(int)
- Class getEnumClass()
- **static** EnumResolver constructUnsafe(Class, AnnotationIntrospector)
- Enum[] getRawEnums()
- boolean isFromIntValue()
- Enum getDefaultValue()
- CompactStringObjectMap constructLookup()
- **static** EnumResolver constructFor(DeserializationConfig, Class)
- **static** EnumResolver constructFor(Class, AnnotationIntrospector)
- **static** EnumResolver constructUsingMethod(DeserializationConfig, Class, AnnotatedMember)
- **static** EnumResolver constructUsingMethod(Class, AnnotatedMember, AnnotationIntrospector)
- Collection getEnumIds()
- List getEnums()
- **static** EnumResolver constructUsingToString(DeserializationConfig, Class)
- **static** EnumResolver constructUsingToString(Class, AnnotationIntrospector)
- **static** EnumResolver constructUsingToString(Class)

### Class: com.fasterxml.jackson.databind.util.EnumValues
Type: Class
Implements: java.io.Serializable

Methods:
- SerializableString serializedValueFor(Enum)
- List enums()
- EnumMap internalMap()
- **static** EnumValues constructFromName(MapperConfig, Class)
- Collection values()
- Class getEnumClass()
- **static** EnumValues construct(SerializationConfig, Class)
- **static** EnumValues construct(MapperConfig, Class, List)
- **static** EnumValues construct(Class, SerializableString[])
- **static** EnumValues constructFromToString(MapperConfig, Class)

### Class: com.fasterxml.jackson.databind.util.IgnorePropertiesUtil
Type: Class

Methods:
- **static** IgnorePropertiesUtil$Checker buildCheckerIfNeeded(Set, Set)
- **static** boolean shouldIgnore(Object, Collection, Collection)
- **static** Set combineNamesToInclude(Set, Set)

### Class: com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker
Type: Class
Implements: java.io.Serializable

Methods:
- boolean shouldIgnore(Object)
- **static** IgnorePropertiesUtil$Checker construct(Set, Set)

### Class: com.fasterxml.jackson.databind.util.LRUMap
Type: Class
Implements: com.fasterxml.jackson.databind.util.LookupCache, java.io.Serializable

Methods:
- int size()
- void contents(BiConsumer)
- Object get(Object)
- void clear()
- Object putIfAbsent(Object, Object)
- Object put(Object, Object)

### Class: com.fasterxml.jackson.databind.util.LinkedNode
Type: Class

Methods:
- LinkedNode next()
- **static** boolean contains(LinkedNode, Object)
- void linkNext(LinkedNode)
- Object value()

### Class: com.fasterxml.jackson.databind.util.NameTransformer
Type: Abstract Class

Methods:
- String transform(String)
- **static** NameTransformer chainedTransformer(NameTransformer, NameTransformer)
- **static** NameTransformer simpleTransformer(String, String)
- String reverse(String)

### Class: com.fasterxml.jackson.databind.util.NameTransformer$Chained
Type: Class
Extends: com.fasterxml.jackson.databind.util.NameTransformer
Implements: java.io.Serializable

Methods:
- String transform(String)
- String toString()
- String reverse(String)

### Class: com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer
Type: Class
Extends: com.fasterxml.jackson.databind.util.NameTransformer
Implements: java.io.Serializable

Methods:
- String transform(String)
- String reverse(String)

### Class: com.fasterxml.jackson.databind.util.NativeImageUtil
Type: Class

Methods:
- **static** boolean needsReflectionConfiguration(Class)
- **static** boolean isUnsupportedFeatureError(Throwable)

### Class: com.fasterxml.jackson.databind.util.ObjectBuffer
Type: Class

Methods:
- Object[] resetAndStart()
- Object[] resetAndStart(Object[], int)
- int initialCapacity()
- Object[] completeAndClearBuffer(Object[], int)
- Object[] completeAndClearBuffer(Object[], int, Class)
- void completeAndClearBuffer(Object[], int, List)
- int bufferedSize()
- Object[] appendCompletedChunk(Object[])

### Class: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
Type: Abstract Class

Methods:
- Object resetAndStart()
- Object completeAndClearBuffer(Object, int)
- int bufferedSize()
- Object appendCompletedChunk(Object, int)

### Class: com.fasterxml.jackson.databind.util.RawValue
Type: Class
Implements: com.fasterxml.jackson.databind.JsonSerializable

Methods:
- void serialize(JsonGenerator, SerializerProvider) throws IOException
- void serialize(JsonGenerator) throws IOException
- void serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer) throws IOException
- Object rawValue()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.fasterxml.jackson.databind.util.RootNameLookup
Type: Class
Implements: java.io.Serializable

Methods:
- PropertyName findRootName(JavaType, MapperConfig)
- PropertyName findRootName(Class, MapperConfig)

### Class: com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition
Type: Class
Extends: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition

Methods:
- Class getRawPrimaryType()
- PropertyName getWrapperName()
- boolean hasName(PropertyName)
- String getName()
- JavaType getPrimaryType()
- AnnotatedMember getPrimaryMember()
- boolean isExplicitlyIncluded()
- boolean hasSetter()
- **static** SimpleBeanPropertyDefinition construct(MapperConfig, AnnotatedMember)
- **static** SimpleBeanPropertyDefinition construct(MapperConfig, AnnotatedMember, PropertyName)
- **static** SimpleBeanPropertyDefinition construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, JsonInclude$Include)
- **static** SimpleBeanPropertyDefinition construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, JsonInclude$Value)
- BeanPropertyDefinition withInclusion(JsonInclude$Value)
- Iterator getConstructorParameters()
- BeanPropertyDefinition withName(PropertyName)
- boolean isExplicitlyNamed()
- PropertyName getFullName()
- AnnotatedParameter getConstructorParameter()
- AnnotatedMethod getGetter()
- PropertyMetadata getMetadata()
- JsonInclude$Value findInclusion()
- AnnotatedField getField()
- BeanPropertyDefinition withMetadata(PropertyMetadata)
- boolean hasConstructorParameter()
- AnnotatedMethod getSetter()
- String getInternalName()
- BeanPropertyDefinition withSimpleName(String)
- boolean hasGetter()
- boolean hasField()

### Class: com.fasterxml.jackson.databind.util.StdDateFormat
Type: Class
Extends: java.text.DateFormat

Methods:
- boolean isColonIncludedInTimeZone()
- StdDateFormat withLocale(Locale)
- String toPattern()
- TimeZone getTimeZone()
- boolean isLenient()
- StdDateFormat withColonInTimeZone(boolean)
- StringBuffer format(Date, StringBuffer, FieldPosition)
- Date parse(String) throws ParseException
- Date parse(String, ParsePosition)
- StdDateFormat withLenient(Boolean)
- void setLenient(boolean)
- **static** TimeZone getDefaultTimeZone()
- **static** DateFormat getISO8601Format(TimeZone, Locale)
- int hashCode()
- boolean equals(Object)
- void setTimeZone(TimeZone)
- StdDateFormat clone()
- Object clone()
- String toString()
- **static** DateFormat getRFC1123Format(TimeZone, Locale)
- StdDateFormat withTimeZone(TimeZone)

### Class: com.fasterxml.jackson.databind.util.TokenBuffer
Type: Class
Extends: com.fasterxml.jackson.core.JsonGenerator

Methods:
- JsonGenerator setFeatureMask(int)
- TokenBuffer overrideParentContext(JsonStreamContext)
- boolean canWriteObjectId()
- JsonGenerator setCodec(ObjectCodec)
- JacksonFeatureSet getWriteCapabilities()
- void writeTypeId(Object)
- boolean canWriteTypeId()
- int getFeatureMask()
- JsonGenerator enable(JsonGenerator$Feature)
- void writeUTF8String(byte[], int, int) throws IOException
- void writeEndArray() throws IOException
- **static** TokenBuffer asCopyOfValue(JsonParser) throws IOException
- JsonParser asParserOnFirstToken() throws IOException
- ObjectCodec getCodec()
- void writeObject(Object) throws IOException
- void writeStartObject() throws IOException
- void writeStartObject(Object) throws IOException
- void writeStartObject(Object, int) throws IOException
- void writeEndObject() throws IOException
- void writeNull() throws IOException
- JsonGenerator overrideStdFeatures(int, int)
- Version version()
- void writeTree(TreeNode) throws IOException
- void serialize(JsonGenerator) throws IOException
- boolean isEnabled(JsonGenerator$Feature)
- void writeNumber(short) throws IOException
- void writeNumber(int) throws IOException
- void writeNumber(long) throws IOException
- void writeNumber(double) throws IOException
- void writeNumber(float) throws IOException
- void writeNumber(BigDecimal) throws IOException
- void writeNumber(BigInteger) throws IOException
- void writeNumber(String) throws IOException
- void writeRaw(String) throws IOException
- void writeRaw(String, int, int) throws IOException
- void writeRaw(SerializableString) throws IOException
- void writeRaw(char[], int, int) throws IOException
- void writeRaw(char) throws IOException
- void writeBoolean(boolean) throws IOException
- JsonParser asParser()
- JsonParser asParser(ObjectCodec)
- JsonParser asParser(JsonParser)
- void writeRawUTF8String(byte[], int, int) throws IOException
- void writeRawValue(String) throws IOException
- void writeRawValue(String, int, int) throws IOException
- void writeRawValue(char[], int, int) throws IOException
- void writeFieldName(String) throws IOException
- void writeFieldName(SerializableString) throws IOException
- void writeStartArray() throws IOException
- void writeStartArray(Object) throws IOException
- void writeStartArray(Object, int) throws IOException
- TokenBuffer forceUseOfBigDecimal(boolean)
- void writeEmbeddedObject(Object) throws IOException
- void writeBinary(Base64Variant, byte[], int, int) throws IOException
- int writeBinary(Base64Variant, InputStream, int)
- JsonGenerator useDefaultPrettyPrinter()
- void flush() throws IOException
- void copyCurrentStructure(JsonParser) throws IOException
- JsonWriteContext getOutputContext()
- JsonStreamContext getOutputContext()
- void copyCurrentEvent(JsonParser) throws IOException
- void close() throws IOException
- TokenBuffer deserialize(JsonParser, DeserializationContext) throws IOException
- JsonToken firstToken()
- boolean isEmpty()
- void writeObjectId(Object)
- boolean isClosed()
- JsonGenerator disable(JsonGenerator$Feature)
- String toString()
- boolean canWriteBinaryNatively()
- void writeString(String) throws IOException
- void writeString(char[], int, int) throws IOException
- void writeString(SerializableString) throws IOException
- TokenBuffer append(TokenBuffer) throws IOException

### Class: com.fasterxml.jackson.databind.util.TokenBuffer$Parser
Type: Class
Extends: com.fasterxml.jackson.core.base.ParserMinimalBase

Methods:
- boolean canReadObjectId()
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- String nextFieldName() throws IOException
- int getIntValue() throws IOException
- void setCodec(ObjectCodec)
- String getCurrentName()
- double getDoubleValue() throws IOException
- boolean isNaN()
- Object getTypeId()
- BigDecimal getDecimalValue() throws IOException
- Object getObjectId()
- char[] getTextCharacters()
- JsonToken peekNextToken() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset()
- void setLocation(JsonLocation)
- long getLongValue() throws IOException
- BigInteger getBigIntegerValue() throws IOException
- JsonLocation getCurrentLocation()
- byte[] getBinaryValue(Base64Variant) throws IOException
- void close() throws IOException
- boolean canReadTypeId()
- ObjectCodec getCodec()
- String getText()
- Object getEmbeddedObject()
- Version version()
- boolean hasTextCharacters()
- int getTextLength()
- boolean isClosed()
- float getFloatValue() throws IOException
- JsonToken nextToken() throws IOException
- String currentName()
- JsonStreamContext getParsingContext()
- JsonParser$NumberType getNumberType() throws IOException
- Number getNumberValue() throws IOException
- void overrideCurrentName(String)
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.databind.util.TokenBuffer$Segment
Type: Class

Methods:
- TokenBuffer$Segment next()
- int rawType(int)
- Object get(int)
- boolean hasIds()
- JsonToken type(int)
- TokenBuffer$Segment append(int, JsonToken)
- TokenBuffer$Segment append(int, JsonToken, Object, Object)
- TokenBuffer$Segment append(int, JsonToken, Object)
- TokenBuffer$Segment append(int, JsonToken, Object, Object, Object)

### Class: com.fasterxml.jackson.databind.util.TokenBufferReadContext
Type: Class
Extends: com.fasterxml.jackson.core.JsonStreamContext

Methods:
- JsonStreamContext getParent()
- boolean hasCurrentName()
- **static** TokenBufferReadContext createRootContext(JsonStreamContext)
- Object getCurrentValue()
- String getCurrentName()
- TokenBufferReadContext createChildArrayContext()
- TokenBufferReadContext createChildObjectContext()
- void updateForValue()
- void setCurrentValue(Object)
- void setCurrentName(String) throws JsonProcessingException
- TokenBufferReadContext parentOrCopy()

### Class: com.fasterxml.jackson.databind.util.TypeKey
Type: Class

Methods:
- void resetTyped(Class)
- void resetTyped(JavaType)
- Class getRawType()
- boolean isTyped()
- **static** int untypedHash(Class)
- **static** int untypedHash(JavaType)
- JavaType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- void resetUntyped(Class)
- void resetUntyped(JavaType)
- **static** int typedHash(Class)
- **static** int typedHash(JavaType)

### Class: com.fasterxml.jackson.databind.util.ViewMatcher
Type: Class
Implements: java.io.Serializable

Methods:
- boolean isVisibleForView(Class)
- **static** ViewMatcher construct(Class[])

## Package: com.fasterxml.jackson.databind.util.internal

### Class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap
Type: Class
Extends: java.util.AbstractMap
Implements: java.util.concurrent.ConcurrentMap, java.io.Serializable

Methods:
- Set descendingKeySet()
- Object getQuietly(Object)
- Map ascendingMapWithLimit(int)
- Set entrySet()
- Map descendingMap()
- boolean containsKey(Object)
- Map descendingMapWithLimit(int)
- Collection values()
- Set ascendingKeySet()
- Object replace(Object, Object)
- boolean replace(Object, Object, Object)
- void clear()
- boolean isEmpty()
- Map ascendingMap()
- Object remove(Object)
- boolean remove(Object, Object)
- Object put(Object, Object)
- boolean containsValue(Object)
- long capacity()
- Set descendingKeySetWithLimit(int)
- int size()
- Object get(Object)
- void setCapacity(long)
- Set keySet()
- Object putIfAbsent(Object, Object)
- long weightedSize()
- Set ascendingKeySetWithLimit(int)

### Class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$Builder
Type: Class

Methods:
- PrivateMaxEntriesMap$Builder concurrencyLevel(int)
- PrivateMaxEntriesMap build()
- PrivateMaxEntriesMap$Builder listener(EvictionListener)
- PrivateMaxEntriesMap$Builder initialCapacity(int)
- PrivateMaxEntriesMap$Builder maximumCapacity(long)

## Package: com.fasterxml.jackson.dataformat.yaml

### Class: com.fasterxml.jackson.dataformat.yaml.JacksonYAMLParseException
Type: Class
Extends: com.fasterxml.jackson.core.JsonParseException

No public methods found

### Class: com.fasterxml.jackson.dataformat.yaml.PackageVersion
Type: Class
Implements: com.fasterxml.jackson.core.Versioned

Methods:
- Version version()

### Class: com.fasterxml.jackson.dataformat.yaml.UTF8Reader
Type: Class
Extends: java.io.Reader

Methods:
- int read() throws IOException
- int read(char[]) throws IOException
- int read(char[], int, int) throws IOException
- void close() throws IOException
- void freeBuffers()

### Class: com.fasterxml.jackson.dataformat.yaml.UTF8Writer
Type: Class
Extends: java.io.Writer

Methods:
- void flush() throws IOException
- void write(char[]) throws IOException
- void write(char[], int, int) throws IOException
- void write(int) throws IOException
- void write(String) throws IOException
- void write(String, int, int) throws IOException
- void close() throws IOException
- Writer append(char) throws IOException
- Appendable append(char) throws IOException

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLFactory
Type: Class
Extends: com.fasterxml.jackson.core.JsonFactory

Methods:
- int getFormatParserFeatures()
- YAMLFactoryBuilder rebuild()
- TSFBuilder rebuild()
- int getFormatGeneratorFeatures()
- MatchStrength hasFormat(InputAccessor) throws IOException
- boolean canUseCharArrays()
- YAMLFactory configure(YAMLParser$Feature, boolean)
- YAMLFactory configure(YAMLGenerator$Feature, boolean)
- Class getFormatReadFeatureType()
- Version version()
- YAMLGenerator createGenerator(OutputStream, JsonEncoding) throws IOException
- YAMLGenerator createGenerator(OutputStream) throws IOException
- YAMLGenerator createGenerator(Writer) throws IOException
- JsonGenerator createGenerator(File, JsonEncoding) throws IOException
- JsonGenerator createGenerator(Writer) throws IOException
- JsonGenerator createGenerator(OutputStream) throws IOException
- JsonGenerator createGenerator(OutputStream, JsonEncoding) throws IOException
- String getFormatName()
- Class getFormatWriteFeatureType()
- YAMLFactory disable(YAMLParser$Feature)
- YAMLFactory disable(YAMLGenerator$Feature)
- YAMLFactory enable(YAMLParser$Feature)
- YAMLFactory enable(YAMLGenerator$Feature)
- boolean isEnabled(YAMLParser$Feature)
- boolean isEnabled(YAMLGenerator$Feature)
- **static** YAMLFactoryBuilder builder()
- YAMLParser createParser(String) throws IOException
- YAMLParser createParser(File) throws IOException
- YAMLParser createParser(URL) throws IOException
- YAMLParser createParser(InputStream) throws IOException
- YAMLParser createParser(Reader) throws IOException
- YAMLParser createParser(char[]) throws IOException
- YAMLParser createParser(char[], int, int) throws IOException
- YAMLParser createParser(byte[]) throws IOException
- YAMLParser createParser(byte[], int, int) throws IOException
- JsonParser createParser(char[], int, int) throws IOException
- JsonParser createParser(char[]) throws IOException
- JsonParser createParser(String) throws IOException, JsonParseException
- JsonParser createParser(byte[], int, int) throws IOException, JsonParseException
- JsonParser createParser(byte[]) throws IOException, JsonParseException
- JsonParser createParser(Reader) throws IOException, JsonParseException
- JsonParser createParser(InputStream) throws IOException, JsonParseException
- JsonParser createParser(URL) throws IOException, JsonParseException
- JsonParser createParser(File) throws IOException, JsonParseException
- YAMLFactory copy()
- JsonFactory copy()

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLFactoryBuilder
Type: Class
Extends: com.fasterxml.jackson.core.TSFBuilder

Methods:
- YAMLFactoryBuilder stringQuotingChecker(StringQuotingChecker)
- StringQuotingChecker stringQuotingChecker()
- YAMLFactoryBuilder loaderOptions(LoaderOptions)
- LoaderOptions loaderOptions()
- int formatGeneratorFeaturesMask()
- YAMLFactory build()
- JsonFactory build()
- YAMLFactoryBuilder disable(YAMLGenerator$Feature)
- YAMLFactoryBuilder disable(YAMLGenerator$Feature, YAMLGenerator$Feature[])
- YAMLFactoryBuilder enable(YAMLGenerator$Feature)
- YAMLFactoryBuilder enable(YAMLGenerator$Feature, YAMLGenerator$Feature[])
- YAMLFactoryBuilder dumperOptions(DumperOptions)
- DumperOptions dumperOptions()
- YAMLFactoryBuilder yamlVersionToWrite(DumperOptions$Version)
- DumperOptions$Version yamlVersionToWrite()
- YAMLFactoryBuilder configure(YAMLGenerator$Feature, boolean)

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLGenerator
Type: Class
Extends: com.fasterxml.jackson.core.base.GeneratorBase

Methods:
- boolean canWriteObjectId()
- void writeRawUTF8String(byte[], int, int) throws IOException
- void writeRawValue(String) throws IOException
- void writeRawValue(String, int, int) throws IOException
- void writeRawValue(char[], int, int) throws IOException
- void writeFieldName(String) throws IOException
- void writeFieldName(SerializableString) throws IOException
- void writeStartArray() throws IOException
- void writeBinary(Base64Variant, byte[], int, int) throws IOException
- YAMLGenerator setPrettyPrinter(PrettyPrinter)
- JsonGenerator setPrettyPrinter(PrettyPrinter)
- void writeFieldId(long) throws IOException
- JacksonFeatureSet getWriteCapabilities()
- int getOutputBuffered()
- YAMLGenerator useDefaultPrettyPrinter()
- JsonGenerator useDefaultPrettyPrinter()
- void writeTypeId(Object) throws IOException
- boolean canWriteTypeId()
- void flush() throws IOException
- int getFormatFeatures()
- YAMLGenerator enable(YAMLGenerator$Feature)
- void writeUTF8String(byte[], int, int) throws IOException
- boolean canWriteFormattedNumbers()
- void writeEndArray() throws IOException
- void close() throws IOException
- void writeObjectRef(Object) throws IOException
- void writeStartObject() throws IOException
- void writeEndObject() throws IOException
- YAMLGenerator configure(YAMLGenerator$Feature, boolean)
- void writeNull() throws IOException
- Version version()
- void writeObjectId(Object) throws IOException
- JsonGenerator overrideFormatFeatures(int, int)
- YAMLGenerator disable(YAMLGenerator$Feature)
- boolean isEnabled(YAMLGenerator$Feature)
- void writeNumber(int) throws IOException
- void writeNumber(long) throws IOException
- void writeNumber(BigInteger) throws IOException
- void writeNumber(double) throws IOException
- void writeNumber(float) throws IOException
- void writeNumber(BigDecimal) throws IOException
- void writeNumber(String) throws IOException, JsonGenerationException, UnsupportedOperationException
- void writeRaw(String) throws IOException
- void writeRaw(String, int, int) throws IOException
- void writeRaw(char[], int, int) throws IOException
- void writeRaw(char) throws IOException
- boolean canUseSchema(FormatSchema)
- void writeString(String) throws IOException, JsonGenerationException
- void writeString(char[], int, int) throws IOException
- void writeString(SerializableString) throws IOException
- void writeBoolean(boolean) throws IOException
- Object getOutputTarget()

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLGenerator$Feature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.FormatFeature

Methods:
- int getMask()
- **static** YAMLGenerator$Feature valueOf(String)
- **static** YAMLGenerator$Feature[] values()
- boolean enabledByDefault()
- **static** int collectDefaults()
- boolean enabledIn(int)

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLMapper
Type: Class
Extends: com.fasterxml.jackson.databind.ObjectMapper

Methods:
- YAMLMapper disable(YAMLGenerator$Feature)
- YAMLMapper disable(YAMLParser$Feature)
- YAMLMapper enable(YAMLGenerator$Feature)
- YAMLMapper enable(YAMLParser$Feature)
- **static** YAMLMapper$Builder builder()
- **static** YAMLMapper$Builder builder(YAMLFactory)
- YAMLMapper configure(YAMLGenerator$Feature, boolean)
- YAMLMapper configure(YAMLParser$Feature, boolean)
- YAMLMapper copy()
- ObjectMapper copy()
- YAMLFactory getFactory()
- JsonFactory getFactory()

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLMapper$Builder
Type: Class
Extends: com.fasterxml.jackson.databind.cfg.MapperBuilder

Methods:
- YAMLMapper$Builder disable(YAMLParser$Feature[])
- YAMLMapper$Builder disable(YAMLGenerator$Feature[])
- YAMLMapper$Builder enable(YAMLParser$Feature[])
- YAMLMapper$Builder enable(YAMLGenerator$Feature[])
- YAMLMapper$Builder configure(YAMLParser$Feature, boolean)
- YAMLMapper$Builder configure(YAMLGenerator$Feature, boolean)

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLParser
Type: Class
Extends: com.fasterxml.jackson.core.base.ParserBase

Methods:
- boolean canReadObjectId()
- int readBinaryValue(Base64Variant, OutputStream) throws IOException
- void setCodec(ObjectCodec)
- String getCurrentName() throws IOException
- String getTypeId() throws IOException
- Object getTypeId() throws IOException
- String getObjectId() throws IOException
- Object getObjectId() throws IOException
- char[] getTextCharacters() throws IOException
- JacksonFeatureSet getReadCapabilities()
- int getTextOffset() throws IOException
- int getFormatFeatures()
- JsonParser enable(YAMLParser$Feature)
- JsonLocation getCurrentLocation()
- String getCurrentAnchor()
- boolean canReadTypeId()
- boolean isCurrentAlias()
- ObjectCodec getCodec()
- String getText() throws IOException
- int getText(Writer) throws IOException
- boolean requiresCustomCodec()
- Object getEmbeddedObject() throws IOException
- JsonParser configure(YAMLParser$Feature, boolean)
- Version version()
- boolean hasTextCharacters()
- JsonParser overrideFormatFeatures(int, int)
- int getTextLength() throws IOException
- JsonToken nextToken() throws IOException
- JsonParser disable(YAMLParser$Feature)
- boolean isEnabled(YAMLParser$Feature)
- JsonLocation getTokenLocation()

### Class: com.fasterxml.jackson.dataformat.yaml.YAMLParser$Feature
Type: Enum
Extends: java.lang.Enum
Implements: com.fasterxml.jackson.core.FormatFeature

Methods:
- int getMask()
- **static** YAMLParser$Feature valueOf(String)
- **static** YAMLParser$Feature[] values()
- boolean enabledByDefault()
- **static** int collectDefaults()
- boolean enabledIn(int)

## Package: com.fasterxml.jackson.dataformat.yaml.snakeyaml.error

### Class: com.fasterxml.jackson.dataformat.yaml.snakeyaml.error.Mark
Type: Class

Methods:
- String getName()
- int getIndex()
- int getLine()
- int getColumn()
- String get_snippet()
- String get_snippet(int, int)
- **static** Mark from(Mark)

### Class: com.fasterxml.jackson.dataformat.yaml.snakeyaml.error.MarkedYAMLException
Type: Class
Extends: com.fasterxml.jackson.dataformat.yaml.snakeyaml.error.YAMLException

Methods:
- String getProblem()
- Mark getProblemMark()
- Mark getContextMark()
- **static** MarkedYAMLException from(JsonParser, MarkedYAMLException)
- String getContext()

### Class: com.fasterxml.jackson.dataformat.yaml.snakeyaml.error.YAMLException
Type: Class
Extends: com.fasterxml.jackson.dataformat.yaml.JacksonYAMLParseException

Methods:
- **static** YAMLException from(JsonParser, YAMLException)

## Package: com.fasterxml.jackson.dataformat.yaml.util

### Class: com.fasterxml.jackson.dataformat.yaml.util.StringQuotingChecker
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- boolean needToQuoteValue(String)
- boolean needToQuoteName(String)

### Class: com.fasterxml.jackson.dataformat.yaml.util.StringQuotingChecker$Default
Type: Class
Extends: com.fasterxml.jackson.dataformat.yaml.util.StringQuotingChecker
Implements: java.io.Serializable

Methods:
- **static** StringQuotingChecker$Default instance()
- boolean needToQuoteValue(String)
- boolean needToQuoteName(String)

## Package: com.twodevsstudio.simplejsonconfig

### Class: com.twodevsstudio.simplejsonconfig.Main
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void onEnable()

### Class: com.twodevsstudio.simplejsonconfig.SimpleJSONConfig
Type: Enum
Extends: java.lang.Enum

Methods:
- void setEnableDebug(boolean)
- boolean isEnableDebug()
- void scanConfiguration(JavaPlugin, File, Class)
- **static** SimpleJSONConfig valueOf(String)
- **static** SimpleJSONConfig[] values()
- AnnotationProcessor getAnnotationProcessor()
- void scanStoredTypes(File, Class)
- void register(JavaPlugin, File)
- void register(JavaPlugin)
- void register(JavaPlugin, StoreType)
- void register(JavaPlugin, File, StoreType)

## Package: com.twodevsstudio.simplejsonconfig.api

### Class: com.twodevsstudio.simplejsonconfig.api.Service
Type: Interface

Methods:
- void addToCache(Identifiable)
- void saveAll()
- Identifiable getById(Object)
- void deleteFromCache(Object)
- Collection getAllCached()
- void deleteById(Object)
- void save(Identifiable)
- void delete(Identifiable)
- **static** Service getService(Class)
- Collection getMatching(Predicate)
- Collection loadAndGetAll()

### Class: com.twodevsstudio.simplejsonconfig.api.AnnotationProcessor
Type: Class

Methods:
- boolean isConfig(Class)
- void processAutowired(Set)
- void processAutowired(Reflections)
- void processAnnotations(JavaPlugin, File, Set)
- **static** Map getFieldsComments(Object)
- void processConfiguration(JavaPlugin, File, Class, Set)
- void processConfiguration(JavaPlugin, File, Reflections)
- void processStores(Path, Class, Set)
- void processStores(Path, Reflections)
- boolean isStored(Class)

### Class: com.twodevsstudio.simplejsonconfig.api.CommentProcessor
Type: Class

Methods:
- File getFileWithoutComments(File)
- void includeComments(File, Map)
- void includeComments(File, Object)

### Class: com.twodevsstudio.simplejsonconfig.api.Config
Type: Abstract Class

Methods:
- void reload()
- **static** StoreType getType()
- void save()
- **static** Set reloadAll()
- **static** void setType(StoreType)
- File getConfigFile()
- **static** Config getConfig(Class)

### Class: com.twodevsstudio.simplejsonconfig.api.ServiceContainer
Type: Class

No public methods found

## Package: com.twodevsstudio.simplejsonconfig.data

### Class: com.twodevsstudio.simplejsonconfig.data.Identifiable
Type: Interface

Methods:
- Object getId()

### Class: com.twodevsstudio.simplejsonconfig.data.Stored
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- long cacheLifespanSeconds()
- StoreType storeType()
- String value()
- int cacheMaxSize()
- long cacheScanIntervalSeconds()

## Package: com.twodevsstudio.simplejsonconfig.data.cache

### Class: com.twodevsstudio.simplejsonconfig.data.cache.InMemoryCache
Type: Class

Methods:
- LRUMap getCache()
- void cleanupCache()
- int size()
- int hashCode()
- boolean containsKey(Object)
- boolean equals(Object)
- long getScanIntervalMillis()
- long getEntryLifespanMillis()
- Collection values()
- Object get(Object)
- String toString()
- void remove(Object)
- void put(Object, Object)

### Class: com.twodevsstudio.simplejsonconfig.data.cache.InMemoryCache$CacheObject
Type: Class

Methods:
- Object getValue()
- void setLastAccessed(long)
- int hashCode()
- boolean equals(Object)
- void setValue(Object)
- long getLastAccessed()
- String toString()

## Package: com.twodevsstudio.simplejsonconfig.data.repository

### Class: com.twodevsstudio.simplejsonconfig.data.repository.Repository
Type: Interface

Methods:
- Identifiable findById(Object)
- void deleteById(Object)
- void save(Identifiable)
- void delete(Identifiable)
- Collection findAll()

### Class: com.twodevsstudio.simplejsonconfig.data.repository.FileRepository
Type: Class
Implements: com.twodevsstudio.simplejsonconfig.data.repository.Repository

Methods:
- Identifiable findById(Object)
- void deleteById(Object)
- void save(Identifiable)
- void save(Identifiable, Charset)
- Path findFileById(Object)
- void delete(Identifiable)
- List findAll()
- Collection findAll()

## Package: com.twodevsstudio.simplejsonconfig.data.service

### Class: com.twodevsstudio.simplejsonconfig.data.service.FileService
Type: Class
Extends: com.twodevsstudio.simplejsonconfig.data.service.StandardService

Methods:
- void addToCache(Identifiable)
- void saveAll()
- Identifiable getById(Object)
- void deleteFromCache(Object)
- void save(Identifiable)
- void deleteById(Object)
- Collection getAllCached()
- void delete(Identifiable)
- Collection loadAndGetAll()
- Collection getMatching(Predicate)

## Package: com.twodevsstudio.simplejsonconfig.def

### Class: com.twodevsstudio.simplejsonconfig.def.Serializer
Type: Class

Methods:
- SharedGsonBuilder toBuilder()
- Object loadConfig(TypeToken, File)
- Object loadConfig(TypeToken, File, StoreType)
- Object loadConfig(Class, File)
- Object loadConfig(Class, File, StoreType)
- void setGson(Gson)
- CommentProcessor getCommentProcessor()
- JsonParser getJsonParser()
- **static** Serializer getInst()
- SharedGsonBuilder getJsonBuilder()
- String getFileContent(Object, StoreType)
- Gson getGson()
- String getYamlString(String)
- void saveConfig(Object, File)
- void saveConfig(Object, File, StoreType, Charset)

### Class: com.twodevsstudio.simplejsonconfig.def.SharedGsonBuilder
Type: Class

Methods:
- Gson buildGson()
- SharedGsonBuilder addSerializationExclusionStrategy(ExclusionStrategy)
- SharedGsonBuilder unregisterTypeHierarchyAdapter(Class, Class)
- SharedGsonBuilder registerTypeHierarchyAdapter(Class, Object)
- SharedGsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy)
- void build()
- SharedGsonBuilder removeDeserializationExclusionStrategy(Class)
- SharedGsonBuilder registerTypeAdapter(Type, Object)
- SharedGsonBuilder removeSerializationExclusionStrategy(Class)
- SharedGsonBuilder unregisterTypeAdapter(Type, Object)

### Class: com.twodevsstudio.simplejsonconfig.def.StoreType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getExtension()
- **static** StoreType valueOf(String)
- **static** StoreType[] values()

## Package: com.twodevsstudio.simplejsonconfig.def.adapters

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.AdventureComponentAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(Component, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Component deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.AdventureStyleAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(Style, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Style deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.ChronoUnitAdapter
Type: Class
Implements: com.google.gson.JsonDeserializer, com.google.gson.JsonSerializer

Methods:
- JsonElement serialize(ChronoUnit, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- ChronoUnit deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.ClassAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(Class, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Class deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.FieldValidator
Type: Class
Implements: com.google.gson.JsonDeserializer

Methods:
- Config deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.InterfaceAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.ItemStackAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(ItemStack, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- ItemStack deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.ReferenceAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.twodevsstudio.simplejsonconfig.def.adapters.WorldAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

## Package: com.twodevsstudio.simplejsonconfig.def.strategies

### Class: com.twodevsstudio.simplejsonconfig.def.strategies.SuperclassExclusionStrategy
Type: Class
Implements: com.google.gson.ExclusionStrategy

Methods:
- boolean shouldSkipClass(Class)
- boolean shouldSkipField(FieldAttributes)

## Package: com.twodevsstudio.simplejsonconfig.exceptions

### Class: com.twodevsstudio.simplejsonconfig.exceptions.ConfigDeprecatedException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- JsonElement getSourceJson()
- List getMissingFields()
- List getRedundantFields()

### Class: com.twodevsstudio.simplejsonconfig.exceptions.ConfigNotFoundException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.twodevsstudio.simplejsonconfig.exceptions.InstanceOverrideException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: com.twodevsstudio.simplejsonconfig.interfaces

### Class: com.twodevsstudio.simplejsonconfig.interfaces.Autowired
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.twodevsstudio.simplejsonconfig.interfaces.Comment
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: com.twodevsstudio.simplejsonconfig.interfaces.Configuration
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String configPath()
- String value()
- boolean enableConfigAutoUpdates()

### Class: com.twodevsstudio.simplejsonconfig.interfaces.PostProcessable
Type: Interface

Methods:
- **static** void recursivePostProcess(PostProcessable)
- **static** void deepPostProcess(Object)
- void gsonPostProcess()

## Package: com.twodevsstudio.simplejsonconfig.utils

### Class: com.twodevsstudio.simplejsonconfig.utils.CustomLogger
Type: Class

Methods:
- **static** void log(String)
- **static** void warning(String)
- **static** void warning(Throwable)
- **static** void error(String)
- **static** void error(Throwable)

### Class: com.twodevsstudio.simplejsonconfig.utils.MetaSerializationUtils
Type: Class

Methods:
- **static** Color deserializeRawColor(Map)
- **static** FireworkEffect deserializeRawFireworkEffect(Map)
- **static** List deserializePotionEffects(List)
- **static** List deserializeRawColors(List)
- **static** List deserializeFireworkEffects(List)
- **static** PotionEffect deserializeRawPotionEffect(Map)

### Class: com.twodevsstudio.simplejsonconfig.utils.Utils
Type: Class

Methods:
- **static** String toAmpersand(String)
- **static** List toAmpersand(List)
- **static** String colored(String)
- **static** List colored(List)

## Package: javassist

### Class: javassist.ClassPath
Type: Interface

Methods:
- URL find(String)
- InputStream openClassfile(String) throws NotFoundException

### Class: javassist.CodeConverter$ArrayAccessReplacementMethodNames
Type: Interface

Methods:
- String objectRead()
- String charRead()
- String shortWrite()
- String byteOrBooleanWrite()
- String intRead()
- String intWrite()
- String byteOrBooleanRead()
- String longRead()
- String objectWrite()
- String doubleRead()
- String shortRead()
- String doubleWrite()
- String floatWrite()
- String longWrite()
- String floatRead()
- String charWrite()

### Class: javassist.CannotCompileException
Type: Class
Extends: java.lang.Exception

Methods:
- String getReason()
- Throwable initCause(Throwable)
- Throwable getCause()

### Class: javassist.ClassClassPath
Type: Class
Implements: javassist.ClassPath

Methods:
- URL find(String)
- String toString()
- InputStream openClassfile(String) throws NotFoundException

### Class: javassist.ClassMap
Type: Class
Extends: java.util.HashMap

Methods:
- **static** String toJvmName(String)
- void fix(CtClass)
- void fix(String)
- void putIfNone(String, String)
- **static** String toJavaName(String)
- String get(Object)
- Object get(Object)
- void put(CtClass, CtClass)
- String put(String, String)
- Object put(Object, Object)

### Class: javassist.ClassPool
Type: Class

Methods:
- Class toClass(CtClass) throws CannotCompileException
- Class toClass(CtClass, ClassLoader) throws CannotCompileException
- Class toClass(CtClass, ClassLoader, ProtectionDomain) throws CannotCompileException
- Class toClass(CtClass, Class) throws CannotCompileException
- Class toClass(CtClass, MethodHandles$Lookup) throws CannotCompileException
- Class toClass(CtClass, Class, ClassLoader, ProtectionDomain) throws CannotCompileException
- Object[] lookupCflow(String)
- CtClass getAndRename(String, String) throws NotFoundException
- void recordInvalidClassName(String)
- void clearImportedPackages()
- ClassPath appendClassPath(ClassPath)
- ClassPath appendClassPath(String) throws NotFoundException
- CtClass makeClass(InputStream) throws IOException, RuntimeException
- CtClass makeClass(InputStream, boolean) throws IOException, RuntimeException
- CtClass makeClass(ClassFile) throws RuntimeException
- CtClass makeClass(ClassFile, boolean) throws RuntimeException
- CtClass makeClass(String) throws RuntimeException
- CtClass makeClass(String, CtClass) throws RuntimeException
- ClassPath appendSystemPath()
- void importPackage(String)
- ClassLoader getClassLoader()
- **static** ClassPool getDefault()
- CtMethod getMethod(String, String) throws NotFoundException
- CtClass getOrNull(String)
- CtClass makeAnnotation(String) throws RuntimeException
- CtClass makeClassIfNew(InputStream) throws IOException, RuntimeException
- URL find(String)
- CtClass get(String) throws NotFoundException
- CtClass[] get(String[]) throws NotFoundException
- Iterator getImportedPackages()
- void makePackage(ClassLoader, String) throws CannotCompileException
- CtClass makeInterface(String) throws RuntimeException
- CtClass makeInterface(String, CtClass) throws RuntimeException
- CtClass getCtClass(String) throws NotFoundException
- String toString()
- ClassPath insertClassPath(ClassPath)
- ClassPath insertClassPath(String) throws NotFoundException
- void appendPathList(String) throws NotFoundException
- void removeClassPath(ClassPath)

### Class: javassist.CodeConverter
Type: Class

Methods:
- void insertBeforeMethod(CtMethod, CtMethod) throws CannotCompileException
- void replaceArrayAccess(CtClass, CodeConverter$ArrayAccessReplacementMethodNames) throws NotFoundException
- void insertAfterMethod(CtMethod, CtMethod) throws CannotCompileException
- void replaceFieldRead(CtField, CtClass, String)
- void redirectMethodCallToStatic(CtMethod, CtMethod)
- void redirectMethodCall(CtMethod, CtMethod) throws CannotCompileException
- void redirectMethodCall(String, CtMethod) throws CannotCompileException
- void redirectFieldAccess(CtField, CtClass, String)
- void replaceNew(CtClass, CtClass, String)
- void replaceNew(CtClass, CtClass)
- void replaceFieldWrite(CtField, CtClass, String)

### Class: javassist.CodeConverter$DefaultArrayAccessReplacementMethodNames
Type: Class
Implements: javassist.CodeConverter$ArrayAccessReplacementMethodNames

Methods:
- String objectRead()
- String charRead()
- String shortWrite()
- String byteOrBooleanWrite()
- String intRead()
- String intWrite()
- String byteOrBooleanRead()
- String longRead()
- String objectWrite()
- String doubleRead()
- String shortRead()
- String doubleWrite()
- String floatWrite()
- String longWrite()
- String floatRead()
- String charWrite()

### Class: javassist.CtBehavior
Type: Abstract Class
Extends: javassist.CtMember

Methods:
- String getGenericSignature()
- boolean hasAnnotation(String)
- MethodInfo getMethodInfo()
- void useCflow(String) throws CannotCompileException
- int insertAt(int, String) throws CannotCompileException
- int insertAt(int, boolean, String) throws CannotCompileException
- void instrument(CodeConverter) throws CannotCompileException
- void instrument(ExprEditor) throws CannotCompileException
- CtClass[] getParameterTypes() throws NotFoundException
- void setModifiers(int)
- void insertAfter(String) throws CannotCompileException
- void insertAfter(String, boolean) throws CannotCompileException
- void insertAfter(String, boolean, boolean) throws CannotCompileException
- void addParameter(CtClass) throws CannotCompileException
- void insertBefore(String) throws CannotCompileException
- void setAttribute(String, byte[])
- byte[] getAttribute(String)
- Object[][] getAvailableParameterAnnotations()
- void addCatch(String, CtClass) throws CannotCompileException
- void addCatch(String, CtClass, String) throws CannotCompileException
- int getModifiers()
- boolean isEmpty()
- String getSignature()
- void addLocalVariable(String, CtClass) throws CannotCompileException
- void setExceptionTypes(CtClass[]) throws NotFoundException
- void setBody(String) throws CannotCompileException
- void setBody(String, String, String) throws CannotCompileException
- Object[] getAnnotations() throws ClassNotFoundException
- String getLongName()
- void setGenericSignature(String)
- Object[] getAvailableAnnotations()
- MethodInfo getMethodInfo2()
- CtClass[] getExceptionTypes() throws NotFoundException
- Object getAnnotation(Class) throws ClassNotFoundException
- void insertParameter(CtClass) throws CannotCompileException
- Object[][] getParameterAnnotations() throws ClassNotFoundException

### Class: javassist.CtClass
Type: Abstract Class

Methods:
- boolean hasAnnotation(Class)
- boolean hasAnnotation(String)
- String getName()
- CtConstructor makeClassInitializer() throws CannotCompileException
- **static** void main(String[])
- CtMethod getMethod(String, String) throws NotFoundException
- ClassFile getClassFile()
- CtField[] getDeclaredFields()
- byte[] toBytecode() throws IOException, CannotCompileException
- void toBytecode(DataOutputStream) throws CannotCompileException, IOException
- void freeze()
- CtBehavior getEnclosingBehavior() throws NotFoundException
- CtMethod getEnclosingMethod() throws NotFoundException
- boolean isModified()
- void rebuildClassFile()
- void removeMethod(CtMethod) throws NotFoundException
- ClassFile getClassFile2()
- boolean isInterface()
- void addMethod(CtMethod) throws CannotCompileException
- Class toClass() throws CannotCompileException
- Class toClass(Class) throws CannotCompileException
- Class toClass(MethodHandles$Lookup) throws CannotCompileException
- Class toClass(ClassLoader, ProtectionDomain) throws CannotCompileException
- Class toClass(ClassLoader) throws CannotCompileException
- String makeUniqueName(String)
- void addInterface(CtClass)
- void replaceClassName(String, String)
- void replaceClassName(ClassMap)
- void addField(CtField) throws CannotCompileException
- void addField(CtField, String) throws CannotCompileException
- void addField(CtField, CtField$Initializer) throws CannotCompileException
- CtField getField(String) throws NotFoundException
- CtField getField(String, String) throws NotFoundException
- CtClass[] getInterfaces() throws NotFoundException
- void removeConstructor(CtConstructor) throws NotFoundException
- ClassPool getClassPool()
- CtClass[] getNestedClasses() throws NotFoundException
- Object[] getAvailableAnnotations()
- URL getURL() throws NotFoundException
- CtField[] getFields()
- Object getAnnotation(Class) throws ClassNotFoundException
- CtClass getComponentType() throws NotFoundException
- String getSimpleName()
- boolean isArray()
- CtConstructor getClassInitializer()
- String getPackageName()
- CtMethod[] getMethods()
- boolean isPrimitive()
- void addConstructor(CtConstructor) throws CannotCompileException
- String getGenericSignature()
- void setName(String)
- void setInterfaces(CtClass[])
- boolean isAnnotation()
- CtConstructor[] getDeclaredConstructors()
- AccessorMaker getAccessorMaker()
- void instrument(CodeConverter) throws CannotCompileException
- void instrument(ExprEditor) throws CannotCompileException
- void setModifiers(int)
- void removeField(CtField) throws NotFoundException
- Collection getRefClasses()
- CtMethod[] getDeclaredMethods()
- CtMethod[] getDeclaredMethods(String) throws NotFoundException
- CtClass getDeclaringClass() throws NotFoundException
- void setAttribute(String, byte[])
- byte[] getAttribute(String)
- CtConstructor[] getConstructors()
- boolean stopPruning(boolean)
- int getModifiers()
- boolean isFrozen()
- void writeFile() throws NotFoundException, IOException, CannotCompileException
- void writeFile(String) throws CannotCompileException, IOException
- boolean isKotlin()
- CtClass getSuperclass() throws NotFoundException
- CtField getDeclaredField(String) throws NotFoundException
- CtField getDeclaredField(String, String) throws NotFoundException
- void debugWriteFile()
- void debugWriteFile(String)
- boolean subtypeOf(CtClass) throws NotFoundException
- CtMethod getDeclaredMethod(String, CtClass[]) throws NotFoundException
- CtMethod getDeclaredMethod(String) throws NotFoundException
- CtClass makeNestedClass(String, boolean)
- boolean isEnum()
- CtConstructor getDeclaredConstructor(CtClass[]) throws NotFoundException
- CtConstructor getConstructor(String) throws NotFoundException
- Object[] getAnnotations() throws ClassNotFoundException
- void setSuperclass(CtClass) throws CannotCompileException
- void setGenericSignature(String)
- void prune()
- CtClass[] getDeclaredClasses() throws NotFoundException
- boolean subclassOf(CtClass)
- void defrost()
- void detach()
- String toString()
- CtBehavior[] getDeclaredBehaviors()

### Class: javassist.CtConstructor
Type: Class
Extends: javassist.CtBehavior

Methods:
- String getName()
- void insertBeforeBody(String) throws CannotCompileException
- boolean isConstructor()
- boolean isEmpty()
- boolean isClassInitializer()
- CtMethod toMethod(String, CtClass) throws CannotCompileException
- CtMethod toMethod(String, CtClass, ClassMap) throws CannotCompileException
- void setBody(String) throws CannotCompileException
- void setBody(CtConstructor, ClassMap) throws CannotCompileException
- boolean callsSuper() throws CannotCompileException
- String getLongName()

### Class: javassist.CtField
Type: Class
Extends: javassist.CtMember

Methods:
- String getGenericSignature()
- void setName(String)
- boolean hasAnnotation(String)
- String getName()
- FieldInfo getFieldInfo()
- Object getConstantValue()
- String getSignature()
- FieldInfo getFieldInfo2()
- void setModifiers(int)
- void setType(CtClass)
- Object[] getAnnotations() throws ClassNotFoundException
- void setGenericSignature(String)
- Object[] getAvailableAnnotations()
- CtClass getDeclaringClass()
- void setAttribute(String, byte[])
- byte[] getAttribute(String)
- CtClass getType() throws NotFoundException
- Object getAnnotation(Class) throws ClassNotFoundException
- String toString()
- int getModifiers()
- **static** CtField make(String, CtClass) throws CannotCompileException

### Class: javassist.CtField$Initializer
Type: Abstract Class

Methods:
- **static** CtField$Initializer byCallWithParams(CtClass, String)
- **static** CtField$Initializer byCallWithParams(CtClass, String, String[])
- **static** CtField$Initializer byNewArray(CtClass, int) throws NotFoundException
- **static** CtField$Initializer byNewArray(CtClass, int[])
- **static** CtField$Initializer byParameter(int)
- **static** CtField$Initializer constant(int)
- **static** CtField$Initializer constant(boolean)
- **static** CtField$Initializer constant(long)
- **static** CtField$Initializer constant(float)
- **static** CtField$Initializer constant(double)
- **static** CtField$Initializer constant(String)
- **static** CtField$Initializer byNew(CtClass)
- **static** CtField$Initializer byNew(CtClass, String[])
- **static** CtField$Initializer byCall(CtClass, String)
- **static** CtField$Initializer byCall(CtClass, String, String[])
- **static** CtField$Initializer byExpr(String)
- **static** CtField$Initializer byNewWithParams(CtClass)
- **static** CtField$Initializer byNewWithParams(CtClass, String[])

### Class: javassist.CtMember
Type: Abstract Class

Methods:
- String getGenericSignature()
- boolean hasAnnotation(Class)
- boolean hasAnnotation(String)
- String getName()
- String getSignature()
- void setModifiers(int)
- Object[] getAnnotations() throws ClassNotFoundException
- void setGenericSignature(String)
- Object[] getAvailableAnnotations()
- CtClass getDeclaringClass()
- void setAttribute(String, byte[])
- byte[] getAttribute(String)
- Object getAnnotation(Class) throws ClassNotFoundException
- String toString()
- int getModifiers()
- boolean visibleFrom(CtClass)

### Class: javassist.CtMethod
Type: Class
Extends: javassist.CtBehavior

Methods:
- void setWrappedBody(CtMethod, CtMethod$ConstParameter) throws CannotCompileException
- void setName(String)
- String getName()
- CtClass getReturnType() throws NotFoundException
- int hashCode()
- boolean equals(Object)
- boolean isEmpty()
- void setBody(CtMethod, ClassMap) throws CannotCompileException
- **static** CtMethod make(String, CtClass) throws CannotCompileException
- **static** CtMethod make(MethodInfo, CtClass) throws CannotCompileException
- String getLongName()

### Class: javassist.CtMethod$ConstParameter
Type: Class

Methods:
- **static** CtMethod$ConstParameter string(String)
- **static** CtMethod$ConstParameter integer(int)
- **static** CtMethod$ConstParameter integer(long)

### Class: javassist.CtNewConstructor
Type: Class

Methods:
- **static** CtConstructor skeleton(CtClass[], CtClass[], CtClass) throws CannotCompileException
- **static** CtConstructor defaultConstructor(CtClass) throws CannotCompileException
- **static** CtConstructor copy(CtConstructor, CtClass, ClassMap) throws CannotCompileException
- **static** CtConstructor make(String, CtClass) throws CannotCompileException
- **static** CtConstructor make(CtClass[], CtClass[], String, CtClass) throws CannotCompileException
- **static** CtConstructor make(CtClass[], CtClass[], CtClass) throws CannotCompileException
- **static** CtConstructor make(CtClass[], CtClass[], int, CtMethod, CtMethod$ConstParameter, CtClass) throws CannotCompileException

### Class: javassist.CtNewMethod
Type: Class

Methods:
- **static** CtMethod getter(String, CtField) throws CannotCompileException
- **static** CtMethod delegator(CtMethod, CtClass) throws CannotCompileException
- **static** CtMethod abstractMethod(CtClass, String, CtClass[], CtClass[], CtClass) throws NotFoundException
- **static** CtMethod copy(CtMethod, CtClass, ClassMap) throws CannotCompileException
- **static** CtMethod copy(CtMethod, String, CtClass, ClassMap) throws CannotCompileException
- **static** CtMethod wrapped(CtClass, String, CtClass[], CtClass[], CtMethod, CtMethod$ConstParameter, CtClass) throws CannotCompileException
- **static** CtMethod setter(String, CtField) throws CannotCompileException
- **static** CtMethod make(String, CtClass) throws CannotCompileException
- **static** CtMethod make(String, CtClass, String, String) throws CannotCompileException
- **static** CtMethod make(CtClass, String, CtClass[], CtClass[], String, CtClass) throws CannotCompileException
- **static** CtMethod make(int, CtClass, String, CtClass[], CtClass[], String, CtClass) throws CannotCompileException

### Class: javassist.CtPrimitiveType
Type: Class
Extends: javassist.CtClass

Methods:
- char getDescriptor()
- String getGetMethodDescriptor()
- int getArrayType()
- String getWrapperName()
- String getGetMethodName()
- int getReturnOp()
- int getModifiers()
- int getDataSize()
- boolean isPrimitive()

### Class: javassist.LoaderClassPath
Type: Class
Implements: javassist.ClassPath

Methods:
- URL find(String)
- String toString()
- InputStream openClassfile(String) throws NotFoundException

### Class: javassist.Modifier
Type: Class

Methods:
- **static** int setPublic(int)
- **static** boolean isStatic(int)
- **static** boolean isAnnotation(int)
- **static** boolean isVarArgs(int)
- **static** int setPackage(int)
- **static** int clear(int, int)
- **static** boolean isVolatile(int)
- **static** boolean isEnum(int)
- **static** boolean isSynchronized(int)
- **static** boolean isPackage(int)
- **static** boolean isPrivate(int)
- **static** boolean isAbstract(int)
- **static** boolean isNative(int)
- **static** boolean isStrict(int)
- **static** boolean isProtected(int)
- **static** int setProtected(int)
- **static** boolean isPublic(int)
- **static** String toString(int)
- **static** boolean isFinal(int)
- **static** boolean isTransient(int)
- **static** boolean isInterface(int)
- **static** int setPrivate(int)

### Class: javassist.NotFoundException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: javassist.bytecode

### Class: javassist.bytecode.Opcode
Type: Interface

No public methods found

### Class: javassist.bytecode.AccessFlag
Type: Class

Methods:
- **static** int setPublic(int)
- **static** boolean isProtected(int)
- **static** int of(int)
- **static** int setPackage(int)
- **static** int setProtected(int)
- **static** int clear(int, int)
- **static** boolean isPublic(int)
- **static** boolean isPackage(int)
- **static** boolean isPrivate(int)
- **static** int setPrivate(int)
- **static** int toModifier(int)

### Class: javassist.bytecode.AnnotationDefaultAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- void setDefaultValue(MemberValue)
- String toString()
- AttributeInfo copy(ConstPool, Map)
- MemberValue getDefaultValue()

### Class: javassist.bytecode.AnnotationsAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- boolean removeAnnotation(String)
- void addAnnotation(Annotation)
- void setAnnotation(Annotation)
- Annotation getAnnotation(String)
- int numAnnotations()
- String toString()
- void setAnnotations(Annotation[])
- AttributeInfo copy(ConstPool, Map)
- Annotation[] getAnnotations()

### Class: javassist.bytecode.AttributeInfo
Type: Class

Methods:
- void set(byte[])
- ConstPool getConstPool()
- String getName()
- byte[] get()
- int length()
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.BadBytecode
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: javassist.bytecode.BootstrapMethodsAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- AttributeInfo copy(ConstPool, Map)
- BootstrapMethodsAttribute$BootstrapMethod[] getMethods()

### Class: javassist.bytecode.BootstrapMethodsAttribute$BootstrapMethod
Type: Class

No public methods found

### Class: javassist.bytecode.ByteArray
Type: Class

Methods:
- **static** int read32bit(byte[], int)
- **static** void write32bit(int, byte[], int)
- **static** int readU16bit(byte[], int)
- **static** void write16bit(int, byte[], int)
- **static** int readS16bit(byte[], int)

### Class: javassist.bytecode.Bytecode
Type: Class
Extends: javassist.bytecode.ByteVector
Implements: java.lang.Cloneable, javassist.bytecode.Opcode

Methods:
- void add32bit(int)
- void addDconst(double)
- CodeAttribute toCodeAttribute()
- void addNew(CtClass)
- void addNew(String)
- void addAload(int)
- void addInvokeinterface(CtClass, String, CtClass, CtClass[], int)
- void addInvokeinterface(CtClass, String, String, int)
- void addInvokeinterface(String, String, String, int)
- void addInvokeinterface(int, String, String, int)
- void addInvokedynamic(int, String, String)
- void addInvokestatic(CtClass, String, CtClass, CtClass[])
- void addInvokestatic(CtClass, String, String)
- void addInvokestatic(String, String, String)
- void addInvokestatic(int, String, String)
- int read16bit(int)
- void addAnewarray(String)
- void addAnewarray(CtClass, int)
- void addIconst(int)
- void addConstZero(CtClass)
- void addDstore(int)
- void write(int, int)
- void add(int)
- void add(int, int, int, int)
- void add(int, int)
- int addLoad(int, CtClass)
- int read(int)
- void addIndex(int)
- int getStackDepth()
- void addIload(int)
- void addReturn(CtClass)
- void addOpcode(int)
- void addCheckcast(CtClass)
- void addCheckcast(String)
- void setMaxLocals(int)
- void setMaxLocals(boolean, CtClass[], int)
- void write16bit(int, int)
- void addInvokevirtual(CtClass, String, CtClass, CtClass[])
- void addInvokevirtual(CtClass, String, String)
- void addInvokevirtual(String, String, String)
- void addInvokevirtual(int, String, String)
- void addGetfield(CtClass, String, String)
- void addGetfield(String, String, String)
- void setMaxStack(int)
- void addLdc(String)
- void addLdc(int)
- void addGap(int)
- void write32bit(int, int)
- void addLdc2w(long)
- void addLdc2w(double)
- void addExceptionHandler(int, int, int, CtClass)
- void addExceptionHandler(int, int, int, String)
- void addExceptionHandler(int, int, int, int)
- void growStack(int)
- void addLconst(long)
- void addFconst(float)
- ConstPool getConstPool()
- byte[] get()
- void addInstanceof(String)
- void addFload(int)
- void setStackDepth(int)
- void addNewarray(int, int)
- void addPutstatic(CtClass, String, String)
- void addPutstatic(String, String, String)
- int read32bit(int)
- void addGetstatic(CtClass, String, String)
- void addGetstatic(String, String, String)
- void addPutfield(CtClass, String, String)
- void addPutfield(String, String, String)
- int addMultiNewarray(CtClass, int[])
- int addMultiNewarray(CtClass, int)
- int addMultiNewarray(String, int)
- int length()
- void addAstore(int)
- void addInvokespecial(CtClass, String, CtClass, CtClass[])
- void addInvokespecial(CtClass, String, String)
- void addInvokespecial(String, String, String)
- void addInvokespecial(int, String, String)
- void addInvokespecial(boolean, int, String, String)
- void addInvokespecial(int, String)
- void addFstore(int)
- int addStore(int, CtClass)
- ExceptionTable getExceptionTable()
- void addPrintln(String)
- void addRet(int)
- int addLoadParameters(CtClass[], int)
- void addLload(int)
- void addIstore(int)
- void addLstore(int)
- void incMaxLocals(int)
- Object clone()
- int currentPc()
- int getMaxStack()
- void addDload(int)
- int getMaxLocals()

### Class: javassist.bytecode.ClassFile
Type: Class

Methods:
- int getSuperclassId()
- void setName(String)
- void setInterfaces(String[])
- String getName()
- void addField2(FieldInfo)
- void compact()
- int getMinorVersion()
- int getInnerAccessFlags()
- MethodInfo getMethod(String)
- void getRefClasses(Map)
- void setAccessFlags(int)
- int getMajorVersion()
- AttributeInfo getAttribute(String)
- ConstPool getConstPool()
- void renameClass(String, String)
- void renameClass(Map)
- String getSourceFile()
- boolean isFinal()
- AttributeInfo removeAttribute(String)
- void write(DataOutputStream) throws IOException
- boolean isInterface()
- void addMethod(MethodInfo) throws DuplicateMemberException
- String getSuperclass()
- void addMethod2(MethodInfo)
- List getAttributes()
- int getAccessFlags()
- void addInterface(String)
- void addField(FieldInfo) throws DuplicateMemberException
- String[] getInterfaces()
- boolean isAbstract()
- void setMajorVersion(int)
- void setSuperclass(String) throws CannotCompileException
- List getFields()
- void addAttribute(AttributeInfo)
- void prune()
- void setVersionToJava5()
- MethodInfo getStaticInitializer()
- List getMethods()
- void setMinorVersion(int)

### Class: javassist.bytecode.CodeAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo
Implements: javassist.bytecode.Opcode

Methods:
- List getAttributes()
- void set(byte[])
- int length()
- int computeMaxStack() throws BadBytecode
- String getDeclaringClass()
- void setAttribute(StackMapTable)
- void setAttribute(StackMap)
- CodeIterator iterator()
- AttributeInfo getAttribute(String)
- ExceptionTable getExceptionTable()
- void setMaxLocals(int)
- byte[] get()
- int getCodeLength()
- void setMaxStack(int)
- AttributeInfo copy(ConstPool, Map) throws CodeAttribute$RuntimeCopyException
- void insertLocalVar(int, int) throws BadBytecode
- byte[] getCode()
- int getMaxStack()
- int getMaxLocals()

### Class: javassist.bytecode.CodeAttribute$RuntimeCopyException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: javassist.bytecode.CodeIterator
Type: Class
Implements: javassist.bytecode.Opcode

Methods:
- int next() throws BadBytecode
- int byteAt(int)
- int getMark()
- void setMark(int)
- void write32bit(int, int)
- int signedByteAt(int)
- int getMark2()
- int insertExGap(int) throws BadBytecode
- int insertExGap(int, int) throws BadBytecode
- int insertEx(byte[]) throws BadBytecode
- void insertEx(int, byte[]) throws BadBytecode
- int insertAt(int, byte[]) throws BadBytecode
- int insertGap(int) throws BadBytecode
- int insertGap(int, int) throws BadBytecode
- int insert(byte[]) throws BadBytecode
- void insert(int, byte[]) throws BadBytecode
- void insert(ExceptionTable, int)
- int skipConstructor() throws BadBytecode
- CodeIterator$Gap insertGapAt(int, int, boolean) throws BadBytecode
- int insertExAt(int, byte[]) throws BadBytecode
- int lookAhead()
- CodeAttribute get()
- void setMark2(int)
- void appendGap(int)
- int skipThisConstructor() throws BadBytecode
- void write(byte[], int)
- void writeByte(int, int)
- void move(int)
- int s32bitAt(int)
- boolean hasNext()
- int skipSuperConstructor() throws BadBytecode
- int u16bitAt(int)
- void write16bit(int, int)
- int getCodeLength()
- int s16bitAt(int)
- void begin()
- int append(byte[])
- void append(ExceptionTable, int)

### Class: javassist.bytecode.CodeIterator$Gap
Type: Class

No public methods found

### Class: javassist.bytecode.ConstPool
Type: Class

Methods:
- int addInterfaceMethodrefInfo(int, String, String)
- int addInterfaceMethodrefInfo(int, int)
- int getFieldrefClass(int)
- String getDynamicType(int)
- int addStringInfo(String)
- int addClassInfo(CtClass)
- int addClassInfo(String)
- int isMember(String, String, int)
- int getDynamicBootstrap(int)
- String getFieldrefName(int)
- int getMemberClass(int)
- void renameClass(String, String)
- void renameClass(Map)
- String getInterfaceMethodrefName(int)
- int getThisClassInfo()
- void write(DataOutputStream) throws IOException
- int addPackageInfo(int)
- Object getLdcValue(int)
- String getPackageInfo(int)
- int getMethodrefNameAndType(int)
- String getMethodrefClassName(int)
- int getInvokeDynamicNameAndType(int)
- int addFieldrefInfo(int, String, String)
- int addFieldrefInfo(int, int)
- String getStringInfo(int)
- double getDoubleInfo(int)
- int addIntegerInfo(int)
- int getMethodHandleIndex(int)
- int addDoubleInfo(double)
- int isConstructor(String, int)
- int getIntegerInfo(int)
- int addDynamicInfo(int, int)
- String getClassName()
- int getMethodrefClass(int)
- String getClassInfo(int)
- int getInterfaceMethodrefNameAndType(int)
- int getMethodTypeInfo(int)
- int addLongInfo(long)
- int addMethodHandleInfo(int, int)
- String getMethodrefType(int)
- int getMethodHandleKind(int)
- int getNameAndTypeDescriptor(int)
- int addInvokeDynamicInfo(int, int)
- String getInterfaceMethodrefClassName(int)
- int addNameAndTypeInfo(String, String)
- int addNameAndTypeInfo(int, int)
- int getInvokeDynamicBootstrap(int)
- String getFieldrefType(int)
- int getInterfaceMethodrefClass(int)
- String getInterfaceMethodrefType(int)
- int copy(int, ConstPool, Map)
- Set getClassNames()
- int addFloatInfo(float)
- String getUtf8Info(int)
- int addMethodrefInfo(int, String, String)
- int addMethodrefInfo(int, int)
- int getTag(int)
- String getModuleInfo(int)
- int getFieldrefNameAndType(int)
- int getNameAndTypeName(int)
- String getFieldrefClassName(int)
- int addUtf8Info(String)
- long getLongInfo(int)
- void print()
- void print(PrintWriter)
- int getMemberNameAndType(int)
- int getSize()
- int addModuleInfo(int)
- String eqMember(String, String, int)
- float getFloatInfo(int)
- String getMethodrefName(int)
- int addMethodTypeInfo(int)
- int getDynamicNameAndType(int)
- String getInvokeDynamicType(int)
- String getClassInfoByDescriptor(int)

### Class: javassist.bytecode.ConstantAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int getConstantValue()
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.DeprecatedAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.Descriptor
Type: Class

Methods:
- **static** String toArrayComponent(String, int)
- **static** String toJvmName(String)
- **static** String toJvmName(CtClass)
- **static** int arrayDimension(String)
- **static** String changeReturnType(String, String)
- **static** int dataSize(String)
- **static** CtClass[] getParameterTypes(String, ClassPool) throws NotFoundException
- **static** int numOfParameters(String)
- **static** String ofParameters(CtClass[])
- **static** String getParamDescriptor(String)
- **static** String ofMethod(CtClass, CtClass[])
- **static** CtClass getReturnType(String, ClassPool) throws NotFoundException
- **static** String appendParameter(String, String)
- **static** String appendParameter(CtClass, String)
- **static** String rename(String, String, String)
- **static** String rename(String, Map)
- **static** String toJavaName(String)
- **static** CtClass toCtClass(String, ClassPool) throws NotFoundException
- **static** String ofConstructor(CtClass[])
- **static** String of(String)
- **static** String of(CtClass)
- **static** int paramSize(String)
- **static** String toString(String)
- **static** String toClassName(String)
- **static** boolean eqParamTypes(String, String)
- **static** String insertParameter(String, String)
- **static** String insertParameter(CtClass, String)

### Class: javassist.bytecode.Descriptor$Iterator
Type: Class

Methods:
- int next()
- char currentChar()
- boolean isParameter()
- boolean is2byte()
- boolean hasNext()

### Class: javassist.bytecode.DuplicateMemberException
Type: Class
Extends: javassist.CannotCompileException

No public methods found

### Class: javassist.bytecode.EnclosingMethodAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int classIndex()
- int methodIndex()
- String methodDescriptor()
- String methodName()
- String className()
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.ExceptionTable
Type: Class
Implements: java.lang.Cloneable

Methods:
- void add(int, ExceptionTable, int)
- void add(int, int, int, int, int)
- void add(int, int, int, int)
- void setEndPc(int, int)
- int size()
- int catchType(int)
- void setHandlerPc(int, int)
- Object clone() throws CloneNotSupportedException
- void setStartPc(int, int)
- ExceptionTable copy(ConstPool, Map)
- int endPc(int)
- void setCatchType(int, int)
- void remove(int)
- int startPc(int)
- int handlerPc(int)

### Class: javassist.bytecode.ExceptionsAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- String[] getExceptions()
- int getException(int)
- void setExceptionIndexes(int[])
- void setExceptions(String[])
- int tableLength()
- AttributeInfo copy(ConstPool, Map)
- int[] getExceptionIndexes()

### Class: javassist.bytecode.FieldInfo
Type: Class

Methods:
- String getDescriptor()
- void setName(String)
- AttributeInfo getAttribute(String)
- List getAttributes()
- String getName()
- ConstPool getConstPool()
- void addAttribute(AttributeInfo)
- int getAccessFlags()
- int getConstantValue()
- void setDescriptor(String)
- String toString()
- AttributeInfo removeAttribute(String)
- void setAccessFlags(int)

### Class: javassist.bytecode.InnerClassesAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int innerClassIndex(int)
- void setOuterClassIndex(int, int)
- String innerName(int)
- void setInnerClassIndex(int, int)
- void setInnerNameIndex(int, int)
- String innerClass(int)
- int outerClassIndex(int)
- int remove(int)
- void setAccessFlags(int, int)
- int accessFlags(int)
- int find(String)
- String outerClass(int)
- int tableLength()
- AttributeInfo copy(ConstPool, Map)
- int innerNameIndex(int)
- void append(String, String, String, int)
- void append(int, int, int, int)

### Class: javassist.bytecode.LineNumberAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int toStartPc(int)
- int toLineNumber(int)
- LineNumberAttribute$Pc toNearPc(int)
- int tableLength()
- AttributeInfo copy(ConstPool, Map)
- int lineNumber(int)
- int startPc(int)

### Class: javassist.bytecode.LineNumberAttribute$Pc
Type: Class

No public methods found

### Class: javassist.bytecode.LocalVariableAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- String variableName(int)
- int codeLength(int)
- String signature(int)
- int index(int)
- int descriptorIndex(int)
- String descriptor(int)
- String variableNameByIndex(int)
- int signatureIndex(int)
- void addEntry(int, int, int, int, int)
- int nameIndex(int)
- int tableLength()
- AttributeInfo copy(ConstPool, Map)
- void shiftIndex(int, int)
- int startPc(int)

### Class: javassist.bytecode.LocalVariableTypeAttribute
Type: Class
Extends: javassist.bytecode.LocalVariableAttribute

No public methods found

### Class: javassist.bytecode.MethodInfo
Type: Class

Methods:
- String getDescriptor()
- void setName(String)
- String getName()
- ExceptionsAttribute getExceptionsAttribute()
- void removeExceptionsAttribute()
- void setAccessFlags(int)
- AttributeInfo getAttribute(String)
- ConstPool getConstPool()
- boolean isMethod()
- void setCodeAttribute(CodeAttribute)
- AttributeInfo removeAttribute(String)
- void rebuildStackMapIf6(ClassPool, ClassFile) throws BadBytecode
- void rebuildStackMapForME(ClassPool) throws BadBytecode
- CodeAttribute getCodeAttribute()
- List getAttributes()
- int getAccessFlags()
- boolean isStaticInitializer()
- void setSuperclass(String) throws BadBytecode
- int getLineNumber(int)
- void addAttribute(AttributeInfo)
- void removeCodeAttribute()
- boolean isConstructor()
- void setDescriptor(String)
- String toString()
- void rebuildStackMap(ClassPool) throws BadBytecode
- void setExceptionsAttribute(ExceptionsAttribute)

### Class: javassist.bytecode.MethodParametersAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int accessFlags(int)
- int size()
- int name(int)
- AttributeInfo copy(ConstPool, Map)
- String parameterName(int)

### Class: javassist.bytecode.NestHostAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int hostClassIndex()
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.NestMembersAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int numberOfClasses()
- AttributeInfo copy(ConstPool, Map)
- int memberClass(int)

### Class: javassist.bytecode.ParameterAnnotationsAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int numParameters()
- String toString()
- void setAnnotations(Annotation[][])
- AttributeInfo copy(ConstPool, Map)
- Annotation[][] getAnnotations()

### Class: javassist.bytecode.SignatureAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- **static** SignatureAttribute$Type toTypeSignature(String) throws BadBytecode
- **static** SignatureAttribute$ObjectType toFieldSignature(String) throws BadBytecode
- **static** SignatureAttribute$MethodSignature toMethodSignature(String) throws BadBytecode
- void setSignature(String)
- String getSignature()
- AttributeInfo copy(ConstPool, Map)
- **static** SignatureAttribute$ClassSignature toClassSignature(String) throws BadBytecode

### Class: javassist.bytecode.SignatureAttribute$ArrayType
Type: Class
Extends: javassist.bytecode.SignatureAttribute$ObjectType

Methods:
- SignatureAttribute$Type getComponentType()
- int getDimension()
- String toString()

### Class: javassist.bytecode.SignatureAttribute$BaseType
Type: Class
Extends: javassist.bytecode.SignatureAttribute$Type

Methods:
- CtClass getCtlass()
- char getDescriptor()
- String toString()

### Class: javassist.bytecode.SignatureAttribute$ClassSignature
Type: Class

Methods:
- String encode()
- SignatureAttribute$ClassType[] getInterfaces()
- SignatureAttribute$TypeParameter[] getParameters()
- String toString()
- SignatureAttribute$ClassType getSuperClass()

### Class: javassist.bytecode.SignatureAttribute$ClassType
Type: Class
Extends: javassist.bytecode.SignatureAttribute$ObjectType

Methods:
- String jvmTypeName()
- SignatureAttribute$ClassType getDeclaringClass()
- String getName()
- String toString()
- SignatureAttribute$TypeArgument[] getTypeArguments()

### Class: javassist.bytecode.SignatureAttribute$MethodSignature
Type: Class

Methods:
- String encode()
- SignatureAttribute$ObjectType[] getExceptionTypes()
- SignatureAttribute$Type getReturnType()
- String toString()
- SignatureAttribute$Type[] getParameterTypes()
- SignatureAttribute$TypeParameter[] getTypeParameters()

### Class: javassist.bytecode.SignatureAttribute$NestedClassType
Type: Class
Extends: javassist.bytecode.SignatureAttribute$ClassType

Methods:
- SignatureAttribute$ClassType getDeclaringClass()

### Class: javassist.bytecode.SignatureAttribute$ObjectType
Type: Abstract Class
Extends: javassist.bytecode.SignatureAttribute$Type

Methods:
- String encode()

### Class: javassist.bytecode.SignatureAttribute$Type
Type: Abstract Class

Methods:
- String jvmTypeName()

### Class: javassist.bytecode.SignatureAttribute$TypeArgument
Type: Class

Methods:
- SignatureAttribute$ObjectType getType()
- **static** SignatureAttribute$TypeArgument subclassOf(SignatureAttribute$ObjectType)
- boolean isWildcard()
- String toString()
- char getKind()
- **static** SignatureAttribute$TypeArgument superOf(SignatureAttribute$ObjectType)

### Class: javassist.bytecode.SignatureAttribute$TypeParameter
Type: Class

Methods:
- SignatureAttribute$ObjectType[] getInterfaceBound()
- String getName()
- SignatureAttribute$ObjectType getClassBound()
- String toString()

### Class: javassist.bytecode.SignatureAttribute$TypeVariable
Type: Class
Extends: javassist.bytecode.SignatureAttribute$ObjectType

Methods:
- String getName()
- String toString()

### Class: javassist.bytecode.SourceFileAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- AttributeInfo copy(ConstPool, Map)
- String getFileName()

### Class: javassist.bytecode.StackMap
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- void print(PrintWriter)
- int numOfEntries()
- void removeNew(int) throws CannotCompileException
- void insertLocal(int, int, int) throws BadBytecode
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.StackMap$Walker
Type: Class

Methods:
- int typeInfoArray(int, int, int, boolean)
- int stack(int, int, int)
- void typeInfo(int, byte)
- void visit()
- int locals(int, int, int)
- void uninitialized(int, int)
- void objectVariable(int, int)

### Class: javassist.bytecode.StackMap$Writer
Type: Class

Methods:
- byte[] toByteArray()
- void write16bit(int)
- void writeVerifyTypeInfo(int, int)
- StackMap toStackMap(ConstPool)

### Class: javassist.bytecode.StackMapTable
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- void println(PrintWriter)
- void println(PrintStream)
- void removeNew(int) throws CannotCompileException
- **static** int typeTagOf(char)
- void insertLocal(int, int, int) throws BadBytecode
- AttributeInfo copy(ConstPool, Map) throws StackMapTable$RuntimeCopyException

### Class: javassist.bytecode.StackMapTable$RuntimeCopyException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: javassist.bytecode.StackMapTable$Walker
Type: Class

Methods:
- void objectOrUninitialized(int, int, int)
- void appendFrame(int, int, int[], int[]) throws BadBytecode
- void sameLocals(int, int, int, int) throws BadBytecode
- void chopFrame(int, int, int) throws BadBytecode
- int size()
- void fullFrame(int, int, int[], int[], int[], int[]) throws BadBytecode
- void sameFrame(int, int) throws BadBytecode
- void parse() throws BadBytecode

### Class: javassist.bytecode.StackMapTable$Writer
Type: Class

Methods:
- void appendFrame(int, int[], int[])
- void sameLocals(int, int, int)
- StackMapTable toStackMapTable(ConstPool)
- void chopFrame(int, int)
- void fullFrame(int, int[], int[], int[], int[])
- void sameFrame(int)
- byte[] toByteArray()

### Class: javassist.bytecode.SyntheticAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- AttributeInfo copy(ConstPool, Map)

### Class: javassist.bytecode.TypeAnnotationsAttribute
Type: Class
Extends: javassist.bytecode.AttributeInfo

Methods:
- int numAnnotations()
- AttributeInfo copy(ConstPool, Map)

## Package: javassist.bytecode.analysis

### Class: javassist.bytecode.analysis.Analyzer
Type: Class
Implements: javassist.bytecode.Opcode

Methods:
- Frame[] analyze(CtClass, MethodInfo) throws BadBytecode
- Frame[] analyze(CtMethod) throws BadBytecode

### Class: javassist.bytecode.analysis.Executor
Type: Class
Implements: javassist.bytecode.Opcode

Methods:
- void execute(MethodInfo, int, CodeIterator, Frame, Subroutine) throws BadBytecode

### Class: javassist.bytecode.analysis.Frame
Type: Class

Methods:
- int localsLength()
- Frame copyStack()
- void push(Type)
- Type peek()
- Type pop()
- void setStack(int, Type)
- void clearStack()
- Type getLocal(int)
- boolean merge(Frame)
- void setLocal(int, Type)
- String toString()
- Type getStack(int)
- Frame copy()
- boolean mergeStack(Frame)
- int getTopIndex()

### Class: javassist.bytecode.analysis.MultiArrayType
Type: Class
Extends: javassist.bytecode.analysis.Type

Methods:
- boolean isAssignableTo(Type)
- int getDimensions()
- int getSize()
- int hashCode()
- boolean equals(Object)
- boolean isReference()
- String toString()
- boolean isArray()
- CtClass getCtClass()
- Type getComponent()
- boolean isAssignableFrom(Type)

### Class: javassist.bytecode.analysis.MultiType
Type: Class
Extends: javassist.bytecode.analysis.Type

Methods:
- boolean isAssignableTo(Type)
- int getSize()
- int hashCode()
- boolean equals(Object)
- Type merge(Type)
- boolean isReference()
- String toString()
- boolean isArray()
- CtClass getCtClass()
- Type getComponent()
- boolean isAssignableFrom(Type)

### Class: javassist.bytecode.analysis.Subroutine
Type: Class

Methods:
- void access(int)
- int start()
- String toString()
- boolean isAccessed(int)
- Collection callers()
- Collection accessed()
- void addCaller(int)

### Class: javassist.bytecode.analysis.SubroutineScanner
Type: Class
Implements: javassist.bytecode.Opcode

Methods:
- Subroutine[] scan(MethodInfo) throws BadBytecode

### Class: javassist.bytecode.analysis.Type
Type: Class

Methods:
- int getDimensions()
- int getSize()
- boolean isSpecial()
- int hashCode()
- boolean equals(Object)
- Type merge(Type)
- **static** Type get(CtClass)
- boolean isReference()
- String toString()
- boolean isArray()
- CtClass getCtClass()
- Type getComponent()
- boolean isAssignableFrom(Type)

### Class: javassist.bytecode.analysis.Util
Type: Class
Implements: javassist.bytecode.Opcode

Methods:
- **static** boolean isReturn(int)
- **static** boolean isJsr(int)
- **static** boolean isJumpInstruction(int)
- **static** int getJumpTarget(int, CodeIterator)
- **static** boolean isGoto(int)

## Package: javassist.bytecode.annotation

### Class: javassist.bytecode.annotation.MemberValueVisitor
Type: Interface

Methods:
- void visitDoubleMemberValue(DoubleMemberValue)
- void visitByteMemberValue(ByteMemberValue)
- void visitArrayMemberValue(ArrayMemberValue)
- void visitAnnotationMemberValue(AnnotationMemberValue)
- void visitEnumMemberValue(EnumMemberValue)
- void visitClassMemberValue(ClassMemberValue)
- void visitCharMemberValue(CharMemberValue)
- void visitIntegerMemberValue(IntegerMemberValue)
- void visitShortMemberValue(ShortMemberValue)
- void visitStringMemberValue(StringMemberValue)
- void visitFloatMemberValue(FloatMemberValue)
- void visitBooleanMemberValue(BooleanMemberValue)
- void visitLongMemberValue(LongMemberValue)

### Class: javassist.bytecode.annotation.Annotation
Type: Class

Methods:
- Set getMemberNames()
- int hashCode()
- boolean equals(Object)
- Object toAnnotationType(ClassLoader, ClassPool) throws ClassNotFoundException, NoSuchClassError
- String toString()
- void addMemberValue(int, MemberValue)
- void addMemberValue(String, MemberValue)
- MemberValue getMemberValue(String)
- String getTypeName()
- void write(AnnotationsWriter) throws IOException
- **static** MemberValue createMemberValue(ConstPool, CtClass) throws NotFoundException

### Class: javassist.bytecode.annotation.AnnotationImpl
Type: Class
Implements: java.lang.reflect.InvocationHandler

Methods:
- Annotation getAnnotation()
- int hashCode()
- Object invoke(Object, Method, Object[]) throws Throwable
- String getTypeName()
- **static** Object make(ClassLoader, Class, ClassPool, Annotation) throws IllegalArgumentException

### Class: javassist.bytecode.annotation.AnnotationMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- Annotation getValue()
- void setValue(Annotation)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.AnnotationsWriter
Type: Class

Methods:
- void annotation(String, int) throws IOException
- void annotation(int, int) throws IOException
- void memberValuePair(String) throws IOException
- void memberValuePair(int) throws IOException
- void enumConstValue(String, String) throws IOException
- void enumConstValue(int, int) throws IOException
- ConstPool getConstPool()
- void classInfoIndex(String) throws IOException
- void classInfoIndex(int) throws IOException
- void constValueIndex(boolean) throws IOException
- void constValueIndex(byte) throws IOException
- void constValueIndex(char) throws IOException
- void constValueIndex(short) throws IOException
- void constValueIndex(int) throws IOException
- void constValueIndex(long) throws IOException
- void constValueIndex(float) throws IOException
- void constValueIndex(double) throws IOException
- void constValueIndex(String) throws IOException
- void constValueIndex(int, int) throws IOException
- void numAnnotations(int) throws IOException
- void numParameters(int) throws IOException
- void annotationValue() throws IOException
- void arrayValue(int) throws IOException
- void close() throws IOException

### Class: javassist.bytecode.annotation.ArrayMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- MemberValue[] getValue()
- MemberValue getType()
- void setValue(MemberValue[])
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.BooleanMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- boolean getValue()
- void setValue(boolean)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.ByteMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- byte getValue()
- void setValue(byte)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.CharMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- char getValue()
- void setValue(char)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.ClassMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- String getValue()
- void setValue(String)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.DoubleMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- double getValue()
- void setValue(double)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.EnumMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- String getValue()
- String getType()
- void setValue(String)
- String toString()
- void setType(String)
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.FloatMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- float getValue()
- void setValue(float)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.IntegerMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- int getValue()
- void setValue(int)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.LongMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- long getValue()
- void setValue(long)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.MemberValue
Type: Abstract Class

Methods:
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.NoSuchClassError
Type: Class
Extends: java.lang.Error

Methods:
- String getClassName()

### Class: javassist.bytecode.annotation.ShortMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- short getValue()
- void setValue(short)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.StringMemberValue
Type: Class
Extends: javassist.bytecode.annotation.MemberValue

Methods:
- String getValue()
- void setValue(String)
- String toString()
- void write(AnnotationsWriter) throws IOException
- void accept(MemberValueVisitor)

### Class: javassist.bytecode.annotation.TypeAnnotationsWriter
Type: Class
Extends: javassist.bytecode.annotation.AnnotationsWriter

Methods:
- void typePathPath(int, int) throws IOException
- void typeArgumentTarget(int, int, int) throws IOException
- void typeParameterTarget(int, int) throws IOException
- void catchTarget(int) throws IOException
- void formalParameterTarget(int) throws IOException
- void supertypeTarget(int) throws IOException
- void localVarTargetTable(int, int, int) throws IOException
- void typePath(int) throws IOException
- void emptyTarget(int) throws IOException
- void offsetTarget(int, int) throws IOException
- void numAnnotations(int) throws IOException
- void typeParameterBoundTarget(int, int, int) throws IOException
- void localVarTarget(int, int) throws IOException
- void throwsTarget(int) throws IOException

## Package: javassist.bytecode.stackmap

### Class: javassist.bytecode.stackmap.TypeTag
Type: Interface

No public methods found

### Class: javassist.bytecode.stackmap.BasicBlock
Type: Class

Methods:
- **static** BasicBlock find(BasicBlock[], int) throws BadBytecode
- String toString()

### Class: javassist.bytecode.stackmap.BasicBlock$Catch
Type: Class

No public methods found

### Class: javassist.bytecode.stackmap.BasicBlock$Maker
Type: Class

Methods:
- BasicBlock[] make(MethodInfo) throws BadBytecode
- BasicBlock[] make(CodeIterator, int, int, ExceptionTable) throws BadBytecode

### Class: javassist.bytecode.stackmap.MapMaker
Type: Class
Extends: javassist.bytecode.stackmap.Tracer

Methods:
- StackMap toStackMap2(ConstPool, TypedBlock[])
- **static** StackMap make2(ClassPool, MethodInfo) throws BadBytecode
- StackMapTable toStackMap(TypedBlock[])
- **static** StackMapTable make(ClassPool, MethodInfo) throws BadBytecode

### Class: javassist.bytecode.stackmap.Tracer
Type: Abstract Class
Implements: javassist.bytecode.stackmap.TypeTag

No public methods found

### Class: javassist.bytecode.stackmap.TypeData
Type: Abstract Class

Methods:
- boolean isUninit()
- **static** CtClass commonSuperClass(CtClass, CtClass) throws NotFoundException
- TypeData getArrayType(int) throws NotFoundException
- String getName()
- TypeData$BasicType isBasicType()
- **static** CtClass commonSuperClassEx(CtClass, CtClass) throws NotFoundException
- **static** void aastore(TypeData, TypeData, ClassPool) throws BadBytecode
- void setType(String, ClassPool) throws BadBytecode
- boolean eq(TypeData)
- int dfs(List, int, ClassPool) throws NotFoundException
- boolean is2WordType()
- int getTypeData(ConstPool)
- int getTypeTag()
- String toString()
- TypeData join()
- boolean isNullType()
- **static** TypeData[] make(int)
- void constructorCalled(int)

### Class: javassist.bytecode.stackmap.TypeData$AbsTypeVar
Type: Abstract Class
Extends: javassist.bytecode.stackmap.TypeData

Methods:
- void merge(TypeData)
- int getTypeData(ConstPool)
- int getTypeTag()
- boolean eq(TypeData)

### Class: javassist.bytecode.stackmap.TypeData$ArrayElement
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$AbsTypeVar

Methods:
- int dfs(List, int, ClassPool) throws NotFoundException
- TypeData getArrayType(int) throws NotFoundException
- TypeData$AbsTypeVar arrayType()
- String getName()
- void merge(TypeData)
- boolean is2WordType()
- TypeData$BasicType isBasicType()
- void setType(String, ClassPool) throws BadBytecode
- **static** TypeData make(TypeData) throws BadBytecode

### Class: javassist.bytecode.stackmap.TypeData$ArrayType
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$AbsTypeVar

Methods:
- int dfs(List, int, ClassPool) throws NotFoundException
- TypeData getArrayType(int) throws NotFoundException
- String getName()
- void merge(TypeData)
- **static** String typeName(String)
- boolean is2WordType()
- TypeData$BasicType isBasicType()
- void setType(String, ClassPool) throws BadBytecode
- TypeData$AbsTypeVar elementType()

### Class: javassist.bytecode.stackmap.TypeData$BasicType
Type: Class
Extends: javassist.bytecode.stackmap.TypeData

Methods:
- TypeData getArrayType(int) throws NotFoundException
- String getName()
- char getDecodedName()
- boolean is2WordType()
- TypeData$BasicType isBasicType()
- int getTypeData(ConstPool)
- int getTypeTag()
- TypeData join()
- void setType(String, ClassPool) throws BadBytecode
- boolean eq(TypeData)

### Class: javassist.bytecode.stackmap.TypeData$ClassName
Type: Class
Extends: javassist.bytecode.stackmap.TypeData

Methods:
- TypeData getArrayType(int) throws NotFoundException
- String getName()
- boolean is2WordType()
- TypeData$BasicType isBasicType()
- int getTypeData(ConstPool)
- int getTypeTag()
- void setType(String, ClassPool) throws BadBytecode
- boolean eq(TypeData)

### Class: javassist.bytecode.stackmap.TypeData$NullType
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$ClassName

Methods:
- TypeData getArrayType(int)
- int getTypeData(ConstPool)
- int getTypeTag()
- boolean isNullType()

### Class: javassist.bytecode.stackmap.TypeData$TypeVar
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$AbsTypeVar

Methods:
- int dfs(List, int, ClassPool) throws NotFoundException
- boolean isUninit()
- TypeData getArrayType(int) throws NotFoundException
- String getName()
- void merge(TypeData)
- boolean is2WordType()
- TypeData$BasicType isBasicType()
- int getTypeData(ConstPool)
- int getTypeTag()
- void setType(String, ClassPool) throws BadBytecode
- boolean isNullType()

### Class: javassist.bytecode.stackmap.TypeData$UninitData
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$ClassName

Methods:
- boolean isUninit()
- int offset()
- int getTypeData(ConstPool)
- int getTypeTag()
- TypeData join()
- TypeData$UninitData copy()
- boolean eq(TypeData)
- void constructorCalled(int)

### Class: javassist.bytecode.stackmap.TypeData$UninitThis
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$UninitData

Methods:
- int getTypeData(ConstPool)
- int getTypeTag()
- TypeData$UninitData copy()

### Class: javassist.bytecode.stackmap.TypeData$UninitTypeVar
Type: Class
Extends: javassist.bytecode.stackmap.TypeData$AbsTypeVar

Methods:
- boolean isUninit()
- TypeData getArrayType(int) throws NotFoundException
- String getName()
- int offset()
- void merge(TypeData)
- boolean is2WordType()
- TypeData$BasicType isBasicType()
- int getTypeData(ConstPool)
- int getTypeTag()
- TypeData join()
- void setType(String, ClassPool) throws BadBytecode
- boolean eq(TypeData)
- void constructorCalled(int)

### Class: javassist.bytecode.stackmap.TypedBlock
Type: Class
Extends: javassist.bytecode.stackmap.BasicBlock

Methods:
- void setStackMap(int, TypeData[], int, TypeData[]) throws BadBytecode
- **static** String getRetType(String)
- void resetNumLocals()
- boolean alreadySet()
- **static** TypedBlock[] makeBlocks(MethodInfo, CodeAttribute, boolean) throws BadBytecode

### Class: javassist.bytecode.stackmap.TypedBlock$Maker
Type: Class
Extends: javassist.bytecode.stackmap.BasicBlock$Maker

No public methods found

## Package: javassist.compiler

### Class: javassist.compiler.ProceedHandler
Type: Interface

Methods:
- void setReturnType(JvstTypeChecker, ASTList) throws CompileError
- void doit(JvstCodeGen, Bytecode, ASTList) throws CompileError

### Class: javassist.compiler.TokenId
Type: Interface

No public methods found

### Class: javassist.compiler.AccessorMaker
Type: Class

Methods:
- String getMethodAccessor(String, String, String, MethodInfo) throws CompileError
- MethodInfo getFieldSetter(FieldInfo, boolean) throws CompileError
- String getConstructor(CtClass, String, MethodInfo) throws CompileError
- MethodInfo getFieldGetter(FieldInfo, boolean) throws CompileError

### Class: javassist.compiler.CodeGen
Type: Abstract Class
Extends: javassist.compiler.ast.Visitor
Implements: javassist.bytecode.Opcode, javassist.compiler.TokenId

Methods:
- void atExpr(Expr) throws CompileError
- void atBinExpr(BinExpr) throws CompileError
- void atClassObject(Expr) throws CompileError
- void atIntConst(IntConst) throws CompileError
- void atSymbol(Symbol) throws CompileError
- void setTypeChecker(TypeChecker)
- void atStmnt(Stmnt) throws CompileError
- void atDoubleConst(DoubleConst) throws CompileError
- void atAssignExpr(AssignExpr) throws CompileError
- boolean compileBooleanExpr(boolean, ASTree) throws CompileError
- void atKeyword(Keyword) throws CompileError
- void atFieldDecl(FieldDecl) throws CompileError
- void compileExpr(ASTree) throws CompileError
- void atMethodBody(Stmnt, boolean, boolean) throws CompileError
- void atCallExpr(CallExpr) throws CompileError
- void atASTList(ASTList) throws CompileError
- void atMethodDecl(MethodDecl) throws CompileError
- void atMember(Member) throws CompileError
- void atPair(Pair) throws CompileError
- void atCastExpr(CastExpr) throws CompileError
- void atNewExpr(NewExpr) throws CompileError
- void atDeclarator(Declarator) throws CompileError
- void doTypeCheck(ASTree) throws CompileError
- void atInstanceOfExpr(InstanceOfExpr) throws CompileError
- void atStringL(StringL) throws CompileError
- void atArrayRead(ASTree, ASTree) throws CompileError
- **static** boolean is2word(int, int)
- void setMaxLocals(int)
- void atVariable(Variable) throws CompileError
- void atCondExpr(CondExpr) throws CompileError
- void atArrayInit(ArrayInit) throws CompileError
- void atArrayPlusPlus(int, boolean, Expr, boolean) throws CompileError
- int getMaxLocals()

### Class: javassist.compiler.CodeGen$ReturnHook
Type: Abstract Class

No public methods found

### Class: javassist.compiler.CompileError
Type: Class
Extends: java.lang.Exception

Methods:
- Lex getLex()
- String getMessage()
- String toString()

### Class: javassist.compiler.Javac
Type: Class

Methods:
- boolean recordParamNames(CodeAttribute, int) throws CompileError
- Bytecode getBytecode()
- void recordStaticProceed(String, String) throws CompileError
- void recordType(CtClass)
- int recordReturnType(CtClass, boolean) throws CompileError
- int recordVariable(CtClass, String) throws CompileError
- Bytecode compileBody(CtBehavior, String) throws CompileError
- void compileStmnt(String) throws CompileError
- void recordProceed(String, String) throws CompileError
- void recordProceed(ProceedHandler)
- void compileExpr(String) throws CompileError
- void compileExpr(ASTree) throws CompileError
- CtMember compile(String) throws CompileError
- boolean recordLocalVariables(CodeAttribute, int) throws CompileError
- void setMaxLocals(int)
- int recordParams(CtClass[], boolean) throws CompileError
- int recordParams(String, CtClass[], boolean, int, boolean) throws CompileError
- void recordSpecialProceed(String, String, String, String, int) throws CompileError
- **static** ASTree parseExpr(String, SymbolTable) throws CompileError

### Class: javassist.compiler.Javac$CtFieldWithInit
Type: Class
Extends: javassist.CtField

No public methods found

### Class: javassist.compiler.JvstCodeGen
Type: Class
Extends: javassist.compiler.MemberCodeGen

Methods:
- void atMember(Member) throws CompileError
- void setProceedHandler(ProceedHandler, String)
- void atCastExpr(CastExpr) throws CompileError
- void recordType(CtClass)
- void addNullIfVoid()
- int getMethodArgsLength(ASTList)
- int recordReturnType(CtClass, String, String, SymbolTable) throws CompileError
- void setType(CtClass) throws CompileError
- int recordVariable(CtClass, String, SymbolTable) throws CompileError
- void recordVariable(String, String, int, SymbolTable) throws CompileError
- void doNumCast(CtClass) throws CompileError
- boolean isParamListName(ASTList)
- void atMethodArgs(ASTList, int[], int[], String[]) throws CompileError
- int recordParams(CtClass[], boolean, String, String, String, SymbolTable) throws CompileError
- int recordParams(CtClass[], boolean, String, String, String, boolean, int, String, SymbolTable) throws CompileError
- void atCallExpr(CallExpr) throws CompileError
- **static** int compileParameterList(Bytecode, CtClass[], int)

### Class: javassist.compiler.JvstTypeChecker
Type: Class
Extends: javassist.compiler.TypeChecker

Methods:
- boolean isParamListName(ASTList)
- void atMember(Member) throws CompileError
- void atMethodArgs(ASTList, int[], int[], String[]) throws CompileError
- void atCastExpr(CastExpr) throws CompileError
- void addNullIfVoid()
- int getMethodArgsLength(ASTList)
- void atCallExpr(CallExpr) throws CompileError
- void setType(CtClass) throws CompileError

### Class: javassist.compiler.KeywordTable
Type: Class
Extends: java.util.HashMap

Methods:
- int lookup(String)
- void append(String, int)

### Class: javassist.compiler.Lex
Type: Class
Implements: javassist.compiler.TokenId

Methods:
- long getLong()
- int lookAhead()
- int lookAhead(int)
- int get()
- double getDouble()
- String getString()
- String getTextAround()

### Class: javassist.compiler.MemberCodeGen
Type: Class
Extends: javassist.compiler.CodeGen

Methods:
- CtClass[] makeThrowsList(MethodDecl) throws CompileError
- void atMember(Member) throws CompileError
- CtClass[] makeParamList(MethodDecl) throws CompileError
- void atNewArrayExpr(NewExpr) throws CompileError
- void atMethodArgs(ASTList, int[], int[], String[]) throws CompileError
- int getMajorVersion()
- void atNewExpr(NewExpr) throws CompileError
- int getMethodArgsLength(ASTList)
- void atCallExpr(CallExpr) throws CompileError
- void atArrayInit(ArrayInit) throws CompileError
- CtClass getThisClass()
- void atMethodCallCore(CtClass, String, ASTList, boolean, boolean, int, MemberResolver$Method) throws CompileError
- void setThisMethod(CtMethod)

### Class: javassist.compiler.MemberResolver
Type: Class
Implements: javassist.compiler.TokenId

Methods:
- CtField lookupField(String, Symbol) throws CompileError
- CtField lookupFieldByJvmName(String, Symbol) throws CompileError
- MemberResolver$Method lookupMethod(CtClass, CtClass, MethodInfo, String, int[], int[], String[]) throws CompileError
- CtClass lookupClass(Declarator) throws CompileError
- CtClass lookupClass(int, int, String) throws CompileError
- CtClass lookupClass(String, boolean) throws CompileError
- ClassPool getClassPool()
- String resolveJvmClassName(String) throws CompileError
- **static** String jvmToJavaName(String)
- CtClass lookupClassByJvmName(String) throws CompileError
- CtField lookupFieldByJvmName2(String, Symbol, ASTree) throws NoFieldException
- **static** int getModifiers(ASTList)
- **static** String javaToJvmName(String)
- **static** int getInvalidMapSize()
- **static** int descToType(char) throws CompileError
- **static** CtClass getSuperInterface(CtClass, String) throws CompileError
- **static** CtClass getSuperclass(CtClass) throws CompileError
- String resolveClassName(ASTList) throws CompileError
- CtClass lookupClassByName(ASTList) throws CompileError

### Class: javassist.compiler.MemberResolver$Method
Type: Class

Methods:
- boolean isStatic()

### Class: javassist.compiler.NoFieldException
Type: Class
Extends: javassist.compiler.CompileError

Methods:
- ASTree getExpr()
- String getField()

### Class: javassist.compiler.Parser
Type: Class
Implements: javassist.compiler.TokenId

Methods:
- ASTList parseMember(SymbolTable) throws CompileError
- Stmnt parseStatement(SymbolTable) throws CompileError
- ASTList parseMember1(SymbolTable) throws CompileError
- boolean hasMore()
- MethodDecl parseMethod2(SymbolTable, MethodDecl) throws CompileError
- ASTree parseExpression(SymbolTable) throws CompileError

### Class: javassist.compiler.SymbolTable
Type: Class
Extends: java.util.HashMap

Methods:
- Declarator lookup(String)
- SymbolTable getParent()
- void append(String, Declarator)

### Class: javassist.compiler.SyntaxError
Type: Class
Extends: javassist.compiler.CompileError

No public methods found

### Class: javassist.compiler.TypeChecker
Type: Class
Extends: javassist.compiler.ast.Visitor
Implements: javassist.bytecode.Opcode, javassist.compiler.TokenId

Methods:
- void atMember(Member) throws CompileError
- void atExpr(Expr) throws CompileError
- **static** ASTree getConstantFieldValue(CtField)
- void atNewArrayExpr(NewExpr) throws CompileError
- void atBinExpr(BinExpr) throws CompileError
- void atCastExpr(CastExpr) throws CompileError
- void atClassObject(Expr) throws CompileError
- void atNewExpr(NewExpr) throws CompileError
- void atIntConst(IntConst) throws CompileError
- int getMethodArgsLength(ASTList)
- void atInstanceOfExpr(InstanceOfExpr) throws CompileError
- void atDoubleConst(DoubleConst) throws CompileError
- void atAssignExpr(AssignExpr) throws CompileError
- void atStringL(StringL) throws CompileError
- void atArrayRead(ASTree, ASTree) throws CompileError
- MemberResolver$Method atMethodCallCore(CtClass, String, ASTList) throws CompileError
- void setThisMethod(MethodInfo)
- void atKeyword(Keyword) throws CompileError
- void atMethodArgs(ASTList, int[], int[], String[]) throws CompileError
- void atArrayLength(Expr) throws CompileError
- void atCallExpr(CallExpr) throws CompileError
- void atVariable(Variable) throws CompileError
- void atCondExpr(CondExpr) throws CompileError
- void atArrayInit(ArrayInit) throws CompileError

## Package: javassist.compiler.ast

### Class: javassist.compiler.ast.ASTList
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- void setTail(ASTList)
- void setLeft(ASTree)
- ASTList tail()
- int length()
- **static** int length(ASTList)
- void setHead(ASTree)
- boolean subst(ASTree, ASTree)
- **static** ASTList concat(ASTList, ASTList)
- void accept(Visitor) throws CompileError
- ASTree head()
- ASTree getRight()
- ASTList sublist(int)
- void setRight(ASTree)
- String toString()
- **static** ASTList make(ASTree, ASTree, ASTree)
- **static** ASTList append(ASTList, ASTree)
- ASTree getLeft()

### Class: javassist.compiler.ast.ASTree
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- ASTree getRight()
- void setLeft(ASTree)
- void setRight(ASTree)
- String toString()
- void accept(Visitor) throws CompileError
- ASTree getLeft()

### Class: javassist.compiler.ast.ArrayInit
Type: Class
Extends: javassist.compiler.ast.ASTList

Methods:
- int size()
- String getTag()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.AssignExpr
Type: Class
Extends: javassist.compiler.ast.Expr

Methods:
- **static** AssignExpr makeAssign(int, ASTree, ASTree)
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.BinExpr
Type: Class
Extends: javassist.compiler.ast.Expr

Methods:
- **static** BinExpr makeBin(int, ASTree, ASTree)
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.CallExpr
Type: Class
Extends: javassist.compiler.ast.Expr

Methods:
- void setMethod(MemberResolver$Method)
- MemberResolver$Method getMethod()
- **static** CallExpr makeCall(ASTree, ASTree)
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.CastExpr
Type: Class
Extends: javassist.compiler.ast.ASTList
Implements: javassist.compiler.TokenId

Methods:
- int getType()
- ASTList getClassName()
- String getTag()
- ASTree getOprand()
- void setOprand(ASTree)
- void accept(Visitor) throws CompileError
- int getArrayDim()

### Class: javassist.compiler.ast.CondExpr
Type: Class
Extends: javassist.compiler.ast.ASTList

Methods:
- void setElse(ASTree)
- ASTree condExpr()
- ASTree elseExpr()
- ASTree thenExpr()
- String getTag()
- void setCond(ASTree)
- void accept(Visitor) throws CompileError
- void setThen(ASTree)

### Class: javassist.compiler.ast.Declarator
Type: Class
Extends: javassist.compiler.ast.ASTList
Implements: javassist.compiler.TokenId

Methods:
- void setLocalVar(int)
- **static** String astToClassName(ASTList, char)
- void setVariable(Symbol)
- void setClassName(String)
- String getTag()
- Symbol getVariable()
- void addArrayDim(int)
- void accept(Visitor) throws CompileError
- ASTree getInitializer()
- int getArrayDim()
- int getType()
- int getLocalVar()
- String getClassName()
- Declarator make(Symbol, int, ASTree)

### Class: javassist.compiler.ast.DoubleConst
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- ASTree compute(int, ASTree)
- void set(double)
- int getType()
- double get()
- String toString()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Expr
Type: Class
Extends: javassist.compiler.ast.ASTList
Implements: javassist.compiler.TokenId

Methods:
- String getName()
- ASTree oprand2()
- void setOperator(int)
- void setOprand1(ASTree)
- ASTree oprand1()
- **static** Expr make(int, ASTree, ASTree)
- **static** Expr make(int, ASTree)
- int getOperator()
- void accept(Visitor) throws CompileError
- void setOprand2(ASTree)

### Class: javassist.compiler.ast.FieldDecl
Type: Class
Extends: javassist.compiler.ast.ASTList

Methods:
- ASTree getInit()
- Declarator getDeclarator()
- ASTList getModifiers()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.InstanceOfExpr
Type: Class
Extends: javassist.compiler.ast.CastExpr

Methods:
- String getTag()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.IntConst
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- ASTree compute(int, ASTree)
- void set(long)
- int getType()
- long get()
- String toString()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Keyword
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- int get()
- String toString()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Member
Type: Class
Extends: javassist.compiler.ast.Symbol

Methods:
- void setField(CtField)
- CtField getField()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.MethodDecl
Type: Class
Extends: javassist.compiler.ast.ASTList

Methods:
- Declarator getReturn()
- Stmnt getBody()
- boolean isConstructor()
- ASTList getThrows()
- ASTList getModifiers()
- ASTList getParams()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.NewExpr
Type: Class
Extends: javassist.compiler.ast.ASTList
Implements: javassist.compiler.TokenId

Methods:
- int getArrayType()
- ASTList getArguments()
- ASTList getArraySize()
- boolean isArray()
- ASTList getClassName()
- **static** NewExpr makeObjectArray(ASTList, ASTList, ArrayInit)
- void accept(Visitor) throws CompileError
- ArrayInit getInitializer()

### Class: javassist.compiler.ast.Pair
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- ASTree getRight()
- void setLeft(ASTree)
- void setRight(ASTree)
- String toString()
- ASTree getLeft()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Stmnt
Type: Class
Extends: javassist.compiler.ast.ASTList
Implements: javassist.compiler.TokenId

Methods:
- **static** Stmnt make(int, ASTree, ASTree)
- **static** Stmnt make(int, ASTree, ASTree, ASTree)
- int getOperator()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.StringL
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- String get()
- String toString()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Symbol
Type: Class
Extends: javassist.compiler.ast.ASTree

Methods:
- String get()
- String toString()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Variable
Type: Class
Extends: javassist.compiler.ast.Symbol

Methods:
- Declarator getDeclarator()
- String toString()
- void accept(Visitor) throws CompileError

### Class: javassist.compiler.ast.Visitor
Type: Class

Methods:
- void atMember(Member) throws CompileError
- void atExpr(Expr) throws CompileError
- void atPair(Pair) throws CompileError
- void atBinExpr(BinExpr) throws CompileError
- void atCastExpr(CastExpr) throws CompileError
- void atNewExpr(NewExpr) throws CompileError
- void atDeclarator(Declarator) throws CompileError
- void atIntConst(IntConst) throws CompileError
- void atSymbol(Symbol) throws CompileError
- void atInstanceOfExpr(InstanceOfExpr) throws CompileError
- void atStmnt(Stmnt) throws CompileError
- void atDoubleConst(DoubleConst) throws CompileError
- void atAssignExpr(AssignExpr) throws CompileError
- void atStringL(StringL) throws CompileError
- void atKeyword(Keyword) throws CompileError
- void atFieldDecl(FieldDecl) throws CompileError
- void atCallExpr(CallExpr) throws CompileError
- void atVariable(Variable) throws CompileError
- void atCondExpr(CondExpr) throws CompileError
- void atArrayInit(ArrayInit) throws CompileError
- void atASTList(ASTList) throws CompileError
- void atMethodDecl(MethodDecl) throws CompileError

## Package: javassist.convert

### Class: javassist.convert.TransformAccessArrayField
Type: Class
Extends: javassist.convert.Transformer

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool) throws BadBytecode
- void initialize(ConstPool, CtClass, MethodInfo) throws CannotCompileException
- void clean()

### Class: javassist.convert.TransformAfter
Type: Class
Extends: javassist.convert.TransformBefore

No public methods found

### Class: javassist.convert.TransformBefore
Type: Class
Extends: javassist.convert.TransformCall

Methods:
- void initialize(ConstPool, CodeAttribute)
- int extraLocals()

### Class: javassist.convert.TransformCall
Type: Class
Extends: javassist.convert.Transformer

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool) throws BadBytecode
- void initialize(ConstPool, CodeAttribute)

### Class: javassist.convert.TransformCallToStatic
Type: Class
Extends: javassist.convert.TransformCall

No public methods found

### Class: javassist.convert.TransformFieldAccess
Type: Class
Extends: javassist.convert.Transformer

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool)
- void initialize(ConstPool, CodeAttribute)

### Class: javassist.convert.TransformNew
Type: Class
Extends: javassist.convert.Transformer

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool) throws CannotCompileException
- void initialize(ConstPool, CodeAttribute)

### Class: javassist.convert.TransformNewClass
Type: Class
Extends: javassist.convert.Transformer

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool) throws CannotCompileException
- void initialize(ConstPool, CodeAttribute)

### Class: javassist.convert.TransformReadField
Type: Class
Extends: javassist.convert.Transformer

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool) throws BadBytecode

### Class: javassist.convert.TransformWriteField
Type: Class
Extends: javassist.convert.TransformReadField

Methods:
- int transform(CtClass, int, CodeIterator, ConstPool) throws BadBytecode

### Class: javassist.convert.Transformer
Type: Abstract Class
Implements: javassist.bytecode.Opcode

Methods:
- int extraStack()
- int transform(CtClass, int, CodeIterator, ConstPool) throws CannotCompileException, BadBytecode
- void initialize(ConstPool, CodeAttribute)
- void initialize(ConstPool, CtClass, MethodInfo) throws CannotCompileException
- Transformer getNext()
- void clean()
- int extraLocals()

## Package: javassist.expr

### Class: javassist.expr.Cast
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- CtClass getType() throws NotFoundException
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- CtBehavior where()
- String getFileName()

### Class: javassist.expr.ConstructorCall
Type: Class
Extends: javassist.expr.MethodCall

Methods:
- String getMethodName()
- boolean isSuper()
- CtMethod getMethod() throws NotFoundException
- CtConstructor getConstructor() throws NotFoundException

### Class: javassist.expr.Expr
Type: Abstract Class
Implements: javassist.bytecode.Opcode

Methods:
- int getLineNumber()
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- void replace(String, ExprEditor) throws CannotCompileException
- CtBehavior where()
- CtClass getEnclosingClass()
- String getFileName()
- int indexOfBytecode()

### Class: javassist.expr.ExprEditor
Type: Class

Methods:
- void edit(NewExpr) throws CannotCompileException
- void edit(NewArray) throws CannotCompileException
- void edit(MethodCall) throws CannotCompileException
- void edit(ConstructorCall) throws CannotCompileException
- void edit(FieldAccess) throws CannotCompileException
- void edit(Instanceof) throws CannotCompileException
- void edit(Cast) throws CannotCompileException
- void edit(Handler) throws CannotCompileException
- boolean doit(CtClass, MethodInfo) throws CannotCompileException

### Class: javassist.expr.FieldAccess
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- boolean isStatic()
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- CtField getField() throws NotFoundException
- boolean isWriter()
- String getSignature()
- CtBehavior where()
- String getClassName()
- String getFieldName()
- String getFileName()
- boolean isReader()

### Class: javassist.expr.Handler
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- CtClass getType() throws NotFoundException
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- CtBehavior where()
- boolean isFinally()
- String getFileName()
- void insertBefore(String) throws CannotCompileException

### Class: javassist.expr.Instanceof
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- CtClass getType() throws NotFoundException
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- CtBehavior where()
- String getFileName()

### Class: javassist.expr.MethodCall
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- String getMethodName()
- boolean isSuper()
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- String getSignature()
- CtBehavior where()
- CtMethod getMethod() throws NotFoundException
- String getClassName()
- String getFileName()

### Class: javassist.expr.NewArray
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- CtClass[] mayThrow()
- CtClass getComponentType() throws NotFoundException
- void replace(String) throws CannotCompileException
- int getDimension()
- CtBehavior where()
- int getCreatedDimensions()
- String getFileName()

### Class: javassist.expr.NewExpr
Type: Class
Extends: javassist.expr.Expr

Methods:
- int getLineNumber()
- CtClass[] mayThrow()
- void replace(String) throws CannotCompileException
- String getSignature()
- CtBehavior where()
- String getClassName()
- CtConstructor getConstructor() throws NotFoundException
- String getFileName()

## Package: javassist.util.proxy

### Class: javassist.util.proxy.DefineClassHelper
Type: Class

Methods:
- **static** Class toClass(String, Class, ClassLoader, ProtectionDomain, byte[]) throws CannotCompileException
- **static** Class toClass(Class, byte[]) throws CannotCompileException
- **static** Class toClass(MethodHandles$Lookup, byte[]) throws CannotCompileException

### Class: javassist.util.proxy.DefinePackageHelper
Type: Class

Methods:
- **static** void definePackage(String, ClassLoader) throws CannotCompileException

## Package: javax.annotation

### Class: javax.annotation.Nonnull
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- When when()

### Class: javax.annotation.Nullable
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: javax.annotation.Nonnull$Checker
Type: Class
Implements: javax.annotation.meta.TypeQualifierValidator

Methods:
- When forConstantValue(Nonnull, Object)
- When forConstantValue(Annotation, Object)

## Package: javax.annotation.meta

### Class: javax.annotation.meta.TypeQualifier
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class applicableTo()

### Class: javax.annotation.meta.TypeQualifierNickname
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: javax.annotation.meta.TypeQualifierValidator
Type: Interface

Methods:
- When forConstantValue(Annotation, Object)

### Class: javax.annotation.meta.When
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** When valueOf(String)
- **static** When[] values()

## Package: org.apache.commons.collections4

### Class: org.apache.commons.collections4.BoundedMap
Type: Interface
Implements: org.apache.commons.collections4.IterableMap

Methods:
- int maxSize()
- boolean isFull()

### Class: org.apache.commons.collections4.Get
Type: Interface

Methods:
- int size()
- Set entrySet()
- boolean containsKey(Object)
- Collection values()
- Object get(Object)
- boolean isEmpty()
- Set keySet()
- Object remove(Object)
- boolean containsValue(Object)

### Class: org.apache.commons.collections4.IterableGet
Type: Interface
Implements: org.apache.commons.collections4.Get

Methods:
- MapIterator mapIterator()

### Class: org.apache.commons.collections4.IterableMap
Type: Interface
Implements: java.util.Map, org.apache.commons.collections4.Put, org.apache.commons.collections4.IterableGet

No public methods found

### Class: org.apache.commons.collections4.KeyValue
Type: Interface

Methods:
- Object getValue()
- Object getKey()

### Class: org.apache.commons.collections4.MapIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- Object next()
- Object getValue()
- Object getKey()
- Object setValue(Object)
- boolean hasNext()
- void remove()

### Class: org.apache.commons.collections4.OrderedIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- Object previous()
- boolean hasPrevious()

### Class: org.apache.commons.collections4.OrderedMap
Type: Interface
Implements: org.apache.commons.collections4.IterableMap

Methods:
- OrderedMapIterator mapIterator()
- MapIterator mapIterator()
- Object previousKey(Object)
- Object firstKey()
- Object lastKey()
- Object nextKey(Object)

### Class: org.apache.commons.collections4.OrderedMapIterator
Type: Interface
Implements: org.apache.commons.collections4.MapIterator, org.apache.commons.collections4.OrderedIterator

Methods:
- Object previous()
- boolean hasPrevious()

### Class: org.apache.commons.collections4.Put
Type: Interface

Methods:
- void putAll(Map)
- void clear()
- Object put(Object, Object)

### Class: org.apache.commons.collections4.ResettableIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- void reset()

## Package: org.apache.commons.collections4.iterators

### Class: org.apache.commons.collections4.iterators.AbstractEmptyMapIterator
Type: Abstract Class
Extends: org.apache.commons.collections4.iterators.AbstractEmptyIterator

Methods:
- Object next()
- void add(Object)
- Object getValue()
- Object getKey()
- void set(Object)
- Object previous()
- Object setValue(Object)
- boolean hasPrevious()
- void reset()
- boolean hasNext()
- int nextIndex()
- int previousIndex()
- void remove()

### Class: org.apache.commons.collections4.iterators.EmptyIterator
Type: Class
Extends: org.apache.commons.collections4.iterators.AbstractEmptyIterator
Implements: org.apache.commons.collections4.ResettableIterator

Methods:
- Object next()
- void add(Object)
- **static** Iterator emptyIterator()
- void set(Object)
- Object previous()
- boolean hasPrevious()
- void reset()
- **static** ResettableIterator resettableEmptyIterator()
- boolean hasNext()
- int nextIndex()
- int previousIndex()
- void remove()

### Class: org.apache.commons.collections4.iterators.EmptyMapIterator
Type: Class
Extends: org.apache.commons.collections4.iterators.AbstractEmptyMapIterator
Implements: org.apache.commons.collections4.MapIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- **static** MapIterator emptyMapIterator()

### Class: org.apache.commons.collections4.iterators.EmptyOrderedIterator
Type: Class
Extends: org.apache.commons.collections4.iterators.AbstractEmptyIterator
Implements: org.apache.commons.collections4.OrderedIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- Object next()
- void add(Object)
- void set(Object)
- Object previous()
- boolean hasPrevious()
- void reset()
- boolean hasNext()
- int nextIndex()
- **static** OrderedIterator emptyOrderedIterator()
- int previousIndex()
- void remove()

### Class: org.apache.commons.collections4.iterators.EmptyOrderedMapIterator
Type: Class
Extends: org.apache.commons.collections4.iterators.AbstractEmptyMapIterator
Implements: org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- **static** OrderedMapIterator emptyOrderedMapIterator()

## Package: org.apache.commons.collections4.map

### Class: org.apache.commons.collections4.map.AbstractHashedMap
Type: Class
Extends: java.util.AbstractMap
Implements: org.apache.commons.collections4.IterableMap

Methods:
- Set entrySet()
- boolean containsKey(Object)
- Collection values()
- void clear()
- boolean isEmpty()
- Object remove(Object)
- Object put(Object, Object)
- boolean containsValue(Object)
- MapIterator mapIterator()
- int size()
- int hashCode()
- boolean equals(Object)
- void putAll(Map)
- Object get(Object)
- String toString()
- Set keySet()

### Class: org.apache.commons.collections4.map.AbstractHashedMap$EntrySet
Type: Class
Extends: java.util.AbstractSet

Methods:
- Iterator iterator()
- boolean contains(Object)
- int size()
- void clear()
- boolean remove(Object)

### Class: org.apache.commons.collections4.map.AbstractHashedMap$EntrySetIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractHashedMap$HashIterator
Implements: java.util.Iterator

Methods:
- Map$Entry next()
- Object next()

### Class: org.apache.commons.collections4.map.AbstractHashedMap$HashEntry
Type: Class
Implements: java.util.Map$Entry, org.apache.commons.collections4.KeyValue

Methods:
- Object getValue()
- Object getKey()
- int hashCode()
- boolean equals(Object)
- Object setValue(Object)
- String toString()

### Class: org.apache.commons.collections4.map.AbstractHashedMap$HashIterator
Type: Abstract Class

Methods:
- String toString()
- boolean hasNext()
- void remove()

### Class: org.apache.commons.collections4.map.AbstractHashedMap$HashMapIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractHashedMap$HashIterator
Implements: org.apache.commons.collections4.MapIterator

Methods:
- Object next()
- Object getValue()
- Object getKey()
- Object setValue(Object)

### Class: org.apache.commons.collections4.map.AbstractHashedMap$KeySet
Type: Class
Extends: java.util.AbstractSet

Methods:
- Iterator iterator()
- boolean contains(Object)
- int size()
- void clear()
- boolean remove(Object)

### Class: org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractHashedMap$HashIterator
Implements: java.util.Iterator

Methods:
- Object next()

### Class: org.apache.commons.collections4.map.AbstractHashedMap$Values
Type: Class
Extends: java.util.AbstractCollection

Methods:
- Iterator iterator()
- boolean contains(Object)
- int size()
- void clear()

### Class: org.apache.commons.collections4.map.AbstractHashedMap$ValuesIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractHashedMap$HashIterator
Implements: java.util.Iterator

Methods:
- Object next()

### Class: org.apache.commons.collections4.map.AbstractLinkedMap
Type: Abstract Class
Extends: org.apache.commons.collections4.map.AbstractHashedMap
Implements: org.apache.commons.collections4.OrderedMap

Methods:
- OrderedMapIterator mapIterator()
- MapIterator mapIterator()
- Object previousKey(Object)
- Object firstKey()
- Object lastKey()
- void clear()
- Object nextKey(Object)
- boolean containsValue(Object)

### Class: org.apache.commons.collections4.map.AbstractLinkedMap$EntrySetIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator
Implements: org.apache.commons.collections4.OrderedIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- Map$Entry next()
- Object next()
- Map$Entry previous()
- Object previous()

### Class: org.apache.commons.collections4.map.AbstractLinkedMap$KeySetIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator
Implements: org.apache.commons.collections4.OrderedIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- Object next()
- Object previous()

### Class: org.apache.commons.collections4.map.AbstractLinkedMap$LinkEntry
Type: Class
Extends: org.apache.commons.collections4.map.AbstractHashedMap$HashEntry

No public methods found

### Class: org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator
Type: Abstract Class

Methods:
- void reset()
- boolean hasPrevious()
- String toString()
- boolean hasNext()
- void remove()

### Class: org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator
Implements: org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- Object next()
- Object getValue()
- Object getKey()
- Object previous()
- Object setValue(Object)

### Class: org.apache.commons.collections4.map.AbstractLinkedMap$ValuesIterator
Type: Class
Extends: org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator
Implements: org.apache.commons.collections4.OrderedIterator, org.apache.commons.collections4.ResettableIterator

Methods:
- Object next()
- Object previous()

### Class: org.apache.commons.collections4.map.LRUMap
Type: Class
Extends: org.apache.commons.collections4.map.AbstractLinkedMap
Implements: org.apache.commons.collections4.BoundedMap, java.io.Serializable, java.lang.Cloneable

Methods:
- Object get(Object)
- Object get(Object, boolean)
- LRUMap clone()
- AbstractHashedMap clone()
- Object clone() throws CloneNotSupportedException
- boolean isScanUntilRemovable()
- int maxSize()
- boolean isFull()

## Package: org.reflections

### Class: org.reflections.Configuration
Type: Interface

Methods:
- boolean shouldExpandSuperTypes()
- boolean isParallel()
- Predicate getInputsFilter()
- Set getScanners()
- Set getUrls()
- ClassLoader[] getClassLoaders()

### Class: org.reflections.ReflectionUtils
Type: Abstract Class
Extends: org.reflections.util.ReflectionUtilsPredicates

Methods:
- **static** Annotation toAnnotation(Map)
- **static** Annotation toAnnotation(Map, Class)
- **static** Set getAllFields(Class, Predicate[])
- **static** Set getAllAnnotations(AnnotatedElement, Predicate[])
- **static** Object invoke(Method, Object, Object[])
- **static** Set getSuperTypes(Class)
- **static** Set getAllSuperTypes(Class, Predicate[])
- **static** Set getAnnotations(AnnotatedElement, Predicate[])
- **static** Set getFields(Class, Predicate[])
- **static** Set getAllConstructors(Class, Predicate[])
- **static** Set getConstructors(Class, Predicate[])
- **static** Map toMap(Annotation)
- **static** Map toMap(Annotation, AnnotatedElement)
- **static** Set get(QueryFunction)
- **static** Set get(QueryFunction, Predicate[])
- **static** Set getAllMethods(Class, Predicate[])
- **static** Set getMethods(Class, Predicate[])
- **static** UtilQueryBuilder extendType()

### Class: org.reflections.Reflections
Type: Class
Implements: org.reflections.util.NameHelper

Methods:
- Set getFieldsAnnotatedWith(Class)
- Set getFieldsAnnotatedWith(Annotation)
- List getMemberParameterNames(Member)
- Store getStore()
- Set getAll(Scanner)
- Set getMethodsAnnotatedWith(Class)
- Set getMethodsAnnotatedWith(Annotation)
- Set getConstructorsWithSignature(Class[])
- File save(String)
- File save(String, Serializer)
- Set getMethodsWithParameter(AnnotatedElement)
- Set getConstructorsAnnotatedWith(Class)
- Set getConstructorsAnnotatedWith(Annotation)
- Configuration getConfiguration()
- Set getConstructorsWithParameter(AnnotatedElement)
- Set getMethodsReturn(Class)
- Set getResources(String)
- Set getResources(Pattern)
- Collection getMemberUsage(Member)
- Set get(QueryFunction)
- void expandSuperTypes(Map, Map)
- Reflections merge(Reflections)
- Set getMethodsWithSignature(Class[])
- **static** Reflections collect()
- **static** Reflections collect(String, Predicate)
- **static** Reflections collect(String, Predicate, Serializer)
- Reflections collect(InputStream, Serializer)
- Reflections collect(File, Serializer)
- Set getTypesAnnotatedWith(Class)
- Set getTypesAnnotatedWith(Class, boolean)
- Set getTypesAnnotatedWith(Annotation)
- Set getTypesAnnotatedWith(Annotation, boolean)
- Set getSubTypesOf(Class)
- Set getAllTypes()

### Class: org.reflections.ReflectionsException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: org.reflections.Store
Type: Class
Extends: java.util.HashMap

No public methods found

## Package: org.reflections.scanners

### Class: org.reflections.scanners.Scanner
Type: Interface

Methods:
- Map$Entry entry(String, String)
- List entries(Collection, String)
- List entries(String, String)
- List entries(String, Collection)
- List scan(ClassFile)
- List scan(Vfs$File)
- String index()
- boolean acceptsInput(String)

### Class: org.reflections.scanners.MemberUsageScanner
Type: Class
Implements: org.reflections.scanners.Scanner

Methods:
- Scanner filterResultsBy(Predicate)
- List scan(ClassFile)
- **static** String parameterNames(MethodInfo)

### Class: org.reflections.scanners.MethodParameterNamesScanner
Type: Class
Implements: org.reflections.scanners.Scanner

Methods:
- List scan(ClassFile)

### Class: org.reflections.scanners.Scanners
Type: Enum
Extends: java.lang.Enum
Implements: org.reflections.scanners.Scanner, org.reflections.util.QueryBuilder, org.reflections.util.NameHelper

Methods:
- Scanners filterResultsBy(Predicate)
- **static** Scanners valueOf(String)
- **static** Scanners[] values()
- List scan(ClassFile)
- String index()

## Package: org.reflections.serializers

### Class: org.reflections.serializers.Serializer
Type: Interface

Methods:
- Reflections read(InputStream)
- **static** File prepareFile(String)
- File save(Reflections, String)

### Class: org.reflections.serializers.XmlSerializer
Type: Class
Implements: org.reflections.serializers.Serializer

Methods:
- Reflections read(InputStream)
- File save(Reflections, String)

## Package: org.reflections.util

### Class: org.reflections.util.NameHelper
Type: Interface

Methods:
- Collection forNames(Collection, Class, ClassLoader[])
- Collection forNames(Collection, ClassLoader[])
- AnnotatedElement forElement(String, Class, ClassLoader[])
- Object forName(String, Class, ClassLoader[])
- String toName(AnnotatedElement)
- String toName(Class)
- String toName(Constructor)
- String toName(Method)
- String toName(Field)
- Constructor forConstructor(String, ClassLoader[]) throws ReflectionsException
- Member forMember(String, ClassLoader[]) throws ReflectionsException
- Collection toNames(Collection)
- Collection toNames(AnnotatedElement[])
- Class forClass(String, ClassLoader[])
- Method forMethod(String, ClassLoader[]) throws ReflectionsException
- Field forField(String, ClassLoader[])

### Class: org.reflections.util.QueryBuilder
Type: Interface
Implements: org.reflections.util.NameHelper

Methods:
- QueryFunction with(Collection)
- QueryFunction with(String)
- QueryFunction with(AnnotatedElement[])
- QueryFunction with(Set)
- QueryFunction getAll(Collection)
- QueryFunction of(Collection)
- QueryFunction of(String)
- QueryFunction of(AnnotatedElement[])
- QueryFunction of(Set)
- QueryFunction of(QueryFunction)
- QueryFunction get(String)
- QueryFunction get(AnnotatedElement)
- QueryFunction get(Collection)
- QueryFunction getAllIncluding(String)
- QueryFunction getAllIncluding(Collection)
- String index()

### Class: org.reflections.util.QueryFunction
Type: Interface
Implements: java.util.function.Function, org.reflections.util.NameHelper

Methods:
- QueryFunction add(QueryFunction)
- QueryFunction flatMap(Function)
- QueryFunction filter(Predicate)
- **static** QueryFunction single(Object)
- QueryFunction as(Class, ClassLoader[])
- QueryFunction as()
- QueryFunction getAll(Function)
- QueryFunction getAll(Function, Function)
- **static** QueryFunction set(Collection)
- Set apply(Object)
- Object apply(Object)
- QueryFunction asClass(ClassLoader[])
- QueryFunction asString()
- QueryFunction map(Function)
- **static** QueryFunction empty()

### Class: org.reflections.util.UtilQueryBuilder
Type: Interface

Methods:
- QueryFunction of(Object)
- QueryFunction of(Object, Predicate)
- QueryFunction of(QueryFunction)
- QueryFunction get(Object)

### Class: org.reflections.util.ClasspathHelper
Type: Abstract Class

Methods:
- **static** Collection forResource(String, ClassLoader[])
- **static** ClassLoader staticClassLoader()
- **static** ClassLoader contextClassLoader()
- **static** ClassLoader[] classLoaders(ClassLoader[])
- **static** URL forWebInfClasses(ServletContext)
- **static** URL forClass(Class, ClassLoader[])
- **static** String cleanPath(URL)
- **static** Collection forManifest()
- **static** Collection forManifest(URL)
- **static** Collection forManifest(Iterable)
- **static** Collection forJavaClassPath()
- **static** Collection forClassLoader()
- **static** Collection forClassLoader(ClassLoader[])
- **static** Collection forWebInfLib(ServletContext)
- **static** Collection forPackage(String, ClassLoader[])

### Class: org.reflections.util.ConfigurationBuilder
Type: Class
Implements: org.reflections.Configuration

Methods:
- ConfigurationBuilder setClassLoaders(ClassLoader[])
- Predicate getInputsFilter()
- ConfigurationBuilder setInputsFilter(Predicate)
- ConfigurationBuilder setParallel(boolean)
- ConfigurationBuilder addUrls(Collection)
- ConfigurationBuilder addUrls(URL[])
- ConfigurationBuilder forPackage(String, ClassLoader[])
- boolean shouldExpandSuperTypes()
- ConfigurationBuilder filterInputsBy(Predicate)
- ConfigurationBuilder addScanners(Scanner[])
- **static** ConfigurationBuilder build(Object[])
- ConfigurationBuilder setUrls(Collection)
- ConfigurationBuilder setUrls(URL[])
- boolean isParallel()
- ConfigurationBuilder addClassLoaders(ClassLoader[])
- Set getScanners()
- ConfigurationBuilder forPackages(String[])
- Set getUrls()
- ClassLoader[] getClassLoaders()
- ConfigurationBuilder setScanners(Scanner[])
- ConfigurationBuilder setExpandSuperTypes(boolean)

### Class: org.reflections.util.FilterBuilder
Type: Class
Implements: java.util.function.Predicate

Methods:
- FilterBuilder add(Predicate)
- FilterBuilder include(String)
- **static** FilterBuilder parsePackages(String)
- boolean test(String)
- boolean test(Object)
- int hashCode()
- FilterBuilder excludePackage(String)
- boolean equals(Object)
- FilterBuilder excludePattern(String)
- String toString()
- FilterBuilder exclude(String)
- FilterBuilder includePackage(String)
- FilterBuilder includePattern(String)

### Class: org.reflections.util.JavassistHelper
Type: Class

Methods:
- **static** String fieldName(ClassFile, FieldInfo)
- **static** String getReturnType(MethodInfo)
- **static** Stream getConstructors(ClassFile)
- **static** List getParameters(MethodInfo)
- **static** boolean isPublic(Object)
- **static** String methodName(ClassFile, MethodInfo)
- **static** List getParametersAnnotations(MethodInfo)
- **static** List getAnnotations(Function)
- **static** Stream getMethods(ClassFile)

### Class: org.reflections.util.ReflectionUtilsPredicates
Type: Class

Methods:
- **static** boolean isAssignable(Class[], Class[])
- **static** Predicate withModifier(int)
- **static** Predicate withPublic()
- **static** Predicate withPrefix(String)
- **static** Predicate withAnnotations(Class[])
- **static** Predicate withAnnotations(Annotation[])
- **static** Predicate withAnnotation(Class)
- **static** Predicate withAnnotation(Annotation)
- **static** Predicate withStatic()
- **static** Predicate withType(Class)
- **static** Predicate withInterface()
- **static** Predicate withReturnTypeAssignableFrom(Class)
- **static** Predicate withParametersAssignableTo(Class[])
- **static** Predicate withClassModifier(int)
- **static** Predicate withReturnType(Class)
- **static** Predicate withTypeAssignableTo(Class)
- **static** Predicate withAnyParameterAnnotation(Class)
- **static** Predicate withAnyParameterAnnotation(Annotation)
- **static** Predicate withPattern(String)
- **static** Predicate withParameters(Class[])
- **static** Predicate withNamePrefix(String)
- **static** Predicate withName(String)
- **static** Predicate withParametersAssignableFrom(Class[])
- **static** Predicate withParametersCount(int)

## Package: org.reflections.vfs

### Class: org.reflections.vfs.Vfs$Dir
Type: Interface

Methods:
- String getPath()
- void close()
- Iterable getFiles()

### Class: org.reflections.vfs.Vfs$File
Type: Interface

Methods:
- String getName()
- String getRelativePath()
- InputStream openInputStream() throws IOException

### Class: org.reflections.vfs.Vfs$UrlType
Type: Interface

Methods:
- Vfs$Dir createDir(URL) throws Exception
- boolean matches(URL) throws Exception

### Class: org.reflections.vfs.JarInputDir
Type: Class
Implements: org.reflections.vfs.Vfs$Dir

Methods:
- String getPath()
- void close()
- Iterable getFiles()

### Class: org.reflections.vfs.JarInputFile
Type: Class
Implements: org.reflections.vfs.Vfs$File

Methods:
- String getName()
- String getRelativePath()
- InputStream openInputStream()

### Class: org.reflections.vfs.JbossDir
Type: Class
Implements: org.reflections.vfs.Vfs$Dir

Methods:
- String getPath()
- **static** Vfs$Dir createDir(URL) throws Exception
- Iterable getFiles()

### Class: org.reflections.vfs.JbossFile
Type: Class
Implements: org.reflections.vfs.Vfs$File

Methods:
- String getName()
- String getRelativePath()
- InputStream openInputStream() throws IOException

### Class: org.reflections.vfs.SystemDir
Type: Class
Implements: org.reflections.vfs.Vfs$Dir

Methods:
- String getPath()
- Iterable getFiles()

### Class: org.reflections.vfs.SystemFile
Type: Class
Implements: org.reflections.vfs.Vfs$File

Methods:
- String getName()
- String toString()
- String getRelativePath()
- InputStream openInputStream()

### Class: org.reflections.vfs.UrlTypeVFS
Type: Class
Implements: org.reflections.vfs.Vfs$UrlType

Methods:
- Vfs$Dir createDir(URL)
- URL adaptURL(URL) throws MalformedURLException
- boolean matches(URL)

### Class: org.reflections.vfs.Vfs
Type: Abstract Class

Methods:
- **static** void addDefaultURLTypes(Vfs$UrlType)
- **static** Iterable findFiles(Collection, String, Predicate)
- **static** Iterable findFiles(Collection, Predicate)
- **static** Vfs$Dir fromURL(URL)
- **static** Vfs$Dir fromURL(URL, List)
- **static** Vfs$Dir fromURL(URL, Vfs$UrlType[])
- **static** List getDefaultUrlTypes()
- **static** void setDefaultURLTypes(List)
- **static** File getFile(URL)

### Class: org.reflections.vfs.Vfs$DefaultUrlTypes
Type: Enum
Extends: java.lang.Enum
Implements: org.reflections.vfs.Vfs$UrlType

Methods:
- **static** Vfs$DefaultUrlTypes valueOf(String)
- **static** Vfs$DefaultUrlTypes[] values()

### Class: org.reflections.vfs.ZipDir
Type: Class
Implements: org.reflections.vfs.Vfs$Dir

Methods:
- String getPath()
- String toString()
- void close()
- Iterable getFiles()

### Class: org.reflections.vfs.ZipFile
Type: Class
Implements: org.reflections.vfs.Vfs$File

Methods:
- String getName()
- String toString()
- String getRelativePath()
- InputStream openInputStream() throws IOException

## Package: org.slf4j

### Class: org.slf4j.ILoggerFactory
Type: Interface

Methods:
- Logger getLogger(String)

### Class: org.slf4j.IMarkerFactory
Type: Interface

Methods:
- Marker getMarker(String)
- boolean exists(String)
- Marker getDetachedMarker(String)
- boolean detachMarker(String)

### Class: org.slf4j.Logger
Type: Interface

Methods:
- void debug(String)
- void debug(String, Object)
- void debug(String, Object, Object)
- void debug(String, Object[])
- void debug(String, Throwable)
- void debug(Marker, String)
- void debug(Marker, String, Object)
- void debug(Marker, String, Object, Object)
- void debug(Marker, String, Object[])
- void debug(Marker, String, Throwable)
- String getName()
- LoggingEventBuilder atError()
- LoggingEventBuilder atWarn()
- LoggingEventBuilder atInfo()
- boolean isWarnEnabled()
- boolean isWarnEnabled(Marker)
- void error(String)
- void error(String, Object)
- void error(String, Object, Object)
- void error(String, Object[])
- void error(String, Throwable)
- void error(Marker, String)
- void error(Marker, String, Object)
- void error(Marker, String, Object, Object)
- void error(Marker, String, Object[])
- void error(Marker, String, Throwable)
- void warn(String)
- void warn(String, Object)
- void warn(String, Object[])
- void warn(String, Object, Object)
- void warn(String, Throwable)
- void warn(Marker, String)
- void warn(Marker, String, Object)
- void warn(Marker, String, Object, Object)
- void warn(Marker, String, Object[])
- void warn(Marker, String, Throwable)
- LoggingEventBuilder atTrace()
- void trace(String)
- void trace(String, Object)
- void trace(String, Object, Object)
- void trace(String, Object[])
- void trace(String, Throwable)
- void trace(Marker, String)
- void trace(Marker, String, Object)
- void trace(Marker, String, Object, Object)
- void trace(Marker, String, Object[])
- void trace(Marker, String, Throwable)
- boolean isEnabledForLevel(Level)
- boolean isInfoEnabled()
- boolean isInfoEnabled(Marker)
- LoggingEventBuilder makeLoggingEventBuilder(Level)
- boolean isErrorEnabled()
- boolean isErrorEnabled(Marker)
- boolean isTraceEnabled()
- boolean isTraceEnabled(Marker)
- boolean isDebugEnabled()
- boolean isDebugEnabled(Marker)
- LoggingEventBuilder atDebug()
- LoggingEventBuilder atLevel(Level)
- void info(String)
- void info(String, Object)
- void info(String, Object, Object)
- void info(String, Object[])
- void info(String, Throwable)
- void info(Marker, String)
- void info(Marker, String, Object)
- void info(Marker, String, Object, Object)
- void info(Marker, String, Object[])
- void info(Marker, String, Throwable)

### Class: org.slf4j.Marker
Type: Interface
Implements: java.io.Serializable

Methods:
- void add(Marker)
- boolean contains(Marker)
- boolean contains(String)
- Iterator iterator()
- String getName()
- int hashCode()
- boolean hasChildren()
- boolean equals(Object)
- boolean hasReferences()
- boolean remove(Marker)

### Class: org.slf4j.LoggerFactory
Type: Class

Methods:
- **static** ILoggerFactory getILoggerFactory()
- **static** Logger getLogger(String)
- **static** Logger getLogger(Class)

## Package: org.slf4j.event

### Class: org.slf4j.event.LoggingEvent
Type: Interface

Methods:
- List getMarkers()
- Level getLevel()
- long getTimeStamp()
- List getKeyValuePairs()
- String getThreadName()
- List getArguments()
- String getMessage()
- String getLoggerName()
- String getCallerBoundary()
- Throwable getThrowable()
- Object[] getArgumentArray()

### Class: org.slf4j.event.DefaultLoggingEvent
Type: Class
Implements: org.slf4j.event.LoggingEvent

Methods:
- void addArguments(Object[])
- List getKeyValuePairs()
- void setCallerBoundary(String)
- String getMessage()
- String getCallerBoundary()
- void setMessage(String)
- List getMarkers()
- Level getLevel()
- void setTimeStamp(long)
- long getTimeStamp()
- void addArgument(Object)
- void setThrowable(Throwable)
- String getThreadName()
- void addKeyValue(String, Object)
- String getLoggerName()
- List getArguments()
- Throwable getThrowable()
- Object[] getArgumentArray()
- void addMarker(Marker)

### Class: org.slf4j.event.EventRecordingLogger
Type: Class
Extends: org.slf4j.helpers.LegacyAbstractLogger

Methods:
- String getName()
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isWarnEnabled()
- boolean isDebugEnabled()

### Class: org.slf4j.event.KeyValuePair
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: org.slf4j.event.Level
Type: Enum
Extends: java.lang.Enum

Methods:
- int toInt()
- **static** Level valueOf(String)
- **static** Level[] values()
- **static** Level intToLevel(int)
- String toString()

### Class: org.slf4j.event.SubstituteLoggingEvent
Type: Class
Implements: org.slf4j.event.LoggingEvent

Methods:
- List getKeyValuePairs()
- String getMessage()
- SubstituteLogger getLogger()
- void setMessage(String)
- void setLevel(Level)
- List getMarkers()
- void setLoggerName(String)
- Level getLevel()
- void setTimeStamp(long)
- long getTimeStamp()
- void setArgumentArray(Object[])
- void setThrowable(Throwable)
- void setLogger(SubstituteLogger)
- void setThreadName(String)
- String getThreadName()
- List getArguments()
- String getLoggerName()
- Throwable getThrowable()
- Object[] getArgumentArray()
- void addMarker(Marker)

## Package: org.slf4j.helpers

### Class: org.slf4j.helpers.CheckReturnValue
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.slf4j.helpers.AbstractLogger
Type: Abstract Class
Implements: org.slf4j.Logger, java.io.Serializable

Methods:
- void warn(String)
- void warn(String, Object)
- void warn(String, Object, Object)
- void warn(String, Object[])
- void warn(String, Throwable)
- void warn(Marker, String)
- void warn(Marker, String, Object)
- void warn(Marker, String, Object, Object)
- void warn(Marker, String, Object[])
- void warn(Marker, String, Throwable)
- void trace(String)
- void trace(String, Object)
- void trace(String, Object, Object)
- void trace(String, Object[])
- void trace(String, Throwable)
- void trace(Marker, String)
- void trace(Marker, String, Object)
- void trace(Marker, String, Object, Object)
- void trace(Marker, String, Object[])
- void trace(Marker, String, Throwable)
- void debug(String)
- void debug(String, Object)
- void debug(String, Object, Object)
- void debug(String, Object[])
- void debug(String, Throwable)
- void debug(Marker, String)
- void debug(Marker, String, Object)
- void debug(Marker, String, Object, Object)
- void debug(Marker, String, Object[])
- void debug(Marker, String, Throwable)
- String getName()
- void error(String)
- void error(String, Object)
- void error(String, Object, Object)
- void error(String, Object[])
- void error(String, Throwable)
- void error(Marker, String)
- void error(Marker, String, Object)
- void error(Marker, String, Object, Object)
- void error(Marker, String, Object[])
- void error(Marker, String, Throwable)
- void info(String)
- void info(String, Object)
- void info(String, Object, Object)
- void info(String, Object[])
- void info(String, Throwable)
- void info(Marker, String)
- void info(Marker, String, Object)
- void info(Marker, String, Object, Object)
- void info(Marker, String, Object[])
- void info(Marker, String, Throwable)

### Class: org.slf4j.helpers.BasicMDCAdapter
Type: Class
Implements: org.slf4j.spi.MDCAdapter

Methods:
- Map getCopyOfContextMap()
- void clearDequeByKey(String)
- Deque getCopyOfDequeByKey(String)
- void pushByKey(String, String)
- String popByKey(String)
- String get(String)
- void clear()
- void setContextMap(Map)
- Set getKeys()
- void remove(String)
- void put(String, String)

### Class: org.slf4j.helpers.BasicMarker
Type: Class
Implements: org.slf4j.Marker

Methods:
- void add(Marker)
- boolean contains(Marker)
- boolean contains(String)
- Iterator iterator()
- String getName()
- int hashCode()
- boolean hasChildren()
- boolean equals(Object)
- boolean hasReferences()
- String toString()
- boolean remove(Marker)

### Class: org.slf4j.helpers.BasicMarkerFactory
Type: Class
Implements: org.slf4j.IMarkerFactory

Methods:
- Marker getMarker(String)
- boolean exists(String)
- Marker getDetachedMarker(String)
- boolean detachMarker(String)

### Class: org.slf4j.helpers.FormattingTuple
Type: Class

Methods:
- Object[] getArgArray()
- String getMessage()
- Throwable getThrowable()

### Class: org.slf4j.helpers.LegacyAbstractLogger
Type: Abstract Class
Extends: org.slf4j.helpers.AbstractLogger

Methods:
- boolean isInfoEnabled(Marker)
- boolean isErrorEnabled(Marker)
- boolean isTraceEnabled(Marker)
- boolean isWarnEnabled(Marker)
- boolean isDebugEnabled(Marker)

### Class: org.slf4j.helpers.MessageFormatter
Type: Class

Methods:
- **static** Throwable getThrowableCandidate(Object[])
- **static** Object[] trimmedCopy(Object[])
- **static** String basicArrayFormat(String, Object[])
- **static** String basicArrayFormat(NormalizedParameters)
- **static** FormattingTuple format(String, Object)
- **static** FormattingTuple format(String, Object, Object)
- **static** FormattingTuple arrayFormat(String, Object[])
- **static** FormattingTuple arrayFormat(String, Object[], Throwable)

### Class: org.slf4j.helpers.NOPLogger
Type: Class
Extends: org.slf4j.helpers.NamedLoggerBase
Implements: org.slf4j.Logger

Methods:
- void warn(String)
- void warn(String, Object)
- void warn(String, Object, Object)
- void warn(String, Object[])
- void warn(String, Throwable)
- void warn(Marker, String)
- void warn(Marker, String, Object)
- void warn(Marker, String, Object, Object)
- void warn(Marker, String, Object[])
- void warn(Marker, String, Throwable)
- void trace(String)
- void trace(String, Object)
- void trace(String, Object, Object)
- void trace(String, Object[])
- void trace(String, Throwable)
- void trace(Marker, String)
- void trace(Marker, String, Object)
- void trace(Marker, String, Object, Object)
- void trace(Marker, String, Object[])
- void trace(Marker, String, Throwable)
- void debug(String)
- void debug(String, Object)
- void debug(String, Object, Object)
- void debug(String, Object[])
- void debug(String, Throwable)
- void debug(Marker, String)
- void debug(Marker, String, Object)
- void debug(Marker, String, Object, Object)
- void debug(Marker, String, Object[])
- void debug(Marker, String, Throwable)
- String getName()
- boolean isInfoEnabled()
- boolean isInfoEnabled(Marker)
- boolean isErrorEnabled()
- boolean isErrorEnabled(Marker)
- boolean isTraceEnabled()
- boolean isTraceEnabled(Marker)
- boolean isWarnEnabled()
- boolean isWarnEnabled(Marker)
- boolean isDebugEnabled()
- boolean isDebugEnabled(Marker)
- void error(String)
- void error(String, Object)
- void error(String, Object, Object)
- void error(String, Object[])
- void error(String, Throwable)
- void error(Marker, String)
- void error(Marker, String, Object)
- void error(Marker, String, Object, Object)
- void error(Marker, String, Object[])
- void error(Marker, String, Throwable)
- void info(String)
- void info(String, Object)
- void info(String, Object, Object)
- void info(String, Object[])
- void info(String, Throwable)
- void info(Marker, String)
- void info(Marker, String, Object)
- void info(Marker, String, Object, Object)
- void info(Marker, String, Object[])
- void info(Marker, String, Throwable)

### Class: org.slf4j.helpers.NOPLoggerFactory
Type: Class
Implements: org.slf4j.ILoggerFactory

Methods:
- Logger getLogger(String)

### Class: org.slf4j.helpers.NOPMDCAdapter
Type: Class
Implements: org.slf4j.spi.MDCAdapter

Methods:
- Map getCopyOfContextMap()
- void clearDequeByKey(String)
- Deque getCopyOfDequeByKey(String)
- void pushByKey(String, String)
- String popByKey(String)
- String get(String)
- void clear()
- void setContextMap(Map)
- void remove(String)
- void put(String, String)

### Class: org.slf4j.helpers.NOP_FallbackServiceProvider
Type: Class
Implements: org.slf4j.spi.SLF4JServiceProvider

Methods:
- ILoggerFactory getLoggerFactory()
- IMarkerFactory getMarkerFactory()
- String getRequestedApiVersion()
- void initialize()
- MDCAdapter getMDCAdapter()

### Class: org.slf4j.helpers.NormalizedParameters
Type: Class

Methods:
- **static** Throwable getThrowableCandidate(Object[])
- **static** Object[] trimmedCopy(Object[])
- **static** NormalizedParameters normalize(String, Object[], Throwable)
- **static** NormalizedParameters normalize(LoggingEvent)
- Object[] getArguments()
- String getMessage()
- Throwable getThrowable()

### Class: org.slf4j.helpers.Reporter
Type: Class

Methods:
- **static** void warn(String)
- **static** void debug(String)
- **static** void error(String, Throwable)
- **static** void error(String)
- **static** void info(String)

### Class: org.slf4j.helpers.SubstituteLogger
Type: Class
Implements: org.slf4j.Logger

Methods:
- boolean isDelegateNull()
- String getName()
- void log(LoggingEvent)
- LoggingEventBuilder atWarn()
- LoggingEventBuilder atInfo()
- boolean isWarnEnabled()
- boolean isWarnEnabled(Marker)
- void error(String)
- void error(String, Object)
- void error(String, Object, Object)
- void error(String, Object[])
- void error(String, Throwable)
- void error(Marker, String)
- void error(Marker, String, Object)
- void error(Marker, String, Object, Object)
- void error(Marker, String, Object[])
- void error(Marker, String, Throwable)
- Logger delegate()
- LoggingEventBuilder atTrace()
- void trace(String)
- void trace(String, Object)
- void trace(String, Object, Object)
- void trace(String, Object[])
- void trace(String, Throwable)
- void trace(Marker, String)
- void trace(Marker, String, Object)
- void trace(Marker, String, Object, Object)
- void trace(Marker, String, Object[])
- void trace(Marker, String, Throwable)
- boolean isEnabledForLevel(Level)
- int hashCode()
- boolean isInfoEnabled()
- boolean isInfoEnabled(Marker)
- boolean isErrorEnabled()
- boolean isErrorEnabled(Marker)
- boolean isTraceEnabled()
- boolean isTraceEnabled(Marker)
- LoggingEventBuilder atLevel(Level)
- void info(String)
- void info(String, Object)
- void info(String, Object, Object)
- void info(String, Object[])
- void info(String, Throwable)
- void info(Marker, String)
- void info(Marker, String, Object)
- void info(Marker, String, Object, Object)
- void info(Marker, String, Object[])
- void info(Marker, String, Throwable)
- void debug(String)
- void debug(String, Object)
- void debug(String, Object, Object)
- void debug(String, Object[])
- void debug(String, Throwable)
- void debug(Marker, String)
- void debug(Marker, String, Object)
- void debug(Marker, String, Object, Object)
- void debug(Marker, String, Object[])
- void debug(Marker, String, Throwable)
- LoggingEventBuilder atError()
- boolean isDelegateEventAware()
- void setDelegate(Logger)
- void warn(String)
- void warn(String, Object)
- void warn(String, Object, Object)
- void warn(String, Object[])
- void warn(String, Throwable)
- void warn(Marker, String)
- void warn(Marker, String, Object)
- void warn(Marker, String, Object, Object)
- void warn(Marker, String, Object[])
- void warn(Marker, String, Throwable)
- boolean isDelegateNOP()
- boolean equals(Object)
- LoggingEventBuilder makeLoggingEventBuilder(Level)
- boolean isDebugEnabled()
- boolean isDebugEnabled(Marker)
- LoggingEventBuilder atDebug()

### Class: org.slf4j.helpers.SubstituteLoggerFactory
Type: Class
Implements: org.slf4j.ILoggerFactory

Methods:
- List getLoggerNames()
- void clear()
- Logger getLogger(String)
- LinkedBlockingQueue getEventQueue()
- void postInitialization()
- List getLoggers()

### Class: org.slf4j.helpers.SubstituteServiceProvider
Type: Class
Implements: org.slf4j.spi.SLF4JServiceProvider

Methods:
- SubstituteLoggerFactory getSubstituteLoggerFactory()
- ILoggerFactory getLoggerFactory()
- IMarkerFactory getMarkerFactory()
- String getRequestedApiVersion()
- void initialize()
- MDCAdapter getMDCAdapter()

### Class: org.slf4j.helpers.ThreadLocalMapOfStacks
Type: Class

Methods:
- void clearDequeByKey(String)
- Deque getCopyOfDequeByKey(String)
- void pushByKey(String, String)
- String popByKey(String)

### Class: org.slf4j.helpers.Util
Type: Class

Methods:
- **static** String safeGetSystemProperty(String)
- **static** void report(String, Throwable)
- **static** void report(String)
- **static** Class getCallingClass()
- **static** boolean safeGetBooleanSystemProperty(String)

## Package: org.slf4j.spi

### Class: org.slf4j.spi.CallerBoundaryAware
Type: Interface

Methods:
- void setCallerBoundary(String)

### Class: org.slf4j.spi.LocationAwareLogger
Type: Interface
Implements: org.slf4j.Logger

Methods:
- void log(Marker, String, int, String, Object[], Throwable)

### Class: org.slf4j.spi.LoggingEventAware
Type: Interface

Methods:
- void log(LoggingEvent)

### Class: org.slf4j.spi.LoggingEventBuilder
Type: Interface

Methods:
- LoggingEventBuilder addArgument(Object)
- LoggingEventBuilder addArgument(Supplier)
- void log()
- void log(String)
- void log(String, Object)
- void log(String, Object, Object)
- void log(String, Object[])
- void log(Supplier)
- LoggingEventBuilder addKeyValue(String, Object)
- LoggingEventBuilder addKeyValue(String, Supplier)
- LoggingEventBuilder setCause(Throwable)
- LoggingEventBuilder setMessage(String)
- LoggingEventBuilder setMessage(Supplier)
- LoggingEventBuilder addMarker(Marker)

### Class: org.slf4j.spi.MDCAdapter
Type: Interface

Methods:
- Map getCopyOfContextMap()
- void clearDequeByKey(String)
- Deque getCopyOfDequeByKey(String)
- void pushByKey(String, String)
- String popByKey(String)
- String get(String)
- void clear()
- void setContextMap(Map)
- void remove(String)
- void put(String, String)

### Class: org.slf4j.spi.SLF4JServiceProvider
Type: Interface

Methods:
- ILoggerFactory getLoggerFactory()
- IMarkerFactory getMarkerFactory()
- String getRequestedApiVersion()
- void initialize()
- MDCAdapter getMDCAdapter()

### Class: org.slf4j.spi.DefaultLoggingEventBuilder
Type: Class
Implements: org.slf4j.spi.LoggingEventBuilder, org.slf4j.spi.CallerBoundaryAware

Methods:
- LoggingEventBuilder addArgument(Object)
- LoggingEventBuilder addArgument(Supplier)
- void log()
- void log(String)
- void log(String, Object)
- void log(String, Object, Object)
- void log(String, Object[])
- void log(Supplier)
- LoggingEventBuilder addKeyValue(String, Object)
- LoggingEventBuilder addKeyValue(String, Supplier)
- void setCallerBoundary(String)
- LoggingEventBuilder setCause(Throwable)
- LoggingEventBuilder setMessage(String)
- LoggingEventBuilder setMessage(Supplier)
- LoggingEventBuilder addMarker(Marker)

### Class: org.slf4j.spi.NOPLoggingEventBuilder
Type: Class
Implements: org.slf4j.spi.LoggingEventBuilder

Methods:
- **static** LoggingEventBuilder singleton()
- LoggingEventBuilder addArgument(Object)
- LoggingEventBuilder addArgument(Supplier)
- void log()
- void log(String)
- void log(Supplier)
- void log(String, Object)
- void log(String, Object, Object)
- void log(String, Object[])
- LoggingEventBuilder addKeyValue(String, Object)
- LoggingEventBuilder addKeyValue(String, Supplier)
- LoggingEventBuilder setCause(Throwable)
- LoggingEventBuilder setMessage(String)
- LoggingEventBuilder setMessage(Supplier)
- LoggingEventBuilder addMarker(Marker)

## Package: org.yaml.snakeyaml

### Class: org.yaml.snakeyaml.DumperOptions
Type: Class

Methods:
- boolean isAllowUnicode()
- TimeZone getTimeZone()
- void setExplicitStart(boolean)
- Map getTags()
- boolean isExplicitStart()
- boolean isProcessComments()
- void setTags(Map)
- int getWidth()
- void setIndentWithIndicator(boolean)
- DumperOptions$NonPrintableStyle getNonPrintableStyle()
- void setMaxSimpleKeyLength(int)
- void setCanonical(boolean)
- int getIndicatorIndent()
- void setDefaultScalarStyle(DumperOptions$ScalarStyle)
- DumperOptions$ScalarStyle getDefaultScalarStyle()
- void setSplitLines(boolean)
- void setIndicatorIndent(int)
- boolean getSplitLines()
- void setNonPrintableStyle(DumperOptions$NonPrintableStyle)
- void setTimeZone(TimeZone)
- void setIndent(int)
- boolean isAllowReadOnlyProperties()
- boolean isExplicitEnd()
- void setDefaultFlowStyle(DumperOptions$FlowStyle)
- void setPrettyFlow(boolean)
- DumperOptions$Version getVersion()
- void setAllowUnicode(boolean)
- boolean isPrettyFlow()
- int getIndent()
- void setProcessComments(boolean)
- DumperOptions$FlowStyle getDefaultFlowStyle()
- void setVersion(DumperOptions$Version)
- void setExplicitEnd(boolean)
- boolean getIndentWithIndicator()
- void setWidth(int)
- void setLineBreak(DumperOptions$LineBreak)
- void setAllowReadOnlyProperties(boolean)
- DumperOptions$LineBreak getLineBreak()
- int getMaxSimpleKeyLength()
- void setAnchorGenerator(AnchorGenerator)
- boolean isCanonical()
- AnchorGenerator getAnchorGenerator()

### Class: org.yaml.snakeyaml.DumperOptions$FlowStyle
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DumperOptions$FlowStyle valueOf(String)
- **static** DumperOptions$FlowStyle[] values()
- String toString()

### Class: org.yaml.snakeyaml.DumperOptions$LineBreak
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DumperOptions$LineBreak getPlatformLineBreak()
- **static** DumperOptions$LineBreak valueOf(String)
- **static** DumperOptions$LineBreak[] values()
- String toString()
- String getString()

### Class: org.yaml.snakeyaml.DumperOptions$NonPrintableStyle
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DumperOptions$NonPrintableStyle valueOf(String)
- **static** DumperOptions$NonPrintableStyle[] values()

### Class: org.yaml.snakeyaml.DumperOptions$ScalarStyle
Type: Enum
Extends: java.lang.Enum

Methods:
- Character getChar()
- **static** DumperOptions$ScalarStyle valueOf(String)
- **static** DumperOptions$ScalarStyle[] values()
- String toString()
- **static** DumperOptions$ScalarStyle createStyle(Character)

### Class: org.yaml.snakeyaml.DumperOptions$Version
Type: Enum
Extends: java.lang.Enum

Methods:
- int minor()
- int major()
- **static** DumperOptions$Version valueOf(String)
- **static** DumperOptions$Version[] values()
- String toString()
- String getRepresentation()

### Class: org.yaml.snakeyaml.LoaderOptions
Type: Class

Methods:
- int getMaxAliasesForCollections()
- void setMaxAliasesForCollections(int)
- void setTagInspector(TagInspector)
- LoaderOptions setProcessComments(boolean)
- void setCodePointLimit(int)
- TagInspector getTagInspector()
- int getCodePointLimit()
- void setNestingDepthLimit(int)
- boolean isProcessComments()
- boolean getAllowRecursiveKeys()
- void setWrappedToRootException(boolean)
- boolean isEnumCaseSensitive()
- void setEnumCaseSensitive(boolean)
- boolean isWrappedToRootException()
- boolean isAllowDuplicateKeys()
- void setAllowRecursiveKeys(boolean)
- void setAllowDuplicateKeys(boolean)
- int getNestingDepthLimit()

### Class: org.yaml.snakeyaml.TypeDescription
Type: Class

Methods:
- Property getProperty(String)
- Object finalizeConstruction(Object)
- Set getProperties()
- Object newInstance(Node)
- Object newInstance(String, Node)
- void substituteProperty(String, Class, String, String, Class[])
- void substituteProperty(PropertySubstitute)
- Tag getTag()
- void addPropertyParameters(String, Class[])
- void putMapPropertyType(String, Class, Class)
- Class getType()
- void setExcludes(String[])
- boolean setProperty(Object, String, Object) throws Exception
- boolean setupPropertyType(String, Node)
- String toString()
- void setPropertyUtils(PropertyUtils)
- void putListPropertyType(String, Class)
- void setIncludes(String[])

### Class: org.yaml.snakeyaml.Yaml
Type: Class

Methods:
- void setName(String)
- String dumpAsMap(Object)
- String getName()
- void addImplicitResolver(Tag, Pattern, String)
- void addImplicitResolver(Tag, Pattern, String, int)
- String dumpAll(Iterator)
- void dumpAll(Iterator, Writer)
- Iterable parse(Reader)
- Iterable loadAll(Reader)
- Iterable loadAll(String)
- Iterable loadAll(InputStream)
- Object loadAs(Reader, Class)
- Object loadAs(String, Class)
- Object loadAs(InputStream, Class)
- String dumpAs(Object, Tag, DumperOptions$FlowStyle)
- void serialize(Node, Writer)
- List serialize(Node)
- Object load(String)
- Object load(InputStream)
- Object load(Reader)
- Iterable composeAll(Reader)
- Node compose(Reader)
- void addTypeDescription(TypeDescription)
- void setBeanAccess(BeanAccess)
- String toString()
- String dump(Object)
- void dump(Object, Writer)
- Node represent(Object)

## Package: org.yaml.snakeyaml.comments

### Class: org.yaml.snakeyaml.comments.CommentEventsCollector
Type: Class

Methods:
- boolean isEmpty()
- List consume()
- Event collectEventsAndPoll(Event)
- CommentEventsCollector collectEvents()
- Event collectEvents(Event)

### Class: org.yaml.snakeyaml.comments.CommentLine
Type: Class

Methods:
- String getValue()
- CommentType getCommentType()
- Mark getStartMark()
- String toString()
- Mark getEndMark()

### Class: org.yaml.snakeyaml.comments.CommentType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CommentType valueOf(String)
- **static** CommentType[] values()

## Package: org.yaml.snakeyaml.composer

### Class: org.yaml.snakeyaml.composer.Composer
Type: Class

Methods:
- Node getSingleNode()
- boolean checkNode()
- Node getNode()

### Class: org.yaml.snakeyaml.composer.ComposerException
Type: Class
Extends: org.yaml.snakeyaml.error.MarkedYAMLException

No public methods found

## Package: org.yaml.snakeyaml.constructor

### Class: org.yaml.snakeyaml.constructor.Construct
Type: Interface

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.AbstractConstruct
Type: Abstract Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.BaseConstructor
Type: Abstract Class

Methods:
- boolean isExplicitPropertyUtils()
- Object getSingleData(Class)
- boolean checkData()
- void setWrappedToRootException(boolean)
- boolean isEnumCaseSensitive()
- void setEnumCaseSensitive(boolean)
- boolean isWrappedToRootException()
- boolean isAllowDuplicateKeys()
- void setAllowDuplicateKeys(boolean)
- LoaderOptions getLoadingConfig()
- TypeDescription addTypeDescription(TypeDescription)
- PropertyUtils getPropertyUtils()
- void setComposer(Composer)
- void setPropertyUtils(PropertyUtils)
- Object getData() throws NoSuchElementException

### Class: org.yaml.snakeyaml.constructor.Constructor
Type: Class
Extends: org.yaml.snakeyaml.constructor.SafeConstructor

No public methods found

### Class: org.yaml.snakeyaml.constructor.Constructor$ConstructMapping
Type: Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.Constructor$ConstructScalar
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.Constructor$ConstructSequence
Type: Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject
Type: Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.ConstructorException
Type: Class
Extends: org.yaml.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: org.yaml.snakeyaml.constructor.DuplicateKeyException
Type: Class
Extends: org.yaml.snakeyaml.constructor.ConstructorException

No public methods found

### Class: org.yaml.snakeyaml.constructor.SafeConstructor
Type: Class
Extends: org.yaml.snakeyaml.constructor.BaseConstructor

No public methods found

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap
Type: Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq
Type: Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet
Type: Class
Implements: org.yaml.snakeyaml.constructor.Construct

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)

### Class: org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp
Type: Class
Extends: org.yaml.snakeyaml.constructor.AbstractConstruct

Methods:
- Object construct(Node)
- Calendar getCalendar()

## Package: org.yaml.snakeyaml.emitter

### Class: org.yaml.snakeyaml.emitter.Emitable
Type: Interface

Methods:
- void emit(Event) throws IOException

### Class: org.yaml.snakeyaml.emitter.Emitter
Type: Class
Implements: org.yaml.snakeyaml.emitter.Emitable

Methods:
- void emit(Event) throws IOException

### Class: org.yaml.snakeyaml.emitter.EmitterException
Type: Class
Extends: org.yaml.snakeyaml.error.YAMLException

No public methods found

### Class: org.yaml.snakeyaml.emitter.ScalarAnalysis
Type: Class

Methods:
- boolean isAllowFlowPlain()
- boolean isMultiline()
- String getScalar()
- boolean isAllowSingleQuoted()
- boolean isEmpty()
- boolean isAllowBlock()
- boolean isAllowBlockPlain()

## Package: org.yaml.snakeyaml.error

### Class: org.yaml.snakeyaml.error.Mark
Type: Class
Implements: java.io.Serializable

Methods:
- String getName()
- int[] getBuffer()
- int getIndex()
- int getLine()
- int getColumn()
- String get_snippet(int, int)
- String get_snippet()
- String toString()
- int getPointer()

### Class: org.yaml.snakeyaml.error.MarkedYAMLException
Type: Class
Extends: org.yaml.snakeyaml.error.YAMLException

Methods:
- String getProblem()
- Mark getProblemMark()
- Mark getContextMark()
- String getMessage()
- String toString()
- String getContext()

### Class: org.yaml.snakeyaml.error.YAMLException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: org.yaml.snakeyaml.events

### Class: org.yaml.snakeyaml.events.AliasEvent
Type: Class
Extends: org.yaml.snakeyaml.events.NodeEvent

Methods:
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.CollectionEndEvent
Type: Abstract Class
Extends: org.yaml.snakeyaml.events.Event

No public methods found

### Class: org.yaml.snakeyaml.events.CollectionStartEvent
Type: Abstract Class
Extends: org.yaml.snakeyaml.events.NodeEvent

Methods:
- DumperOptions$FlowStyle getFlowStyle()
- boolean getImplicit()
- boolean isFlow()
- String getTag()

### Class: org.yaml.snakeyaml.events.CommentEvent
Type: Class
Extends: org.yaml.snakeyaml.events.Event

Methods:
- String getValue()
- CommentType getCommentType()
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.DocumentEndEvent
Type: Class
Extends: org.yaml.snakeyaml.events.Event

Methods:
- boolean getExplicit()
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.DocumentStartEvent
Type: Class
Extends: org.yaml.snakeyaml.events.Event

Methods:
- DumperOptions$Version getVersion()
- boolean getExplicit()
- Map getTags()
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.Event
Type: Abstract Class

Methods:
- int hashCode()
- Mark getStartMark()
- boolean equals(Object)
- boolean is(Event$ID)
- String toString()
- Event$ID getEventId()
- Mark getEndMark()

### Class: org.yaml.snakeyaml.events.Event$ID
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Event$ID valueOf(String)
- **static** Event$ID[] values()

### Class: org.yaml.snakeyaml.events.ImplicitTuple
Type: Class

Methods:
- boolean bothFalse()
- String toString()
- boolean canOmitTagInPlainScalar()
- boolean canOmitTagInNonPlainScalar()

### Class: org.yaml.snakeyaml.events.MappingEndEvent
Type: Class
Extends: org.yaml.snakeyaml.events.CollectionEndEvent

Methods:
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.MappingStartEvent
Type: Class
Extends: org.yaml.snakeyaml.events.CollectionStartEvent

Methods:
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.NodeEvent
Type: Abstract Class
Extends: org.yaml.snakeyaml.events.Event

Methods:
- String getAnchor()

### Class: org.yaml.snakeyaml.events.ScalarEvent
Type: Class
Extends: org.yaml.snakeyaml.events.NodeEvent

Methods:
- String getValue()
- boolean isPlain()
- ImplicitTuple getImplicit()
- DumperOptions$ScalarStyle getScalarStyle()
- String getTag()
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.SequenceEndEvent
Type: Class
Extends: org.yaml.snakeyaml.events.CollectionEndEvent

Methods:
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.SequenceStartEvent
Type: Class
Extends: org.yaml.snakeyaml.events.CollectionStartEvent

Methods:
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.StreamEndEvent
Type: Class
Extends: org.yaml.snakeyaml.events.Event

Methods:
- Event$ID getEventId()

### Class: org.yaml.snakeyaml.events.StreamStartEvent
Type: Class
Extends: org.yaml.snakeyaml.events.Event

Methods:
- Event$ID getEventId()

## Package: org.yaml.snakeyaml.external.biz.base64Coder

### Class: org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder
Type: Class

Methods:
- **static** byte[] decodeLines(String)
- **static** char[] encode(byte[])
- **static** char[] encode(byte[], int)
- **static** char[] encode(byte[], int, int)
- **static** String encodeLines(byte[])
- **static** String encodeLines(byte[], int, int, int, String)
- **static** String encodeString(String)
- **static** String decodeString(String)
- **static** byte[] decode(String)
- **static** byte[] decode(char[])
- **static** byte[] decode(char[], int, int)

## Package: org.yaml.snakeyaml.external.com.google.gdata.util.common.base

### Class: org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper
Type: Interface

Methods:
- String escape(String)
- Appendable escape(Appendable)

### Class: org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper
Type: Class
Extends: org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper

Methods:
- String escape(String)

### Class: org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper
Type: Abstract Class
Implements: org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper

Methods:
- String escape(String)
- Appendable escape(Appendable)

## Package: org.yaml.snakeyaml.inspector

### Class: org.yaml.snakeyaml.inspector.TagInspector
Type: Interface

Methods:
- boolean isGlobalTagAllowed(Tag)

### Class: org.yaml.snakeyaml.inspector.UnTrustedTagInspector
Type: Class
Implements: org.yaml.snakeyaml.inspector.TagInspector

Methods:
- boolean isGlobalTagAllowed(Tag)

## Package: org.yaml.snakeyaml.internal

### Class: org.yaml.snakeyaml.internal.Logger
Type: Class

Methods:
- void warn(String)
- boolean isLoggable(Logger$Level)
- **static** Logger getLogger(String)

### Class: org.yaml.snakeyaml.internal.Logger
Type: Class

Methods:
- void warn(String)
- boolean isLoggable(Logger$Level)
- **static** Logger getLogger(String)

### Class: org.yaml.snakeyaml.internal.Logger$Level
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Logger$Level valueOf(String)
- **static** Logger$Level[] values()

### Class: org.yaml.snakeyaml.internal.Logger$Level
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Logger$Level valueOf(String)
- **static** Logger$Level[] values()

## Package: org.yaml.snakeyaml.introspector

### Class: org.yaml.snakeyaml.introspector.BeanAccess
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BeanAccess valueOf(String)
- **static** BeanAccess[] values()

### Class: org.yaml.snakeyaml.introspector.FieldProperty
Type: Class
Extends: org.yaml.snakeyaml.introspector.GenericProperty

Methods:
- void set(Object, Object) throws Exception
- Annotation getAnnotation(Class)
- Object get(Object)
- List getAnnotations()

### Class: org.yaml.snakeyaml.introspector.GenericProperty
Type: Abstract Class
Extends: org.yaml.snakeyaml.introspector.Property

Methods:
- Class[] getActualTypeArguments()

### Class: org.yaml.snakeyaml.introspector.MethodProperty
Type: Class
Extends: org.yaml.snakeyaml.introspector.GenericProperty

Methods:
- void set(Object, Object) throws Exception
- Annotation getAnnotation(Class)
- Object get(Object)
- boolean isWritable()
- boolean isReadable()
- List getAnnotations()

### Class: org.yaml.snakeyaml.introspector.MissingProperty
Type: Class
Extends: org.yaml.snakeyaml.introspector.Property

Methods:
- void set(Object, Object) throws Exception
- Class[] getActualTypeArguments()
- Annotation getAnnotation(Class)
- Object get(Object)
- List getAnnotations()

### Class: org.yaml.snakeyaml.introspector.Property
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- void set(Object, Object) throws Exception
- String getName()
- Class[] getActualTypeArguments()
- int compareTo(Property)
- int compareTo(Object)
- boolean isWritable()
- List getAnnotations()
- Annotation getAnnotation(Class)
- Class getType()
- int hashCode()
- boolean equals(Object)
- Object get(Object)
- String toString()
- boolean isReadable()

### Class: org.yaml.snakeyaml.introspector.PropertySubstitute
Type: Class
Extends: org.yaml.snakeyaml.introspector.Property

Methods:
- String getName()
- void set(Object, Object) throws Exception
- Class[] getActualTypeArguments()
- Class getType()
- Annotation getAnnotation(Class)
- Object get(Object)
- void setTargetType(Class)
- boolean isWritable()
- boolean isReadable()
- List getAnnotations()
- void setActualTypeArguments(Class[])
- void setDelegate(Property)

### Class: org.yaml.snakeyaml.introspector.PropertyUtils
Type: Class

Methods:
- boolean isSkipMissingProperties()
- void setAllowReadOnlyProperties(boolean)
- Property getProperty(Class, String)
- Property getProperty(Class, String, BeanAccess)
- Set getProperties(Class)
- Set getProperties(Class, BeanAccess)
- void setBeanAccess(BeanAccess)
- boolean isAllowReadOnlyProperties()
- void setSkipMissingProperties(boolean)

## Package: org.yaml.snakeyaml.nodes

### Class: org.yaml.snakeyaml.nodes.AnchorNode
Type: Class
Extends: org.yaml.snakeyaml.nodes.Node

Methods:
- Node getRealNode()
- NodeId getNodeId()

### Class: org.yaml.snakeyaml.nodes.CollectionNode
Type: Abstract Class
Extends: org.yaml.snakeyaml.nodes.Node

Methods:
- DumperOptions$FlowStyle getFlowStyle()
- void setFlowStyle(DumperOptions$FlowStyle)
- List getValue()
- void setEndMark(Mark)

### Class: org.yaml.snakeyaml.nodes.MappingNode
Type: Class
Extends: org.yaml.snakeyaml.nodes.CollectionNode

Methods:
- void setTypes(Class, Class)
- List getValue()
- NodeId getNodeId()
- void setOnlyKeyType(Class)
- boolean isMerged()
- void setValue(List)
- String toString()
- void setMerged(boolean)

### Class: org.yaml.snakeyaml.nodes.Node
Type: Abstract Class

Methods:
- List getInLineComments()
- boolean isTwoStepsConstruction()
- NodeId getNodeId()
- Mark getStartMark()
- void setUseClassConstructor(Boolean)
- void setType(Class)
- Tag getTag()
- Mark getEndMark()
- boolean useClassConstructor()
- void setBlockComments(List)
- void setInLineComments(List)
- String getAnchor()
- void setTwoStepsConstruction(boolean)
- List getEndComments()
- Class getType()
- int hashCode()
- boolean equals(Object)
- void setAnchor(String)
- void setTag(Tag)
- List getBlockComments()
- void setEndComments(List)

### Class: org.yaml.snakeyaml.nodes.NodeId
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NodeId valueOf(String)
- **static** NodeId[] values()

### Class: org.yaml.snakeyaml.nodes.NodeTuple
Type: Class

Methods:
- Node getKeyNode()
- String toString()
- Node getValueNode()

### Class: org.yaml.snakeyaml.nodes.ScalarNode
Type: Class
Extends: org.yaml.snakeyaml.nodes.Node

Methods:
- String getValue()
- NodeId getNodeId()
- boolean isPlain()
- String toString()
- DumperOptions$ScalarStyle getScalarStyle()

### Class: org.yaml.snakeyaml.nodes.SequenceNode
Type: Class
Extends: org.yaml.snakeyaml.nodes.CollectionNode

Methods:
- List getValue()
- NodeId getNodeId()
- String toString()
- void setListType(Class)

### Class: org.yaml.snakeyaml.nodes.Tag
Type: Class

Methods:
- boolean isCustomGlobal()
- String getValue()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getClassName()
- boolean isSecondary()
- boolean matches(Class)
- boolean isCompatible(Class)
- boolean startsWith(String)

## Package: org.yaml.snakeyaml.parser

### Class: org.yaml.snakeyaml.parser.Parser
Type: Interface

Methods:
- Event getEvent()
- Event peekEvent()
- boolean checkEvent(Event$ID)

### Class: org.yaml.snakeyaml.parser.ParserException
Type: Class
Extends: org.yaml.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: org.yaml.snakeyaml.parser.ParserImpl
Type: Class
Implements: org.yaml.snakeyaml.parser.Parser

Methods:
- Event getEvent()
- Event peekEvent()
- boolean checkEvent(Event$ID)

## Package: org.yaml.snakeyaml.reader

### Class: org.yaml.snakeyaml.reader.ReaderException
Type: Class
Extends: org.yaml.snakeyaml.error.YAMLException

Methods:
- int getPosition()
- String getName()
- int getCodePoint()
- String toString()

### Class: org.yaml.snakeyaml.reader.StreamReader
Type: Class

Methods:
- Mark getMark()
- void resetDocumentIndex()
- int getIndex()
- String prefixForward(int)
- String prefix(int)
- void forward()
- void forward(int)
- int getLine()
- int getDocumentIndex()
- int getColumn()
- **static** boolean isPrintable(String)
- **static** boolean isPrintable(int)
- int peek()
- int peek(int)

### Class: org.yaml.snakeyaml.reader.UnicodeReader
Type: Class
Extends: java.io.Reader

Methods:
- String getEncoding()
- int read(char[], int, int) throws IOException
- void close() throws IOException

## Package: org.yaml.snakeyaml.representer

### Class: org.yaml.snakeyaml.representer.Represent
Type: Interface

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.BaseRepresenter
Type: Abstract Class

Methods:
- DumperOptions$ScalarStyle getDefaultScalarStyle()
- void setDefaultScalarStyle(DumperOptions$ScalarStyle)
- boolean isExplicitPropertyUtils()
- DumperOptions$FlowStyle getDefaultFlowStyle()
- PropertyUtils getPropertyUtils()
- void setPropertyUtils(PropertyUtils)
- void setDefaultFlowStyle(DumperOptions$FlowStyle)
- Node represent(Object)

### Class: org.yaml.snakeyaml.representer.Representer
Type: Class
Extends: org.yaml.snakeyaml.representer.SafeRepresenter

Methods:
- Tag addClassTag(Class, Tag)
- TimeZone getTimeZone()
- TypeDescription addTypeDescription(TypeDescription)
- void setTimeZone(TimeZone)
- void setPropertyUtils(PropertyUtils)

### Class: org.yaml.snakeyaml.representer.Representer$RepresentJavaBean
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

### Class: org.yaml.snakeyaml.representer.SafeRepresenter$RepresentUuid
Type: Class
Implements: org.yaml.snakeyaml.representer.Represent

Methods:
- Node representData(Object)

## Package: org.yaml.snakeyaml.resolver

### Class: org.yaml.snakeyaml.resolver.Resolver
Type: Class

Methods:
- Tag resolve(NodeId, String, boolean)
- void addImplicitResolver(Tag, Pattern, String)
- void addImplicitResolver(Tag, Pattern, String, int)

## Package: org.yaml.snakeyaml.scanner

### Class: org.yaml.snakeyaml.scanner.Scanner
Type: Interface

Methods:
- void resetDocumentIndex()
- Token getToken()
- Token peekToken()
- boolean checkToken(Token$ID[])

### Class: org.yaml.snakeyaml.scanner.Constant
Type: Class

Methods:
- boolean has(int)
- boolean has(int, String)
- boolean hasNo(int)
- boolean hasNo(int, String)

### Class: org.yaml.snakeyaml.scanner.ScannerException
Type: Class
Extends: org.yaml.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: org.yaml.snakeyaml.scanner.ScannerImpl
Type: Class
Implements: org.yaml.snakeyaml.scanner.Scanner

Methods:
- void resetDocumentIndex()
- Token getToken()
- Token peekToken()
- boolean checkToken(Token$ID[])

## Package: org.yaml.snakeyaml.serializer

### Class: org.yaml.snakeyaml.serializer.AnchorGenerator
Type: Interface

Methods:
- String nextAnchor(Node)

### Class: org.yaml.snakeyaml.serializer.NumberAnchorGenerator
Type: Class
Implements: org.yaml.snakeyaml.serializer.AnchorGenerator

Methods:
- String nextAnchor(Node)

### Class: org.yaml.snakeyaml.serializer.Serializer
Type: Class

Methods:
- void serialize(Node) throws IOException
- void close() throws IOException
- void open() throws IOException

### Class: org.yaml.snakeyaml.serializer.SerializerException
Type: Class
Extends: org.yaml.snakeyaml.error.YAMLException

No public methods found

## Package: org.yaml.snakeyaml.tokens

### Class: org.yaml.snakeyaml.tokens.AliasToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.AnchorToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.BlockEndToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.BlockEntryToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.BlockMappingStartToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.BlockSequenceStartToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.CommentToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- CommentType getCommentType()

### Class: org.yaml.snakeyaml.tokens.DirectiveToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- List getValue()
- Token$ID getTokenId()
- String getName()

### Class: org.yaml.snakeyaml.tokens.DocumentEndToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.DocumentStartToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.FlowEntryToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.FlowMappingEndToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.FlowMappingStartToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.FlowSequenceEndToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.FlowSequenceStartToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.KeyToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.ScalarToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- DumperOptions$ScalarStyle getStyle()
- boolean getPlain()

### Class: org.yaml.snakeyaml.tokens.StreamEndToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.StreamStartToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.TagToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- TagTuple getValue()
- Token$ID getTokenId()

### Class: org.yaml.snakeyaml.tokens.TagTuple
Type: Class

Methods:
- String getSuffix()
- String getHandle()

### Class: org.yaml.snakeyaml.tokens.Token
Type: Abstract Class

Methods:
- Token$ID getTokenId()
- Mark getStartMark()
- Mark getEndMark()

### Class: org.yaml.snakeyaml.tokens.Token$ID
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Token$ID valueOf(String)
- **static** Token$ID[] values()
- String toString()

### Class: org.yaml.snakeyaml.tokens.ValueToken
Type: Class
Extends: org.yaml.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

## Package: org.yaml.snakeyaml.util

### Class: org.yaml.snakeyaml.util.ArrayStack
Type: Class

Methods:
- Object pop()
- void clear()
- boolean isEmpty()
- void push(Object)

### Class: org.yaml.snakeyaml.util.ArrayUtils
Type: Class

Methods:
- **static** List toUnmodifiableCompositeList(Object[], Object[])
- **static** List toUnmodifiableList(Object[])

### Class: org.yaml.snakeyaml.util.EnumUtils
Type: Class

Methods:
- **static** Enum findEnumInsensitiveCase(Class, String)

### Class: org.yaml.snakeyaml.util.PlatformFeatureDetector
Type: Class

Methods:
- boolean isRunningOnAndroid()

### Class: org.yaml.snakeyaml.util.UriEncoder
Type: Abstract Class

Methods:
- **static** String encode(String)
- **static** String decode(ByteBuffer) throws CharacterCodingException
- **static** String decode(String)

