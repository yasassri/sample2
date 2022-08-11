
def setEnvironments(ENV) {
    def propMap = [:]
    switch (ENV) {
      case 'site_01':
        propMap["WEB_SERVER"]   =  'site_01.someplace.org'
        propMap["DB_SERVER"]    =  'site_01.db.someplace.org'
        propMap["DB_NAME"]      =  'site_01_db'
        propMap["SITE_URL"]     =  'https://some-spiffy-name.org'
      case 'site_02':
        propMap["WEB_SERVER"]  =  'site_02.someplace.org'
        propMap["DB_SERVER"]   =  'site_02.db.someplace.org'
        propMap["DB_NAME"]     =  'site_02_db'
        propMap["SITE_URL"]   =  'https://some-different-name.org'
      default:
         error("ERROR: Unknown environment.")
    }
    return propMap
 }
 
 return this
