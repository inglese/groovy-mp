package email.englisch

import static groovyx.javafx.GroovyFX.start

class GfxListViewTest {
    static void main(args) {
        start {
            stage title: 'GfxListViewTest', visible: true, {
                scene {
                    stackPane {
                        listView(items: ['Item1', 'Item2', 'Item3'])
                    }
                }
            }
        }
    }
}
