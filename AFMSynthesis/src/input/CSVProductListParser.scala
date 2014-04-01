package input

import com.github.tototoshi.csv.CSVReader

class CSVProductListParser {

	def parse(path : String) : List[Map[String,String]] = {
		val reader = CSVReader.open(path)
		val products = reader.allWithHeaders
		reader.close
		products
	}
}