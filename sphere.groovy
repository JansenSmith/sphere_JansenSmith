//create a sphere
CSG sphere = new Sphere(25)// Spheres radius
				.toCSG()// convert to CSG to display
				.movex(55)
CSG sphereHighRes = new Sphere(25,// Spheres radius
						40,//elevation Divisions
						40)// vertical divisions
						.toCSG()// convert to CSG to display

sphereHighRes = sphereHighRes.movex(110)


CSG vitamin_hobbyServo_towerProMG91 = Vitamins.get("hobbyServo", "towerProMG91")


return [sphere,sphereHighRes, vitamin_hobbyServo_towerProMG91]