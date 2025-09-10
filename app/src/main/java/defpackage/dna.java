package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dna implements ayy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dna(drq drqVar, Context context, int i) {
        this.c = i;
        this.a = drqVar;
        this.b = context;
    }

    @Override // defpackage.ayy
    public final void a() {
        int i = this.c;
        if (i == 0) {
            ((dnb) this.b).a.h(this.a);
            return;
        }
        if (i == 1) {
            ((aqp) this.b).c.remove(this.a);
        } else {
            if (i == 2) {
                ((tdy) ((kwp) this.b).a).h(this.a);
                return;
            }
            Object obj = this.a;
            drq drqVar = (drq) obj;
            if (drqVar.a) {
                ((Context) this.b).unregisterReceiver((BroadcastReceiver) obj);
                drqVar.a = false;
            }
        }
    }

    public dna(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
