ruleset {
    description 'CodeNarc Rules Sample Groovy Gradle Project'

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml') {
        NoDef(enabled: false)
        NoTabCharacter(enabled: false)
    }
    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml') {
        DuplicateMapLiteral(enabled: false)
        DuplicateNumberLiteral(enabled: false)
        DuplicateStringLiteral(enabled: false)
    }
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {
        ClassJavadoc(enabled: false)
        LineLength(enabled: false)
        SpaceAfterOpeningBrace(enabled: false)
        SpaceAroundMapEntryColon(enabled: false)
    }
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/groovyism.xml')
    ruleset('rulesets/imports.xml') {
        NoWildcardImports(enabled: false)
    }
    ruleset('rulesets/logging.xml') {
        'PrintStackTrace' priority: 1
    }
    ruleset('rulesets/naming.xml'){
        MethodName(enabled: false)
    }
    ruleset('rulesets/security.xml')
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/unused.xml')
}
