package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes2.dex */
class env extends Handler {
    final LinkedList r;

    public env(Looper looper) {
        super(looper);
        LinkedList linkedList = new LinkedList();
        this.r = linkedList;
        linkedList.offerLast(-1);
    }

    final String c(int i) {
        String str = new String("HIST") + "_ID" + i;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            str = str + '_' + ((Integer) it.next()).toString();
        }
        return str.concat("_HEND");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Integer numValueOf = Integer.valueOf(message.what);
        LinkedList linkedList = this.r;
        linkedList.offerLast(numValueOf);
        while (linkedList.size() > 400) {
            linkedList.pollFirst();
        }
    }
}
