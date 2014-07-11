package org.zeus.listeners;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.util.Log;

public class ProsaListener extends Log implements ISORequestListener {

    @Override
    public boolean process(ISOSource source, ISOMsg isoMsg){

        try {

            isoMsg.dump(System.out, "");

            isoMsg.setMTI("810");
            isoMsg.set   (4, "007000");

            source.send(isoMsg);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
