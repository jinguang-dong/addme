package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cna implements cnh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cna(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cnh
    public final /* synthetic */ void accept(Object obj) {
        if (this.b != 0) {
            qev qevVar = (qev) obj;
            if (qevVar == null) {
                qevVar = new qev(-3, (byte[]) null);
            }
            ((ebn) this.a).x(qevVar);
            return;
        }
        qev qevVar2 = (qev) obj;
        synchronized (cnb.c) {
            aaa aaaVar = cnb.d;
            Object obj2 = this.a;
            ArrayList arrayList = (ArrayList) aaaVar.get(obj2);
            if (arrayList == null) {
                return;
            }
            aaaVar.remove(obj2);
            for (int i = 0; i < arrayList.size(); i++) {
                ((cnh) arrayList.get(i)).accept(qevVar2);
            }
        }
    }
}
