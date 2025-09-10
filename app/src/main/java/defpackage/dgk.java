package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.WindowId;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgk {
    final Object a;
    public final Object b;
    public final Object c;
    final Object d;
    final Object e;
    final Object f;

    public dgk(View view, String str, dgp dgpVar, WindowId windowId, dgy dgyVar, Animator animator) {
        this.a = view;
        this.b = str;
        this.c = dgyVar;
        this.d = windowId;
        this.e = dgpVar;
        this.f = animator;
    }

    public final float a() {
        return ((bbb) this.e).e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final Object b() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final Object c() {
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final void d() {
    }

    public dgk(Object obj, uif uifVar) {
        this.b = uifVar;
        new AtomicReference(null);
        new uxa();
        bap bapVar = bap.c;
        this.a = new azz(obj, bapVar);
        aei aeiVar = new aei(this, 16);
        pmg pmgVar = bbj.a;
        new ayv(aeiVar, null);
        this.c = new ayv(new aei(this, 17), null);
        this.e = new azv(Float.NaN);
        new ayv(new aei(this, 18), bapVar);
        new azv(0.0f);
        this.d = new azz(null, bapVar);
        this.f = new azz(new asx(ufx.a), bapVar);
    }
}
