def setEnvironments(ENV) {
    def propMap = [:]
    if(ENV == "site_01") {
        propMap["WEB_SERVER"]   =  'site_01.someplace.org'
        propMap["DB_SERVER"]    =  'site_01.db.someplace.org'
        propMap["DB_NAME"]      =  'site_01_db'
        propMap["SITE_URL"]     =  'https://some-spiffy-name.org'
    } else {
        propMap["WEB_SERVER"]  =  'site_02.someplace.org'
        propMap["DB_SERVER"]   =  'site_02.db.someplace.org'
        propMap["DB_NAME"]     =  'site_02_db'
        propMap["SITE_URL"]   =  'https://some-different-name.org'
    }
    return propMap
 }
return this
