## error message

```log
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT ***************************
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT APPLICATION FAILED TO START
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT ***************************
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT Description:
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT The bean 'eurekaInstanceConfigBean', defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class] and overriding is disabled.
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT Action:
   2019-07-24T11:35:08.08+0900 [APP/PROC/WEB/0] OUT Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
   2019-07-24T11:35:08.18+0900 [APP/PROC/WEB/0] OUT Exit status 1
   2019-07-24T11:35:08.18+0900 [CELL/SSHD/0] OUT Exit status 0
   2019-07-24T11:35:14.12+0900 [CELL/0] OUT Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance 96f5a8b3-525a-41c4-4e3c-7c4b
   2019-07-24T11:35:14.12+0900 [CELL/0] OUT Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance 96f5a8b3-525a-41c4-4e3c-7c4b
   2019-07-24T11:35:14.14+0900 [API/8] OUT Process has crashed with type: "web"
   2019-07-24T11:35:14.16+0900 [API/8] OUT App instance exited with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 payload: {"instance"=>"96f5a8b3-525a-41c4-4e3c-7c4b", "index"=>0, "cell_id"=>"2440170a-656c-492a-82e8-da4cdbd1373c", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>3, "crash_timestamp"=>1563935714116214596, "version"=>"0adeddb5-d399-44fa-a98b-52ad29134b5f"}
   2019-07-24T11:35:15.52+0900 [PROXY/0] OUT Exit status 137
```