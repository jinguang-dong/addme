package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eqs implements eqv {
    private final String a;
    private final AssetManager b;
    private Object c;

    public eqs(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.eqv
    public final void d() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) {
        try {
            Object objB = b(this.b, this.a);
            this.c = objB;
            equVar.b(objB);
        } catch (IOException e) {
            equVar.e(e);
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }

    @Override // defpackage.eqv
    public final void dE() {
    }
}
