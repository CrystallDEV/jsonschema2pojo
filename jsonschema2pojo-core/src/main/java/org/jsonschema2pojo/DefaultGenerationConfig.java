/**
 * Copyright © 2010-2020 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.jsonschema2pojo.rules.RuleFactory;

/**
 * A generation config that returns default values for all behavioural options.
 */
public class DefaultGenerationConfig implements GenerationConfig {

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isGenerateBuilders() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeTypeInfo()
    {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isUsePrimitives() {
        return false;
    }

    /**
     * Unsupported since no default source is possible.
     */
    @Override
    public Iterator<URL> getSource() {
        throw new UnsupportedOperationException("No default source available");
    }

    /**
     * @return the current working directory
     */
    @Override
    public File getTargetDirectory() {
        return new File(System.getProperty("${project.buildDir}") + "/generated-sources/js2p");
    }

    /**
     * Gets the 'sourceDirectory' configuration option
     *
     * @return Location of the JSON Schema file(s). Note: this may refer to a single
     * file or a directory of files.
     */
    @Override
    public String getSourceDirectory() {
        return null;
    }

    /**
     * Gets the 'sourcePaths' configuration option
     *
     * @return An array of locations of the JSON Schema file(s). Note: each item may
     * refer to a single file or a directory of files.
     */
    @Override
    public String[] getSourcePaths() {
        return new String[0];
    }

    /**
     * @return the 'default' package (i.e. an empty string)
     */
    @Override
    public String getTargetPackage() {
        return "";
    }

    /**
     * @return an empty array (i.e. no word delimiters)
     */
    @Override
    public char[] getPropertyWordDelimiters() {
        return new char[] { '-', ' ', '_' };
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isUseLongIntegers() {
        return false;
    }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isUseDoubleNumbers() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isIncludeHashcodeAndEquals() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isIncludeToString() {
        return true;
    }

    /**
     * @return no exclusions
     */
    @Override
    public String[] getToStringExcludes() {
        return new String[] {};
    }

    /**
     * @return {@code false}
     */
    @Override
    public boolean isUseTitleAsClassname() {
        return false;
    }

    /**
     * @return {@link AnnotationStyle#JACKSON2}
     */
    @Override
    public AnnotationStyle getAnnotationStyle() {
        return AnnotationStyle.JACKSON;
    }

    /**
     * @return {@link InclusionLevel#NON_NULL}
     */
    @Override
    public InclusionLevel getInclusionLevel() {
        return InclusionLevel.NON_NULL;
    }

    /**
     * {@link NoopAnnotator}
     */
    @Override
    public Class<? extends Annotator> getCustomAnnotator() {
        return NoopAnnotator.class;
    }

    @Override
    public Class<? extends RuleFactory> getCustomRuleFactory() {
        return RuleFactory.class;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeJsr303Annotations() {
        return false;
    }

    @Override
    public boolean isIncludeJsr305Annotations() {
        return false;
    }

    @Override
    public boolean isUseOptionalForGetters() { return false; }

    /**
     * @return {@link SourceType#JSONSCHEMA}
     */
    @Override
    public SourceType getSourceType() {
        return SourceType.JSONSCHEMA;
    }

    /**
     * @return UTF-8
     */
    @Override
    public String getOutputEncoding() {
        return StandardCharsets.UTF_8.toString();
    }

    /**
     * @return false
     */
    @Override
    public boolean isRemoveOldOutput() {
        return false;
    }

    /**
     * @return false
     */
    @Override
    public boolean isUseJodaDates() {
        return false;
    }

    /**
     * @return false
     */
    @Override
    public boolean isUseJodaLocalDates() {
        return false;
    }

    /**
     * @return false
     */
    @Override
    public boolean isUseJodaLocalTimes() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isParcelable() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isSerializable() {
        return false;
    }

    @Override
    public FileFilter getFileFilter() {
        return new AllFileFilter();
    }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isInitializeCollections() {
        return true;
    }

    @Override
    public String getClassNamePrefix() {
        return "";
    }

    @Override
    public String getClassNameSuffix() {
        return "";
    }

    @Override
    public String[] getFileExtensions() {
        return new String[] {};
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isUseBigIntegers() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isUseBigDecimals() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeConstructors() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isConstructorsRequiredPropertiesOnly() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeRequiredPropertiesConstructor(){ return false; }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isIncludeAllPropertiesConstructor() { return true; }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeCopyConstructor() { return false; }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isIncludeAdditionalProperties() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isIncludeGetters() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    @Override
    public boolean isIncludeSetters() {
        return true;
    }

    /**
     * @return <code>1.6</code>
     */
    @Override
    public String getTargetVersion() {
        return "1.6";
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeDynamicAccessors() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeDynamicGetters() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeDynamicSetters() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeDynamicBuilders() {
        return false;
    }

    @Override
    public String getDateTimeType() {
        return null;
    }

    @Override
    public String getDateType() {
        return null;
    }

    @Override
    public String getTimeType() {
        return null;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isFormatDateTimes() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isFormatDates() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isFormatTimes() {
        return false;
    }

    /**
     * @return "#/."
     */
    @Override
    public String getRefFragmentPathDelimiters() {
        return "#/.";
    }

    @Override
    public String getCustomDatePattern() {
        return null;
    }

    @Override
    public String getCustomTimePattern() {
        return null;
    }

    @Override
    public String getCustomDateTimePattern() {
        return null;
    }

    /**
     * @return {@link SourceSortOrder#OS}
     */
    @Override
    public SourceSortOrder getSourceSortOrder() {
        return SourceSortOrder.OS;
    }

    /**
     * @return {@link Collections#emptyMap}
     */
    @Override
    public Map<String, String> getFormatTypeMapping() {
        return Collections.emptyMap();
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isUseInnerClassBuilders() { return false; }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeConstructorPropertiesAnnotation() {
        return false;
    }

    /**
     * @return <code>false</code>
     */
    @Override
    public boolean isIncludeGeneratedAnnotation() {
        return true;
    }

    /**
     * @return {@code false}
     */
    @Override
    public boolean isUseJakartaValidation() {
        return false;
    }
}
