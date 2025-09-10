package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cym extends Handler {
    final /* synthetic */ cyo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cym(cyo cyoVar, Looper looper) {
        super(looper);
        this.a = cyoVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        ebn[] ebnVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        cyo cyoVar = this.a;
        while (true) {
            synchronized (cyoVar.b) {
                ArrayList arrayList = cyoVar.d;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                ebnVarArr = new ebn[size];
                arrayList.toArray(ebnVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                ebn ebnVar = ebnVarArr[i];
                ArrayList arrayList2 = (ArrayList) ebnVar.b;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cyn cynVar = (cyn) arrayList2.get(i2);
                    if (!cynVar.d) {
                        cynVar.b.onReceive(cyoVar.a, (Intent) ebnVar.a);
                    }
                }
            }
        }
    }
}
