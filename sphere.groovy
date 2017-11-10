//create a sphere
CSG sphere = new Sphere(100)// Spheres radius
				.toCSG()// convert to CSG to display
				.movex(200)
CSG sphereHighRes = new Sphere(100,// Spheres radius
						40,//elevation Divisions
						40)// vertical divisions
						.toCSG()// convert to CSG to display

return [sphere,sphereHighRes]