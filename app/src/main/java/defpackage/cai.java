package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cai implements cwf {
    final /* synthetic */ und a;
    final /* synthetic */ bao b;
    final /* synthetic */ uka c;
    final /* synthetic */ View d;
    final /* synthetic */ byt e;

    public cai(und undVar, byt bytVar, bao baoVar, uka ukaVar, View view) {
        this.a = undVar;
        this.e = bytVar;
        this.b = baoVar;
        this.c = ukaVar;
        this.d = view;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        umk umkVarU = null;
        switch (cwaVar.ordinal()) {
            case 0:
                ukc.C(this.a, null, 4, new cah(this.c, this.b, cwhVar, this, this.d, null), 1);
                return;
            case 1:
                byt bytVar = this.e;
                if (bytVar != null) {
                    Object obj = bytVar.a;
                    synchronized (((azj) obj).a) {
                        if (!((azj) obj).a()) {
                            List list = ((azj) obj).b;
                            ((azj) obj).b = ((azj) obj).c;
                            ((azj) obj).c = list;
                            ((azj) obj).d = true;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ((uhb) list.get(i)).fW(ufg.a);
                            }
                            list.clear();
                        }
                    }
                }
                bao baoVar = this.b;
                synchronized (baoVar.c) {
                    if (baoVar.j) {
                        baoVar.j = false;
                        umkVarU = baoVar.u();
                    }
                }
                if (umkVarU != null) {
                    umkVarU.fW(ufg.a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 6:
                return;
            case 4:
                this.b.w();
                return;
            case 5:
                this.b.v();
                return;
            default:
                throw new uet();
        }
    }
}
