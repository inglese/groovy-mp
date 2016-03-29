package email.englisch

import static groovyx.javafx.GroovyFX.start

class GroovyMp {
    static void main(args) {
        start {
            stage title: 'Groovy MP', visible: true, {
                scene {
                    stackPane {
                        label(text: 'Groovy MP')
                    }
                }
            }
        }
    }
}