import json
import sys
miJSON ={"personajesGOT":[
        {"khaleesi":[{
            "rol":"Madre de Dragones",
            "casa":"Targaryen",
            "Familiares": ["Rhaegar Targaryen", "Aerys II Targaryen", "Viserys Targaryen"]
            }],
            "Jon Nieve":[{
            "rol":"Comandandte Guardia Noche",
            "casa":"Stark",
            "Familiares": ["Rob Stark", "Aria Stark", "Sanasa Stark"]
            }]
        }
    ]
}


print (json.dumps (miJSON ))
sys.exit(0)
