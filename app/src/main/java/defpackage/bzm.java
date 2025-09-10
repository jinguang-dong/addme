package defpackage;

import android.view.Choreographer;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzm extends ujq implements uiq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzm(byt bytVar, Choreographer.FrameCallback frameCallback, int i) {
        super(1);
        this.c = i;
        this.b = bytVar;
        this.a = frameCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uol] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, uqx] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.Choreographer$FrameCallback, java.lang.Object] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            View view = (View) obj;
            return Boolean.valueOf(bad.p((View) this.a, view, view.getNextFocusForwardId()) == this.b);
        }
        if (i == 1) {
            ((Choreographer) ((byt) this.b).a).removeFrameCallback(this.a);
            return ufg.a;
        }
        if (i != 2) {
            cpo cpoVar = (cpo) obj;
            cpoVar.getClass();
            this.a.s(null);
            this.b.j(cpoVar);
            return ufg.a;
        }
        Throwable th = (Throwable) obj;
        if (th instanceof dyl) {
            ((dwi) this.a).e(((dyl) th).a);
        }
        this.b.cancel(false);
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzm(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
