# celebrity
1. 자동 reload 기능 추가
- 의존성(dependency) 추가
<pre>
dependencies {  
    compile("org.springframework.boot:spring-boot-devtools")
}
</pre>

- application property 추가
<pre>
spring.devtools.livereload.enabled=true
</pre> 

- intelliJ IDE case
<pre>
> Preferences > Build,Execution,Deployment > Compiler
    > Build project Automatically: Check
</pre>

- intellij action 찾기 ctrl+shift+a > registry > compiler.automake.allow.when.app.running 에 체크

- Run/Debug Configurations -> Running Application Update Policies -> Update classes and resources 
<pre>
> On Update action => Hot swap classes and update trigger file if failed 체크
> On frame deactivation => Update resources 체크
</pre>

