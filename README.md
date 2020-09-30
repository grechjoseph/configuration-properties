<h1>Configuration Properties</h1>
<ol>
    <li><b>application.yml</b>: add your properties (eg: my-properties.property-one and my-properties.property-two.</li>
    <li><b>MyProperties.class</b>: create with annotation @ConfigurationProperties and @Data.</li>
    <li><b>MyProperties.class</b>: add field for each property (matching name, or @Value).</li>
    <li><b>Main Class (or any Bean)</b>: @EnableConfigurationProperties(MyProperties.class).</li>
    <li>(Optional) ApplicationRunner Bean in main class for testing.</li>
    <li>Up to this point, yaml file still has properties highlighted as unrecognized. To fix this, add dependency <b>spring-boot-configuration-processor</b> and run the Maven compile goal.</li>
    <li>This should make available <b>/target/classes/META-INF/spring-configuration-metadata.json</b>, and also allows auto-completion in the yaml file for <b>my-properties</b>.</li>
    <li>To add descriptions to these properties, annotate their field in <b>MyProperties</b> with Javadoc descriptions.</li>
</ol>