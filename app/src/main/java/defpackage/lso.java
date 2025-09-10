package defpackage;

import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lso implements syf {
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public lso(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        int i = this.d;
        if (i == 0) {
            ((sgt) ((sgt) lsp.a.c().i(th)).M(4393)).E("Ignoring %s for %s", this.a, this.c);
            return;
        }
        if (i == 1) {
            ivw ivwVar = (ivw) this.c;
            ivwVar.e();
            this.b.run();
            ((sgt) ((sgt) ivx.a.c().i(th)).M(2412)).t("Error executing first stage for task %s", ivwVar.d);
            return;
        }
        if (i != 2) {
            Log.e("ClientLoggingBackend", "Error while logging.", th);
            return;
        }
        String str = "Failed to allocate pending " + this.b.toString() + " this may leak";
        Object obj = this.c;
        ((pgn) obj).a.d(str);
        synchronized (obj) {
            ((pgn) obj).e = false;
            ((pgn) obj).f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, syu] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        int i = this.d;
        if (i == 0) {
            this.b.run();
            return;
        }
        if (i == 1) {
            ((ivw) this.c).g.d.execute(new gdq((Object) this, this.a, this.b, 13, (byte[]) null));
            return;
        }
        if (i != 2) {
            if (((Boolean) obj).booleanValue()) {
                ske.W(this.c, rsx.d(new fpc(this, this.a, 15, (short[]) null)), sxo.a);
            }
        } else {
            Object obj2 = this.c;
            Set set = (Set) obj;
            synchronized (obj2) {
                ((pgn) obj2).e = false;
                ((pgn) obj2).c(this.a, set);
            }
        }
    }

    public lso(String str, Runnable runnable, ltd ltdVar, int i) {
        this.d = i;
        this.a = str;
        this.b = runnable;
        this.c = ltdVar;
    }

    public lso(taq taqVar, syu syuVar, tba tbaVar, int i) {
        this.d = i;
        this.c = syuVar;
        this.a = tbaVar;
        this.b = taqVar;
    }
}
