# Progetto  Università  Programmazione ad Oggetti
Il progetto da noi svolto esegue la scansione di un indirizzo URL, una volta scansionato ritrova un indirizzo URL di un file csv per poter scaricare il data-set, file che contiene i dati da esaminare.
Mediante ambiente di programmazione eclipse abbiamo implementato delle classi per la gestione di tale file csv.
Le classi implementate svolgono le seguenti funzioni, prima di tutto viene scaricato il file csv, poi su tale file si esegue una analisi sintattica per poter creare delle strutture dati che contenute nel data-set.
Poi da un menu è  possibile scegliere quali dei dati mandare in output, infatti su richiesta dell’utente è  possibile visionare a video i metadati ovvero elenco degli attributi e del tipo, restituire i dati. restituire statistiche sui dati che specificando l’attributo sul quale effettuare la computazione quali:
• Numeri:
dove è  possibile eseguire  calcolo numero medio , minimo, massimo, deviazione standard, somma, conteggio
• Stringhe
dove viene eseguito il Conteggio elementi unici (per ogni elemento unico viene indicato il numero di occorrenze)
Nella restituzione dei dati è  possibile specificare in fase di richiesta una serie di filtri su attributi con operatori conditional e logical
Di seguito vengono  allegati i file UML del diagramma dei casi d’uso, del diagramma delle classi e del diagramma delle sequenze.
{
	"_type": "Project",
	"_id": "AAAAAAFF+h6SjaM2Hec=",
	"name": "Untitled",
	"ownedElements": [
		{
			"_type": "UMLModel",
			"_id": "AAAAAAFF+qBWK6M3Z8Y=",
			"_parent": {
				"$ref": "AAAAAAFF+h6SjaM2Hec="
			},
			"name": "Model",
			"ownedElements": [
				{
					"_type": "UMLClassDiagram",
					"_id": "AAAAAAFF+qBtyKM79qY=",
					"_parent": {
						"$ref": "AAAAAAFF+qBWK6M3Z8Y="
					},
					"name": "Main",
					"defaultDiagram": true
				}
			]
		},
		{
			"_type": "UMLModel",
			"_id": "AAAAAAFrRpQq9SSJRWY=",
			"_parent": {
				"$ref": "AAAAAAFF+h6SjaM2Hec="
			},
			"name": "Model1",
			"ownedElements": [
				{
					"_type": "UMLUseCaseDiagram",
					"_id": "AAAAAAFrRpQq9iSK/zg=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "UseCaseDiagram1",
					"ownedViews": [
						{
							"_type": "UMLActorView",
							"_id": "AAAAAAFrRpopRCSQzSU=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRpopRiSRHWg=",
									"_parent": {
										"$ref": "AAAAAAFrRpopRCSQzSU="
									},
									"model": {
										"$ref": "AAAAAAFrRpopQySON7s="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpopRiSSq1s=",
											"_parent": {
												"$ref": "AAAAAAFrRpopRiSRHWg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 352,
											"top": 864,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpopRiSTUaM=",
											"_parent": {
												"$ref": "AAAAAAFrRpopRiSRHWg="
											},
											"font": "Arial;13;1",
											"left": 181,
											"top": 493,
											"width": 41.17724609375,
											"height": 13,
											"text": "Utente"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpopRiSUjnQ=",
											"_parent": {
												"$ref": "AAAAAAFrRpopRiSRHWg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 352,
											"top": 864,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpopRySViPs=",
											"_parent": {
												"$ref": "AAAAAAFrRpopRiSRHWg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 352,
											"top": 864,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 176,
									"top": 486,
									"width": 51.17724609375,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRpopRiSSq1s="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRpopRiSTUaM="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRpopRiSUjnQ="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRpopRySViPs="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRpopRySWx8w=",
									"_parent": {
										"$ref": "AAAAAAFrRpopRCSQzSU="
									},
									"model": {
										"$ref": "AAAAAAFrRpopQySON7s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 176,
									"top": 432,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRpopSCSXhII=",
									"_parent": {
										"$ref": "AAAAAAFrRpopRCSQzSU="
									},
									"model": {
										"$ref": "AAAAAAFrRpopQySON7s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 176,
									"top": 432,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRpopSCSYPU8=",
									"_parent": {
										"$ref": "AAAAAAFrRpopRCSQzSU="
									},
									"model": {
										"$ref": "AAAAAAFrRpopQySON7s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 176,
									"top": 432,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRpopSCSZlSc=",
									"_parent": {
										"$ref": "AAAAAAFrRpopRCSQzSU="
									},
									"model": {
										"$ref": "AAAAAAFrRpopQySON7s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 176,
									"top": 432,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 176,
							"top": 432,
							"width": 51.17724609375,
							"height": 80,
							"nameCompartment": {
								"$ref": "AAAAAAFrRpopRiSRHWg="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRpopRySWx8w="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRpopSCSXhII="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRpopSCSYPU8="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRpopSCSZlSc="
							}
						},
						{
							"_type": "UMLUseCaseSubjectView",
							"_id": "AAAAAAFrRpsRCiS7Alw=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRpsRCiS5QvY="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRpsRCyS8i5c=",
									"_parent": {
										"$ref": "AAAAAAFrRpsRCiS7Alw="
									},
									"model": {
										"$ref": "AAAAAAFrRpsRCiS5QvY="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpsRCyS9EP0=",
											"_parent": {
												"$ref": "AAAAAAFrRpsRCyS8i5c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 16,
											"top": -48,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpsRCyS+w50=",
											"_parent": {
												"$ref": "AAAAAAFrRpsRCyS8i5c="
											},
											"font": "Arial;13;1",
											"left": 333,
											"top": 31,
											"width": 895,
											"height": 13,
											"text": "Sistema"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpsRCyS/rmg=",
											"_parent": {
												"$ref": "AAAAAAFrRpsRCyS8i5c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 16,
											"top": -48,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRpsRCyTAK2U=",
											"_parent": {
												"$ref": "AAAAAAFrRpsRCyS8i5c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 16,
											"top": -48,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 328,
									"top": 24,
									"width": 905,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRpsRCyS9EP0="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRpsRCyS+w50="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRpsRCyS/rmg="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRpsRCyTAK2U="
									}
								}
							],
							"font": "Arial;13;0",
							"left": 328,
							"top": 24,
							"width": 905,
							"height": 865,
							"nameCompartment": {
								"$ref": "AAAAAAFrRpsRCyS8i5c="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqM+FSXJ6ic=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqM+EiXHHb4="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqM+FSXKJdE=",
									"_parent": {
										"$ref": "AAAAAAFrRqM+FSXJ6ic="
									},
									"model": {
										"$ref": "AAAAAAFrRqM+EiXHHb4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqM+FSXLkdg=",
											"_parent": {
												"$ref": "AAAAAAFrRqM+FSXKJdE="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 848,
											"top": 752,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqM+FSXMQIo=",
											"_parent": {
												"$ref": "AAAAAAFrRqM+FSXKJdE="
											},
											"font": "Arial;13;1",
											"left": 457.5,
											"top": 402.5,
											"width": 126,
											"height": 13,
											"text": "Richiede metadati"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqM+FSXNCnQ=",
											"_parent": {
												"$ref": "AAAAAAFrRqM+FSXKJdE="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 848,
											"top": 752,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqM+FSXO7MY=",
											"_parent": {
												"$ref": "AAAAAAFrRqM+FSXKJdE="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 848,
											"top": 752,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 452.5,
									"top": 395.5,
									"width": 136,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqM+FSXLkdg="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqM+FSXMQIo="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqM+FSXNCnQ="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqM+FSXO7MY="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqM+FSXP3Uc=",
									"_parent": {
										"$ref": "AAAAAAFrRqM+FSXJ6ic="
									},
									"model": {
										"$ref": "AAAAAAFrRqM+EiXHHb4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 424,
									"top": 376,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqM+FSXQTxs=",
									"_parent": {
										"$ref": "AAAAAAFrRqM+FSXJ6ic="
									},
									"model": {
										"$ref": "AAAAAAFrRqM+EiXHHb4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 424,
									"top": 376,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqM+FSXR314=",
									"_parent": {
										"$ref": "AAAAAAFrRqM+FSXJ6ic="
									},
									"model": {
										"$ref": "AAAAAAFrRqM+EiXHHb4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 424,
									"top": 376,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqM+FSXSFnI=",
									"_parent": {
										"$ref": "AAAAAAFrRqM+FSXJ6ic="
									},
									"model": {
										"$ref": "AAAAAAFrRqM+EiXHHb4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 424,
									"top": 376,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqM+FiXTjWI=",
									"_parent": {
										"$ref": "AAAAAAFrRqM+FSXJ6ic="
									},
									"model": {
										"$ref": "AAAAAAFrRqM+EiXHHb4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 424,
									"top": 376,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 424,
							"top": 376,
							"width": 193,
							"height": 65,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqM+FSXKJdE="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqM+FSXP3Uc="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqM+FSXQTxs="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqM+FSXR314="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqM+FSXSFnI="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqM+FiXTjWI="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqS5GyYA9MI=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqS5GyX+er0="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqS5GyYBpTU=",
									"_parent": {
										"$ref": "AAAAAAFrRqS5GyYA9MI="
									},
									"model": {
										"$ref": "AAAAAAFrRqS5GyX+er0="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqS5GyYC8AM=",
											"_parent": {
												"$ref": "AAAAAAFrRqS5GyYBpTU="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -288,
											"top": 480,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqS5GyYDPKw=",
											"_parent": {
												"$ref": "AAAAAAFrRqS5GyYBpTU="
											},
											"font": "Arial;13;1",
											"left": 416.5,
											"top": 494.5,
											"width": 120,
											"height": 13,
											"text": "Richiede dati"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqS5GyYEswM=",
											"_parent": {
												"$ref": "AAAAAAFrRqS5GyYBpTU="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -288,
											"top": 480,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqS5GyYF1nQ=",
											"_parent": {
												"$ref": "AAAAAAFrRqS5GyYBpTU="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -288,
											"top": 480,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 411.5,
									"top": 487.5,
									"width": 130,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqS5GyYC8AM="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqS5GyYDPKw="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqS5GyYEswM="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqS5GyYF1nQ="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqS5GyYGGkk=",
									"_parent": {
										"$ref": "AAAAAAFrRqS5GyYA9MI="
									},
									"model": {
										"$ref": "AAAAAAFrRqS5GyX+er0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -144,
									"top": 240,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqS5GyYHR3w=",
									"_parent": {
										"$ref": "AAAAAAFrRqS5GyYA9MI="
									},
									"model": {
										"$ref": "AAAAAAFrRqS5GyX+er0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -144,
									"top": 240,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqS5GyYIGfg=",
									"_parent": {
										"$ref": "AAAAAAFrRqS5GyYA9MI="
									},
									"model": {
										"$ref": "AAAAAAFrRqS5GyX+er0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -144,
									"top": 240,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqS5GyYJbEo=",
									"_parent": {
										"$ref": "AAAAAAFrRqS5GyYA9MI="
									},
									"model": {
										"$ref": "AAAAAAFrRqS5GyX+er0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -144,
									"top": 240,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqS5GyYKsGw=",
									"_parent": {
										"$ref": "AAAAAAFrRqS5GyYA9MI="
									},
									"model": {
										"$ref": "AAAAAAFrRqS5GyX+er0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -144,
									"top": 240,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 384,
							"top": 464,
							"width": 185,
							"height": 73,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqS5GyYBpTU="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqS5GyYGGkk="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqS5GyYHR3w="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqS5GyYIGfg="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqS5GyYJbEo="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqS5GyYKsGw="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqVD+CYyV0E=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqVD+CYzeyM=",
									"_parent": {
										"$ref": "AAAAAAFrRqVD+CYyV0E="
									},
									"model": {
										"$ref": "AAAAAAFrRqVD+CYwlUU="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqVD+CY0BbU=",
											"_parent": {
												"$ref": "AAAAAAFrRqVD+CYzeyM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -224,
											"top": 704,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqVD+CY1d/Q=",
											"_parent": {
												"$ref": "AAAAAAFrRqVD+CYzeyM="
											},
											"font": "Arial;13;1",
											"left": 435,
											"top": 575.5,
											"width": 133,
											"height": 13,
											"text": "Richiede statistiche"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqVD+CY2aqs=",
											"_parent": {
												"$ref": "AAAAAAFrRqVD+CYzeyM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -224,
											"top": 704,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqVD+CY3fKw=",
											"_parent": {
												"$ref": "AAAAAAFrRqVD+CYzeyM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -224,
											"top": 704,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 430,
									"top": 568.5,
									"width": 143,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqVD+CY0BbU="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqVD+CY1d/Q="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqVD+CY2aqs="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqVD+CY3fKw="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqVD+CY4j5c=",
									"_parent": {
										"$ref": "AAAAAAFrRqVD+CYyV0E="
									},
									"model": {
										"$ref": "AAAAAAFrRqVD+CYwlUU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -112,
									"top": 352,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqVD+CY56As=",
									"_parent": {
										"$ref": "AAAAAAFrRqVD+CYyV0E="
									},
									"model": {
										"$ref": "AAAAAAFrRqVD+CYwlUU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -112,
									"top": 352,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqVD+CY6ni4=",
									"_parent": {
										"$ref": "AAAAAAFrRqVD+CYyV0E="
									},
									"model": {
										"$ref": "AAAAAAFrRqVD+CYwlUU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -112,
									"top": 352,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqVD+CY7O+Y=",
									"_parent": {
										"$ref": "AAAAAAFrRqVD+CYyV0E="
									},
									"model": {
										"$ref": "AAAAAAFrRqVD+CYwlUU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -112,
									"top": 352,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqVD+CY81Qg=",
									"_parent": {
										"$ref": "AAAAAAFrRqVD+CYyV0E="
									},
									"model": {
										"$ref": "AAAAAAFrRqVD+CYwlUU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -112,
									"top": 352,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 400,
							"top": 544,
							"width": 203,
							"height": 75,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqVD+CYzeyM="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqVD+CY4j5c="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqVD+CY56As="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqVD+CY6ni4="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqVD+CY7O+Y="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqVD+CY81Qg="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqe5gyZtzGg=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqe5giZrcVY="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqe5gyZuZ6Q=",
									"_parent": {
										"$ref": "AAAAAAFrRqe5gyZtzGg="
									},
									"model": {
										"$ref": "AAAAAAFrRqe5giZrcVY="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqe5gyZv5u0=",
											"_parent": {
												"$ref": "AAAAAAFrRqe5gyZuZ6Q="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -416,
											"top": 720,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqe5gyZwINI=",
											"_parent": {
												"$ref": "AAAAAAFrRqe5gyZuZ6Q="
											},
											"font": "Arial;13;1",
											"left": 652.5,
											"top": 750.5,
											"width": 178,
											"height": 13,
											"text": "Esegui operazioni statistiche"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqe5gyZxnzQ=",
											"_parent": {
												"$ref": "AAAAAAFrRqe5gyZuZ6Q="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -416,
											"top": 720,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqe5gyZybNY=",
											"_parent": {
												"$ref": "AAAAAAFrRqe5gyZuZ6Q="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -416,
											"top": 720,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 647.5,
									"top": 743.5,
									"width": 189.15625,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqe5gyZv5u0="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqe5gyZwINI="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqe5gyZxnzQ="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqe5gyZybNY="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqe5gyZzCEg=",
									"_parent": {
										"$ref": "AAAAAAFrRqe5gyZtzGg="
									},
									"model": {
										"$ref": "AAAAAAFrRqe5giZrcVY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -208,
									"top": 360,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqe5gyZ0GdY=",
									"_parent": {
										"$ref": "AAAAAAFrRqe5gyZtzGg="
									},
									"model": {
										"$ref": "AAAAAAFrRqe5giZrcVY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -208,
									"top": 360,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqe5gyZ1QR8=",
									"_parent": {
										"$ref": "AAAAAAFrRqe5gyZtzGg="
									},
									"model": {
										"$ref": "AAAAAAFrRqe5giZrcVY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -208,
									"top": 360,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqe5gyZ2JtU=",
									"_parent": {
										"$ref": "AAAAAAFrRqe5gyZtzGg="
									},
									"model": {
										"$ref": "AAAAAAFrRqe5giZrcVY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -208,
									"top": 360,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqe5gyZ3FoE=",
									"_parent": {
										"$ref": "AAAAAAFrRqe5gyZtzGg="
									},
									"model": {
										"$ref": "AAAAAAFrRqe5giZrcVY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -208,
									"top": 360,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 608,
							"top": 720,
							"width": 267,
							"height": 73,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqe5gyZuZ6Q="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqe5gyZzCEg="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqe5gyZ0GdY="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqe5gyZ1QR8="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqe5gyZ2JtU="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqe5gyZ3FoE="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqfDwyaaXHY=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqfDwyaYTNI="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqfDwyablv4=",
									"_parent": {
										"$ref": "AAAAAAFrRqfDwyaaXHY="
									},
									"model": {
										"$ref": "AAAAAAFrRqfDwyaYTNI="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqfDwyacR34=",
											"_parent": {
												"$ref": "AAAAAAFrRqfDwyablv4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -1024,
											"top": 592,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqfDwyad39o=",
											"_parent": {
												"$ref": "AAAAAAFrRqfDwyablv4="
											},
											"font": "Arial;13;1",
											"left": 377.5,
											"top": 762.5,
											"width": 166,
											"height": 13,
											"text": "Conteggia elementi"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqfDxCae1BQ=",
											"_parent": {
												"$ref": "AAAAAAFrRqfDwyablv4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -1024,
											"top": 592,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqfDxCaflLg=",
											"_parent": {
												"$ref": "AAAAAAFrRqfDwyablv4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -1024,
											"top": 592,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 372.5,
									"top": 755.5,
									"width": 176,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqfDwyacR34="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqfDwyad39o="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqfDxCae1BQ="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqfDxCaflLg="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqfDxCag/iU=",
									"_parent": {
										"$ref": "AAAAAAFrRqfDwyaaXHY="
									},
									"model": {
										"$ref": "AAAAAAFrRqfDwyaYTNI="
									},
									"subViews": [
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFrRtih9WcmDLo=",
											"_parent": {
												"$ref": "AAAAAAFrRqfDxCag/iU="
											},
											"model": {
												"$ref": "AAAAAAFrRtPiiGcB1HY="
											},
											"visible": false,
											"font": "Arial;13;0",
											"width": 41.55810546875,
											"height": 13,
											"text": "+Role1",
											"horizontalAlignment": 0
										}
									],
									"visible": false,
									"font": "Arial;13;0",
									"left": -512,
									"top": 296,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqfDxCahgr4=",
									"_parent": {
										"$ref": "AAAAAAFrRqfDwyaaXHY="
									},
									"model": {
										"$ref": "AAAAAAFrRqfDwyaYTNI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -512,
									"top": 296,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqfDxCaiX8M=",
									"_parent": {
										"$ref": "AAAAAAFrRqfDwyaaXHY="
									},
									"model": {
										"$ref": "AAAAAAFrRqfDwyaYTNI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -512,
									"top": 296,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqfDxCajYvI=",
									"_parent": {
										"$ref": "AAAAAAFrRqfDwyaaXHY="
									},
									"model": {
										"$ref": "AAAAAAFrRqfDwyaYTNI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -512,
									"top": 296,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqfDxCakXcc=",
									"_parent": {
										"$ref": "AAAAAAFrRqfDwyaaXHY="
									},
									"model": {
										"$ref": "AAAAAAFrRqfDwyaYTNI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -512,
									"top": 296,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 336,
							"top": 728,
							"width": 249,
							"height": 81,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqfDwyablv4="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqfDxCag/iU="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqfDxCahgr4="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqfDxCaiX8M="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqfDxCajYvI="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqfDxCakXcc="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqpX7Sbb+eQ=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqpX7SbZUSc="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqpX7SbcmOc=",
									"_parent": {
										"$ref": "AAAAAAFrRqpX7Sbb+eQ="
									},
									"model": {
										"$ref": "AAAAAAFrRqpX7SbZUSc="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqpX7Sbdcd4=",
											"_parent": {
												"$ref": "AAAAAAFrRqpX7SbcmOc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 752,
											"top": -928,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqpX7SbeYgo=",
											"_parent": {
												"$ref": "AAAAAAFrRqpX7SbcmOc="
											},
											"font": "Arial;13;1",
											"left": 534.5,
											"top": 102.5,
											"width": 189,
											"height": 13,
											"text": "Download e decodifica dei dati"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqpX7ibfWjo=",
											"_parent": {
												"$ref": "AAAAAAFrRqpX7SbcmOc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 752,
											"top": -928,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqpX7ibgIoU=",
											"_parent": {
												"$ref": "AAAAAAFrRqpX7SbcmOc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 752,
											"top": -928,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 529.5,
									"top": 95.5,
									"width": 199.97265625,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqpX7Sbdcd4="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqpX7SbeYgo="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqpX7ibfWjo="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqpX7ibgIoU="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqpX7ibha0U=",
									"_parent": {
										"$ref": "AAAAAAFrRqpX7Sbb+eQ="
									},
									"model": {
										"$ref": "AAAAAAFrRqpX7SbZUSc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 376,
									"top": -464,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqpX7ibiyv4=",
									"_parent": {
										"$ref": "AAAAAAFrRqpX7Sbb+eQ="
									},
									"model": {
										"$ref": "AAAAAAFrRqpX7SbZUSc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 376,
									"top": -464,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqpX7ibjsxY=",
									"_parent": {
										"$ref": "AAAAAAFrRqpX7Sbb+eQ="
									},
									"model": {
										"$ref": "AAAAAAFrRqpX7SbZUSc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 376,
									"top": -464,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqpX7ibk7YY=",
									"_parent": {
										"$ref": "AAAAAAFrRqpX7Sbb+eQ="
									},
									"model": {
										"$ref": "AAAAAAFrRqpX7SbZUSc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 376,
									"top": -464,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqpX7ibloys=",
									"_parent": {
										"$ref": "AAAAAAFrRqpX7Sbb+eQ="
									},
									"model": {
										"$ref": "AAAAAAFrRqpX7SbZUSc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 376,
									"top": -464,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 488,
							"top": 72,
							"width": 282,
							"height": 73,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqpX7SbcmOc="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqpX7ibha0U="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqpX7ibiyv4="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqpX7ibjsxY="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqpX7ibk7YY="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqpX7ibloys="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRqwzSycU438=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRqwzSicS6d0="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRqwzSycVTq0=",
									"_parent": {
										"$ref": "AAAAAAFrRqwzSycU438="
									},
									"model": {
										"$ref": "AAAAAAFrRqwzSicS6d0="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqwzTCcW5x4=",
											"_parent": {
												"$ref": "AAAAAAFrRqwzSycVTq0="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -688,
											"top": 80,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqwzTCcXg1s=",
											"_parent": {
												"$ref": "AAAAAAFrRqwzSycVTq0="
											},
											"font": "Arial;13;1",
											"left": 581,
											"top": 227.5,
											"width": 143,
											"height": 13,
											"text": "Esegui Parsing"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqwzTCcYy/M=",
											"_parent": {
												"$ref": "AAAAAAFrRqwzSycVTq0="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -688,
											"top": 80,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRqwzTCcZJmE=",
											"_parent": {
												"$ref": "AAAAAAFrRqwzSycVTq0="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -688,
											"top": 80,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 576,
									"top": 220.5,
									"width": 153,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRqwzTCcW5x4="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRqwzTCcXg1s="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRqwzTCcYy/M="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRqwzTCcZJmE="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRqwzTCcacgE=",
									"_parent": {
										"$ref": "AAAAAAFrRqwzSycU438="
									},
									"model": {
										"$ref": "AAAAAAFrRqwzSicS6d0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -344,
									"top": 40,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRqwzTCcb3fU=",
									"_parent": {
										"$ref": "AAAAAAFrRqwzSycU438="
									},
									"model": {
										"$ref": "AAAAAAFrRqwzSicS6d0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -344,
									"top": 40,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRqwzTSccZ0w=",
									"_parent": {
										"$ref": "AAAAAAFrRqwzSycU438="
									},
									"model": {
										"$ref": "AAAAAAFrRqwzSicS6d0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -344,
									"top": 40,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRqwzTScdODE=",
									"_parent": {
										"$ref": "AAAAAAFrRqwzSycU438="
									},
									"model": {
										"$ref": "AAAAAAFrRqwzSicS6d0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -344,
									"top": 40,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRqwzTSceVSs=",
									"_parent": {
										"$ref": "AAAAAAFrRqwzSycU438="
									},
									"model": {
										"$ref": "AAAAAAFrRqwzSicS6d0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -344,
									"top": 40,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 544,
							"top": 200,
							"width": 217,
							"height": 67,
							"nameCompartment": {
								"$ref": "AAAAAAFrRqwzSycVTq0="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRqwzTCcacgE="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRqwzTCcb3fU="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRqwzTSccZ0w="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRqwzTScdODE="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRqwzTSceVSs="
							}
						},
						{
							"_type": "UMLActorView",
							"_id": "AAAAAAFrRrFJISdNvQk=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRrFJISdOYoo=",
									"_parent": {
										"$ref": "AAAAAAFrRrFJISdNvQk="
									},
									"model": {
										"$ref": "AAAAAAFrRrFJISdL9oA="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrFJISdPCno=",
											"_parent": {
												"$ref": "AAAAAAFrRrFJISdOYoo="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 144,
											"top": -176,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrFJISdQGsE=",
											"_parent": {
												"$ref": "AAAAAAFrRrFJISdOYoo="
											},
											"font": "Arial;13;1",
											"left": 229,
											"top": 205,
											"width": 54.90087890625,
											"height": 13,
											"text": "Software"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrFJIidRX0w=",
											"_parent": {
												"$ref": "AAAAAAFrRrFJISdOYoo="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 144,
											"top": -176,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrFJIidS0aE=",
											"_parent": {
												"$ref": "AAAAAAFrRrFJISdOYoo="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 144,
											"top": -176,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 198,
									"width": 64.90087890625,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRrFJISdPCno="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRrFJISdQGsE="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRrFJIidRX0w="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRrFJIidS0aE="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRrFJIidTWuw=",
									"_parent": {
										"$ref": "AAAAAAFrRrFJISdNvQk="
									},
									"model": {
										"$ref": "AAAAAAFrRrFJISdL9oA="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 72,
									"top": -88,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRrFJIidUie4=",
									"_parent": {
										"$ref": "AAAAAAFrRrFJISdNvQk="
									},
									"model": {
										"$ref": "AAAAAAFrRrFJISdL9oA="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 72,
									"top": -88,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRrFJIidVwKs=",
									"_parent": {
										"$ref": "AAAAAAFrRrFJISdNvQk="
									},
									"model": {
										"$ref": "AAAAAAFrRrFJISdL9oA="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 72,
									"top": -88,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRrFJIidW9VI=",
									"_parent": {
										"$ref": "AAAAAAFrRrFJISdNvQk="
									},
									"model": {
										"$ref": "AAAAAAFrRrFJISdL9oA="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 72,
									"top": -88,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 224,
							"top": 144,
							"width": 64.90087890625,
							"height": 80,
							"nameCompartment": {
								"$ref": "AAAAAAFrRrFJISdOYoo="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRrFJIidTWuw="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRrFJIidUie4="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRrFJIidVwKs="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRrFJIidW9VI="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRrgtXif+ePw=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRrgtXif/p7c=",
									"_parent": {
										"$ref": "AAAAAAFrRrgtXif+ePw="
									},
									"model": {
										"$ref": "AAAAAAFrRrgtXif8mD0="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrgtXigAmDA=",
											"_parent": {
												"$ref": "AAAAAAFrRrgtXif/p7c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1296,
											"top": -384,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrgtXigBxNk=",
											"_parent": {
												"$ref": "AAAAAAFrRrgtXif/p7c="
											},
											"font": "Arial;13;1",
											"left": 881.5,
											"top": 330.5,
											"width": 202,
											"height": 13,
											"text": "Gestisce problemi nelle richieste"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrgtXigCDtI=",
											"_parent": {
												"$ref": "AAAAAAFrRrgtXif/p7c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1296,
											"top": -384,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrgtXigDht8=",
											"_parent": {
												"$ref": "AAAAAAFrRrgtXif/p7c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1296,
											"top": -384,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 876.5,
									"top": 323.5,
									"width": 213.02978515625,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRrgtXigAmDA="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRrgtXigBxNk="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRrgtXigCDtI="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRrgtXigDht8="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRrgtXigEDSI=",
									"_parent": {
										"$ref": "AAAAAAFrRrgtXif+ePw="
									},
									"model": {
										"$ref": "AAAAAAFrRrgtXif8mD0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 648,
									"top": -192,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRrgtXigFQKk=",
									"_parent": {
										"$ref": "AAAAAAFrRrgtXif+ePw="
									},
									"model": {
										"$ref": "AAAAAAFrRrgtXif8mD0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 648,
									"top": -192,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRrgtXigGQVs=",
									"_parent": {
										"$ref": "AAAAAAFrRrgtXif+ePw="
									},
									"model": {
										"$ref": "AAAAAAFrRrgtXif8mD0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 648,
									"top": -192,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRrgtXygHp58=",
									"_parent": {
										"$ref": "AAAAAAFrRrgtXif+ePw="
									},
									"model": {
										"$ref": "AAAAAAFrRrgtXif8mD0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 648,
									"top": -192,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRrgtXygInl4=",
									"_parent": {
										"$ref": "AAAAAAFrRrgtXif+ePw="
									},
									"model": {
										"$ref": "AAAAAAFrRrgtXif8mD0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 648,
									"top": -192,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 832,
							"top": 296,
							"width": 301,
							"height": 81,
							"nameCompartment": {
								"$ref": "AAAAAAFrRrgtXif/p7c="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRrgtXigEDSI="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRrgtXigFQKk="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRrgtXigGQVs="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRrgtXygHp58="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRrgtXygInl4="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRrhIpSgqj2E=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRrUvrCey2Fk="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRrhIpSgrc0I=",
									"_parent": {
										"$ref": "AAAAAAFrRrhIpSgqj2E="
									},
									"model": {
										"$ref": "AAAAAAFrRrUvrCey2Fk="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrhIpSgsGmc=",
											"_parent": {
												"$ref": "AAAAAAFrRrhIpSgrc0I="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 268,
											"top": -550,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrhIpSgtXyo=",
											"_parent": {
												"$ref": "AAAAAAFrRrhIpSgrc0I="
											},
											"font": "Arial;13;1",
											"left": 947,
											"top": 150.5,
											"width": 212,
											"height": 13,
											"text": "Gestisce problemi di importazione"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrhIpSguUg8=",
											"_parent": {
												"$ref": "AAAAAAFrRrhIpSgrc0I="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 268,
											"top": -550,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRrhIpSgvwQY=",
											"_parent": {
												"$ref": "AAAAAAFrRrhIpSgrc0I="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 268,
											"top": -550,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 942,
									"top": 143.5,
									"width": 222.3798828125,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRrhIpSgsGmc="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRrhIpSgtXyo="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRrhIpSguUg8="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRrhIpSgvwQY="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRrhIpSgwWAc=",
									"_parent": {
										"$ref": "AAAAAAFrRrhIpSgqj2E="
									},
									"model": {
										"$ref": "AAAAAAFrRrUvrCey2Fk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 134,
									"top": -275,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRrhIpSgxGZ8=",
									"_parent": {
										"$ref": "AAAAAAFrRrhIpSgqj2E="
									},
									"model": {
										"$ref": "AAAAAAFrRrUvrCey2Fk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 134,
									"top": -275,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRrhIpSgyDTA=",
									"_parent": {
										"$ref": "AAAAAAFrRrhIpSgqj2E="
									},
									"model": {
										"$ref": "AAAAAAFrRrUvrCey2Fk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 134,
									"top": -275,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRrhIpSgzbHA=",
									"_parent": {
										"$ref": "AAAAAAFrRrhIpSgqj2E="
									},
									"model": {
										"$ref": "AAAAAAFrRrUvrCey2Fk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 134,
									"top": -275,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRrhIpSg0QEY=",
									"_parent": {
										"$ref": "AAAAAAFrRrhIpSgqj2E="
									},
									"model": {
										"$ref": "AAAAAAFrRrUvrCey2Fk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 134,
									"top": -275,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 896,
							"top": 112,
							"width": 314,
							"height": 89,
							"nameCompartment": {
								"$ref": "AAAAAAFrRrhIpSgrc0I="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRrhIpSgwWAc="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRrhIpSgxGZ8="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRrhIpSgyDTA="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRrhIpSgzbHA="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRrhIpSg0QEY="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrRsKpOiwdGAY=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsKpOiwZ6hs="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiweNfI=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwZ6hs="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 417,
									"top": 182,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwfj8E=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwZ6hs="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 419,
									"top": 167,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwgXEg=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwZ6hs="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 414,
									"top": 211,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwhQU0=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwaYpU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 316,
									"top": 169,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwizVc=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwaYpU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 320,
									"top": 156,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwjZf8=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwaYpU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 308,
									"top": 196,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwkkL0=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwbw58="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 519,
									"top": 194,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwlgOE=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwbw58="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 518,
									"top": 181,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsKpOiwmNJ0=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwbw58="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 519,
									"top": 222,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsKpOiwnlgQ=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwaYpU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsKpOiwojbI=",
									"_parent": {
										"$ref": "AAAAAAFrRsKpOiwdGAY="
									},
									"model": {
										"$ref": "AAAAAAFrRsKpOiwbw58="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqwzSycU438="
							},
							"tail": {
								"$ref": "AAAAAAFrRrFJISdNvQk="
							},
							"lineStyle": 1,
							"points": "289:187;543:219",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsKpOiweNfI="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsKpOiwfj8E="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsKpOiwgXEg="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrRsKpOiwhQU0="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrRsKpOiwizVc="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrRsKpOiwjZf8="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrRsKpOiwkkL0="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrRsKpOiwlgOE="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrRsKpOiwmNJ0="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrRsKpOiwnlgQ="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrRsKpOiwojbI="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrRsL7oyxmHKE=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsL7oixiSrY="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxn0VQ=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixiSrY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 385,
									"top": 135,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxoYCY=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixiSrY="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 382,
									"top": 120,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxpfT0=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixiSrY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 390,
									"top": 164,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxqIb8=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixjaj4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 311,
									"top": 150,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxrerM=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixjaj4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 311,
									"top": 136,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxsBKo=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixjaj4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 312,
									"top": 177,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxtUEc=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixkGJE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 458,
									"top": 120,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxuLVE=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixkGJE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 453,
									"top": 107,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsL7oyxvouY=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixkGJE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 468,
									"top": 146,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsL7oyxwedI=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixjaj4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsL7oyxxu/k=",
									"_parent": {
										"$ref": "AAAAAAFrRsL7oyxmHKE="
									},
									"model": {
										"$ref": "AAAAAAFrRsL7oixkGJE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqpX7Sbb+eQ="
							},
							"tail": {
								"$ref": "AAAAAAFrRrFJISdNvQk="
							},
							"lineStyle": 1,
							"points": "289:176;487:136",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsL7oyxn0VQ="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsL7oyxoYCY="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsL7oyxpfT0="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrRsL7oyxqIb8="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrRsL7oyxrerM="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrRsL7oyxsBKo="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrRsL7oyxtUEc="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrRsL7oyxuLVE="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrRsL7oyxvouY="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrRsL7oyxwedI="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrRsL7oyxxu/k="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrRsQFlC/yUew=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsQFky/uWXY="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlC/zmhc=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/uWXY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 322,
									"top": 425,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/0hq8=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/uWXY="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 319,
									"top": 410,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/1QiU=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/uWXY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 327,
									"top": 454,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/2CPI=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/vbcU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 249,
									"top": 440,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/3pwU=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/vbcU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 249,
									"top": 426,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/4bfQ=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/vbcU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 250,
									"top": 468,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/5HNY=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFlC/w4R4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 394,
									"top": 411,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/6B5w=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFlC/w4R4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 389,
									"top": 398,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQFlS/76Ig=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFlC/w4R4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 404,
									"top": 437,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsQFlS/8TuY=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFky/vbcU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsQFlS/9xiQ=",
									"_parent": {
										"$ref": "AAAAAAFrRsQFlC/yUew="
									},
									"model": {
										"$ref": "AAAAAAFrRsQFlC/w4R4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqM+FSXJ6ic="
							},
							"tail": {
								"$ref": "AAAAAAFrRpopRCSQzSU="
							},
							"lineStyle": 1,
							"points": "227:466;423:427",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsQFlC/zmhc="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsQFlS/0hq8="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsQFlS/1QiU="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrRsQFlS/2CPI="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrRsQFlS/3pwU="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrRsQFlS/4bfQ="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrRsQFlS/5HNY="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrRsQFlS/6B5w="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrRsQFlS/76Ig="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrRsQFlS/8TuY="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrRsQFlS/9xiQ="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrRsQPvjBiviU=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsQPvTBeaxI="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBjl6I=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBeaxI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 306,
									"top": 461,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBkjS0=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBeaxI="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 308,
									"top": 446,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBliZI=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBeaxI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 303,
									"top": 490,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBmUPU=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBf4pk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 254,
									"top": 455,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBn1Ms=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBf4pk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 258,
									"top": 442,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBoFN4=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBf4pk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 247,
									"top": 482,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBpvu4=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBgYD4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 358,
									"top": 466,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBqBTk=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBgYD4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 357,
									"top": 452,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQPvjBr6rc=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBgYD4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 360,
									"top": 494,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsQPvjBsx+A=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBf4pk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsQPvjBtF5I=",
									"_parent": {
										"$ref": "AAAAAAFrRsQPvjBiviU="
									},
									"model": {
										"$ref": "AAAAAAFrRsQPvTBgYD4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqS5GyYA9MI="
							},
							"tail": {
								"$ref": "AAAAAAFrRpopRCSQzSU="
							},
							"lineStyle": 1,
							"points": "227:474;383:490",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsQPvjBjl6I="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsQPvjBkjS0="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsQPvjBliZI="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrRsQPvjBmUPU="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrRsQPvjBn1Ms="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrRsQPvjBoFN4="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrRsQPvjBpvu4="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrRsQPvjBqBTk="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrRsQPvjBr6rc="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrRsQPvjBsx+A="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrRsQPvjBtF5I="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrRsQY6jDhTCM=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsQY6TDdg8Y="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDiTn0=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDdg8Y="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 318,
									"top": 491,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDjLB0=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDdg8Y="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 323,
									"top": 477,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDkmeM=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDdg8Y="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 307,
									"top": 520,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDlwL4=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDeDdE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 256,
									"top": 469,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDm6Gs=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDeDdE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 263,
									"top": 458,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDnn6Y=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDeDdE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 243,
									"top": 494,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDokvY=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6jDfZaE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 379,
									"top": 514,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDpsow=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6jDfZaE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 382,
									"top": 501,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsQY6zDqfuE=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6jDfZaE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 374,
									"top": 542,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsQY6zDrJ/U=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6TDeDdE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrRsQY6zDsHPw=",
									"_parent": {
										"$ref": "AAAAAAFrRsQY6jDhTCM="
									},
									"model": {
										"$ref": "AAAAAAFrRsQY6jDfZaE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqVD+CYyV0E="
							},
							"tail": {
								"$ref": "AAAAAAFrRpopRCSQzSU="
							},
							"lineStyle": 1,
							"points": "227:481;399:544",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsQY6zDiTn0="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsQY6zDjLB0="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsQY6zDkmeM="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrRsQY6zDlwL4="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrRsQY6zDm6Gs="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrRsQY6zDnn6Y="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrRsQY6zDokvY="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrRsQY6zDpsow="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrRsQY6zDqfuE="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrRsQY6zDrJ/U="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrRsQY6zDsHPw="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRsb/akDaue4=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsb/akDYjok="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsb/akDbtEM=",
									"_parent": {
										"$ref": "AAAAAAFrRsb/akDaue4="
									},
									"model": {
										"$ref": "AAAAAAFrRsb/akDYjok="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 830,
									"top": 139,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsb/akDaue4="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsb/a0DcaVo=",
									"_parent": {
										"$ref": "AAAAAAFrRsb/akDaue4="
									},
									"model": {
										"$ref": "AAAAAAFrRsb/akDYjok="
									},
									"font": "Arial;13;0",
									"left": 802,
									"top": 154,
									"width": 53.49169921875,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsb/akDaue4="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsb/a0DdKxI=",
									"_parent": {
										"$ref": "AAAAAAFrRsb/akDaue4="
									},
									"model": {
										"$ref": "AAAAAAFrRsb/akDYjok="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 833,
									"top": 110,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsb/akDaue4="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqpX7Sbb+eQ="
							},
							"tail": {
								"$ref": "AAAAAAFrRrhIpSgqj2E="
							},
							"lineStyle": 1,
							"points": "895:138;770:124",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsb/akDbtEM="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsb/a0DcaVo="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsb/a0DdKxI="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRseZEkQODZo=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRseZEkQMYYU="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRseZEkQPm9Y=",
									"_parent": {
										"$ref": "AAAAAAFrRseZEkQODZo="
									},
									"model": {
										"$ref": "AAAAAAFrRseZEkQMYYU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 726,
									"top": 384,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRseZEkQODZo="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRseZEkQQZSI=",
									"_parent": {
										"$ref": "AAAAAAFrRseZEkQODZo="
									},
									"model": {
										"$ref": "AAAAAAFrRseZEkQMYYU="
									},
									"font": "Arial;13;0",
									"left": 752,
									"top": 375,
									"width": 53.49169921875,
									"height": 13,
									"alpha": 2.8733738686725605,
									"distance": 54.3323108288245,
									"hostEdge": {
										"$ref": "AAAAAAFrRseZEkQODZo="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRseZEkQRG+4=",
									"_parent": {
										"$ref": "AAAAAAFrRseZEkQODZo="
									},
									"model": {
										"$ref": "AAAAAAFrRseZEkQMYYU="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 721,
									"top": 355,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRseZEkQODZo="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqM+FSXJ6ic="
							},
							"tail": {
								"$ref": "AAAAAAFrRrgtXif+ePw="
							},
							"lineStyle": 1,
							"points": "831:360;617:393",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRseZEkQPm9Y="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRseZEkQQZSI="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRseZEkQRG+4="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRseqeURqsGA=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRseqeURohoI="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRseqeURr/XM=",
									"_parent": {
										"$ref": "AAAAAAFrRseqeURqsGA="
									},
									"model": {
										"$ref": "AAAAAAFrRseqeURohoI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 716,
									"top": 431,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRseqeURqsGA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRseqeURsKLE=",
									"_parent": {
										"$ref": "AAAAAAFrRseqeURqsGA="
									},
									"model": {
										"$ref": "AAAAAAFrRseqeURohoI="
									},
									"font": "Arial;13;0",
									"left": 728,
									"top": 416,
									"width": 53.49169921875,
									"height": 13,
									"alpha": 2.847848754916145,
									"distance": 42.01190307520001,
									"hostEdge": {
										"$ref": "AAAAAAFrRseqeURqsGA="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRseqeURtE3U=",
									"_parent": {
										"$ref": "AAAAAAFrRseqeURqsGA="
									},
									"model": {
										"$ref": "AAAAAAFrRseqeURohoI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 707,
									"top": 402,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRseqeURqsGA="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqS5GyYA9MI="
							},
							"tail": {
								"$ref": "AAAAAAFrRrgtXif+ePw="
							},
							"lineStyle": 1,
							"points": "856:377;569:470",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRseqeURr/XM="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRseqeURsKLE="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRseqeURtE3U="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRse7YkTGITE=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRse7YkTEU74="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRse7YkTHmv8=",
									"_parent": {
										"$ref": "AAAAAAFrRse7YkTGITE="
									},
									"model": {
										"$ref": "AAAAAAFrRse7YkTEU74="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 745,
									"top": 467,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRse7YkTGITE="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRse7YkTIog8=",
									"_parent": {
										"$ref": "AAAAAAFrRse7YkTGITE="
									},
									"model": {
										"$ref": "AAAAAAFrRse7YkTEU74="
									},
									"font": "Arial;13;0",
									"left": 800,
									"top": 583,
									"width": 53.49169921875,
									"height": 13,
									"alpha": 1.6895895656653312,
									"distance": 156.42570121306792,
									"hostEdge": {
										"$ref": "AAAAAAFrRse7YkTGITE="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRse7YkTJMZ0=",
									"_parent": {
										"$ref": "AAAAAAFrRse7YkTGITE="
									},
									"model": {
										"$ref": "AAAAAAFrRse7YkTEU74="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 732,
									"top": 440,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRse7YkTGITE="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqVD+CYyV0E="
							},
							"tail": {
								"$ref": "AAAAAAFrRrgtXif+ePw="
							},
							"lineStyle": 1,
							"points": "902:377;576:543",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRse7YkTHmv8="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRse7YkTIog8="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRse7YkTJMZ0="
							}
						},
						{
							"_type": "UMLIncludeView",
							"_id": "AAAAAAFrRsfcJUVPTqg=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsfcJEVNzG4="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsfcJUVQqKE=",
									"_parent": {
										"$ref": "AAAAAAFrRsfcJUVPTqg="
									},
									"model": {
										"$ref": "AAAAAAFrRsfcJEVNzG4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 629,
									"top": 650,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsfcJUVPTqg="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsfcJkVR5kg=",
									"_parent": {
										"$ref": "AAAAAAFrRsfcJUVPTqg="
									},
									"model": {
										"$ref": "AAAAAAFrRsfcJEVNzG4="
									},
									"font": "Arial;13;0",
									"left": 611,
									"top": 638,
									"width": 55.65625,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRsfcJUVPTqg="
									},
									"edgePosition": 1,
									"text": "«include»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsfcJkVSTjc=",
									"_parent": {
										"$ref": "AAAAAAFrRsfcJUVPTqg="
									},
									"model": {
										"$ref": "AAAAAAFrRsfcJEVNzG4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 612,
									"top": 675,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsfcJUVPTqg="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqe5gyZtzGg="
							},
							"tail": {
								"$ref": "AAAAAAFrRqVD+CYyV0E="
							},
							"lineStyle": 1,
							"points": "553:619;690:719",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsfcJUVQqKE="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsfcJkVR5kg="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsfcJkVSTjc="
							}
						},
						{
							"_type": "UMLIncludeView",
							"_id": "AAAAAAFrRshqaUXYIPg=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRshqY0XWo1Q="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRshqaUXZiW8=",
									"_parent": {
										"$ref": "AAAAAAFrRshqaUXYIPg="
									},
									"model": {
										"$ref": "AAAAAAFrRshqY0XWo1Q="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 495,
									"top": 670,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRshqaUXYIPg="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRshqaUXaX9w=",
									"_parent": {
										"$ref": "AAAAAAFrRshqaUXYIPg="
									},
									"model": {
										"$ref": "AAAAAAFrRshqY0XWo1Q="
									},
									"font": "Arial;13;0",
									"left": 483,
									"top": 673,
									"width": 55.65625,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrRshqaUXYIPg="
									},
									"edgePosition": 1,
									"text": "«include»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRshqaUXbNLU=",
									"_parent": {
										"$ref": "AAAAAAFrRshqaUXYIPg="
									},
									"model": {
										"$ref": "AAAAAAFrRshqY0XWo1Q="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 466,
									"top": 663,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRshqaUXYIPg="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqfDwyaaXHY="
							},
							"tail": {
								"$ref": "AAAAAAFrRqVD+CYyV0E="
							},
							"lineStyle": 1,
							"points": "493:619;469:727",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRshqaUXZiW8="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRshqaUXaX9w="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRshqaUXbNLU="
							}
						},
						{
							"_type": "UMLUseCaseView",
							"_id": "AAAAAAFrRsmVU1DYQVU=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRsmVU1DZr7c=",
									"_parent": {
										"$ref": "AAAAAAFrRsmVU1DYQVU="
									},
									"model": {
										"$ref": "AAAAAAFrRsmVU1DWPsE="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRsmVU1DaHNM=",
											"_parent": {
												"$ref": "AAAAAAFrRsmVU1DZr7c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 96,
											"top": 16,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRsmVVFDb8fg=",
											"_parent": {
												"$ref": "AAAAAAFrRsmVU1DZr7c="
											},
											"font": "Arial;13;1",
											"left": 1040.5,
											"top": 575.5,
											"width": 120,
											"height": 13,
											"text": "Specifica filtri"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRsmVVFDcHr4=",
											"_parent": {
												"$ref": "AAAAAAFrRsmVU1DZr7c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 96,
											"top": 16,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model1)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRsmVVFDdVX8=",
											"_parent": {
												"$ref": "AAAAAAFrRsmVU1DZr7c="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 96,
											"top": 16,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 1035.5,
									"top": 568.5,
									"width": 130,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRsmVU1DaHNM="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRsmVVFDb8fg="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRsmVVFDcHr4="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRsmVVFDdVX8="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRsmVVFDeb/A=",
									"_parent": {
										"$ref": "AAAAAAFrRsmVU1DYQVU="
									},
									"model": {
										"$ref": "AAAAAAFrRsmVU1DWPsE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 48,
									"top": 8,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRsmVVFDfW4w=",
									"_parent": {
										"$ref": "AAAAAAFrRsmVU1DYQVU="
									},
									"model": {
										"$ref": "AAAAAAFrRsmVU1DWPsE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 48,
									"top": 8,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRsmVVFDgSms=",
									"_parent": {
										"$ref": "AAAAAAFrRsmVU1DYQVU="
									},
									"model": {
										"$ref": "AAAAAAFrRsmVU1DWPsE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 48,
									"top": 8,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRsmVVFDhJoI=",
									"_parent": {
										"$ref": "AAAAAAFrRsmVU1DYQVU="
									},
									"model": {
										"$ref": "AAAAAAFrRsmVU1DWPsE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 48,
									"top": 8,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLExtensionPointCompartmentView",
									"_id": "AAAAAAFrRsmVVFDini4=",
									"_parent": {
										"$ref": "AAAAAAFrRsmVU1DYQVU="
									},
									"model": {
										"$ref": "AAAAAAFrRsmVU1DWPsE="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 48,
									"top": 8,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 1008,
							"top": 544,
							"width": 185,
							"height": 75,
							"nameCompartment": {
								"$ref": "AAAAAAFrRsmVU1DZr7c="
							},
							"suppressAttributes": true,
							"suppressOperations": true,
							"attributeCompartment": {
								"$ref": "AAAAAAFrRsmVVFDeb/A="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRsmVVFDfW4w="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRsmVVFDgSms="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRsmVVFDhJoI="
							},
							"extensionPointCompartment": {
								"$ref": "AAAAAAFrRsmVVFDini4="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRsrPlVYsxr8=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsrPlVYq5+w="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrPlVYtTr4=",
									"_parent": {
										"$ref": "AAAAAAFrRsrPlVYsxr8="
									},
									"model": {
										"$ref": "AAAAAAFrRsrPlVYq5+w="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 807,
									"top": 503,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrPlVYsxr8="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrPlVYuyvY=",
									"_parent": {
										"$ref": "AAAAAAFrRsrPlVYsxr8="
									},
									"model": {
										"$ref": "AAAAAAFrRsrPlVYq5+w="
									},
									"font": "Arial;13;0",
									"left": 816,
									"top": 511,
									"width": 53.49169921875,
									"height": 13,
									"alpha": 2.776612854002491,
									"distance": 37.8021163428716,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrPlVYsxr8="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrPlVYvL9s=",
									"_parent": {
										"$ref": "AAAAAAFrRsrPlVYsxr8="
									},
									"model": {
										"$ref": "AAAAAAFrRsrPlVYq5+w="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 816,
									"top": 474,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrPlVYsxr8="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqM+FSXJ6ic="
							},
							"tail": {
								"$ref": "AAAAAAFrRsmVU1DYQVU="
							},
							"lineStyle": 1,
							"points": "1007:553;617:437",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsrPlVYtTr4="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsrPlVYuyvY="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsrPlVYvL9s="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRsrgBFaIBcg=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsrgBFaGRpo="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrgBFaJ/Cg=",
									"_parent": {
										"$ref": "AAAAAAFrRsrgBFaIBcg="
									},
									"model": {
										"$ref": "AAAAAAFrRsrgBFaGRpo="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 786,
									"top": 548,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrgBFaIBcg="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrgBFaKCjU=",
									"_parent": {
										"$ref": "AAAAAAFrRsrgBFaIBcg="
									},
									"model": {
										"$ref": "AAAAAAFrRsrgBFaGRpo="
									},
									"font": "Arial;13;0",
									"left": 760,
									"top": 447,
									"width": 53.49169921875,
									"height": 13,
									"alpha": -1.4203808385336618,
									"distance": 86.02325267042627,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrgBFaIBcg="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrgBFaL/1I=",
									"_parent": {
										"$ref": "AAAAAAFrRsrgBFaIBcg="
									},
									"model": {
										"$ref": "AAAAAAFrRsrgBFaGRpo="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 789,
									"top": 519,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrgBFaIBcg="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqS5GyYA9MI="
							},
							"tail": {
								"$ref": "AAAAAAFrRsmVU1DYQVU="
							},
							"lineStyle": 1,
							"points": "1007:569;569:512",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsrgBFaJ/Cg="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsrgBFaKCjU="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsrgBFaL/1I="
							}
						},
						{
							"_type": "UMLExtendView",
							"_id": "AAAAAAFrRsrtKlbkZJQ=",
							"_parent": {
								"$ref": "AAAAAAFrRpQq9iSK/zg="
							},
							"model": {
								"$ref": "AAAAAAFrRsrtKlbim4s="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrtKlbl26A=",
									"_parent": {
										"$ref": "AAAAAAFrRsrtKlbkZJQ="
									},
									"model": {
										"$ref": "AAAAAAFrRsrtKlbim4s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 804,
									"top": 590,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrtKlbkZJQ="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrtKlbm7fg=",
									"_parent": {
										"$ref": "AAAAAAFrRsrtKlbkZJQ="
									},
									"model": {
										"$ref": "AAAAAAFrRsrtKlbim4s="
									},
									"font": "Arial;13;0",
									"left": 792,
									"top": 552,
									"width": 53.49169921875,
									"height": 13,
									"alpha": 4.19793733781283,
									"distance": 26.419689627245813,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrtKlbkZJQ="
									},
									"edgePosition": 1,
									"text": "«extend»"
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrRsrtKlbn6yU=",
									"_parent": {
										"$ref": "AAAAAAFrRsrtKlbkZJQ="
									},
									"model": {
										"$ref": "AAAAAAFrRsrtKlbim4s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 805,
									"top": 560,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrRsrtKlbkZJQ="
									},
									"edgePosition": 1
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRqVD+CYyV0E="
							},
							"tail": {
								"$ref": "AAAAAAFrRsmVU1DYQVU="
							},
							"lineStyle": 1,
							"points": "1007:581;603:581",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrRsrtKlbl26A="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrRsrtKlbm7fg="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrRsrtKlbn6yU="
							}
						}
					]
				},
				{
					"_type": "UMLActor",
					"_id": "AAAAAAFrRpopQySON7s=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Utente",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsOmhC5Brlw=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsOmhC5CZn8=",
								"_parent": {
									"$ref": "AAAAAAFrRsOmhC5Brlw="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsOmhC5DRyQ=",
								"_parent": {
									"$ref": "AAAAAAFrRsOmhC5Brlw="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsPUdi7nJLM=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsPUdi7ollI=",
								"_parent": {
									"$ref": "AAAAAAFrRsPUdi7nJLM="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsPUdi7pZjs=",
								"_parent": {
									"$ref": "AAAAAAFrRsPUdi7nJLM="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsP5CS+NKwU=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsP5CS+OLDE=",
								"_parent": {
									"$ref": "AAAAAAFrRsP5CS+NKwU="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsP5CS+PZQM=",
								"_parent": {
									"$ref": "AAAAAAFrRsP5CS+NKwU="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsQFky/uWXY=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQFky/vbcU=",
								"_parent": {
									"$ref": "AAAAAAFrRsQFky/uWXY="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQFlC/w4R4=",
								"_parent": {
									"$ref": "AAAAAAFrRsQFky/uWXY="
								},
								"reference": {
									"$ref": "AAAAAAFrRqM+EiXHHb4="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsQPvTBeaxI=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQPvTBf4pk=",
								"_parent": {
									"$ref": "AAAAAAFrRsQPvTBeaxI="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQPvTBgYD4=",
								"_parent": {
									"$ref": "AAAAAAFrRsQPvTBeaxI="
								},
								"reference": {
									"$ref": "AAAAAAFrRqS5GyX+er0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsQY6TDdg8Y=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQY6TDeDdE=",
								"_parent": {
									"$ref": "AAAAAAFrRsQY6TDdg8Y="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQY6jDfZaE=",
								"_parent": {
									"$ref": "AAAAAAFrRsQY6TDdg8Y="
								},
								"reference": {
									"$ref": "AAAAAAFrRqVD+CYwlUU="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsQjTjFriPM=",
							"_parent": {
								"$ref": "AAAAAAFrRpopQySON7s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQjTjFsbdY=",
								"_parent": {
									"$ref": "AAAAAAFrRsQjTjFriPM="
								},
								"reference": {
									"$ref": "AAAAAAFrRpopQySON7s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsQjTjFtCUA=",
								"_parent": {
									"$ref": "AAAAAAFrRsQjTjFriPM="
								},
								"reference": {
									"$ref": "AAAAAAFrRqfDwyaYTNI="
								}
							}
						}
					]
				},
				{
					"_type": "UMLUseCaseSubject",
					"_id": "AAAAAAFrRpsRCiS5QvY=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Sistema"
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqM+EiXHHb4=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Richiede metadati",
					"ownedElements": [
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsqP41TNcNk=",
							"_parent": {
								"$ref": "AAAAAAFrRqM+EiXHHb4="
							},
							"source": {
								"$ref": "AAAAAAFrRqM+EiXHHb4="
							},
							"target": {
								"$ref": "AAAAAAFrRqM+EiXHHb4="
							}
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqS5GyX+er0=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Richiede dati"
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqVD+CYwlUU=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Richiede statistiche",
					"ownedElements": [
						{
							"_type": "UMLInclude",
							"_id": "AAAAAAFrRsfcJEVNzG4=",
							"_parent": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							},
							"source": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							},
							"target": {
								"$ref": "AAAAAAFrRqe5giZrcVY="
							}
						},
						{
							"_type": "UMLInclude",
							"_id": "AAAAAAFrRshqY0XWo1Q=",
							"_parent": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							},
							"source": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							},
							"target": {
								"$ref": "AAAAAAFrRqfDwyaYTNI="
							}
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqe5giZrcVY=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Esegui operazioni statistiche"
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqfDwyaYTNI=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Conteggia elementi",
					"ownedElements": [
						{
							"_type": "UMLInteraction",
							"_id": "AAAAAAFrRtBdDGa41/M=",
							"_parent": {
								"$ref": "AAAAAAFrRqfDwyaYTNI="
							},
							"name": "Interaction1",
							"ownedElements": [
								{
									"_type": "UMLSequenceDiagram",
									"_id": "AAAAAAFrRtBdDWa5Joc=",
									"_parent": {
										"$ref": "AAAAAAFrRtBdDGa41/M="
									},
									"name": "SequenceDiagram1",
									"ownedElements": [
										{
											"_type": "FCFlowchart",
											"_id": "AAAAAAFrRtigeGchcpw=",
											"_parent": {
												"$ref": "AAAAAAFrRtBdDWa5Joc="
											},
											"name": "Flowchart1",
											"ownedElements": [
												{
													"_type": "FCFlowchartDiagram",
													"_id": "AAAAAAFrRtigeWcix6I=",
													"_parent": {
														"$ref": "AAAAAAFrRtigeGchcpw="
													},
													"name": "FlowchartDiagram1"
												}
											]
										}
									],
									"ownedViews": [
										{
											"_type": "UMLFrameView",
											"_id": "AAAAAAFrRtBdDWa6pFk=",
											"_parent": {
												"$ref": "AAAAAAFrRtBdDWa5Joc="
											},
											"model": {
												"$ref": "AAAAAAFrRtBdDWa5Joc="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrRtBdDma7D7E=",
													"_parent": {
														"$ref": "AAAAAAFrRtBdDWa6pFk="
													},
													"font": "Arial;13;0",
													"left": 75.97900390625,
													"top": 10,
													"width": 115.9052734375,
													"height": 13,
													"text": "SequenceDiagram1"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrRtBdDma8y30=",
													"_parent": {
														"$ref": "AAAAAAFrRtBdDWa6pFk="
													},
													"font": "Arial;13;1",
													"left": 10,
													"top": 10,
													"width": 60.97900390625,
													"height": 13,
													"text": "interaction"
												}
											],
											"font": "Arial;13;0",
											"left": 5,
											"top": 5,
											"width": 695,
											"height": 595,
											"nameLabel": {
												"$ref": "AAAAAAFrRtBdDma7D7E="
											},
											"frameTypeLabel": {
												"$ref": "AAAAAAFrRtBdDma8y30="
											}
										},
										{
											"_type": "UMLSeqLifelineView",
											"_id": "AAAAAAFrRtPiiGcD4DY=",
											"_parent": {
												"$ref": "AAAAAAFrRtBdDWa5Joc="
											},
											"model": {
												"$ref": "AAAAAAFrRtPiiGcC90U="
											},
											"subViews": [
												{
													"_type": "UMLNameCompartmentView",
													"_id": "AAAAAAFrRtPiiGcEK2Q=",
													"_parent": {
														"$ref": "AAAAAAFrRtPiiGcD4DY="
													},
													"model": {
														"$ref": "AAAAAAFrRtPiiGcC90U="
													},
													"subViews": [
														{
															"_type": "LabelView",
															"_id": "AAAAAAFrRtPiiGcFJZk=",
															"_parent": {
																"$ref": "AAAAAAFrRtPiiGcEK2Q="
															},
															"visible": false,
															"font": "Arial;13;0",
															"height": 13
														},
														{
															"_type": "LabelView",
															"_id": "AAAAAAFrRtPiiGcGKJs=",
															"_parent": {
																"$ref": "AAAAAAFrRtPiiGcEK2Q="
															},
															"font": "Arial;13;1",
															"left": 93,
															"top": 47,
															"width": 70.66455078125,
															"height": 13,
															"text": "Oggetto 1"
														},
														{
															"_type": "LabelView",
															"_id": "AAAAAAFrRtPiiWcHKCs=",
															"_parent": {
																"$ref": "AAAAAAFrRtPiiGcEK2Q="
															},
															"visible": false,
															"font": "Arial;13;0",
															"width": 106.20263671875,
															"height": 13,
															"text": "(from Interaction1)"
														},
														{
															"_type": "LabelView",
															"_id": "AAAAAAFrRtPiiWcInbE=",
															"_parent": {
																"$ref": "AAAAAAFrRtPiiGcEK2Q="
															},
															"visible": false,
															"font": "Arial;13;0",
															"height": 13,
															"horizontalAlignment": 1
														}
													],
													"font": "Arial;13;0",
													"left": 88,
													"top": 40,
													"width": 80.66455078125,
													"height": 40,
													"stereotypeLabel": {
														"$ref": "AAAAAAFrRtPiiGcFJZk="
													},
													"nameLabel": {
														"$ref": "AAAAAAFrRtPiiGcGKJs="
													},
													"namespaceLabel": {
														"$ref": "AAAAAAFrRtPiiWcHKCs="
													},
													"propertyLabel": {
														"$ref": "AAAAAAFrRtPiiWcInbE="
													}
												},
												{
													"_type": "UMLLinePartView",
													"_id": "AAAAAAFrRtPiiWcJnWI=",
													"_parent": {
														"$ref": "AAAAAAFrRtPiiGcD4DY="
													},
													"model": {
														"$ref": "AAAAAAFrRtPiiGcC90U="
													},
													"font": "Arial;13;0",
													"left": 128,
													"top": 80,
													"width": 1,
													"height": 160
												}
											],
											"font": "Arial;13;0",
											"left": 88,
											"top": 40,
											"width": 80.66455078125,
											"height": 200,
											"nameCompartment": {
												"$ref": "AAAAAAFrRtPiiGcEK2Q="
											},
											"linePart": {
												"$ref": "AAAAAAFrRtPiiWcJnWI="
											}
										}
									]
								}
							],
							"participants": [
								{
									"_type": "UMLLifeline",
									"_id": "AAAAAAFrRtPiiGcC90U=",
									"_parent": {
										"$ref": "AAAAAAFrRtBdDGa41/M="
									},
									"name": "Oggetto 1",
									"represent": {
										"$ref": "AAAAAAFrRtPiiGcB1HY="
									},
									"isMultiInstance": false
								}
							]
						}
					],
					"attributes": [
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFrRtPiiGcB1HY=",
							"_parent": {
								"$ref": "AAAAAAFrRqfDwyaYTNI="
							},
							"name": "Role1",
							"type": ""
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqpX7SbZUSc=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Download e decodifica dei dati",
					"ownedElements": [
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsbS5D9lgp4=",
							"_parent": {
								"$ref": "AAAAAAFrRqpX7SbZUSc="
							},
							"source": {
								"$ref": "AAAAAAFrRqpX7SbZUSc="
							},
							"target": {
								"$ref": "AAAAAAFrRrUvrCey2Fk="
							}
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRqwzSicS6d0=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Esegui Parsing"
				},
				{
					"_type": "UMLActor",
					"_id": "AAAAAAFrRrFJISdL9oA=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Software",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsD1XykR0f0=",
							"_parent": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsD1YSkSQbI=",
								"_parent": {
									"$ref": "AAAAAAFrRsD1XykR0f0="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								},
								"navigable": false
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsD1YSkTPx8=",
								"_parent": {
									"$ref": "AAAAAAFrRsD1XykR0f0="
								},
								"reference": {
									"$ref": "AAAAAAFrRqpX7SbZUSc="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsEetClwiuY=",
							"_parent": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsEetClxwto=",
								"_parent": {
									"$ref": "AAAAAAFrRsEetClwiuY="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								},
								"navigable": false
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsEetCly4n8=",
								"_parent": {
									"$ref": "AAAAAAFrRsEetClwiuY="
								},
								"reference": {
									"$ref": "AAAAAAFrRqwzSicS6d0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsGZKCqlBY8=",
							"_parent": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsGZKCqm5e0=",
								"_parent": {
									"$ref": "AAAAAAFrRsGZKCqlBY8="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								},
								"navigable": false
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsGZKCqnfvs=",
								"_parent": {
									"$ref": "AAAAAAFrRsGZKCqlBY8="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsJolCuseWQ=",
							"_parent": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsJolCut/tw=",
								"_parent": {
									"$ref": "AAAAAAFrRsJolCuseWQ="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								},
								"navigable": false
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsJolCuuSi4=",
								"_parent": {
									"$ref": "AAAAAAFrRsJolCuseWQ="
								},
								"reference": {
									"$ref": "AAAAAAFrRqwzSicS6d0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsKpOiwZ6hs=",
							"_parent": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsKpOiwaYpU=",
								"_parent": {
									"$ref": "AAAAAAFrRsKpOiwZ6hs="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsKpOiwbw58=",
								"_parent": {
									"$ref": "AAAAAAFrRsKpOiwZ6hs="
								},
								"reference": {
									"$ref": "AAAAAAFrRqwzSicS6d0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRsL7oixiSrY=",
							"_parent": {
								"$ref": "AAAAAAFrRrFJISdL9oA="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsL7oixjaj4=",
								"_parent": {
									"$ref": "AAAAAAFrRsL7oixiSrY="
								},
								"reference": {
									"$ref": "AAAAAAFrRrFJISdL9oA="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRsL7oixkGJE=",
								"_parent": {
									"$ref": "AAAAAAFrRsL7oixiSrY="
								},
								"reference": {
									"$ref": "AAAAAAFrRqpX7SbZUSc="
								}
							}
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRrUvrCey2Fk=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Gestisce problemi di importazione",
					"ownedElements": [
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsb/akDYjok=",
							"_parent": {
								"$ref": "AAAAAAFrRrUvrCey2Fk="
							},
							"source": {
								"$ref": "AAAAAAFrRrUvrCey2Fk="
							},
							"target": {
								"$ref": "AAAAAAFrRqpX7SbZUSc="
							}
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRrgtXif8mD0=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Gestisce problemi nelle richieste",
					"ownedElements": [
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRseZEkQMYYU=",
							"_parent": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"source": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"target": {
								"$ref": "AAAAAAFrRqM+EiXHHb4="
							}
						},
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRseqeURohoI=",
							"_parent": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"source": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"target": {
								"$ref": "AAAAAAFrRqS5GyX+er0="
							}
						},
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRse7YkTEU74=",
							"_parent": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"source": {
								"$ref": "AAAAAAFrRrgtXif8mD0="
							},
							"target": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							}
						}
					]
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRrhJGyhUiIM=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "UseCase3"
				},
				{
					"_type": "UMLUseCase",
					"_id": "AAAAAAFrRsmVU1DWPsE=",
					"_parent": {
						"$ref": "AAAAAAFrRpQq9SSJRWY="
					},
					"name": "Specifica filtri",
					"ownedElements": [
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsqLB1RxXE4=",
							"_parent": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"source": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"target": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							}
						},
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsrPlVYq5+w=",
							"_parent": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"source": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"target": {
								"$ref": "AAAAAAFrRqM+EiXHHb4="
							}
						},
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsrgBFaGRpo=",
							"_parent": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"source": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"target": {
								"$ref": "AAAAAAFrRqS5GyX+er0="
							}
						},
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsrtKlbim4s=",
							"_parent": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"source": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"target": {
								"$ref": "AAAAAAFrRqVD+CYwlUU="
							}
						},
						{
							"_type": "UMLExtend",
							"_id": "AAAAAAFrRsrzgVc+6DA=",
							"_parent": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"source": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							},
							"target": {
								"$ref": "AAAAAAFrRsmVU1DWPsE="
							}
						}
					]
				}
			]
		},
		{
			"_type": "UMLModel",
			"_id": "AAAAAAFrRtlg2mc44Jk=",
			"_parent": {
				"$ref": "AAAAAAFF+h6SjaM2Hec="
			},
			"name": "Model2",
			"ownedElements": [
				{
					"_type": "UMLClassDiagram",
					"_id": "AAAAAAFrRtlg22c5Yw4=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "ClassDiagram1",
					"ownedViews": [
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFrRuIZt23tkps=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRuIZt23uqBM=",
									"_parent": {
										"$ref": "AAAAAAFrRuIZt23tkps="
									},
									"model": {
										"$ref": "AAAAAAFrRuIZtm3rqWs="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuIZt23vFss=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt23uqBM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 32,
											"top": -192,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuIZt23wrS8=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt23uqBM="
											},
											"font": "Arial;13;1",
											"left": 229,
											"top": 103,
											"width": 151,
											"height": 13,
											"text": "DowAndDec"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuIZt23xGd0=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt23uqBM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 32,
											"top": -192,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuIZt23ynos=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt23uqBM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 32,
											"top": -192,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 96,
									"width": 161,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRuIZt23vFss="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRuIZt23wrS8="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRuIZt23xGd0="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRuIZt23ynos="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRuIZt23zHjk=",
									"_parent": {
										"$ref": "AAAAAAFrRuIZt23tkps="
									},
									"model": {
										"$ref": "AAAAAAFrRuIZtm3rqWs="
									},
									"subViews": [
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFrdRdH2EC0Kmw=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt23zHjk="
											},
											"model": {
												"$ref": "AAAAAAFrdRdHOECx35s="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 126,
											"width": 151,
											"height": 13,
											"text": "-filename: String",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 121,
									"width": 161,
									"height": 23
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRuIZt230pQc=",
									"_parent": {
										"$ref": "AAAAAAFrRuIZt23tkps="
									},
									"model": {
										"$ref": "AAAAAAFrRuIZtm3rqWs="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrapbqM+AtG8c=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt230pQc="
											},
											"model": {
												"$ref": "AAAAAAFrapbpzuAqPOs="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 149,
											"width": 151,
											"height": 13,
											"text": "+Decode(): void",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrapdDyeBmM3E=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt230pQc="
											},
											"model": {
												"$ref": "AAAAAAFrapdDf+BjAow="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 164,
											"width": 151,
											"height": 13,
											"text": "+getFilename(): String",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFraphQTuCfXh0=",
											"_parent": {
												"$ref": "AAAAAAFrRuIZt230pQc="
											},
											"model": {
												"$ref": "AAAAAAFraphQDeCcXNc="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 179,
											"width": 151,
											"height": 13,
											"text": "+download(): void",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 144,
									"width": 161,
									"height": 53
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRuIZt231Oxs=",
									"_parent": {
										"$ref": "AAAAAAFrRuIZt23tkps="
									},
									"model": {
										"$ref": "AAAAAAFrRuIZtm3rqWs="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 16,
									"top": -96,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRuIZt232s2E=",
									"_parent": {
										"$ref": "AAAAAAFrRuIZt23tkps="
									},
									"model": {
										"$ref": "AAAAAAFrRuIZtm3rqWs="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 16,
									"top": -96,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 224,
							"top": 96,
							"width": 161,
							"height": 161,
							"nameCompartment": {
								"$ref": "AAAAAAFrRuIZt23uqBM="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFrRuIZt23zHjk="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRuIZt230pQc="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRuIZt231Oxs="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRuIZt232s2E="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFrRuaJ+26dWlk=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRuaJ+26edL8=",
									"_parent": {
										"$ref": "AAAAAAFrRuaJ+26dWlk="
									},
									"model": {
										"$ref": "AAAAAAFrRuaJ+m6bs8Q="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuaJ+26fP28=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26edL8="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -144,
											"top": 848,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuaJ+26gozc=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26edL8="
											},
											"font": "Arial;13;1",
											"left": 397,
											"top": 631,
											"width": 175.93798828125,
											"height": 13,
											"text": "GetData"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuaJ+26h7Ok=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26edL8="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -144,
											"top": 848,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRuaJ+26i1ag=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26edL8="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -144,
											"top": 848,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 392,
									"top": 624,
									"width": 185.93798828125,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRuaJ+26fP28="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRuaJ+26gozc="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRuaJ+26h7Ok="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRuaJ+26i1ag="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRuaJ+26jidc=",
									"_parent": {
										"$ref": "AAAAAAFrRuaJ+26dWlk="
									},
									"model": {
										"$ref": "AAAAAAFrRuaJ+m6bs8Q="
									},
									"subViews": [
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFrapw/2+IAOic=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26jidc="
											},
											"model": {
												"$ref": "AAAAAAFrapw/huH9rdY="
											},
											"font": "Arial;13;0",
											"left": 397,
											"top": 654,
											"width": 175.93798828125,
											"height": 13,
											"text": "-line: String",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraqJ0keIkunQ=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26jidc="
											},
											"model": {
												"$ref": "AAAAAAFraqJ0NeIhlf8="
											},
											"font": "Arial;13;0",
											"left": 397,
											"top": 669,
											"width": 175.93798828125,
											"height": 13,
											"text": "+Attribute2",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 392,
									"top": 649,
									"width": 185.93798828125,
									"height": 38
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRuaJ+26kGZI=",
									"_parent": {
										"$ref": "AAAAAAFrRuaJ+26dWlk="
									},
									"model": {
										"$ref": "AAAAAAFrRuaJ+m6bs8Q="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFraqXmf+KYbGs=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26kGZI="
											},
											"model": {
												"$ref": "AAAAAAFraqXmIuKVzsQ="
											},
											"font": "Arial;13;0",
											"left": 397,
											"top": 692,
											"width": 175.93798828125,
											"height": 13,
											"text": "+getData(ArrayList, int n): void",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFraqY8NuLReCs=",
											"_parent": {
												"$ref": "AAAAAAFrRuaJ+26kGZI="
											},
											"model": {
												"$ref": "AAAAAAFraqY74+LOAYE="
											},
											"font": "Arial;13;0",
											"left": 397,
											"top": 707,
											"width": 175.93798828125,
											"height": 13,
											"text": "+getMetaData(): void",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 392,
									"top": 687,
									"width": 185.93798828125,
									"height": 38
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRuaJ+26ltlY=",
									"_parent": {
										"$ref": "AAAAAAFrRuaJ+26dWlk="
									},
									"model": {
										"$ref": "AAAAAAFrRuaJ+m6bs8Q="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -72,
									"top": 424,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRuaJ+26mT9k=",
									"_parent": {
										"$ref": "AAAAAAFrRuaJ+26dWlk="
									},
									"model": {
										"$ref": "AAAAAAFrRuaJ+m6bs8Q="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -72,
									"top": 424,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 392,
							"top": 624,
							"width": 185.93798828125,
							"height": 101,
							"nameCompartment": {
								"$ref": "AAAAAAFrRuaJ+26edL8="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFrRuaJ+26jidc="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRuaJ+26kGZI="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRuaJ+26ltlY="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRuaJ+26mT9k="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFrRvJdh3M5C2I=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrRvJdiHM6ahA=",
									"_parent": {
										"$ref": "AAAAAAFrRvJdh3M5C2I="
									},
									"model": {
										"$ref": "AAAAAAFrRu/fKnKxl8s="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRvJdiHM7tHo=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHM6ahA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1319,
											"top": 75,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRvJdiHM8KkM=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHM6ahA="
											},
											"font": "Arial;13;1",
											"left": 1077,
											"top": 359,
											"width": 303.84326171875,
											"height": 13,
											"text": "Filters"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRvJdiHM9d5E=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHM6ahA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1319,
											"top": 75,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrRvJdiHM+ubw=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHM6ahA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1319,
											"top": 75,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 1072,
									"top": 352,
									"width": 313.84326171875,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrRvJdiHM7tHo="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrRvJdiHM8KkM="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrRvJdiHM9d5E="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrRvJdiHM+ubw="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrRvJdiHM/rWU=",
									"_parent": {
										"$ref": "AAAAAAFrRvJdh3M5C2I="
									},
									"model": {
										"$ref": "AAAAAAFrRu/fKnKxl8s="
									},
									"font": "Arial;13;0",
									"left": 1072,
									"top": 377,
									"width": 313.84326171875,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrRvJdiHNA/MI=",
									"_parent": {
										"$ref": "AAAAAAFrRvJdh3M5C2I="
									},
									"model": {
										"$ref": "AAAAAAFrRu/fKnKxl8s="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdR88c0xE8Aw=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHNA/MI="
											},
											"model": {
												"$ref": "AAAAAAFrdR88FkxBTWY="
											},
											"font": "Arial;13;0",
											"left": 1077,
											"top": 392,
											"width": 303.84326171875,
											"height": 13,
											"text": "+ArrayList LogFilter1(ArrayList database, double n)",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSAO6EygMXM=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHNA/MI="
											},
											"model": {
												"$ref": "AAAAAAFrdSAOnUydeLs="
											},
											"font": "Arial;13;0",
											"left": 1077,
											"top": 407,
											"width": 303.84326171875,
											"height": 13,
											"text": "+ArrayList LogFilter2(ArrayList  database, double n)",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSCBxUz8YhU=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHNA/MI="
											},
											"model": {
												"$ref": "AAAAAAFrdSCBhkz5SMM="
											},
											"font": "Arial;13;0",
											"left": 1077,
											"top": 422,
											"width": 303.84326171875,
											"height": 13,
											"text": "+ArrayList CondFilter1(ArrayList database, double n)",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSECr01Yjbg=",
											"_parent": {
												"$ref": "AAAAAAFrRvJdiHNA/MI="
											},
											"model": {
												"$ref": "AAAAAAFrdSECZE1VNUM="
											},
											"font": "Arial;13;0",
											"left": 1077,
											"top": 437,
											"width": 303.84326171875,
											"height": 13,
											"text": "+ArrayList CondFilter2(ArrayList database, double n)",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 1072,
									"top": 387,
									"width": 313.84326171875,
									"height": 68
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrRvJdiHNBO7Q=",
									"_parent": {
										"$ref": "AAAAAAFrRvJdh3M5C2I="
									},
									"model": {
										"$ref": "AAAAAAFrRu/fKnKxl8s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 815,
									"top": 67,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrRvJdiHNCTcY=",
									"_parent": {
										"$ref": "AAAAAAFrRvJdh3M5C2I="
									},
									"model": {
										"$ref": "AAAAAAFrRu/fKnKxl8s="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 815,
									"top": 67,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 1072,
							"top": 352,
							"width": 313.84326171875,
							"height": 121,
							"nameCompartment": {
								"$ref": "AAAAAAFrRvJdiHM6ahA="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFrRvJdiHM/rWU="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrRvJdiHNA/MI="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrRvJdiHNBO7Q="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrRvJdiHNCTcY="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFraoaYL9mH/OA=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFraoaYL9mIw7k=",
									"_parent": {
										"$ref": "AAAAAAFraoaYL9mH/OA="
									},
									"model": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraoaYL9mJlbk=",
											"_parent": {
												"$ref": "AAAAAAFraoaYL9mIw7k="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 32,
											"top": -160,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraoaYL9mKrW0=",
											"_parent": {
												"$ref": "AAAAAAFraoaYL9mIw7k="
											},
											"font": "Arial;13;1",
											"left": 229,
											"top": 295,
											"width": 159,
											"height": 13,
											"text": "StockRecords"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraoaYMNmLZWU=",
											"_parent": {
												"$ref": "AAAAAAFraoaYL9mIw7k="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 32,
											"top": -160,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraoaYMNmMHIs=",
											"_parent": {
												"$ref": "AAAAAAFraoaYL9mIw7k="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 32,
											"top": -160,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 288,
									"width": 169,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFraoaYL9mJlbk="
									},
									"nameLabel": {
										"$ref": "AAAAAAFraoaYL9mKrW0="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFraoaYMNmLZWU="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFraoaYMNmMHIs="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFraoaYMNmNSRg=",
									"_parent": {
										"$ref": "AAAAAAFraoaYL9mH/OA="
									},
									"model": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"subViews": [
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraocPLtpXhYE=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmNSRg="
											},
											"model": {
												"$ref": "AAAAAAFraocOvdpOE3s="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 318,
											"width": 159,
											"height": 13,
											"text": "-Indirizzo: String",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraojHsNqVEXE=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmNSRg="
											},
											"model": {
												"$ref": "AAAAAAFraojHUNqMHkA="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 333,
											"width": 159,
											"height": 13,
											"text": "-Attiva: int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraola5drT9q0=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmNSRg="
											},
											"model": {
												"$ref": "AAAAAAFraolafNrKZ5U="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 348,
											"width": 159,
											"height": 13,
											"text": "-Zona: int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraomoUtsRhMI=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmNSRg="
											},
											"model": {
												"$ref": "AAAAAAFraomn0dsISWc="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 363,
											"width": 159,
											"height": 13,
											"text": "-Longitudine: double",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraoqOpdu+0jE=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmNSRg="
											},
											"model": {
												"$ref": "AAAAAAFraoqOL9u1tws="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 378,
											"width": 159,
											"height": 13,
											"text": "-Latitudine: double",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraoq/edvvibA=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmNSRg="
											},
											"model": {
												"$ref": "AAAAAAFraoq/Ldvm7PU="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 393,
											"width": 159,
											"height": 13,
											"text": "-Località: double",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 313,
									"width": 169,
									"height": 98
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFraoaYMNmO2I0=",
									"_parent": {
										"$ref": "AAAAAAFraoaYL9mH/OA="
									},
									"model": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFraoxGlNytNgI=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFraoxF+tykX9k="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 416,
											"width": 159,
											"height": 13,
											"text": "+getIndirizzo(): String",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFraoy2VtzzzzM=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFraoy2CtzqmCA="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 431,
											"width": 159,
											"height": 13,
											"text": "+setIndirizzo(): void",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFraozxVt0sZJw=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFraozxFt0jfiA="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 446,
											"width": 159,
											"height": 13,
											"text": "+getAttiva(): int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrao0set1lNo0=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFrao0sBN1c2zU="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 461,
											"width": 159,
											"height": 13,
											"text": "+setAttiva(int attiva): void",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrao2c+N2m7vU=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFrao2cvd2dxwo="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 476,
											"width": 159,
											"height": 13,
											"text": "+getZona(): int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrao3C3d3fzyg=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFrao3CmN3Wss4="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 491,
											"width": 159,
											"height": 13,
											"text": "+setZona(int zona): int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrao3xw94YFvA=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFrao3xht4PyhQ="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 506,
											"width": 159,
											"height": 13,
											"text": "+getLon(): double",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrao6fQd6ootg=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFrao6ex96fBns="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 521,
											"width": 159,
											"height": 13,
											"text": "+setLoc(double loc): void",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrapAOgN7ps4g=",
											"_parent": {
												"$ref": "AAAAAAFraoaYMNmO2I0="
											},
											"model": {
												"$ref": "AAAAAAFrapAOMd7g6F4="
											},
											"font": "Arial;13;0",
											"left": 229,
											"top": 536,
											"width": 159,
											"height": 13,
											"text": "+toString(): String",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 411,
									"width": 169,
									"height": 143
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFraoaYMNmPAQE=",
									"_parent": {
										"$ref": "AAAAAAFraoaYL9mH/OA="
									},
									"model": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 16,
									"top": -80,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFraoaYMNmQ47U=",
									"_parent": {
										"$ref": "AAAAAAFraoaYL9mH/OA="
									},
									"model": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 16,
									"top": -80,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 224,
							"top": 288,
							"width": 169,
							"height": 266,
							"nameCompartment": {
								"$ref": "AAAAAAFraoaYL9mIw7k="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFraoaYMNmNSRg="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFraoaYMNmO2I0="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFraoaYMNmPAQE="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFraoaYMNmQ47U="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFraqbM7+aglyI=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFraqbM7+ahY1o=",
									"_parent": {
										"$ref": "AAAAAAFraqbM7+aglyI="
									},
									"model": {
										"$ref": "AAAAAAFraqbM7+aevqg="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraqbM7+ai3xc=",
											"_parent": {
												"$ref": "AAAAAAFraqbM7+ahY1o="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 432,
											"top": -528,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraqbM7+ajre4=",
											"_parent": {
												"$ref": "AAAAAAFraqbM7+ahY1o="
											},
											"font": "Arial;13;1",
											"left": 717,
											"top": 319,
											"width": 237.34521484375,
											"height": 13,
											"text": "StockData"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraqbM7+akrNA=",
											"_parent": {
												"$ref": "AAAAAAFraqbM7+ahY1o="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 432,
											"top": -528,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFraqbM7+alQDo=",
											"_parent": {
												"$ref": "AAAAAAFraqbM7+ahY1o="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 432,
											"top": -528,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 712,
									"top": 312,
									"width": 247.34521484375,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFraqbM7+ai3xc="
									},
									"nameLabel": {
										"$ref": "AAAAAAFraqbM7+ajre4="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFraqbM7+akrNA="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFraqbM7+alQDo="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFraqbM7+amWGc=",
									"_parent": {
										"$ref": "AAAAAAFraqbM7+aglyI="
									},
									"model": {
										"$ref": "AAAAAAFraqbM7+aevqg="
									},
									"subViews": [
										{
											"_type": "UMLAttributeView",
											"_id": "AAAAAAFraqzBmOtzKbg=",
											"_parent": {
												"$ref": "AAAAAAFraqbM7+amWGc="
											},
											"model": {
												"$ref": "AAAAAAFraqzBXOtqIOg="
											},
											"font": "Arial;13;0",
											"left": 717,
											"top": 342,
											"width": 237.34521484375,
											"height": 13,
											"text": "-records: ArrayList",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 712,
									"top": 337,
									"width": 247.34521484375,
									"height": 23
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFraqbM8Oanlow=",
									"_parent": {
										"$ref": "AAAAAAFraqbM7+aglyI="
									},
									"model": {
										"$ref": "AAAAAAFraqbM7+aevqg="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrarIg9uwBcaY=",
											"_parent": {
												"$ref": "AAAAAAFraqbM8Oanlow="
											},
											"model": {
												"$ref": "AAAAAAFrarIgn+v4jzc="
											},
											"font": "Arial;13;0",
											"left": 717,
											"top": 365,
											"width": 237.34521484375,
											"height": 13,
											"text": "+getRecordNumber(): StockRecords",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrarOw/OzJkBA=",
											"_parent": {
												"$ref": "AAAAAAFraqbM8Oanlow="
											},
											"model": {
												"$ref": "AAAAAAFrarOwnezATFE="
											},
											"font": "Arial;13;0",
											"left": 717,
											"top": 380,
											"width": 237.34521484375,
											"height": 13,
											"text": "+getRecords(): ArrayList<StockRecords>",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrarRAr+0g+q4=",
											"_parent": {
												"$ref": "AAAAAAFraqbM8Oanlow="
											},
											"model": {
												"$ref": "AAAAAAFrarRAYu0XWUc="
											},
											"font": "Arial;13;0",
											"left": 717,
											"top": 395,
											"width": 237.34521484375,
											"height": 13,
											"text": "+getNumberOfrecords(): int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrarR//e1ZyqY=",
											"_parent": {
												"$ref": "AAAAAAFraqbM8Oanlow="
											},
											"model": {
												"$ref": "AAAAAAFrarR/qe1Q2ZU="
											},
											"font": "Arial;13;0",
											"left": 717,
											"top": 410,
											"width": 237.34521484375,
											"height": 13,
											"text": "+LoadDatafromFile(String filepath): void",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdRo9FEMecR4=",
											"_parent": {
												"$ref": "AAAAAAFraqbM8Oanlow="
											},
											"model": {
												"$ref": "AAAAAAFrdRo8sEMVUXk="
											},
											"font": "Arial;13;0",
											"left": 717,
											"top": 425,
											"width": 237.34521484375,
											"height": 13,
											"text": "+getRecordNumber(int i): StockRecords",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 712,
									"top": 360,
									"width": 247.34521484375,
									"height": 83
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFraqbM8OaownI=",
									"_parent": {
										"$ref": "AAAAAAFraqbM7+aglyI="
									},
									"model": {
										"$ref": "AAAAAAFraqbM7+aevqg="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 216,
									"top": -264,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFraqbM8Oap7cA=",
									"_parent": {
										"$ref": "AAAAAAFraqbM7+aglyI="
									},
									"model": {
										"$ref": "AAAAAAFraqbM7+aevqg="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 216,
									"top": -264,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 712,
							"top": 312,
							"width": 247.34521484375,
							"height": 191,
							"nameCompartment": {
								"$ref": "AAAAAAFraqbM7+ahY1o="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFraqbM7+amWGc="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFraqbM8Oanlow="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFraqbM8OaownI="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFraqbM8Oap7cA="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFrdSSZHFMCYXg=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrdSSZG1MAI5o="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrdSSZHFMDG14=",
									"_parent": {
										"$ref": "AAAAAAFrdSSZHFMCYXg="
									},
									"model": {
										"$ref": "AAAAAAFrdSSZG1MAI5o="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSSZHVMELac=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHFMDG14="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -240,
											"top": 1072,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSSZHVMFNDY=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHFMDG14="
											},
											"font": "Arial;13;1",
											"left": 645,
											"top": 631,
											"width": 372.5185546875,
											"height": 13,
											"text": "GetStats"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSSZHVMGECM=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHFMDG14="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -240,
											"top": 1072,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSSZHVMHR8I=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHFMDG14="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -240,
											"top": 1072,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 640,
									"top": 624,
									"width": 382.5185546875,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdSSZHVMELac="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrdSSZHVMFNDY="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrdSSZHVMGECM="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdSSZHVMHR8I="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrdSSZHlMIk84=",
									"_parent": {
										"$ref": "AAAAAAFrdSSZHFMCYXg="
									},
									"model": {
										"$ref": "AAAAAAFrdSSZG1MAI5o="
									},
									"font": "Arial;13;0",
									"left": 640,
									"top": 649,
									"width": 382.5185546875,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrdSSZHlMJEZU=",
									"_parent": {
										"$ref": "AAAAAAFrdSSZHFMCYXg="
									},
									"model": {
										"$ref": "AAAAAAFrdSSZG1MAI5o="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSTqWVOQMZU=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHlMJEZU="
											},
											"model": {
												"$ref": "AAAAAAFrdSTqCVOEIds="
											},
											"font": "Arial;13;0",
											"left": 645,
											"top": 664,
											"width": 372.5185546875,
											"height": 13,
											"text": "+getLatStats(ArrayList database, double n): double",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSVhUVPskgc=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHlMJEZU="
											},
											"model": {
												"$ref": "AAAAAAFrdSVhBlPgybw="
											},
											"font": "Arial;13;0",
											"left": 645,
											"top": 679,
											"width": 372.5185546875,
											"height": 13,
											"text": "+getLonStats(ArrayList database, double n): double",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSXZ6VS1C4M=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHlMJEZU="
											},
											"model": {
												"$ref": "AAAAAAFrdSXZV1Spw8o="
											},
											"font": "Arial;13;0",
											"left": 645,
											"top": 694,
											"width": 372.5185546875,
											"height": 13,
											"text": "+getNumberofActiveAreas(ArrayList database, double n): int",
											"horizontalAlignment": 0
										},
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSYwrlURFR0=",
											"_parent": {
												"$ref": "AAAAAAFrdSSZHlMJEZU="
											},
											"model": {
												"$ref": "AAAAAAFrdSYwbFUFhv4="
											},
											"font": "Arial;13;0",
											"left": 645,
											"top": 709,
											"width": 372.5185546875,
											"height": 13,
											"text": "+getNumberofAddressinaZone(ArrayList database, double n): int",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 640,
									"top": 659,
									"width": 382.5185546875,
									"height": 68
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrdSSZIFMKgss=",
									"_parent": {
										"$ref": "AAAAAAFrdSSZHFMCYXg="
									},
									"model": {
										"$ref": "AAAAAAFrdSSZG1MAI5o="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -120,
									"top": 536,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrdSSZIFML/n4=",
									"_parent": {
										"$ref": "AAAAAAFrdSSZHFMCYXg="
									},
									"model": {
										"$ref": "AAAAAAFrdSSZG1MAI5o="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -120,
									"top": 536,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 640,
							"top": 624,
							"width": 382.5185546875,
							"height": 103,
							"nameCompartment": {
								"$ref": "AAAAAAFrdSSZHFMDG14="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFrdSSZHlMIk84="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrdSSZHlMJEZU="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrdSSZIFMKgss="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrdSSZIFML/n4="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFrdSciY16ALdA=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrdSciYl5+CJc="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrdSciY16BHM8=",
									"_parent": {
										"$ref": "AAAAAAFrdSciY16ALdA="
									},
									"model": {
										"$ref": "AAAAAAFrdSciYl5+CJc="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSciY16CRPc=",
											"_parent": {
												"$ref": "AAAAAAFrdSciY16BHM8="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -144,
											"top": 864,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSciY16DPm0=",
											"_parent": {
												"$ref": "AAAAAAFrdSciY16BHM8="
											},
											"font": "Arial;13;1",
											"left": 1045,
											"top": 631,
											"width": 279,
											"height": 13,
											"text": "GetWords"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSciY16EcjM=",
											"_parent": {
												"$ref": "AAAAAAFrdSciY16BHM8="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -144,
											"top": 864,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSciY16FLIU=",
											"_parent": {
												"$ref": "AAAAAAFrdSciY16BHM8="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": -144,
											"top": 864,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 1040,
									"top": 624,
									"width": 289,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdSciY16CRPc="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrdSciY16DPm0="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrdSciY16EcjM="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdSciY16FLIU="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrdSciY16GjCg=",
									"_parent": {
										"$ref": "AAAAAAFrdSciY16ALdA="
									},
									"model": {
										"$ref": "AAAAAAFrdSciYl5+CJc="
									},
									"font": "Arial;13;0",
									"left": 1040,
									"top": 649,
									"width": 289,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrdSciZF6Hz/I=",
									"_parent": {
										"$ref": "AAAAAAFrdSciY16ALdA="
									},
									"model": {
										"$ref": "AAAAAAFrdSciYl5+CJc="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSdh2F8OBzk=",
											"_parent": {
												"$ref": "AAAAAAFrdSciZF6Hz/I="
											},
											"model": {
												"$ref": "AAAAAAFrdSdhHV8C4wg="
											},
											"font": "Arial;13;0",
											"left": 1045,
											"top": 664,
											"width": 279,
											"height": 13,
											"text": "+getWords(ArrayList database, double n): void",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 1040,
									"top": 659,
									"width": 289,
									"height": 23
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrdSciZF6IqN0=",
									"_parent": {
										"$ref": "AAAAAAFrdSciY16ALdA="
									},
									"model": {
										"$ref": "AAAAAAFrdSciYl5+CJc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -72,
									"top": 432,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrdSciZF6J+iA=",
									"_parent": {
										"$ref": "AAAAAAFrdSciY16ALdA="
									},
									"model": {
										"$ref": "AAAAAAFrdSciYl5+CJc="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": -72,
									"top": 432,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 1040,
							"top": 624,
							"width": 289,
							"height": 66,
							"nameCompartment": {
								"$ref": "AAAAAAFrdSciY16BHM8="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFrdSciY16GjCg="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrdSciZF6Hz/I="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrdSciZF6IqN0="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrdSciZF6J+iA="
							}
						},
						{
							"_type": "UMLClassView",
							"_id": "AAAAAAFrdSiJ+WRWDgk=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"subViews": [
								{
									"_type": "UMLNameCompartmentView",
									"_id": "AAAAAAFrdSiJ+WRXcgM=",
									"_parent": {
										"$ref": "AAAAAAFrdSiJ+WRWDgk="
									},
									"model": {
										"$ref": "AAAAAAFrdSiJ+WRUWt8="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSiJ+WRYVAw=",
											"_parent": {
												"$ref": "AAAAAAFrdSiJ+WRXcgM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 64,
											"top": -416,
											"height": 13
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSiJ+WRZROs=",
											"_parent": {
												"$ref": "AAAAAAFrdSiJ+WRXcgM="
											},
											"font": "Arial;13;1",
											"left": 757,
											"top": 47,
											"width": 167,
											"height": 13,
											"text": "ProgettoApplication"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSiJ+mRaNBE=",
											"_parent": {
												"$ref": "AAAAAAFrdSiJ+WRXcgM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 64,
											"top": -416,
											"width": 80.9072265625,
											"height": 13,
											"text": "(from Model2)"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrdSiJ+mRbCOU=",
											"_parent": {
												"$ref": "AAAAAAFrdSiJ+WRXcgM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 64,
											"top": -416,
											"height": 13,
											"horizontalAlignment": 1
										}
									],
									"font": "Arial;13;0",
									"left": 752,
									"top": 40,
									"width": 177,
									"height": 25,
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdSiJ+WRYVAw="
									},
									"nameLabel": {
										"$ref": "AAAAAAFrdSiJ+WRZROs="
									},
									"namespaceLabel": {
										"$ref": "AAAAAAFrdSiJ+mRaNBE="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdSiJ+mRbCOU="
									}
								},
								{
									"_type": "UMLAttributeCompartmentView",
									"_id": "AAAAAAFrdSiJ+mRctcQ=",
									"_parent": {
										"$ref": "AAAAAAFrdSiJ+WRWDgk="
									},
									"model": {
										"$ref": "AAAAAAFrdSiJ+WRUWt8="
									},
									"font": "Arial;13;0",
									"left": 752,
									"top": 65,
									"width": 177,
									"height": 10
								},
								{
									"_type": "UMLOperationCompartmentView",
									"_id": "AAAAAAFrdSiJ+mRdZZ0=",
									"_parent": {
										"$ref": "AAAAAAFrdSiJ+WRWDgk="
									},
									"model": {
										"$ref": "AAAAAAFrdSiJ+WRUWt8="
									},
									"subViews": [
										{
											"_type": "UMLOperationView",
											"_id": "AAAAAAFrdSiwNmTkDf4=",
											"_parent": {
												"$ref": "AAAAAAFrdSiJ+mRdZZ0="
											},
											"model": {
												"$ref": "AAAAAAFrdSiv1WTYmU8="
											},
											"font": "Arial;13;0",
											"left": 757,
											"top": 80,
											"width": 167,
											"height": 13,
											"text": "+main(String[] args): void",
											"horizontalAlignment": 0
										}
									],
									"font": "Arial;13;0",
									"left": 752,
									"top": 75,
									"width": 177,
									"height": 23
								},
								{
									"_type": "UMLReceptionCompartmentView",
									"_id": "AAAAAAFrdSiJ+mRetIs=",
									"_parent": {
										"$ref": "AAAAAAFrdSiJ+WRWDgk="
									},
									"model": {
										"$ref": "AAAAAAFrdSiJ+WRUWt8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 32,
									"top": -208,
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLTemplateParameterCompartmentView",
									"_id": "AAAAAAFrdSiJ+mRfYvM=",
									"_parent": {
										"$ref": "AAAAAAFrdSiJ+WRWDgk="
									},
									"model": {
										"$ref": "AAAAAAFrdSiJ+WRUWt8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 32,
									"top": -208,
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"containerChangeable": true,
							"left": 752,
							"top": 40,
							"width": 177,
							"height": 89,
							"nameCompartment": {
								"$ref": "AAAAAAFrdSiJ+WRXcgM="
							},
							"attributeCompartment": {
								"$ref": "AAAAAAFrdSiJ+mRctcQ="
							},
							"operationCompartment": {
								"$ref": "AAAAAAFrdSiJ+mRdZZ0="
							},
							"receptionCompartment": {
								"$ref": "AAAAAAFrdSiJ+mRetIs="
							},
							"templateParameterCompartment": {
								"$ref": "AAAAAAFrdSiJ+mRfYvM="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhn4E7iqOWI=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhn4Erimwi8="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7irLwk=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erimwi8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 621,
									"top": 544,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7iseTc=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erimwi8="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 612,
									"top": 532,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7itPQ4=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erimwi8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 640,
									"top": 567,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7iuaZo=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erin8Uk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 562,
									"top": 589,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7ivGPE=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erin8Uk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 556,
									"top": 577,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7iw7jE=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erin8Uk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 575,
									"top": 613,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7ixBqA=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erio/4U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 681,
									"top": 498,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7iy4/E=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erio/4U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 671,
									"top": 489,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhn4E7iz6kI=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erio/4U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 701,
									"top": 518,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhn4E7i07xM=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erin8Uk="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhn4E7i11G0=",
									"_parent": {
										"$ref": "AAAAAAFrfhn4E7iqOWI="
									},
									"model": {
										"$ref": "AAAAAAFrfhn4Erio/4U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"tail": {
								"$ref": "AAAAAAFrRuaJ+26dWlk="
							},
							"lineStyle": 1,
							"points": "551:623;711:501",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhn4E7irLwk="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhn4E7iseTc="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhn4E7itPQ4="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhn4E7iuaZo="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhn4E7ivGPE="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhn4E7iw7jE="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhn4E7ixBqA="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhn4E7iy4/E="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhn4E7iz6kI="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhn4E7i07xM="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhn4E7i11G0="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhoU7rj2Yog=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhoU7bjyDWg="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj3Tuo=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjyDWg="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 817,
									"top": 556,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj4bOo=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjyDWg="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 802,
									"top": 556,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj5xDk=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjyDWg="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 846,
									"top": 557,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj6J4M=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjzDg4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 816,
									"top": 590,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj7kdA=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjzDg4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 803,
									"top": 588,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj8mkc=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjzDg4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 843,
									"top": 595,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj9R8Y=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bj0YPM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 817,
									"top": 522,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj+BXI=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bj0YPM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 804,
									"top": 524,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhoU7rj/yFs=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bj0YPM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 845,
									"top": 518,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhoU7rkAT38=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bjzDg4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhoU7rkBM2w=",
									"_parent": {
										"$ref": "AAAAAAFrfhoU7rj2Yog="
									},
									"model": {
										"$ref": "AAAAAAFrfhoU7bj0YPM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"tail": {
								"$ref": "AAAAAAFrdSSZHFMCYXg="
							},
							"lineStyle": 1,
							"points": "831:623;833:503",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhoU7rj3Tuo="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhoU7rj4bOo="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhoU7rj5xDk="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhoU7rj6J4M="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhoU7rj7kdA="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhoU7rj8mkc="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhoU7rj9R8Y="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhoU7rj+BXI="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhoU7rj/yFs="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhoU7rkAT38="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhoU7rkBM2w="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhouIrlIY4c=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhouIrlEQt4="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouIrlJuOc=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlEQt4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1039,
									"top": 565,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouIrlKeOc=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlEQt4="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 1030,
									"top": 577,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouIrlLrKA=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlEQt4="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1056,
									"top": 540,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouIrlMilg=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlFOLY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1108,
									"top": 614,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouI7lNzIs=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlFOLY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1098,
									"top": 623,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouI7lOmrI=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlFOLY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1127,
									"top": 594,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouI7lPpvw=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlGbK8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 971,
									"top": 517,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouI7lQFS0=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlGbK8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 965,
									"top": 529,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhouI7lRnEI=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlGbK8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 983,
									"top": 492,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhouI7lSnX4=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlFOLY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhouI7lTETY=",
									"_parent": {
										"$ref": "AAAAAAFrfhouIrlIY4c="
									},
									"model": {
										"$ref": "AAAAAAFrfhouIrlGbK8="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"tail": {
								"$ref": "AAAAAAFrdSciY16ALdA="
							},
							"lineStyle": 1,
							"points": "1138:623;959:496",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhouIrlJuOc="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhouIrlKeOc="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhouIrlLrKA="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhouIrlMilg="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhouI7lNzIs="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhouI7lOmrI="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhouI7lPpvw="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhouI7lQFS0="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhouI7lRnEI="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhouI7lSnX4="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhouI7lTETY="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhrdKL/Wlfg=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhrdJ7/S3ck="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/XZGU=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/S3ck="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1015,
									"top": 388,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/Yxw0=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/S3ck="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 1015,
									"top": 373,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/Z/MU=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/S3ck="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1014,
									"top": 417,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/a6WM=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Tnlo="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 985,
									"top": 388,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/bCoI=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Tnlo="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 987,
									"top": 374,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/ciTQ=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Tnlo="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 980,
									"top": 415,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/dnZI=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Ut0U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1045,
									"top": 388,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/ereY=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Ut0U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1042,
									"top": 375,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhrdKL/f134=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Ut0U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 1049,
									"top": 416,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhrdKL/gLl8=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Tnlo="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhrdKL/h8bU=",
									"_parent": {
										"$ref": "AAAAAAFrfhrdKL/Wlfg="
									},
									"model": {
										"$ref": "AAAAAAFrfhrdJ7/Ut0U="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFrRvJdh3M5C2I="
							},
							"tail": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"lineStyle": 1,
							"points": "959:409;1071:410",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhrdKL/XZGU="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhrdKL/Yxw0="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhrdKL/Z/MU="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhrdKL/a6WM="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhrdKL/bCoI="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhrdKL/ciTQ="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhrdKL/dnZI="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhrdKL/ereY="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhrdKL/f134="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhrdKL/gLl8="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhrdKL/h8bU="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhsRbcLPa0s=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhsRbcLL8AQ="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbcLQUpQ=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLL8AQ="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 851,
									"top": 214,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbcLRkyg=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLL8AQ="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 866,
									"top": 214,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbcLSK7w=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLL8AQ="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 822,
									"top": 213,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbcLTTfY=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLMgLI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 853,
									"top": 149,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbcLULpo=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLMgLI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 866,
									"top": 151,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbsLVAbI=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLMgLI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 826,
									"top": 144,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbsLWdDw=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLNMXM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 851,
									"top": 279,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbsLXXec=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLNMXM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 864,
									"top": 277,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhsRbsLYf80=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLNMXM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 823,
									"top": 283,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhsRbsLZ+lQ=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLMgLI="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhsRbsLaZdY=",
									"_parent": {
										"$ref": "AAAAAAFrfhsRbcLPa0s="
									},
									"model": {
										"$ref": "AAAAAAFrfhsRbcLNMXM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"tail": {
								"$ref": "AAAAAAFrdSiJ+WRWDgk="
							},
							"lineStyle": 1,
							"points": "839:129;836:311",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhsRbcLQUpQ="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhsRbcLRkyg="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhsRbcLSK7w="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhsRbcLTTfY="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhsRbcLULpo="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhsRbsLVAbI="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhsRbsLWdDw="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhsRbsLXXec="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhsRbsLYf80="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhsRbsLZ+lQ="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhsRbsLaZdY="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhtULcc94BA=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhtULcc5DtY="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcc+2yY=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc5DtY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 553,
									"top": 262,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcc/k+Y=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc5DtY="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 559,
									"top": 248,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcdAHHs=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc5DtY="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 542,
									"top": 289,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcdBD00=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc6G70="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 414,
									"top": 201,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcdCu8E=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc6G70="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 422,
									"top": 190,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcdDlvA=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc6G70="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 399,
									"top": 225,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULcdEZf0=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc7ogM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 693,
									"top": 322,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULsdFqk8=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc7ogM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 696,
									"top": 309,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtULsdGaAQ=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc7ogM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 686,
									"top": 349,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhtULsdHNFw=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc6G70="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhtULsdIKBA=",
									"_parent": {
										"$ref": "AAAAAAFrfhtULcc94BA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtULcc7ogM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"tail": {
								"$ref": "AAAAAAFrRuIZt23tkps="
							},
							"lineStyle": 1,
							"points": "385:211;711:353",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhtULcc+2yY="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhtULcc/k+Y="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhtULcdAHHs="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhtULcdBD00="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhtULcdCu8E="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhtULcdDlvA="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhtULcdEZf0="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhtULsdFqk8="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhtULsdGaAQ="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhtULsdHNFw="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhtULsdIKBA="
							}
						},
						{
							"_type": "UMLAssociationView",
							"_id": "AAAAAAFrfhtihsfL2NA=",
							"_parent": {
								"$ref": "AAAAAAFrRtlg22c5Yw4="
							},
							"model": {
								"$ref": "AAAAAAFrfhtihsfHZPM="
							},
							"subViews": [
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfMvBM=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfHZPM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 551,
									"top": 393,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfNBfk=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfHZPM="
									},
									"visible": null,
									"font": "Arial;13;0",
									"left": 551,
									"top": 378,
									"height": 13,
									"alpha": 1.5707963267948966,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfO0h4=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfHZPM="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 552,
									"top": 422,
									"height": 13,
									"alpha": -1.5707963267948966,
									"distance": 15,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"edgePosition": 1
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfPkfo=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfI1ME="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 418,
									"top": 396,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfQlUA=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfI1ME="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 420,
									"top": 383,
									"height": 13,
									"alpha": 0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfRwgo=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfI1ME="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 414,
									"top": 423,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"edgePosition": 2
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfSSlk=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfJ+o0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 684,
									"top": 389,
									"height": 13,
									"alpha": -0.5235987755982988,
									"distance": 30,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfTnac=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfJ+o0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 682,
									"top": 376,
									"height": 13,
									"alpha": -0.7853981633974483,
									"distance": 40,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									}
								},
								{
									"_type": "EdgeLabelView",
									"_id": "AAAAAAFrfhtihsfUhts=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfJ+o0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"left": 689,
									"top": 417,
									"height": 13,
									"alpha": 0.5235987755982988,
									"distance": 25,
									"hostEdge": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									}
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhtihsfVJJg=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfI1ME="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								},
								{
									"_type": "UMLQualifierCompartmentView",
									"_id": "AAAAAAFrfhtihsfWdMU=",
									"_parent": {
										"$ref": "AAAAAAFrfhtihsfL2NA="
									},
									"model": {
										"$ref": "AAAAAAFrfhtihsfJ+o0="
									},
									"visible": false,
									"font": "Arial;13;0",
									"width": 10,
									"height": 10
								}
							],
							"font": "Arial;13;0",
							"head": {
								"$ref": "AAAAAAFraqbM7+aglyI="
							},
							"tail": {
								"$ref": "AAAAAAFraoaYL9mH/OA="
							},
							"lineStyle": 1,
							"points": "393:418;711:410",
							"showVisibility": true,
							"nameLabel": {
								"$ref": "AAAAAAFrfhtihsfMvBM="
							},
							"stereotypeLabel": {
								"$ref": "AAAAAAFrfhtihsfNBfk="
							},
							"propertyLabel": {
								"$ref": "AAAAAAFrfhtihsfO0h4="
							},
							"tailRoleNameLabel": {
								"$ref": "AAAAAAFrfhtihsfPkfo="
							},
							"tailPropertyLabel": {
								"$ref": "AAAAAAFrfhtihsfQlUA="
							},
							"tailMultiplicityLabel": {
								"$ref": "AAAAAAFrfhtihsfRwgo="
							},
							"headRoleNameLabel": {
								"$ref": "AAAAAAFrfhtihsfSSlk="
							},
							"headPropertyLabel": {
								"$ref": "AAAAAAFrfhtihsfTnac="
							},
							"headMultiplicityLabel": {
								"$ref": "AAAAAAFrfhtihsfUhts="
							},
							"tailQualifiersCompartment": {
								"$ref": "AAAAAAFrfhtihsfVJJg="
							},
							"headQualifiersCompartment": {
								"$ref": "AAAAAAFrfhtihsfWdMU="
							}
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRuIZtm3rqWs=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "DowAndDec",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvteNnZjyu4=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvteNnZk9ik=",
								"_parent": {
									"$ref": "AAAAAAFrRvteNnZjyu4="
								},
								"reference": {
									"$ref": "AAAAAAFrRuIZtm3rqWs="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvteNnZlIKM=",
								"_parent": {
									"$ref": "AAAAAAFrRvteNnZjyu4="
								},
								"reference": {
									"$ref": "AAAAAAFrRuJZ824XSkg="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS7NkXOaGLQ=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS7NkXObxf4=",
								"_parent": {
									"$ref": "AAAAAAFrdS7NkXOaGLQ="
								},
								"reference": {
									"$ref": "AAAAAAFrRuIZtm3rqWs="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS7NkXOcqvQ=",
								"_parent": {
									"$ref": "AAAAAAFrdS7NkXOaGLQ="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhtULcc5DtY=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhtULcc6G70=",
								"_parent": {
									"$ref": "AAAAAAFrfhtULcc5DtY="
								},
								"reference": {
									"$ref": "AAAAAAFrRuIZtm3rqWs="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhtULcc7ogM=",
								"_parent": {
									"$ref": "AAAAAAFrfhtULcc5DtY="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						}
					],
					"attributes": [
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFrdRdHOECx35s=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"name": "filename",
							"visibility": "private",
							"type": "String"
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrapbpzuAqPOs=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"name": "Decode",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrapdC0uBPtm4=",
									"_parent": {
										"$ref": "AAAAAAFrapbpzuAqPOs="
									},
									"type": "void",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrapdDf+BjAow=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"name": "getFilename",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFraphPc+CIPS0=",
									"_parent": {
										"$ref": "AAAAAAFrapdDf+BjAow="
									},
									"type": "String",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFraphQDeCcXNc=",
							"_parent": {
								"$ref": "AAAAAAFrRuIZtm3rqWs="
							},
							"name": "download",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrapiMj+DHsl8=",
									"_parent": {
										"$ref": "AAAAAAFraphQDeCcXNc="
									},
									"type": "void",
									"direction": "return"
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRuJZ824XSkg=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "Parsing",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvwEl3jfucg=",
							"_parent": {
								"$ref": "AAAAAAFrRuJZ824XSkg="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwEmHjguO8=",
								"_parent": {
									"$ref": "AAAAAAFrRvwEl3jfucg="
								},
								"reference": {
									"$ref": "AAAAAAFrRuJZ824XSkg="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwEmHjhdrE=",
								"_parent": {
									"$ref": "AAAAAAFrRvwEl3jfucg="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							}
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRuOGzW5Cpmw=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "Par"
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRuaJ+m6bs8Q=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "GetData",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvwVx3ltw40=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwVx3luJcU=",
								"_parent": {
									"$ref": "AAAAAAFrRvwVx3ltw40="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwVx3lvYCc=",
								"_parent": {
									"$ref": "AAAAAAFrRvwVx3ltw40="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvzFMIRRMWY=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvzFMIRSwZE=",
								"_parent": {
									"$ref": "AAAAAAFrRvzFMIRRMWY="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvzFMIRTqJU=",
								"_parent": {
									"$ref": "AAAAAAFrRvzFMIRRMWY="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRv1LP464hO8=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRv1LP465kAw=",
								"_parent": {
									"$ref": "AAAAAAFrRv1LP464hO8="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRv1LP466MMg=",
								"_parent": {
									"$ref": "AAAAAAFrRv1LP464hO8="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhn4Erimwi8=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhn4Erin8Uk=",
								"_parent": {
									"$ref": "AAAAAAFrfhn4Erimwi8="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhn4Erio/4U=",
								"_parent": {
									"$ref": "AAAAAAFrfhn4Erimwi8="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						}
					],
					"attributes": [
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFrapw/huH9rdY=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"name": "line",
							"visibility": "private",
							"type": "String"
						},
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraqJ0NeIhlf8=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"name": "Attribute2",
							"type": ""
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFraqXmIuKVzsQ=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"name": "getData",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFraqY7XeK6LVo=",
									"_parent": {
										"$ref": "AAAAAAFraqXmIuKVzsQ="
									},
									"type": "void",
									"direction": "return"
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdRy1u0QLa0s=",
									"_parent": {
										"$ref": "AAAAAAFraqXmIuKVzsQ="
									},
									"name": "ArrayList",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdRy1u0QMiUA=",
									"_parent": {
										"$ref": "AAAAAAFraqXmIuKVzsQ="
									},
									"name": "int n",
									"type": ""
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFraqY74+LOAYE=",
							"_parent": {
								"$ref": "AAAAAAFrRuaJ+m6bs8Q="
							},
							"name": "getMetaData",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFraqaOtOL5KGI=",
									"_parent": {
										"$ref": "AAAAAAFraqY74+LOAYE="
									},
									"type": "void",
									"direction": "return"
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRu/fKnKxl8s=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "Filters",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvucInasmlg=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvucInatNJU=",
								"_parent": {
									"$ref": "AAAAAAFrRvucInasmlg="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvucI3auxsU=",
								"_parent": {
									"$ref": "AAAAAAFrRvucInasmlg="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvvO2Hc9hhk=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvvO2Hc+TvA=",
								"_parent": {
									"$ref": "AAAAAAFrRvvO2Hc9hhk="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvvO2Hc/o1I=",
								"_parent": {
									"$ref": "AAAAAAFrRvvO2Hc9hhk="
								},
								"reference": {
									"$ref": "AAAAAAFrRuIZtm3rqWs="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvvjX3ePPSQ=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvvjX3eQkBw=",
								"_parent": {
									"$ref": "AAAAAAFrRvvjX3ePPSQ="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvvjX3eRYwM=",
								"_parent": {
									"$ref": "AAAAAAFrRvvjX3ePPSQ="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvvs5Xfwq/A=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvvs5XfxvY0=",
								"_parent": {
									"$ref": "AAAAAAFrRvvs5Xfwq/A="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvvs5Xfyuas=",
								"_parent": {
									"$ref": "AAAAAAFrRvvs5Xfwq/A="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvv0bHhgKHY=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvv0bHhhTJc=",
								"_parent": {
									"$ref": "AAAAAAFrRvv0bHhgKHY="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvv0bHhi8WA=",
								"_parent": {
									"$ref": "AAAAAAFrRvv0bHhgKHY="
								},
								"reference": {
									"$ref": "AAAAAAFrRvOCTXO9F74="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS8jmHc/PRM=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8jmHdA5tw=",
								"_parent": {
									"$ref": "AAAAAAFrdS8jmHc/PRM="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8jmHdBjR4=",
								"_parent": {
									"$ref": "AAAAAAFrdS8jmHc/PRM="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							}
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdR88FkxBTWY=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"name": "ArrayList LogFilter1",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSANtUx1hH8=",
									"_parent": {
										"$ref": "AAAAAAFrdR88FkxBTWY="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSANtkx2Id8=",
									"_parent": {
										"$ref": "AAAAAAFrdR88FkxBTWY="
									},
									"name": "double n",
									"type": ""
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSAOnUydeLs=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"name": "ArrayList LogFilter2",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSCAHUzRVUY=",
									"_parent": {
										"$ref": "AAAAAAFrdSAOnUydeLs="
									},
									"name": "ArrayList  database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSCAHUzS05k=",
									"_parent": {
										"$ref": "AAAAAAFrdSAOnUydeLs="
									},
									"name": "double n",
									"type": ""
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSCBhkz5SMM=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"name": "ArrayList CondFilter1",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSEBBE0tb7Q=",
									"_parent": {
										"$ref": "AAAAAAFrdSCBhkz5SMM="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSEBBE0uNOk=",
									"_parent": {
										"$ref": "AAAAAAFrdSCBhkz5SMM="
									},
									"name": "double n",
									"type": ""
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSECZE1VNUM=",
							"_parent": {
								"$ref": "AAAAAAFrRu/fKnKxl8s="
							},
							"name": "ArrayList CondFilter2",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSFqok2JPq8=",
									"_parent": {
										"$ref": "AAAAAAFrdSECZE1VNUM="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSFqok2KawA=",
									"_parent": {
										"$ref": "AAAAAAFrdSECZE1VNUM="
									},
									"name": "double n",
									"type": ""
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRvN8HXOUVB0=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "Richieste Metadati",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvwdx3oK3GU=",
							"_parent": {
								"$ref": "AAAAAAFrRvN8HXOUVB0="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwdx3oLHTs=",
								"_parent": {
									"$ref": "AAAAAAFrRvwdx3oK3GU="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwdx3oMjiY=",
								"_parent": {
									"$ref": "AAAAAAFrRvwdx3oK3GU="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvwepHq2Uho=",
							"_parent": {
								"$ref": "AAAAAAFrRvN8HXOUVB0="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwepHq3kMU=",
								"_parent": {
									"$ref": "AAAAAAFrRvwepHq2Uho="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwepnq4wb4=",
								"_parent": {
									"$ref": "AAAAAAFrRvwepHq2Uho="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrRvwnlntxCks=",
							"_parent": {
								"$ref": "AAAAAAFrRvN8HXOUVB0="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwnlntyv7c=",
								"_parent": {
									"$ref": "AAAAAAFrRvwnlntxCks="
								},
								"reference": {
									"$ref": "AAAAAAFrRvN8HXOUVB0="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrRvwnlntzbV4=",
								"_parent": {
									"$ref": "AAAAAAFrRvwnlntxCks="
								},
								"reference": {
									"$ref": "AAAAAAFrRvOCTXO9F74="
								}
							}
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrRvOCTXO9F74=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "Richeste statistiche"
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFraoaYL9mFJ1o=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "StockRecords",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrarWdtO5ECp0=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrarWdtO5Fj9Y=",
								"_parent": {
									"$ref": "AAAAAAFrarWdtO5ECp0="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrarWdtO5GPKk=",
								"_parent": {
									"$ref": "AAAAAAFrarWdtO5ECp0="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTmY2oPRyyU=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTmY2oPSakw=",
								"_parent": {
									"$ref": "AAAAAAFrdTmY2oPRyyU="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTmY2oPT7AE=",
								"_parent": {
									"$ref": "AAAAAAFrdTmY2oPRyyU="
								},
								"reference": {
									"$ref": "AAAAAAFrRuIZtm3rqWs="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTqMVoTbIAU=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTqMVoTcRHM=",
								"_parent": {
									"$ref": "AAAAAAFrdTqMVoTbIAU="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTqMVoTd4Sw=",
								"_parent": {
									"$ref": "AAAAAAFrdTqMVoTbIAU="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								},
								"aggregation": "shared"
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTw7OIXROrY=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTw7OIXSvSw=",
								"_parent": {
									"$ref": "AAAAAAFrdTw7OIXROrY="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTw7OIXT8SU=",
								"_parent": {
									"$ref": "AAAAAAFrdTw7OIXROrY="
								},
								"reference": {
									"$ref": "AAAAAAFrRuaJ+m6bs8Q="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTxJ6YYyOao=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTxJ6YYz+bA=",
								"_parent": {
									"$ref": "AAAAAAFrdTxJ6YYyOao="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTxJ6YY03+Q=",
								"_parent": {
									"$ref": "AAAAAAFrdTxJ6YYyOao="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTxdsIaiEwU=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTxdsIajTls=",
								"_parent": {
									"$ref": "AAAAAAFrdTxdsIaiEwU="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTxdsIakAKE=",
								"_parent": {
									"$ref": "AAAAAAFrdTxdsIaiEwU="
								},
								"reference": {
									"$ref": "AAAAAAFrdSciYl5+CJc="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTxwIochc3E=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTxwIocia5I=",
								"_parent": {
									"$ref": "AAAAAAFrdTxwIochc3E="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTxwIocj/Dk=",
								"_parent": {
									"$ref": "AAAAAAFrdTxwIochc3E="
								},
								"reference": {
									"$ref": "AAAAAAFrdSSZG1MAI5o="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhtihsfHZPM=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhtihsfI1ME=",
								"_parent": {
									"$ref": "AAAAAAFrfhtihsfHZPM="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhtihsfJ+o0=",
								"_parent": {
									"$ref": "AAAAAAFrfhtihsfHZPM="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						}
					],
					"attributes": [
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraocOvdpOE3s=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "Indirizzo",
							"visibility": "private",
							"type": "String"
						},
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraojHUNqMHkA=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "Attiva",
							"visibility": "private",
							"type": "int"
						},
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraolafNrKZ5U=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "Zona",
							"visibility": "private",
							"type": "int"
						},
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraomn0dsISWc=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "Longitudine",
							"visibility": "private",
							"type": "double"
						},
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraoqOL9u1tws=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "Latitudine",
							"visibility": "private",
							"type": "double"
						},
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraoq/Ldvm7PU=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "Località",
							"visibility": "private",
							"type": "double"
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFraoxF+tykX9k=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "getIndirizzo",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFraoy1JNzWuiA=",
									"_parent": {
										"$ref": "AAAAAAFraoxF+tykX9k="
									},
									"type": "String",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFraoy2CtzqmCA=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "setIndirizzo",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFraozwfd0Pino=",
									"_parent": {
										"$ref": "AAAAAAFraoy2CtzqmCA="
									},
									"type": "void",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFraozxFt0jfiA=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "getAttiva",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao0raN1IwNw=",
									"_parent": {
										"$ref": "AAAAAAFraozxFt0jfiA="
									},
									"type": "int",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrao0sBN1c2zU=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "setAttiva",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao2cC92Bnlg=",
									"_parent": {
										"$ref": "AAAAAAFrao0sBN1c2zU="
									},
									"name": "int attiva",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao2cC92CvSw=",
									"_parent": {
										"$ref": "AAAAAAFrao0sBN1c2zU="
									},
									"type": "void",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrao2cvd2dxwo=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "getZona",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao3B+d3CAtc=",
									"_parent": {
										"$ref": "AAAAAAFrao2cvd2dxwo="
									},
									"type": "int",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrao3CmN3Wss4=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "setZona",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao3w1t37Zrw=",
									"_parent": {
										"$ref": "AAAAAAFrao3CmN3Wss4="
									},
									"type": "int",
									"direction": "return"
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao5SRt5tzzs=",
									"_parent": {
										"$ref": "AAAAAAFrao3CmN3Wss4="
									},
									"name": "int zona",
									"type": ""
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrao3xht4PyhQ=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "getLon",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrao4xUt46EQw=",
									"_parent": {
										"$ref": "AAAAAAFrao3xht4PyhQ="
									},
									"type": "double",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrao6ex96fBns=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "setLoc",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrapANcN7E/Ko=",
									"_parent": {
										"$ref": "AAAAAAFrao6ex96fBns="
									},
									"name": "double loc",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrapANcN7FMhg=",
									"_parent": {
										"$ref": "AAAAAAFrao6ex96fBns="
									},
									"type": "void",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrapAOMd7g6F4=",
							"_parent": {
								"$ref": "AAAAAAFraoaYL9mFJ1o="
							},
							"name": "toString",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrapDNvd8FURk=",
									"_parent": {
										"$ref": "AAAAAAFrapAOMd7g6F4="
									},
									"type": "String",
									"direction": "return"
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFraqbM7+aevqg=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "StockData",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTpfaoRWeGQ=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTpfaoRXWls=",
								"_parent": {
									"$ref": "AAAAAAFrdTpfaoRWeGQ="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTpfaoRYX14=",
								"_parent": {
									"$ref": "AAAAAAFrdTpfaoRWeGQ="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								},
								"aggregation": "shared"
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdTrMkIV/HSs=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTrMkIWALLE=",
								"_parent": {
									"$ref": "AAAAAAFrdTrMkIV/HSs="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdTrMkIWB4v0=",
								"_parent": {
									"$ref": "AAAAAAFrdTrMkIV/HSs="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								},
								"aggregation": "shared"
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhrdJ7/S3ck=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhrdJ7/Tnlo=",
								"_parent": {
									"$ref": "AAAAAAFrfhrdJ7/S3ck="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhrdJ7/Ut0U=",
								"_parent": {
									"$ref": "AAAAAAFrfhrdJ7/S3ck="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							}
						}
					],
					"attributes": [
						{
							"_type": "UMLAttribute",
							"_id": "AAAAAAFraqzBXOtqIOg=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"name": "records",
							"visibility": "private",
							"type": "ArrayList"
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrarIgn+v4jzc=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"name": "getRecordNumber",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrarLCJOxIMIU=",
									"_parent": {
										"$ref": "AAAAAAFrarIgn+v4jzc="
									},
									"type": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrarOwnezATFE=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"name": "getRecords",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrarQt5uzlVVc=",
									"_parent": {
										"$ref": "AAAAAAFrarOwnezATFE="
									},
									"type": "ArrayList<StockRecords>",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrarRAYu0XWUc=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"name": "getNumberOfrecords",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrarR+6+081K4=",
									"_parent": {
										"$ref": "AAAAAAFrarRAYu0XWUc="
									},
									"type": "int",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrarR/qe1Q2ZU=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"name": "LoadDatafromFile",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrarSxae11l9k=",
									"_parent": {
										"$ref": "AAAAAAFrarR/qe1Q2ZU="
									},
									"name": "String filepath",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrarSxae127/s=",
									"_parent": {
										"$ref": "AAAAAAFrarR/qe1Q2ZU="
									},
									"type": "void",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdRo8sEMVUXk=",
							"_parent": {
								"$ref": "AAAAAAFraqbM7+aevqg="
							},
							"name": "getRecordNumber",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdRq4mkNJEPE=",
									"_parent": {
										"$ref": "AAAAAAFrdRo8sEMVUXk="
									},
									"name": "int i",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdRq4m0NK9Zk=",
									"_parent": {
										"$ref": "AAAAAAFrdRo8sEMVUXk="
									},
									"type": {
										"$ref": "AAAAAAFraoaYL9mFJ1o="
									},
									"direction": "return"
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrdSSZG1MAI5o=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "GetStats",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhoU7bjyDWg=",
							"_parent": {
								"$ref": "AAAAAAFrdSSZG1MAI5o="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhoU7bjzDg4=",
								"_parent": {
									"$ref": "AAAAAAFrfhoU7bjyDWg="
								},
								"reference": {
									"$ref": "AAAAAAFrdSSZG1MAI5o="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhoU7bj0YPM=",
								"_parent": {
									"$ref": "AAAAAAFrfhoU7bjyDWg="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSTqCVOEIds=",
							"_parent": {
								"$ref": "AAAAAAFrdSSZG1MAI5o="
							},
							"name": "getLatStats",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSVgCFO47sg=",
									"_parent": {
										"$ref": "AAAAAAFrdSTqCVOEIds="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSVgCFO5hoY=",
									"_parent": {
										"$ref": "AAAAAAFrdSTqCVOEIds="
									},
									"name": "double n",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSrPDGyNVmM=",
									"_parent": {
										"$ref": "AAAAAAFrdSTqCVOEIds="
									},
									"type": "double",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSVhBlPgybw=",
							"_parent": {
								"$ref": "AAAAAAFrdSSZG1MAI5o="
							},
							"name": "getLonStats",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSW0GFQUDpI=",
									"_parent": {
										"$ref": "AAAAAAFrdSVhBlPgybw="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSW0GVQVDfg=",
									"_parent": {
										"$ref": "AAAAAAFrdSVhBlPgybw="
									},
									"name": "double n",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSrkRmzGUnc=",
									"_parent": {
										"$ref": "AAAAAAFrdSVhBlPgybw="
									},
									"type": "double",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSXZV1Spw8o=",
							"_parent": {
								"$ref": "AAAAAAFrdSSZG1MAI5o="
							},
							"name": "getNumberofActiveAreas",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSYvb1Td/To=",
									"_parent": {
										"$ref": "AAAAAAFrdSXZV1Spw8o="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSYvb1Tegvo=",
									"_parent": {
										"$ref": "AAAAAAFrdSXZV1Spw8o="
									},
									"name": "double n",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSr04Wz/kmk=",
									"_parent": {
										"$ref": "AAAAAAFrdSXZV1Spw8o="
									},
									"type": "int",
									"direction": "return"
								}
							]
						},
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSYwbFUFhv4=",
							"_parent": {
								"$ref": "AAAAAAFrdSSZG1MAI5o="
							},
							"name": "getNumberofAddressinaZone",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSbQiFU5a04=",
									"_parent": {
										"$ref": "AAAAAAFrdSYwbFUFhv4="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSbQiFU67w4=",
									"_parent": {
										"$ref": "AAAAAAFrdSYwbFUFhv4="
									},
									"name": "double n",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSsRdG04jEI=",
									"_parent": {
										"$ref": "AAAAAAFrdSYwbFUFhv4="
									},
									"type": "int",
									"direction": "return"
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrdSciYl5+CJc=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "GetWords",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhouIrlEQt4=",
							"_parent": {
								"$ref": "AAAAAAFrdSciYl5+CJc="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhouIrlFOLY=",
								"_parent": {
									"$ref": "AAAAAAFrfhouIrlEQt4="
								},
								"reference": {
									"$ref": "AAAAAAFrdSciYl5+CJc="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhouIrlGbK8=",
								"_parent": {
									"$ref": "AAAAAAFrfhouIrlEQt4="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSdhHV8C4wg=",
							"_parent": {
								"$ref": "AAAAAAFrdSciYl5+CJc="
							},
							"name": "getWords",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSf0X182uEk=",
									"_parent": {
										"$ref": "AAAAAAFrdSdhHV8C4wg="
									},
									"name": "ArrayList database",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSf0X183vX8=",
									"_parent": {
										"$ref": "AAAAAAFrdSdhHV8C4wg="
									},
									"name": "double n",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdStSj22enwk=",
									"_parent": {
										"$ref": "AAAAAAFrdSdhHV8C4wg="
									},
									"type": "void",
									"direction": "return"
								}
							]
						}
					]
				},
				{
					"_type": "UMLClass",
					"_id": "AAAAAAFrdSiJ+WRUWt8=",
					"_parent": {
						"$ref": "AAAAAAFrRtlg2mc44Jk="
					},
					"name": "ProgettoApplication",
					"ownedElements": [
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS7rYnQuM3A=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS7rYnQvs8g=",
								"_parent": {
									"$ref": "AAAAAAFrdS7rYnQuM3A="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS7rYnQws4o=",
								"_parent": {
									"$ref": "AAAAAAFrdS7rYnQuM3A="
								},
								"reference": {
									"$ref": "AAAAAAFrdSciYl5+CJc="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS72ZXStt+A=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS72ZXSu0QA=",
								"_parent": {
									"$ref": "AAAAAAFrdS72ZXStt+A="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS72ZXSvVrQ=",
								"_parent": {
									"$ref": "AAAAAAFrdS72ZXStt+A="
								},
								"reference": {
									"$ref": "AAAAAAFrdSSZG1MAI5o="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS8DF3U7Vpk=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8DF3U8jYc=",
								"_parent": {
									"$ref": "AAAAAAFrdS8DF3U7Vpk="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8DF3U9eJc=",
								"_parent": {
									"$ref": "AAAAAAFrdS8DF3U7Vpk="
								},
								"reference": {
									"$ref": "AAAAAAFraoaYL9mFJ1o="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS8Lw3XY0rA=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8Lw3XZTnA=",
								"_parent": {
									"$ref": "AAAAAAFrdS8Lw3XY0rA="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8Lw3XaMyM=",
								"_parent": {
									"$ref": "AAAAAAFrdS8Lw3XY0rA="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrdS8a9naEmqE=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8a9naFqGE=",
								"_parent": {
									"$ref": "AAAAAAFrdS8a9naEmqE="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrdS8a9naG8UU=",
								"_parent": {
									"$ref": "AAAAAAFrdS8a9naEmqE="
								},
								"reference": {
									"$ref": "AAAAAAFrRu/fKnKxl8s="
								}
							}
						},
						{
							"_type": "UMLAssociation",
							"_id": "AAAAAAFrfhsRbcLL8AQ=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"end1": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhsRbcLMgLI=",
								"_parent": {
									"$ref": "AAAAAAFrfhsRbcLL8AQ="
								},
								"reference": {
									"$ref": "AAAAAAFrdSiJ+WRUWt8="
								}
							},
							"end2": {
								"_type": "UMLAssociationEnd",
								"_id": "AAAAAAFrfhsRbcLNMXM=",
								"_parent": {
									"$ref": "AAAAAAFrfhsRbcLL8AQ="
								},
								"reference": {
									"$ref": "AAAAAAFraqbM7+aevqg="
								}
							}
						}
					],
					"operations": [
						{
							"_type": "UMLOperation",
							"_id": "AAAAAAFrdSiv1WTYmU8=",
							"_parent": {
								"$ref": "AAAAAAFrdSiJ+WRUWt8="
							},
							"name": "main",
							"parameters": [
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSkZXWVCR6A=",
									"_parent": {
										"$ref": "AAAAAAFrdSiv1WTYmU8="
									},
									"name": "String[] args",
									"type": ""
								},
								{
									"_type": "UMLParameter",
									"_id": "AAAAAAFrdSkvbGVgOYw=",
									"_parent": {
										"$ref": "AAAAAAFrdSiv1WTYmU8="
									},
									"type": "void",
									"direction": "return"
								}
							]
						}
					]
				}
			]
		},
		{
			"_type": "UMLCollaboration",
			"_id": "AAAAAAFrRtmS52d50ho=",
			"_parent": {
				"$ref": "AAAAAAFF+h6SjaM2Hec="
			},
			"name": "Collaboration1",
			"ownedElements": [
				{
					"_type": "UMLInteraction",
					"_id": "AAAAAAFrRtmS6Gd613g=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Interaction1",
					"ownedElements": [
						{
							"_type": "UMLSequenceDiagram",
							"_id": "AAAAAAFrRtmS6Gd72g4=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "SequenceDiagram1",
							"tags": [
								{
									"_type": "Tag",
									"_id": "AAAAAAFrflWi3cxD6I0=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"name": "Tag1",
									"kind": "string"
								},
								{
									"_type": "Tag",
									"_id": "AAAAAAFrfllvWsyQzdA=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"name": "Tag2",
									"kind": "string"
								},
								{
									"_type": "Tag",
									"_id": "AAAAAAFrfoLuN/kmP+w=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"name": "Tag3",
									"kind": "string"
								}
							],
							"ownedViews": [
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrdVkcj4wSgdM=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdVkcj4wRUIQ="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrdVkcj4wTFMw=",
											"_parent": {
												"$ref": "AAAAAAFrdVkcj4wSgdM="
											},
											"model": {
												"$ref": "AAAAAAFrdVkcj4wRUIQ="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdVkckIwUDTU=",
													"_parent": {
														"$ref": "AAAAAAFrdVkcj4wTFMw="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -7.47265625,
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdVkckIwVHBE=",
													"_parent": {
														"$ref": "AAAAAAFrdVkcj4wTFMw="
													},
													"font": "Arial;13;1",
													"left": 229,
													"top": 47,
													"width": 134.21728515625,
													"height": 13,
													"text": "ProgettoApplication",
													"wordWrap": true
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdVkckIwWdiE=",
													"_parent": {
														"$ref": "AAAAAAFrdVkcj4wTFMw="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -7.47265625,
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdVkckYwXDyI=",
													"_parent": {
														"$ref": "AAAAAAFrdVkcj4wTFMw="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -7.47265625,
													"horizontalAlignment": 1,
													"wordWrap": true
												}
											],
											"font": "Arial;13;0",
											"left": 224,
											"top": 40,
											"width": 144.21728515625,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrdVkckIwUDTU="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrdVkckIwVHBE="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrdVkckIwWdiE="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrdVkckYwXDyI="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrdVkckYwYqEg=",
											"_parent": {
												"$ref": "AAAAAAFrdVkcj4wSgdM="
											},
											"model": {
												"$ref": "AAAAAAFrdVkcj4wRUIQ="
											},
											"font": "Arial;13;0",
											"left": 296,
											"top": 80,
											"width": 1,
											"height": 1793
										}
									],
									"font": "Arial;13;0",
									"left": 224,
									"top": 40,
									"width": 144.21728515625,
									"height": 1833,
									"nameCompartment": {
										"$ref": "AAAAAAFrdVkcj4wTFMw="
									},
									"wordWrap": true,
									"linePart": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfjIEUMlplDA=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjIET8loeTg="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjIEUMlqnJI=",
											"_parent": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"model": {
												"$ref": "AAAAAAFrfjIET8loeTg="
											},
											"font": "Arial;13;0",
											"left": 372,
											"top": 88,
											"width": 117.06982421875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"edgePosition": 1,
											"text": "1 : Download del file"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjIEUMlr13g=",
											"_parent": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"model": {
												"$ref": "AAAAAAFrfjIET8loeTg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 430,
											"top": 73,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjIEUMlslp0=",
											"_parent": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"model": {
												"$ref": "AAAAAAFrfjIET8loeTg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 430,
											"top": 108,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfjIEUMlt8NM=",
											"_parent": {
												"$ref": "AAAAAAFrfjIEUMlplDA="
											},
											"model": {
												"$ref": "AAAAAAFrfjIET8loeTg="
											},
											"font": "Arial;13;0",
											"left": 565,
											"top": 104,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfhwVxciYj04="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:104;565:104",
									"nameLabel": {
										"$ref": "AAAAAAFrfjIEUMlqnJI="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfjIEUMlr13g="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfjIEUMlslp0="
									},
									"activation": {
										"$ref": "AAAAAAFrfjIEUMlt8NM="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrdWFciI4Wbp0=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdWFciI4V47w="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrdWFciI4X8n4=",
											"_parent": {
												"$ref": "AAAAAAFrdWFciI4Wbp0="
											},
											"model": {
												"$ref": "AAAAAAFrdWFciI4V47w="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWFciI4YVnY=",
													"_parent": {
														"$ref": "AAAAAAFrdWFciI4X8n4="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 1624.52734375,
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWFciY4ZSeQ=",
													"_parent": {
														"$ref": "AAAAAAFrdWFciI4X8n4="
													},
													"font": "Arial;13;1",
													"left": 1045,
													"top": 47,
													"width": 62.736328125,
													"height": 13,
													"text": "GetData"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWFciY4avoU=",
													"_parent": {
														"$ref": "AAAAAAFrdWFciI4X8n4="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 1624.52734375,
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWFciY4bOU4=",
													"_parent": {
														"$ref": "AAAAAAFrdWFciI4X8n4="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 1624.52734375,
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 1040,
											"top": 40,
											"width": 72.736328125,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrdWFciI4YVnY="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrdWFciY4ZSeQ="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrdWFciY4avoU="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrdWFciY4bOU4="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrdWFciY4cgHc=",
											"_parent": {
												"$ref": "AAAAAAFrdWFciI4Wbp0="
											},
											"model": {
												"$ref": "AAAAAAFrdWFciI4V47w="
											},
											"font": "Arial;13;0",
											"left": 1076,
											"top": 80,
											"width": 1,
											"height": 967
										}
									],
									"font": "Arial;13;0",
									"left": 1040,
									"top": 40,
									"width": 72.736328125,
									"height": 1007,
									"nameCompartment": {
										"$ref": "AAAAAAFrdWFciI4X8n4="
									},
									"linePart": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrdWJK1Y56w9M=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdWJK1Y55CLk="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrdWJK1o57U+Y=",
											"_parent": {
												"$ref": "AAAAAAFrdWJK1Y56w9M="
											},
											"model": {
												"$ref": "AAAAAAFrdWJK1Y55CLk="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWJK1o58d7c=",
													"_parent": {
														"$ref": "AAAAAAFrdWJK1o57U+Y="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 80,
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWJK1o59w3w=",
													"_parent": {
														"$ref": "AAAAAAFrdWJK1o57U+Y="
													},
													"font": "Arial;13;1",
													"left": 1221,
													"top": 47,
													"width": 63.4599609375,
													"height": 13,
													"text": "GetStats"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWJK1o5+Pp0=",
													"_parent": {
														"$ref": "AAAAAAFrdWJK1o57U+Y="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 80,
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWJK145/J2M=",
													"_parent": {
														"$ref": "AAAAAAFrdWJK1o57U+Y="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 80,
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 1216,
											"top": 40,
											"width": 73.4599609375,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrdWJK1o58d7c="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrdWJK1o59w3w="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrdWJK1o5+Pp0="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrdWJK145/J2M="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrdWJK146AC/8=",
											"_parent": {
												"$ref": "AAAAAAFrdWJK1Y56w9M="
											},
											"model": {
												"$ref": "AAAAAAFrdWJK1Y55CLk="
											},
											"font": "Arial;13;0",
											"left": 1253,
											"top": 80,
											"width": 1,
											"height": 1343
										}
									],
									"font": "Arial;13;0",
									"left": 1216,
									"top": 40,
									"width": 73.4599609375,
									"height": 1383,
									"nameCompartment": {
										"$ref": "AAAAAAFrdWJK1o57U+Y="
									},
									"linePart": {
										"$ref": "AAAAAAFrdWJK146AC/8="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrdWGlJ45XULU=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdWGlJ45W3cs="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrdWGlKI5YlUM=",
											"_parent": {
												"$ref": "AAAAAAFrdWGlJ45XULU="
											},
											"model": {
												"$ref": "AAAAAAFrdWGlJ45W3cs="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWGlKI5Zz3U=",
													"_parent": {
														"$ref": "AAAAAAFrdWGlKI5YlUM="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 752,
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWGlKI5aHAw=",
													"_parent": {
														"$ref": "AAAAAAFrdWGlKI5YlUM="
													},
													"font": "Arial;13;1",
													"left": 1341,
													"top": 47,
													"width": 71.876953125,
													"height": 13,
													"text": "GetWords"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWGlKI5bdOI=",
													"_parent": {
														"$ref": "AAAAAAFrdWGlKI5YlUM="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 752,
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdWGlKI5cYRM=",
													"_parent": {
														"$ref": "AAAAAAFrdWGlKI5YlUM="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": 752,
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 1336,
											"top": 40,
											"width": 81.876953125,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrdWGlKI5Zz3U="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrdWGlKI5aHAw="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrdWGlKI5bdOI="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrdWGlKI5cYRM="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrdWGlKI5dK4M=",
											"_parent": {
												"$ref": "AAAAAAFrdWGlJ45XULU="
											},
											"model": {
												"$ref": "AAAAAAFrdWGlJ45W3cs="
											},
											"font": "Arial;13;0",
											"left": 1377,
											"top": 80,
											"width": 1,
											"height": 1536
										}
									],
									"font": "Arial;13;0",
									"left": 1336,
									"top": 40,
									"width": 81.876953125,
									"height": 1576,
									"nameCompartment": {
										"$ref": "AAAAAAFrdWGlKI5YlUM="
									},
									"linePart": {
										"$ref": "AAAAAAFrdWGlKI5dK4M="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfjPp5snrx3g=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjPp5cnqhhw="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjPp5snsgPc=",
											"_parent": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"model": {
												"$ref": "AAAAAAFrfjPp5cnqhhw="
											},
											"font": "Arial;13;0",
											"left": 550,
											"top": 147,
											"width": 123.58251953125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"edgePosition": 1,
											"text": "2 : Esegue Download"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjPp5sntlsE=",
											"_parent": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"model": {
												"$ref": "AAAAAAFrfjPp5cnqhhw="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 626,
											"top": 147,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjPp5snuOwc=",
											"_parent": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"model": {
												"$ref": "AAAAAAFrfjPp5cnqhhw="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 592,
											"top": 148,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfjPp5snvRVg=",
											"_parent": {
												"$ref": "AAAAAAFrfjPp5snrx3g="
											},
											"model": {
												"$ref": "AAAAAAFrfjPp5cnqhhw="
											},
											"font": "Arial;13;0",
											"left": 565,
											"top": 164,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfhwVxciYj04="
									},
									"tail": {
										"$ref": "AAAAAAFrfhwVxciYj04="
									},
									"points": "572:144;602:144;602:164;578:164",
									"nameLabel": {
										"$ref": "AAAAAAFrfjPp5snsgPc="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfjPp5sntlsE="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfjPp5snuOwc="
									},
									"activation": {
										"$ref": "AAAAAAFrfjPp5snvRVg="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfjSX4MqEAgI=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjSX38qDOfM="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjSX4MqFKAE=",
											"_parent": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"model": {
												"$ref": "AAAAAAFrfjSX38qDOfM="
											},
											"font": "Arial;13;0",
											"left": 398,
											"top": 206,
											"width": 71.53173828125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"edgePosition": 1,
											"text": "3 : Filename"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjSX4MqG1TY=",
											"_parent": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"model": {
												"$ref": "AAAAAAFrfjSX38qDOfM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 433,
											"top": 221,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjSX4MqHbHo=",
											"_parent": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"model": {
												"$ref": "AAAAAAFrfjSX38qDOfM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 434,
											"top": 186,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfjSX4MqI+eo=",
											"_parent": {
												"$ref": "AAAAAAFrfjSX4MqEAgI="
											},
											"model": {
												"$ref": "AAAAAAFrfjSX38qDOfM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 202,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfhwVxciYj04="
									},
									"points": "572:202;296:202",
									"nameLabel": {
										"$ref": "AAAAAAFrfjSX4MqFKAE="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfjSX4MqG1TY="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfjSX4MqHbHo="
									},
									"activation": {
										"$ref": "AAAAAAFrfjSX4MqI+eo="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfjVjksq7Mdw=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjVjksq6iTc="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjVjksq8F+E=",
											"_parent": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"model": {
												"$ref": "AAAAAAFrfjVjksq6iTc="
											},
											"font": "Arial;13;0",
											"left": 440,
											"top": 230,
											"width": 175.53173828125,
											"height": 13,
											"alpha": -3.9745744180020064,
											"distance": 14.866068747318506,
											"hostEdge": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"edgePosition": 1,
											"text": "4 : LoadData-----------Filename"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjVjksq9BHA=",
											"_parent": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"model": {
												"$ref": "AAAAAAFrfjVjksq6iTc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 537,
											"top": 217,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjVjksq+KPM=",
											"_parent": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"model": {
												"$ref": "AAAAAAFrfjVjksq6iTc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 537,
											"top": 252,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfjVjksq/hPk=",
											"_parent": {
												"$ref": "AAAAAAFrfjVjksq7Mdw="
											},
											"model": {
												"$ref": "AAAAAAFrfjVjksq6iTc="
											},
											"font": "Arial;13;0",
											"left": 779,
											"top": 248,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:248;779:248",
									"nameLabel": {
										"$ref": "AAAAAAFrfjVjksq8F+E="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfjVjksq9BHA="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfjVjksq+KPM="
									},
									"activation": {
										"$ref": "AAAAAAFrfjVjksq/hPk="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrdV85242a2vo=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdV85242Zfsg="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdV85242bK9w=",
											"_parent": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"model": {
												"$ref": "AAAAAAFrdV85242Zfsg="
											},
											"font": "Arial;13;0",
											"left": 296,
											"top": 267,
											"width": 78.04443359375,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"edgePosition": 1,
											"text": "5 : Scelta"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdV85242ccoc=",
											"_parent": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"model": {
												"$ref": "AAAAAAFrdV85242Zfsg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 350,
											"top": 267,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdV85242dZAA=",
											"_parent": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"model": {
												"$ref": "AAAAAAFrdV85242Zfsg="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 316,
											"top": 268,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrdV85242eDJ4=",
											"_parent": {
												"$ref": "AAAAAAFrdV85242a2vo="
											},
											"model": {
												"$ref": "AAAAAAFrdV85242Zfsg="
											},
											"font": "Arial;13;0",
											"left": 289,
											"top": 284,
											"width": 14,
											"height": 39
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:264;326:264;326:284;302:284",
									"nameLabel": {
										"$ref": "AAAAAAFrdV85242bK9w="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdV85242ccoc="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdV85242dZAA="
									},
									"activation": {
										"$ref": "AAAAAAFrdV85242eDJ4="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfjiHs8rxsC4=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjiHs8rw9JQ="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjiHs8rys+E=",
											"_parent": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"model": {
												"$ref": "AAAAAAFrfjiHs8rw9JQ="
											},
											"font": "Arial;13;0",
											"left": 817,
											"top": 320,
											"width": 79.49169921875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"edgePosition": 1,
											"text": "6 : Passa Info"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjiHs8rzMAk=",
											"_parent": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"model": {
												"$ref": "AAAAAAFrfjiHs8rw9JQ="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 856,
											"top": 305,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjiHs8r0KPE=",
											"_parent": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"model": {
												"$ref": "AAAAAAFrfjiHs8rw9JQ="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 856,
											"top": 340,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfjiHs8r120U=",
											"_parent": {
												"$ref": "AAAAAAFrfjiHs8rxsC4="
											},
											"model": {
												"$ref": "AAAAAAFrfjiHs8rw9JQ="
											},
											"font": "Arial;13;0",
											"left": 927,
											"top": 336,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfh3HkMkEIxI="
									},
									"tail": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									},
									"points": "786:336;927:336",
									"nameLabel": {
										"$ref": "AAAAAAFrfjiHs8rys+E="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfjiHs8rzMAk="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfjiHs8r0KPE="
									},
									"activation": {
										"$ref": "AAAAAAFrfjiHs8r120U="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfjnAiMsyBJM=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjnAiMsxdXc="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjnAiMszIOw=",
											"_parent": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"model": {
												"$ref": "AAAAAAFrfjnAiMsxdXc="
											},
											"font": "Arial;13;0",
											"left": 773,
											"top": 428,
											"width": 172.70703125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"edgePosition": 1,
											"text": "7 : Restituisce un uno all volta"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjnAiMs0Jvw=",
											"_parent": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"model": {
												"$ref": "AAAAAAFrfjnAiMsxdXc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 859,
											"top": 443,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfjnAiMs1foA=",
											"_parent": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"model": {
												"$ref": "AAAAAAFrfjnAiMsxdXc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 860,
											"top": 408,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfjnAiMs2sMo=",
											"_parent": {
												"$ref": "AAAAAAFrfjnAiMsyBJM="
											},
											"model": {
												"$ref": "AAAAAAFrfjnAiMsxdXc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 786,
											"top": 424,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									},
									"tail": {
										"$ref": "AAAAAAFrfh3HkMkEIxI="
									},
									"points": "934:424;786:424",
									"nameLabel": {
										"$ref": "AAAAAAFrfjnAiMszIOw="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfjnAiMs0Jvw="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfjnAiMs1foA="
									},
									"activation": {
										"$ref": "AAAAAAFrfjnAiMs2sMo="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfkxl28ur3tg=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfkxl2suq7eI="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfkxl28usTbw=",
											"_parent": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"model": {
												"$ref": "AAAAAAFrfkxl2suq7eI="
											},
											"font": "Arial;13;0",
											"left": 482,
											"top": 492,
											"width": 116.32080078125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"edgePosition": 1,
											"text": "8 : Restituisce valori"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfkxl28ut4tQ=",
											"_parent": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"model": {
												"$ref": "AAAAAAFrfkxl2suq7eI="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 540,
											"top": 507,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfkxl28uuIAg=",
											"_parent": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"model": {
												"$ref": "AAAAAAFrfkxl2suq7eI="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 541,
											"top": 472,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfkxl28uvR8g=",
											"_parent": {
												"$ref": "AAAAAAFrfkxl28ur3tg="
											},
											"model": {
												"$ref": "AAAAAAFrfkxl2suq7eI="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 488,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									},
									"points": "786:488;296:488",
									"nameLabel": {
										"$ref": "AAAAAAFrfkxl28usTbw="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfkxl28ut4tQ="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfkxl28uuIAg="
									},
									"activation": {
										"$ref": "AAAAAAFrfkxl28uvR8g="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfk0V9svYhHY=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfk0V9svXglA="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfk0V9svZuJE=",
											"_parent": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"model": {
												"$ref": "AAAAAAFrfk0V9svXglA="
											},
											"font": "Arial;13;0",
											"left": 424,
											"top": 515,
											"width": 226.1796875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"edgePosition": 1,
											"text": "9 : Chiede numero di record collection"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfk0V9svaaU4=",
											"_parent": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"model": {
												"$ref": "AAAAAAFrfk0V9svXglA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 537,
											"top": 500,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfk0V9svb7W0=",
											"_parent": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"model": {
												"$ref": "AAAAAAFrfk0V9svXglA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 537,
											"top": 535,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfk0V9svcnq0=",
											"_parent": {
												"$ref": "AAAAAAFrfk0V9svYhHY="
											},
											"model": {
												"$ref": "AAAAAAFrfk0V9svXglA="
											},
											"font": "Arial;13;0",
											"left": 779,
											"top": 531,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:531;779:531",
									"nameLabel": {
										"$ref": "AAAAAAFrfk0V9svZuJE="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfk0V9svaaU4="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfk0V9svb7W0="
									},
									"activation": {
										"$ref": "AAAAAAFrfk0V9svcnq0="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfk2fP8vurqo=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfk2fPsvtwg4="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfk2fP8vvST0=",
											"_parent": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"model": {
												"$ref": "AAAAAAFrfk2fPsvtwg4="
											},
											"font": "Arial;13;0",
											"left": 442,
											"top": 580,
											"width": 197.25341796875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"edgePosition": 1,
											"text": "10 : Restistuisce numero di record"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfk2fQMvwhBU=",
											"_parent": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"model": {
												"$ref": "AAAAAAFrfk2fPsvtwg4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 540,
											"top": 595,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfk2fQMvxWyg=",
											"_parent": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"model": {
												"$ref": "AAAAAAFrfk2fPsvtwg4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 541,
											"top": 560,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfk2fQMvyYUE=",
											"_parent": {
												"$ref": "AAAAAAFrfk2fP8vurqo="
											},
											"model": {
												"$ref": "AAAAAAFrfk2fPsvtwg4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 576,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									},
									"points": "786:576;296:576",
									"nameLabel": {
										"$ref": "AAAAAAFrfk2fP8vvST0="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfk2fQMvwhBU="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfk2fQMvxWyg="
									},
									"activation": {
										"$ref": "AAAAAAFrfk2fQMvyYUE="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrdWtMxY9EXiU=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdWtMxI9DJ94="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdWtMxY9FXfc=",
											"_parent": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"model": {
												"$ref": "AAAAAAFrdWtMxI9DJ94="
											},
											"font": "Arial;13;0",
											"left": 624,
											"top": 652,
											"width": 123.5634765625,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"edgePosition": 1,
											"text": "11 : Restituzione Dati"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdWtMxo9GA2k=",
											"_parent": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"model": {
												"$ref": "AAAAAAFrdWtMxI9DJ94="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 685,
											"top": 667,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdWtMxo9H3ys=",
											"_parent": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"model": {
												"$ref": "AAAAAAFrdWtMxI9DJ94="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 686,
											"top": 632,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrdWtMxo9IJec=",
											"_parent": {
												"$ref": "AAAAAAFrdWtMxY9EXiU="
											},
											"model": {
												"$ref": "AAAAAAFrdWtMxI9DJ94="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 648,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"points": "1076:648;296:648",
									"nameLabel": {
										"$ref": "AAAAAAFrdWtMxY9FXfc="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdWtMxo9GA2k="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdWtMxo9H3ys="
									},
									"activation": {
										"$ref": "AAAAAAFrdWtMxo9IJec="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrdYDmV5IxqjE=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdYDmV5IwAo4="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrdYDmV5Iy1vw=",
											"_parent": {
												"$ref": "AAAAAAFrdYDmV5IxqjE="
											},
											"model": {
												"$ref": "AAAAAAFrdYDmV5IwAo4="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdYDmV5Izmto=",
													"_parent": {
														"$ref": "AAAAAAFrdYDmV5Iy1vw="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -176,
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdYDmV5I0RJM=",
													"_parent": {
														"$ref": "AAAAAAFrdYDmV5Iy1vw="
													},
													"font": "Arial;13;1",
													"left": 1485,
													"top": 47,
													"width": 62.736328125,
													"height": 13,
													"text": "Filters"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdYDmV5I10zI=",
													"_parent": {
														"$ref": "AAAAAAFrdYDmV5Iy1vw="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -176,
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrdYDmV5I2IKY=",
													"_parent": {
														"$ref": "AAAAAAFrdYDmV5Iy1vw="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -176,
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 1480,
											"top": 40,
											"width": 72.736328125,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrdYDmV5Izmto="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrdYDmV5I0RJM="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrdYDmV5I10zI="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrdYDmV5I2IKY="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrdYDmV5I3JvA=",
											"_parent": {
												"$ref": "AAAAAAFrdYDmV5IxqjE="
											},
											"model": {
												"$ref": "AAAAAAFrdYDmV5IwAo4="
											},
											"font": "Arial;13;0",
											"left": 1516,
											"top": 80,
											"width": 1,
											"height": 1825
										}
									],
									"font": "Arial;13;0",
									"left": 1480,
									"top": 40,
									"width": 72.736328125,
									"height": 1865,
									"nameCompartment": {
										"$ref": "AAAAAAFrdYDmV5Iy1vw="
									},
									"linePart": {
										"$ref": "AAAAAAFrdYDmV5I3JvA="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrflozRMyk0y8=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrflozRMyjzGM="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflozRMylnxY=",
											"_parent": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"model": {
												"$ref": "AAAAAAFrflozRMyjzGM="
											},
											"font": "Arial;13;0",
											"left": 171,
											"top": 653,
											"width": 102.60986328125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"edgePosition": 1,
											"text": "12 : Richiede Dati"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflozRMym6xA=",
											"_parent": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"model": {
												"$ref": "AAAAAAFrflozRMyjzGM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 638,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflozRMynfa8=",
											"_parent": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"model": {
												"$ref": "AAAAAAFrflozRMyjzGM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 673,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrflozRMyogDY=",
											"_parent": {
												"$ref": "AAAAAAFrflozRMyk0y8="
											},
											"model": {
												"$ref": "AAAAAAFrflozRMyjzGM="
											},
											"font": "Arial;13;0",
											"left": 289,
											"top": 669,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"points": "156:669;289:669",
									"nameLabel": {
										"$ref": "AAAAAAFrflozRMylnxY="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrflozRMym6xA="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrflozRMynfa8="
									},
									"activation": {
										"$ref": "AAAAAAFrflozRMyogDY="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrflqR8My65Yw=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrflqR8My5RXI="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflqR8cy7Yhw=",
											"_parent": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"model": {
												"$ref": "AAAAAAFrflqR8My5RXI="
											},
											"font": "Arial;13;0",
											"left": 640,
											"top": 696,
											"width": 85.2744140625,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"edgePosition": 1,
											"text": "13 : Get Data"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflqR8cy88xE=",
											"_parent": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"model": {
												"$ref": "AAAAAAFrflqR8My5RXI="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 682,
											"top": 681,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflqR8cy9PTw=",
											"_parent": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"model": {
												"$ref": "AAAAAAFrflqR8My5RXI="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 682,
											"top": 716,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrflqR8cy+8NU=",
											"_parent": {
												"$ref": "AAAAAAFrflqR8My65Yw="
											},
											"model": {
												"$ref": "AAAAAAFrflqR8My5RXI="
											},
											"font": "Arial;13;0",
											"left": 1069,
											"top": 712,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:712;1069:712",
									"nameLabel": {
										"$ref": "AAAAAAFrflqR8cy7Yhw="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrflqR8cy88xE="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrflqR8cy9PTw="
									},
									"activation": {
										"$ref": "AAAAAAFrflqR8cy+8NU="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrflrbFczQEhY=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrflrbFczPTkc="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflrbFczRx+M=",
											"_parent": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"model": {
												"$ref": "AAAAAAFrflrbFczPTkc="
											},
											"font": "Arial;13;0",
											"left": 1071,
											"top": 755,
											"width": 89.59716796875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"edgePosition": 1,
											"text": "14 : Costruttore"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflrbFczSiSc=",
											"_parent": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"model": {
												"$ref": "AAAAAAFrflrbFczPTkc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1130,
											"top": 755,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflrbFczT0S8=",
											"_parent": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"model": {
												"$ref": "AAAAAAFrflrbFczPTkc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1096,
											"top": 756,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrflrbFczU/8A=",
											"_parent": {
												"$ref": "AAAAAAFrflrbFczQEhY="
											},
											"model": {
												"$ref": "AAAAAAFrflrbFczPTkc="
											},
											"font": "Arial;13;0",
											"left": 1069,
											"top": 772,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"tail": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"points": "1076:752;1106:752;1106:772;1082:772",
									"nameLabel": {
										"$ref": "AAAAAAFrflrbFczRx+M="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrflrbFczSiSc="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrflrbFczT0S8="
									},
									"activation": {
										"$ref": "AAAAAAFrflrbFczU/8A="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrfhwVxMiSiAk=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfhwVxMiRK84="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrfhwVxciTM34=",
											"_parent": {
												"$ref": "AAAAAAFrfhwVxMiSiAk="
											},
											"model": {
												"$ref": "AAAAAAFrfhwVxMiRK84="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfhwVxciU8Ks=",
													"_parent": {
														"$ref": "AAAAAAFrfhwVxciTM34="
													},
													"visible": false,
													"font": "Arial;13;0",
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfhwVxciV6/o=",
													"_parent": {
														"$ref": "AAAAAAFrfhwVxciTM34="
													},
													"font": "Arial;13;1",
													"left": 525,
													"top": 47,
													"width": 94.5,
													"height": 13,
													"text": "DownAndDec"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfhwVxciWw3U=",
													"_parent": {
														"$ref": "AAAAAAFrfhwVxciTM34="
													},
													"visible": false,
													"font": "Arial;13;0",
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfhwVxciXPEE=",
													"_parent": {
														"$ref": "AAAAAAFrfhwVxciTM34="
													},
													"visible": false,
													"font": "Arial;13;0",
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 520,
											"top": 40,
											"width": 104.5,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrfhwVxciU8Ks="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrfhwVxciV6/o="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrfhwVxciWw3U="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrfhwVxciXPEE="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrfhwVxciYj04=",
											"_parent": {
												"$ref": "AAAAAAFrfhwVxMiSiAk="
											},
											"model": {
												"$ref": "AAAAAAFrfhwVxMiRK84="
											},
											"font": "Arial;13;0",
											"left": 572,
											"top": 80,
											"width": 1,
											"height": 577
										}
									],
									"font": "Arial;13;0",
									"left": 520,
									"top": 40,
									"width": 104.5,
									"height": 617,
									"nameCompartment": {
										"$ref": "AAAAAAFrfhwVxciTM34="
									},
									"linePart": {
										"$ref": "AAAAAAFrfhwVxciYj04="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrfh1W28i2xa0=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfh1W28i1mgQ="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrfh1W3Mi3ax8=",
											"_parent": {
												"$ref": "AAAAAAFrfh1W28i2xa0="
											},
											"model": {
												"$ref": "AAAAAAFrfh1W28i1mgQ="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh1W3Mi4eGg=",
													"_parent": {
														"$ref": "AAAAAAFrfh1W3Mi3ax8="
													},
													"visible": false,
													"font": "Arial;13;0",
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh1W3Mi52bg=",
													"_parent": {
														"$ref": "AAAAAAFrfh1W3Mi3ax8="
													},
													"font": "Arial;13;1",
													"left": 749,
													"top": 47,
													"width": 73.578125,
													"height": 13,
													"text": "StockData"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh1W3Mi6gCM=",
													"_parent": {
														"$ref": "AAAAAAFrfh1W3Mi3ax8="
													},
													"visible": false,
													"font": "Arial;13;0",
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh1W3Mi71lY=",
													"_parent": {
														"$ref": "AAAAAAFrfh1W3Mi3ax8="
													},
													"visible": false,
													"font": "Arial;13;0",
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 744,
											"top": 40,
											"width": 83.578125,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrfh1W3Mi4eGg="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrfh1W3Mi52bg="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrfh1W3Mi6gCM="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrfh1W3Mi71lY="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrfh1W3Mi8GSI=",
											"_parent": {
												"$ref": "AAAAAAFrfh1W28i2xa0="
											},
											"model": {
												"$ref": "AAAAAAFrfh1W28i1mgQ="
											},
											"font": "Arial;13;0",
											"left": 786,
											"top": 80,
											"width": 1,
											"height": 561
										}
									],
									"font": "Arial;13;0",
									"left": 744,
									"top": 40,
									"width": 83.578125,
									"height": 601,
									"nameCompartment": {
										"$ref": "AAAAAAFrfh1W3Mi3ax8="
									},
									"linePart": {
										"$ref": "AAAAAAFrfh1W3Mi8GSI="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrfh3Hj8j+gDg=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfh3Hj8j95MY="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrfh3Hj8j/92o=",
											"_parent": {
												"$ref": "AAAAAAFrfh3Hj8j+gDg="
											},
											"model": {
												"$ref": "AAAAAAFrfh3Hj8j95MY="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh3Hj8kAvso=",
													"_parent": {
														"$ref": "AAAAAAFrfh3Hj8j/92o="
													},
													"visible": false,
													"font": "Arial;13;0",
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh3HkMkBm64=",
													"_parent": {
														"$ref": "AAAAAAFrfh3Hj8j/92o="
													},
													"font": "Arial;13;1",
													"left": 885,
													"top": 47,
													"width": 97.419921875,
													"height": 13,
													"text": "StockRecords"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh3HkMkC4a8=",
													"_parent": {
														"$ref": "AAAAAAFrfh3Hj8j/92o="
													},
													"visible": false,
													"font": "Arial;13;0",
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfh3HkMkDIPE=",
													"_parent": {
														"$ref": "AAAAAAFrfh3Hj8j/92o="
													},
													"visible": false,
													"font": "Arial;13;0",
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 880,
											"top": 40,
											"width": 107.419921875,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrfh3Hj8kAvso="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrfh3HkMkBm64="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrfh3HkMkC4a8="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrfh3HkMkDIPE="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrfh3HkMkEIxI=",
											"_parent": {
												"$ref": "AAAAAAFrfh3Hj8j+gDg="
											},
											"model": {
												"$ref": "AAAAAAFrfh3Hj8j95MY="
											},
											"font": "Arial;13;0",
											"left": 934,
											"top": 80,
											"width": 1,
											"height": 385
										}
									],
									"font": "Arial;13;0",
									"left": 880,
									"top": 40,
									"width": 107.419921875,
									"height": 425,
									"nameCompartment": {
										"$ref": "AAAAAAFrfh3Hj8j/92o="
									},
									"linePart": {
										"$ref": "AAAAAAFrfh3HkMkEIxI="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfltAu80GBAI=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfltAu80FyKM="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfltAu80H8PE=",
											"_parent": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"model": {
												"$ref": "AAAAAAFrfltAu80FyKM="
											},
											"font": "Arial;13;0",
											"left": 629,
											"top": 812,
											"width": 113.4453125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"edgePosition": 1,
											"text": "15 : Restituisce dati"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfltAu80Iz4E=",
											"_parent": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"model": {
												"$ref": "AAAAAAFrfltAu80FyKM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 685,
											"top": 827,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfltAu80JL7I=",
											"_parent": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"model": {
												"$ref": "AAAAAAFrfltAu80FyKM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 686,
											"top": 792,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfltAu80K42o=",
											"_parent": {
												"$ref": "AAAAAAFrfltAu80GBAI="
											},
											"model": {
												"$ref": "AAAAAAFrfltAu80FyKM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 808,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"points": "1076:808;296:808",
									"nameLabel": {
										"$ref": "AAAAAAFrfltAu80H8PE="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfltAu80Iz4E="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfltAu80JL7I="
									},
									"activation": {
										"$ref": "AAAAAAFrfltAu80K42o="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrflvNqc0dC2Q=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrflvNqM0c8ww="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflvNqc0eT/c=",
											"_parent": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"model": {
												"$ref": "AAAAAAFrflvNqM0c8ww="
											},
											"font": "Arial;13;0",
											"left": 179,
											"top": 820,
											"width": 93.234375,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"edgePosition": 1,
											"text": "16 : Output data"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflvNqc0fliY=",
											"_parent": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"model": {
												"$ref": "AAAAAAFrflvNqM0c8ww="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 225,
											"top": 835,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflvNqc0gfJw=",
											"_parent": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"model": {
												"$ref": "AAAAAAFrflvNqM0c8ww="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 226,
											"top": 800,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrflvNqc0h0Ns=",
											"_parent": {
												"$ref": "AAAAAAFrflvNqc0dC2Q="
											},
											"model": {
												"$ref": "AAAAAAFrflvNqM0c8ww="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 156,
											"top": 816,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:816;156:816",
									"nameLabel": {
										"$ref": "AAAAAAFrflvNqc0eT/c="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrflvNqc0fliY="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrflvNqc0gfJw="
									},
									"activation": {
										"$ref": "AAAAAAFrflvNqc0h0Ns="
									}
								},
								{
									"_type": "UMLSeqLifelineView",
									"_id": "AAAAAAFrfjTzS8qbwXA=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfjTzS8qaBUA="
									},
									"subViews": [
										{
											"_type": "UMLNameCompartmentView",
											"_id": "AAAAAAFrfjTzS8qcXmA=",
											"_parent": {
												"$ref": "AAAAAAFrfjTzS8qbwXA="
											},
											"model": {
												"$ref": "AAAAAAFrfjTzS8qaBUA="
											},
											"subViews": [
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfjTzS8qdf18=",
													"_parent": {
														"$ref": "AAAAAAFrfjTzS8qcXmA="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -160,
													"height": 13
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfjTzS8qeiRc=",
													"_parent": {
														"$ref": "AAAAAAFrfjTzS8qcXmA="
													},
													"font": "Arial;13;1",
													"left": 125,
													"top": 47,
													"width": 62.736328125,
													"height": 13,
													"text": "Utente"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfjTzS8qfj38=",
													"_parent": {
														"$ref": "AAAAAAFrfjTzS8qcXmA="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -160,
													"width": 106.20263671875,
													"height": 13,
													"text": "(from Interaction1)"
												},
												{
													"_type": "LabelView",
													"_id": "AAAAAAFrfjTzS8qg+k4=",
													"_parent": {
														"$ref": "AAAAAAFrfjTzS8qcXmA="
													},
													"visible": false,
													"font": "Arial;13;0",
													"left": -160,
													"height": 13,
													"horizontalAlignment": 1
												}
											],
											"font": "Arial;13;0",
											"left": 120,
											"top": 40,
											"width": 72.736328125,
											"height": 40,
											"stereotypeLabel": {
												"$ref": "AAAAAAFrfjTzS8qdf18="
											},
											"nameLabel": {
												"$ref": "AAAAAAFrfjTzS8qeiRc="
											},
											"namespaceLabel": {
												"$ref": "AAAAAAFrfjTzS8qfj38="
											},
											"propertyLabel": {
												"$ref": "AAAAAAFrfjTzS8qg+k4="
											}
										},
										{
											"_type": "UMLLinePartView",
											"_id": "AAAAAAFrfjTzS8qh5UI=",
											"_parent": {
												"$ref": "AAAAAAFrfjTzS8qbwXA="
											},
											"model": {
												"$ref": "AAAAAAFrfjTzS8qaBUA="
											},
											"font": "Arial;13;0",
											"left": 156,
											"top": 80,
											"width": 1,
											"height": 1791
										}
									],
									"font": "Arial;13;0",
									"left": 120,
									"top": 40,
									"width": 72.736328125,
									"height": 1831,
									"nameCompartment": {
										"$ref": "AAAAAAFrfjTzS8qcXmA="
									},
									"linePart": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									}
								},
								{
									"_type": "UMLFrameView",
									"_id": "AAAAAAFrfjo088tMMNw=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfjo09MtNE0k=",
											"_parent": {
												"$ref": "AAAAAAFrfjo088tMMNw="
											},
											"font": "Arial;13;0",
											"left": 798.97900390625,
											"top": 293,
											"width": 115.9052734375,
											"height": 13,
											"text": "SequenceDiagram1"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfjo09MtOs5A=",
											"_parent": {
												"$ref": "AAAAAAFrfjo088tMMNw="
											},
											"font": "Arial;13;1",
											"left": 733,
											"top": 293,
											"width": 60.97900390625,
											"height": 13,
											"text": "interaction"
										}
									],
									"font": "Arial;13;0",
									"left": 728,
									"top": 288,
									"width": 233,
									"height": 177,
									"nameLabel": {
										"$ref": "AAAAAAFrfjo09MtNE0k="
									},
									"frameTypeLabel": {
										"$ref": "AAAAAAFrfjo09MtOs5A="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrflwRj80zcLo=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrflwRj80ywWw="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflwRj8001HQ=",
											"_parent": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"model": {
												"$ref": "AAAAAAFrflwRj80ywWw="
											},
											"font": "Arial;13;0",
											"left": 154,
											"top": 848,
											"width": 136.5888671875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"edgePosition": 1,
											"text": "17 : Se seglie Metadata"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflwRj801y8M=",
											"_parent": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"model": {
												"$ref": "AAAAAAFrflwRj80ywWw="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 833,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflwRkM02XHY=",
											"_parent": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"model": {
												"$ref": "AAAAAAFrflwRj80ywWw="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 868,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrflwRkM03fgs=",
											"_parent": {
												"$ref": "AAAAAAFrflwRj80zcLo="
											},
											"model": {
												"$ref": "AAAAAAFrflwRj80ywWw="
											},
											"font": "Arial;13;0",
											"left": 289,
											"top": 864,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"points": "156:864;289:864",
									"nameLabel": {
										"$ref": "AAAAAAFrflwRj8001HQ="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrflwRj801y8M="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrflwRkM02XHY="
									},
									"activation": {
										"$ref": "AAAAAAFrflwRkM03fgs="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrflyW8c1UA4U=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrflyW8c1TbaM="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflyW8c1V2rY=",
											"_parent": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"model": {
												"$ref": "AAAAAAFrflyW8c1TbaM="
											},
											"font": "Arial;13;0",
											"left": 630,
											"top": 888,
											"width": 104.0634765625,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"edgePosition": 1,
											"text": "18 : Get Metadata"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflyW8c1W5o0=",
											"_parent": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"model": {
												"$ref": "AAAAAAFrflyW8c1TbaM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 682,
											"top": 873,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrflyW8c1XI2k=",
											"_parent": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"model": {
												"$ref": "AAAAAAFrflyW8c1TbaM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 682,
											"top": 908,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrflyW8c1Yb1w=",
											"_parent": {
												"$ref": "AAAAAAFrflyW8c1UA4U="
											},
											"model": {
												"$ref": "AAAAAAFrflyW8c1TbaM="
											},
											"font": "Arial;13;0",
											"left": 1069,
											"top": 904,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:904;1069:904",
									"nameLabel": {
										"$ref": "AAAAAAFrflyW8c1V2rY="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrflyW8c1W5o0="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrflyW8c1XI2k="
									},
									"activation": {
										"$ref": "AAAAAAFrflyW8c1Yb1w="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfnKBqs8BQoQ=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfnKBqs8AKec="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnKBqs8CQn8=",
											"_parent": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"model": {
												"$ref": "AAAAAAFrfnKBqs8AKec="
											},
											"font": "Arial;13;0",
											"left": 1071,
											"top": 947,
											"width": 89.59716796875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"edgePosition": 1,
											"text": "19 : Costruttore"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnKBqs8DQTQ=",
											"_parent": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"model": {
												"$ref": "AAAAAAFrfnKBqs8AKec="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1130,
											"top": 947,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnKBqs8Eosk=",
											"_parent": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"model": {
												"$ref": "AAAAAAFrfnKBqs8AKec="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1096,
											"top": 948,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfnKBqs8FMrI=",
											"_parent": {
												"$ref": "AAAAAAFrfnKBqs8BQoQ="
											},
											"model": {
												"$ref": "AAAAAAFrfnKBqs8AKec="
											},
											"font": "Arial;13;0",
											"left": 1069,
											"top": 964,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"tail": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"points": "1076:944;1106:944;1106:964;1082:964",
									"nameLabel": {
										"$ref": "AAAAAAFrfnKBqs8CQn8="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfnKBqs8DQTQ="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfnKBqs8Eosk="
									},
									"activation": {
										"$ref": "AAAAAAFrfnKBqs8FMrI="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfm9sSs6t3BQ=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfm9sSc6sa3A="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm9sSs6uDzE=",
											"_parent": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"model": {
												"$ref": "AAAAAAFrfm9sSc6sa3A="
											},
											"font": "Arial;13;0",
											"left": 612,
											"top": 1020,
											"width": 146.68798828125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"edgePosition": 1,
											"text": "20 : Restituisce Metadata"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm9sSs6vDzs=",
											"_parent": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"model": {
												"$ref": "AAAAAAFrfm9sSc6sa3A="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 685,
											"top": 1035,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm9sSs6wt9c=",
											"_parent": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"model": {
												"$ref": "AAAAAAFrfm9sSc6sa3A="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 686,
											"top": 1000,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfm9sSs6xlAk=",
											"_parent": {
												"$ref": "AAAAAAFrfm9sSs6t3BQ="
											},
											"model": {
												"$ref": "AAAAAAFrfm9sSc6sa3A="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 1016,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdWFciY4cgHc="
									},
									"points": "1076:1016;296:1016",
									"nameLabel": {
										"$ref": "AAAAAAFrfm9sSs6uDzE="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfm9sSs6vDzs="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfm9sSs6wt9c="
									},
									"activation": {
										"$ref": "AAAAAAFrfm9sSs6xlAk="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfmXDrM1sI1s=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfmXDrM1r+uk="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmXDrM1tNi4=",
											"_parent": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"model": {
												"$ref": "AAAAAAFrfmXDrM1r+uk="
											},
											"font": "Arial;13;0",
											"left": 162,
											"top": 1040,
											"width": 122.13525390625,
											"height": 13,
											"alpha": 1.3597036764990793,
											"distance": 14.317821063276353,
											"hostEdge": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"edgePosition": 1,
											"text": "21 : Output Metadata"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmXDrM1ujXc=",
											"_parent": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"model": {
												"$ref": "AAAAAAFrfmXDrM1r+uk="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 225,
											"top": 1051,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmXDrM1vn78=",
											"_parent": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"model": {
												"$ref": "AAAAAAFrfmXDrM1r+uk="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 226,
											"top": 1016,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfmXDrM1wP6Q=",
											"_parent": {
												"$ref": "AAAAAAFrfmXDrM1sI1s="
											},
											"model": {
												"$ref": "AAAAAAFrfmXDrM1r+uk="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 156,
											"top": 1032,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1032;156:1032",
									"nameLabel": {
										"$ref": "AAAAAAFrfmXDrM1tNi4="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfmXDrM1ujXc="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfmXDrM1vn78="
									},
									"activation": {
										"$ref": "AAAAAAFrfmXDrM1wP6Q="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrdXh1L5A2Rfo=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdXh1L5A1Lng="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdXh1L5A3esE=",
											"_parent": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"model": {
												"$ref": "AAAAAAFrdXh1L5A1Lng="
											},
											"font": "Arial;13;0",
											"left": 118,
											"top": 1136,
											"width": 209.5361328125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"edgePosition": 1,
											"text": "22 : Richiesta stats"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdXh1L5A4eWU=",
											"_parent": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"model": {
												"$ref": "AAAAAAFrdXh1L5A1Lng="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 1121,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdXh1L5A5KT0=",
											"_parent": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"model": {
												"$ref": "AAAAAAFrdXh1L5A1Lng="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 1156,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrdXh1L5A6Vvs=",
											"_parent": {
												"$ref": "AAAAAAFrdXh1L5A2Rfo="
											},
											"model": {
												"$ref": "AAAAAAFrdXh1L5A1Lng="
											},
											"font": "Arial;13;0",
											"left": 289,
											"top": 1152,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"points": "156:1152;289:1152",
									"nameLabel": {
										"$ref": "AAAAAAFrdXh1L5A3esE="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdXh1L5A4eWU="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdXh1L5A5KT0="
									},
									"activation": {
										"$ref": "AAAAAAFrdXh1L5A6Vvs="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfmlzq83IV/M=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfmlzq83HVDo="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmlzq83JvQA=",
											"_parent": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"model": {
												"$ref": "AAAAAAFrfmlzq83HVDo="
											},
											"font": "Arial;13;0",
											"left": 729,
											"top": 1184,
											"width": 85.2744140625,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"edgePosition": 1,
											"text": "23 : Get Stats"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmlzq83Kr1k=",
											"_parent": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"model": {
												"$ref": "AAAAAAFrfmlzq83HVDo="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 771,
											"top": 1169,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmlzq83LQ7A=",
											"_parent": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"model": {
												"$ref": "AAAAAAFrfmlzq83HVDo="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 771,
											"top": 1204,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfmlzq83M7UM=",
											"_parent": {
												"$ref": "AAAAAAFrfmlzq83IV/M="
											},
											"model": {
												"$ref": "AAAAAAFrfmlzq83HVDo="
											},
											"font": "Arial;13;0",
											"left": 1246,
											"top": 1200,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWJK146AC/8="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1200;1246:1200",
									"nameLabel": {
										"$ref": "AAAAAAFrfmlzq83JvQA="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfmlzq83Kr1k="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfmlzq83LQ7A="
									},
									"activation": {
										"$ref": "AAAAAAFrfmlzq83M7UM="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfnnhrc94KKs=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfnnhrc93TL4="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnnhrc95yvo=",
											"_parent": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"model": {
												"$ref": "AAAAAAFrfnnhrc93TL4="
											},
											"font": "Arial;13;0",
											"left": 1296,
											"top": 1259,
											"width": 89.59716796875,
											"height": 13,
											"alpha": 1.5883373837753767,
											"distance": 57.0087712549569,
											"hostEdge": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"edgePosition": 1,
											"text": "24 : Costruttore"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnnhrc96enM=",
											"_parent": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"model": {
												"$ref": "AAAAAAFrfnnhrc93TL4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1307,
											"top": 1259,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnnhrc97H9E=",
											"_parent": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"model": {
												"$ref": "AAAAAAFrfnnhrc93TL4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1273,
											"top": 1260,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfnnhrc98rcM=",
											"_parent": {
												"$ref": "AAAAAAFrfnnhrc94KKs="
											},
											"model": {
												"$ref": "AAAAAAFrfnnhrc93TL4="
											},
											"font": "Arial;13;0",
											"left": 1246,
											"top": 1276,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWJK146AC/8="
									},
									"tail": {
										"$ref": "AAAAAAFrdWJK146AC/8="
									},
									"points": "1253:1256;1283:1256;1283:1276;1259:1276",
									"nameLabel": {
										"$ref": "AAAAAAFrfnnhrc95yvo="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfnnhrc96enM="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfnnhrc97H9E="
									},
									"activation": {
										"$ref": "AAAAAAFrfnnhrc98rcM="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrdX6gb5HHYUE=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdX6gb5HG0Mk="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdX6gb5HI/QM=",
											"_parent": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"model": {
												"$ref": "AAAAAAFrdX6gb5HG0Mk="
											},
											"font": "Arial;13;0",
											"left": 694,
											"top": 1316,
											"width": 158.2470703125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"edgePosition": 1,
											"text": "25 : Ritorna Stas"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdX6gb5HJgyU=",
											"_parent": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"model": {
												"$ref": "AAAAAAFrdX6gb5HG0Mk="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 773,
											"top": 1331,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdX6gb5HKTks=",
											"_parent": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"model": {
												"$ref": "AAAAAAFrdX6gb5HG0Mk="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 774,
											"top": 1296,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrdX6gb5HLzDs=",
											"_parent": {
												"$ref": "AAAAAAFrdX6gb5HHYUE="
											},
											"model": {
												"$ref": "AAAAAAFrdX6gb5HG0Mk="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 1312,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdWJK146AC/8="
									},
									"points": "1253:1312;296:1312",
									"nameLabel": {
										"$ref": "AAAAAAFrdX6gb5HI/QM="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdX6gb5HJgyU="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdX6gb5HKTks="
									},
									"activation": {
										"$ref": "AAAAAAFrdX6gb5HLzDs="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfmr+o84Nboc=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfmr+os4MRHA="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmr+o84O73Q=",
											"_parent": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"model": {
												"$ref": "AAAAAAFrfmr+os4MRHA="
											},
											"font": "Arial;13;0",
											"left": 176,
											"top": 1348,
											"width": 98.2744140625,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"edgePosition": 1,
											"text": "26 : Ourput Stats"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmr+o84P0os=",
											"_parent": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"model": {
												"$ref": "AAAAAAFrfmr+os4MRHA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 225,
											"top": 1363,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmr+o84QQwE=",
											"_parent": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"model": {
												"$ref": "AAAAAAFrfmr+os4MRHA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 226,
											"top": 1328,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfmr+o84ROBg=",
											"_parent": {
												"$ref": "AAAAAAFrfmr+o84Nboc="
											},
											"model": {
												"$ref": "AAAAAAFrfmr+os4MRHA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 156,
											"top": 1344,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1344;156:1344",
									"nameLabel": {
										"$ref": "AAAAAAFrfmr+o84O73Q="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfmr+o84P0os="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfmr+o84QQwE="
									},
									"activation": {
										"$ref": "AAAAAAFrfmr+o84ROBg="
									}
								},
								{
									"_type": "UMLFrameView",
									"_id": "AAAAAAFrfmb5Lc2YLbg=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfmb5Lc2ZlsQ=",
											"_parent": {
												"$ref": "AAAAAAFrfmb5Lc2YLbg="
											},
											"font": "Arial;13;0",
											"left": 182.97900390625,
											"top": 629,
											"width": 115.9052734375,
											"height": 13,
											"text": "SequenceDiagram1"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfmb5Lc2a8vw=",
											"_parent": {
												"$ref": "AAAAAAFrfmb5Lc2YLbg="
											},
											"font": "Arial;13;1",
											"left": 117,
											"top": 629,
											"width": 60.97900390625,
											"height": 13,
											"text": "interaction"
										}
									],
									"font": "Arial;13;0",
									"left": 112,
									"top": 624,
									"width": 1625,
									"height": 441,
									"nameLabel": {
										"$ref": "AAAAAAFrfmb5Lc2ZlsQ="
									},
									"frameTypeLabel": {
										"$ref": "AAAAAAFrfmb5Lc2a8vw="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfmxi7s4l5tA=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfmxi7s4k6eQ="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmxi784m9hg=",
											"_parent": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"model": {
												"$ref": "AAAAAAFrfmxi7s4k6eQ="
											},
											"font": "Arial;13;0",
											"left": 164,
											"top": 1399,
											"width": 119.95166015625,
											"height": 13,
											"alpha": -1.4994881513497438,
											"distance": 14.035668847618199,
											"hostEdge": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"edgePosition": 1,
											"text": "27 : Richiesta words"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmxi784nVkA=",
											"_parent": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"model": {
												"$ref": "AAAAAAFrfmxi7s4k6eQ="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 1361,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmxi784ofww=",
											"_parent": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"model": {
												"$ref": "AAAAAAFrfmxi7s4k6eQ="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 1396,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfmxi784pSdY=",
											"_parent": {
												"$ref": "AAAAAAFrfmxi7s4l5tA="
											},
											"model": {
												"$ref": "AAAAAAFrfmxi7s4k6eQ="
											},
											"font": "Arial;13;0",
											"left": 289,
											"top": 1392,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"points": "156:1392;289:1392",
									"nameLabel": {
										"$ref": "AAAAAAFrfmxi784m9hg="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfmxi784nVkA="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfmxi784ofww="
									},
									"activation": {
										"$ref": "AAAAAAFrfmxi784pSdY="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfmyuus47jVU=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfmyuus4653M="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmyuus48wS8=",
											"_parent": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"model": {
												"$ref": "AAAAAAFrfmyuus4653M="
											},
											"font": "Arial;13;0",
											"left": 790,
											"top": 1424,
											"width": 87.18505859375,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"edgePosition": 1,
											"text": "28 : Get Words"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmyuus49zcY=",
											"_parent": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"model": {
												"$ref": "AAAAAAFrfmyuus4653M="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 833,
											"top": 1409,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfmyuus4+ero=",
											"_parent": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"model": {
												"$ref": "AAAAAAFrfmyuus4653M="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 833,
											"top": 1444,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfmyuus4/5JQ=",
											"_parent": {
												"$ref": "AAAAAAFrfmyuus47jVU="
											},
											"model": {
												"$ref": "AAAAAAFrfmyuus4653M="
											},
											"font": "Arial;13;0",
											"left": 1370,
											"top": 1440,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWGlKI5dK4M="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1440;1370:1440",
									"nameLabel": {
										"$ref": "AAAAAAFrfmyuus48wS8="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfmyuus49zcY="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfmyuus4+ero="
									},
									"activation": {
										"$ref": "AAAAAAFrfmyuus4/5JQ="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfnrfFM+aWDU=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfnrfFM+ZLCc="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnrfFM+biWk=",
											"_parent": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"model": {
												"$ref": "AAAAAAFrfnrfFM+ZLCc="
											},
											"font": "Arial;13;0",
											"left": 1416,
											"top": 1499,
											"width": 89.59716796875,
											"height": 13,
											"alpha": 1.5896610092578491,
											"distance": 53.009433122794285,
											"hostEdge": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"edgePosition": 1,
											"text": "29 : Costruttore"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnrfFM+cE1E=",
											"_parent": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"model": {
												"$ref": "AAAAAAFrfnrfFM+ZLCc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1431,
											"top": 1499,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnrfFM+d8eM=",
											"_parent": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"model": {
												"$ref": "AAAAAAFrfnrfFM+ZLCc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1397,
											"top": 1500,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfnrfFM+evfo=",
											"_parent": {
												"$ref": "AAAAAAFrfnrfFM+aWDU="
											},
											"model": {
												"$ref": "AAAAAAFrfnrfFM+ZLCc="
											},
											"font": "Arial;13;0",
											"left": 1370,
											"top": 1516,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdWGlKI5dK4M="
									},
									"tail": {
										"$ref": "AAAAAAFrdWGlKI5dK4M="
									},
									"points": "1377:1496;1407:1496;1407:1516;1383:1516",
									"nameLabel": {
										"$ref": "AAAAAAFrfnrfFM+biWk="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfnrfFM+cE1E="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfnrfFM+d8eM="
									},
									"activation": {
										"$ref": "AAAAAAFrfnrfFM+evfo="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfm3FfM529aw=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfm3FfM51SGc="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm3FfM53AgE=",
											"_parent": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"model": {
												"$ref": "AAAAAAFrfm3FfM51SGc="
											},
											"font": "Arial;13;0",
											"left": 174,
											"top": 1576,
											"width": 102.60986328125,
											"height": 13,
											"alpha": 1.5253735009815763,
											"distance": 22.02271554554524,
											"hostEdge": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"edgePosition": 1,
											"text": "30 : Output words"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm3FfM54zw4=",
											"_parent": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"model": {
												"$ref": "AAAAAAFrfm3FfM51SGc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 225,
											"top": 1579,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm3FfM55W5Q=",
											"_parent": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"model": {
												"$ref": "AAAAAAFrfm3FfM51SGc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 226,
											"top": 1544,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfm3FfM56w3c=",
											"_parent": {
												"$ref": "AAAAAAFrfm3FfM529aw="
											},
											"model": {
												"$ref": "AAAAAAFrfm3FfM51SGc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 156,
											"top": 1560,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1560;156:1560",
									"nameLabel": {
										"$ref": "AAAAAAFrfm3FfM53AgE="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfm3FfM54zw4="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfm3FfM55W5Q="
									},
									"activation": {
										"$ref": "AAAAAAFrfm3FfM56w3c="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfm0/YM5dtgw=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfm0/YM5c9Lc="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm0/YM5e1Uc=",
											"_parent": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"model": {
												"$ref": "AAAAAAFrfm0/YM5c9Lc="
											},
											"font": "Arial;13;0",
											"left": 781,
											"top": 1588,
											"width": 108.392578125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"edgePosition": 1,
											"text": "31 : Ritorna words"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm0/YM5fVP4=",
											"_parent": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"model": {
												"$ref": "AAAAAAFrfm0/YM5c9Lc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 835,
											"top": 1603,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfm0/YM5gHOY=",
											"_parent": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"model": {
												"$ref": "AAAAAAFrfm0/YM5c9Lc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 836,
											"top": 1568,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfm0/YM5hUmY=",
											"_parent": {
												"$ref": "AAAAAAFrfm0/YM5dtgw="
											},
											"model": {
												"$ref": "AAAAAAFrfm0/YM5c9Lc="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 1584,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdWGlKI5dK4M="
									},
									"points": "1377:1584;296:1584",
									"nameLabel": {
										"$ref": "AAAAAAFrfm0/YM5e1Uc="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfm0/YM5fVP4="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfm0/YM5gHOY="
									},
									"activation": {
										"$ref": "AAAAAAFrfm0/YM5hUmY="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfnCLkM7JxFk=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfnCLkM7ItP4="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnCLkM7KFOk=",
											"_parent": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"model": {
												"$ref": "AAAAAAFrfnCLkM7ItP4="
											},
											"font": "Arial;13;0",
											"left": 169,
											"top": 1640,
											"width": 106.9326171875,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"edgePosition": 1,
											"text": "32 : Richiesta filtro"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnCLkM7LLsI=",
											"_parent": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"model": {
												"$ref": "AAAAAAFrfnCLkM7ItP4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 1625,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnCLkM7MHys=",
											"_parent": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"model": {
												"$ref": "AAAAAAFrfnCLkM7ItP4="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 222,
											"top": 1660,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfnCLkM7NAtU=",
											"_parent": {
												"$ref": "AAAAAAFrfnCLkM7JxFk="
											},
											"model": {
												"$ref": "AAAAAAFrfnCLkM7ItP4="
											},
											"font": "Arial;13;0",
											"left": 289,
											"top": 1656,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"points": "156:1656;289:1656",
									"nameLabel": {
										"$ref": "AAAAAAFrfnCLkM7KFOk="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfnCLkM7LLsI="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfnCLkM7MHys="
									},
									"activation": {
										"$ref": "AAAAAAFrfnCLkM7NAtU="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrdYGwxpJWbMg=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdYGwxpJV4XA="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdYGwxpJXaUg=",
											"_parent": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"model": {
												"$ref": "AAAAAAFrdYGwxpJV4XA="
											},
											"font": "Arial;13;0",
											"left": 839,
											"top": 1679,
											"width": 102.5908203125,
											"height": 13,
											"alpha": -4.124386761452605,
											"distance": 21.633307652783937,
											"hostEdge": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"edgePosition": 1,
											"text": "33 : Filter"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdYGwx5JYfUg=",
											"_parent": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"model": {
												"$ref": "AAAAAAFrdYGwxpJV4XA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 902,
											"top": 1673,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdYGwx5JZNDw=",
											"_parent": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"model": {
												"$ref": "AAAAAAFrdYGwxpJV4XA="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 902,
											"top": 1708,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrdYGwx5JaABc=",
											"_parent": {
												"$ref": "AAAAAAFrdYGwxpJWbMg="
											},
											"model": {
												"$ref": "AAAAAAFrdYGwxpJV4XA="
											},
											"font": "Arial;13;0",
											"left": 1509,
											"top": 1704,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdYDmV5I3JvA="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1704;1509:1704",
									"nameLabel": {
										"$ref": "AAAAAAFrdYGwxpJXaUg="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdYGwx5JYfUg="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdYGwx5JZNDw="
									},
									"activation": {
										"$ref": "AAAAAAFrdYGwx5JaABc="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfntBDs+1M5Q=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfntBDs+0LSw="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfntBD8+2AeU=",
											"_parent": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"model": {
												"$ref": "AAAAAAFrfntBDs+0LSw="
											},
											"font": "Arial;13;0",
											"left": 1552,
											"top": 1747,
											"width": 89.59716796875,
											"height": 13,
											"alpha": 1.5907926567696473,
											"distance": 50.00999900019995,
											"hostEdge": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"edgePosition": 1,
											"text": "34 : Costruttore"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfntBD8+3Mms=",
											"_parent": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"model": {
												"$ref": "AAAAAAFrfntBDs+0LSw="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1570,
											"top": 1747,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfntBD8+4JnU=",
											"_parent": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"model": {
												"$ref": "AAAAAAFrfntBDs+0LSw="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 1536,
											"top": 1748,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfntBD8+5unk=",
											"_parent": {
												"$ref": "AAAAAAFrfntBDs+1M5Q="
											},
											"model": {
												"$ref": "AAAAAAFrfntBDs+0LSw="
											},
											"font": "Arial;13;0",
											"left": 1509,
											"top": 1764,
											"width": 14,
											"height": 29
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdYDmV5I3JvA="
									},
									"tail": {
										"$ref": "AAAAAAFrdYDmV5I3JvA="
									},
									"points": "1516:1744;1546:1744;1546:1764;1522:1764",
									"nameLabel": {
										"$ref": "AAAAAAFrfntBD8+2AeU="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfntBD8+3Mms="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfntBD8+4JnU="
									},
									"activation": {
										"$ref": "AAAAAAFrfntBD8+5unk="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrdYJwu5JvmGU=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrdYJwu5Ju0Y0="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdYJwu5Jwewc=",
											"_parent": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"model": {
												"$ref": "AAAAAAFrdYJwu5Ju0Y0="
											},
											"font": "Arial;13;0",
											"left": 842,
											"top": 1820,
											"width": 127.8798828125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"edgePosition": 1,
											"text": "35 : Restituzioni Fiilter"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdYJwu5JxOPg=",
											"_parent": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"model": {
												"$ref": "AAAAAAFrdYJwu5Ju0Y0="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 905,
											"top": 1835,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrdYJwu5JyXkg=",
											"_parent": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"model": {
												"$ref": "AAAAAAFrdYJwu5Ju0Y0="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 906,
											"top": 1800,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrdYJwu5JzIs0=",
											"_parent": {
												"$ref": "AAAAAAFrdYJwu5JvmGU="
											},
											"model": {
												"$ref": "AAAAAAFrdYJwu5Ju0Y0="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 296,
											"top": 1816,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"tail": {
										"$ref": "AAAAAAFrdYDmV5I3JvA="
									},
									"points": "1516:1816;296:1816",
									"nameLabel": {
										"$ref": "AAAAAAFrdYJwu5Jwewc="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrdYJwu5JxOPg="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrdYJwu5JyXkg="
									},
									"activation": {
										"$ref": "AAAAAAFrdYJwu5JzIs0="
									}
								},
								{
									"_type": "UMLSeqMessageView",
									"_id": "AAAAAAFrfnFtws7iX+s=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrfnFtwc7hBWM="
									},
									"subViews": [
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnFtws7jpHk=",
											"_parent": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"model": {
												"$ref": "AAAAAAFrfnFtwc7hBWM="
											},
											"font": "Arial;13;0",
											"left": 177,
											"top": 1844,
											"width": 96.82080078125,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"edgePosition": 1,
											"text": "36 : Output Filter"
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnFtws7k+b8=",
											"_parent": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"model": {
												"$ref": "AAAAAAFrfnFtwc7hBWM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 225,
											"top": 1859,
											"height": 13,
											"alpha": 1.5707963267948966,
											"distance": 25,
											"hostEdge": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"edgePosition": 1
										},
										{
											"_type": "EdgeLabelView",
											"_id": "AAAAAAFrfnFtws7lntc=",
											"_parent": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"model": {
												"$ref": "AAAAAAFrfnFtwc7hBWM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 226,
											"top": 1824,
											"height": 13,
											"alpha": -1.5707963267948966,
											"distance": 10,
											"hostEdge": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"edgePosition": 1
										},
										{
											"_type": "UMLActivationView",
											"_id": "AAAAAAFrfnFtws7m6Zc=",
											"_parent": {
												"$ref": "AAAAAAFrfnFtws7iX+s="
											},
											"model": {
												"$ref": "AAAAAAFrfnFtwc7hBWM="
											},
											"visible": false,
											"font": "Arial;13;0",
											"left": 156,
											"top": 1840,
											"width": 14,
											"height": 25
										}
									],
									"font": "Arial;13;0",
									"head": {
										"$ref": "AAAAAAFrfjTzS8qh5UI="
									},
									"tail": {
										"$ref": "AAAAAAFrdVkckYwYqEg="
									},
									"points": "296:1840;156:1840",
									"nameLabel": {
										"$ref": "AAAAAAFrfnFtws7jpHk="
									},
									"stereotypeLabel": {
										"$ref": "AAAAAAFrfnFtws7k+b8="
									},
									"propertyLabel": {
										"$ref": "AAAAAAFrfnFtws7lntc="
									},
									"activation": {
										"$ref": "AAAAAAFrfnFtws7m6Zc="
									}
								},
								{
									"_type": "UMLFrameView",
									"_id": "AAAAAAFrfnvLAs/SHwQ=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfnvLAs/TdzI=",
											"_parent": {
												"$ref": "AAAAAAFrfnvLAs/SHwQ="
											},
											"font": "Arial;13;0",
											"left": 182.97900390625,
											"top": 1069,
											"width": 115.9052734375,
											"height": 13,
											"text": "SequenceDiagram1"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfnvLAs/Uwlw=",
											"_parent": {
												"$ref": "AAAAAAFrfnvLAs/SHwQ="
											},
											"font": "Arial;13;1",
											"left": 117,
											"top": 1069,
											"width": 60.97900390625,
											"height": 13,
											"text": "interaction"
										}
									],
									"font": "Arial;13;0",
									"left": 112,
									"top": 1064,
									"width": 1625,
									"height": 305,
									"nameLabel": {
										"$ref": "AAAAAAFrfnvLAs/TdzI="
									},
									"frameTypeLabel": {
										"$ref": "AAAAAAFrfnvLAs/Uwlw="
									}
								},
								{
									"_type": "UMLFrameView",
									"_id": "AAAAAAFrfnvWD8/gzDA=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfnvWD8/hT44=",
											"_parent": {
												"$ref": "AAAAAAFrfnvWD8/gzDA="
											},
											"font": "Arial;13;0",
											"left": 182.97900390625,
											"top": 1069,
											"width": 115.9052734375,
											"height": 13,
											"text": "SequenceDiagram1"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfnvWD8/ivfI=",
											"_parent": {
												"$ref": "AAAAAAFrfnvWD8/gzDA="
											},
											"font": "Arial;13;1",
											"left": 117,
											"top": 1069,
											"width": 60.97900390625,
											"height": 13,
											"text": "interaction"
										}
									],
									"font": "Arial;13;0",
									"left": 112,
									"top": 1064,
									"width": 1625,
									"height": 545,
									"nameLabel": {
										"$ref": "AAAAAAFrfnvWD8/hT44="
									},
									"frameTypeLabel": {
										"$ref": "AAAAAAFrfnvWD8/ivfI="
									}
								},
								{
									"_type": "UMLFrameView",
									"_id": "AAAAAAFrfnyiSM/wSqM=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfnyiSM/xHPI=",
											"_parent": {
												"$ref": "AAAAAAFrfnyiSM/wSqM="
											},
											"font": "Arial;13;0",
											"left": 182.97900390625,
											"top": 629,
											"width": 115.9052734375,
											"height": 13,
											"text": "SequenceDiagram1"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfnyiSM/yjX8=",
											"_parent": {
												"$ref": "AAAAAAFrfnyiSM/wSqM="
											},
											"font": "Arial;13;1",
											"left": 117,
											"top": 629,
											"width": 60.97900390625,
											"height": 13,
											"text": "interaction"
										}
									],
									"font": "Arial;13;0",
									"left": 112,
									"top": 624,
									"width": 1625,
									"height": 217,
									"nameLabel": {
										"$ref": "AAAAAAFrfnyiSM/xHPI="
									},
									"frameTypeLabel": {
										"$ref": "AAAAAAFrfnyiSM/yjX8="
									}
								},
								{
									"_type": "UMLFrameView",
									"_id": "AAAAAAFrfn40t9AGafA=",
									"_parent": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"model": {
										"$ref": "AAAAAAFrRtmS6Gd72g4="
									},
									"subViews": [
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfn40t9AH5ns=",
											"_parent": {
												"$ref": "AAAAAAFrfn40t9AGafA="
											},
											"font": "Arial;13;0",
											"left": 182.97900390625,
											"top": 1613,
											"width": 115.9052734375,
											"height": 13,
											"text": "SequenceDiagram1"
										},
										{
											"_type": "LabelView",
											"_id": "AAAAAAFrfn40t9AIXiY=",
											"_parent": {
												"$ref": "AAAAAAFrfn40t9AGafA="
											},
											"font": "Arial;13;1",
											"left": 117,
											"top": 1613,
											"width": 60.97900390625,
											"height": 13,
											"text": "interaction"
										}
									],
									"font": "Arial;13;0",
									"left": 112,
									"top": 1608,
									"width": 1625,
									"height": 273,
									"nameLabel": {
										"$ref": "AAAAAAFrfn40t9AH5ns="
									},
									"frameTypeLabel": {
										"$ref": "AAAAAAFrfn40t9AIXiY="
									}
								}
							]
						}
					],
					"messages": [
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfjIET8loeTg=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Download del file",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfhwVxMiRK84="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfjPp5cnqhhw=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Esegue Download",
							"source": {
								"$ref": "AAAAAAFrfhwVxMiRK84="
							},
							"target": {
								"$ref": "AAAAAAFrfhwVxMiRK84="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfjSX38qDOfM=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Filename",
							"source": {
								"$ref": "AAAAAAFrfhwVxMiRK84="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfjVjksq6iTc=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "LoadData-----------Filename",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfh1W28i1mgQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrdV85242Zfsg=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Scelta",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfjiHs8rw9JQ=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Passa Info",
							"source": {
								"$ref": "AAAAAAFrfh1W28i1mgQ="
							},
							"target": {
								"$ref": "AAAAAAFrfh3Hj8j95MY="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfjnAiMsxdXc=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restituisce un uno all volta",
							"source": {
								"$ref": "AAAAAAFrfh3Hj8j95MY="
							},
							"target": {
								"$ref": "AAAAAAFrfh1W28i1mgQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfkxl2suq7eI=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restituisce valori",
							"source": {
								"$ref": "AAAAAAFrfh1W28i1mgQ="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfk0V9svXglA=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Chiede numero di record collection",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfh1W28i1mgQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfk2fPsvtwg4=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restistuisce numero di record",
							"source": {
								"$ref": "AAAAAAFrfh1W28i1mgQ="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrdWtMxI9DJ94=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restituzione Dati",
							"source": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrflozRMyjzGM=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Richiede Dati",
							"source": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrflqR8My5RXI=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Get Data",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrflrbFczPTkc=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Costruttore",
							"source": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							},
							"target": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfltAu80FyKM=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restituisce dati",
							"source": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrflvNqM0c8ww=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Output data",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrflwRj80ywWw=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Se seglie Metadata",
							"source": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrflyW8c1TbaM=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Get Metadata",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfnKBqs8AKec=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Costruttore",
							"source": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							},
							"target": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfm9sSc6sa3A=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restituisce Metadata",
							"source": {
								"$ref": "AAAAAAFrdWFciI4V47w="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfmXDrM1r+uk=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Output Metadata",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrdXh1L5A1Lng=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Richiesta stats",
							"source": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfmlzq83HVDo=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Get Stats",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrdWJK1Y55CLk="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfnnhrc93TL4=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Costruttore",
							"source": {
								"$ref": "AAAAAAFrdWJK1Y55CLk="
							},
							"target": {
								"$ref": "AAAAAAFrdWJK1Y55CLk="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrdX6gb5HG0Mk=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Ritorna Stas",
							"source": {
								"$ref": "AAAAAAFrdWJK1Y55CLk="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfmr+os4MRHA=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Ourput Stats",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfmxi7s4k6eQ=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Richiesta words",
							"source": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfmyuus4653M=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Get Words",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrdWGlJ45W3cs="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfnrfFM+ZLCc=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Costruttore",
							"source": {
								"$ref": "AAAAAAFrdWGlJ45W3cs="
							},
							"target": {
								"$ref": "AAAAAAFrdWGlJ45W3cs="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfm3FfM51SGc=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Output words",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfm0/YM5c9Lc=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Ritorna words",
							"source": {
								"$ref": "AAAAAAFrdWGlJ45W3cs="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfnCLkM7ItP4=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Richiesta filtro",
							"source": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrdYGwxpJV4XA=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Filter",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrdYDmV5IwAo4="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfntBDs+0LSw=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Costruttore",
							"source": {
								"$ref": "AAAAAAFrdYDmV5IwAo4="
							},
							"target": {
								"$ref": "AAAAAAFrdYDmV5IwAo4="
							}
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrdYJwu5Ju0Y0=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Restituzioni Fiilter",
							"source": {
								"$ref": "AAAAAAFrdYDmV5IwAo4="
							},
							"target": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"messageSort": "reply"
						},
						{
							"_type": "UMLMessage",
							"_id": "AAAAAAFrfnFtwc7hBWM=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Output Filter",
							"source": {
								"$ref": "AAAAAAFrdVkcj4wRUIQ="
							},
							"target": {
								"$ref": "AAAAAAFrfjTzS8qaBUA="
							},
							"messageSort": "reply"
						}
					],
					"participants": [
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrdVkcj4wRUIQ=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "ProgettoApplication",
							"represent": {
								"$ref": "AAAAAAFrdVkcj4wQjyY="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrdWFciI4V47w=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "GetData",
							"represent": {
								"$ref": "AAAAAAFrdWFch44UwFQ="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrdWGlJ45W3cs=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "GetWords",
							"represent": {
								"$ref": "AAAAAAFrdWGlJo5V60Q="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrdWJK1Y55CLk=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "GetStats",
							"represent": {
								"$ref": "AAAAAAFrdWJK1I54BNI="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrdYDmV5IwAo4=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Filters",
							"represent": {
								"$ref": "AAAAAAFrdYDmV5IvptI="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrfhwVxMiRK84=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "DownAndDec",
							"represent": {
								"$ref": "AAAAAAFrfhwVxMiQFGc="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrfh1W28i1mgQ=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "StockData",
							"represent": {
								"$ref": "AAAAAAFrfh1W28i0QOs="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrfh3Hj8j95MY=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "StockRecords",
							"represent": {
								"$ref": "AAAAAAFrfh3Hj8j8PRQ="
							},
							"isMultiInstance": false
						},
						{
							"_type": "UMLLifeline",
							"_id": "AAAAAAFrfjTzS8qaBUA=",
							"_parent": {
								"$ref": "AAAAAAFrRtmS6Gd613g="
							},
							"name": "Utente",
							"represent": {
								"$ref": "AAAAAAFrfjTzS8qZs4s="
							},
							"isMultiInstance": false
						}
					]
				}
			],
			"attributes": [
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdVdZRovwq5o=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role1",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdVkcj4wQjyY=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role2",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdVkfx4xEsnQ=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role3",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdVsqXYz2aO0=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role4",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdWFch44UwFQ=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role5",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdWGlJo5V60Q=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role6",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdWJK1I54BNI=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role7",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrdYDmV5IvptI=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role8",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrfhwVxMiQFGc=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role9",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrfh1W28i0QOs=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role10",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrfh3Hj8j8PRQ=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role11",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrfh45kskeZZA=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role12",
					"type": ""
				},
				{
					"_type": "UMLAttribute",
					"_id": "AAAAAAFrfjTzS8qZs4s=",
					"_parent": {
						"$ref": "AAAAAAFrRtmS52d50ho="
					},
					"name": "Role13",
					"type": ""
				}
			]
		},
		{
			"_type": "UMLModel",
			"_id": "AAAAAAFrfld6scxmHyE=",
			"_parent": {
				"$ref": "AAAAAAFF+h6SjaM2Hec="
			},
			"name": "Model3"
		}
	],
	"tags": [
		{
			"_type": "Tag",
			"_id": "AAAAAAFrfldrGsxjphE=",
			"_parent": {
				"$ref": "AAAAAAFF+h6SjaM2Hec="
			},
			"name": "Tag1",
			"kind": "string"
		}
	]
}
