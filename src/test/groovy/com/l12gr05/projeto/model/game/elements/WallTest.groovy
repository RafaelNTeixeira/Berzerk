package com.l12gr05.projeto.model.game.elements

import com.l12gr05.projeto.model.game.Position
import spock.lang.Specification

class WallTest extends Specification{

    def 'Wall creation' () {
        given:
        Wall wall = new Wall(50, 50)
        Position position = new Position(50, 50)

        when:
        Position position1 = wall.getPosition()

        then:
        position == position1
    }


}
