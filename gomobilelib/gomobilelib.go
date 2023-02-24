package gomobilelib

import "math/rand"

type (
	// DataProcessor :
	DataProcessor struct {
		// add fields here
	}
)

func (p *DataProcessor) RandomNumber() int {
	return rand.Intn(100)
}
