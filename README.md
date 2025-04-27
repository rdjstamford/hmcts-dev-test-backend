# HMCTS Dev Test Backend
This will be the backend for the brand new HMCTS case management system. As a potential candidate we are leaving
this in your hands. Please refer to the brief for the complete list of tasks! Complete as much as you can and be
as creative as you want.

You should be able to run `./gradlew build` to start with to ensure it builds successfully. Then from that you
can run the service in IntelliJ (or your IDE of choice) or however you normally would.

There is an example endpoint provided to retrieve an example of a case. You are free to add/remove fields as you
wish.

GUI - https://github.com/rdjstamford/hmcts-backend-gui 

# API Endpoints
Following endpoints:
/allCases - Displays all cases in database \
/createCase/[caseNumber]/[title]/[description]/[status]/[dueDate] - creates case into database. Due Date is string, dd-mm-yyyy or dd-mm-yy is allowed. \
/deleteCase - Deletes last case \
/deleteCase/[id] - deletes case of the same ID \
/LastCase - Shows last case entered \
/updateCase/[id]/[updateStr] -Updates status of case with the ID and using updateStr \

# Notes
This is my first springboot app, so it might not be the best and there is room for improvement but a lot of fun developing and learning.
