
def setEnvironments(ENV) {
    def map[:]
    switch (ENV) {
      case 'site_01':
        map["WEB_SERVER"]   =  'site_01.someplace.org'
        map["DB_SERVER"]    =  'site_01.db.someplace.org'
        map["DB_NAME"]      =  'site_01_db'
        map["SITE_URL"]     =  'https://some-spiffy-name.org'
      case 'site_02':
        map["WEB_SERVER"]  =  'site_02.someplace.org'
        map["DB_SERVER"]   =  'site_02.db.someplace.org'
        map["DB_NAME"]     =  'site_02_db'
        map["SITE_URL"]   =  'https://some-different-name.org'
      default:
         error("ERROR: Unknown environment.")
    }
    return map
 }
