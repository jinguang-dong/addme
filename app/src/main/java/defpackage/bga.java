package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bga implements bfx, deu {
    public final byz a;
    private final /* synthetic */ bfx b;
    private final det c;
    private final cwc d;

    public bga(bfx bfxVar) {
        this.b = bfxVar;
        byz byzVarK = coe.k(this);
        this.a = byzVarK;
        this.d = new cwc(this);
        this.c = (det) byzVarK.a;
        Object objA = a("androidx.savedstate.SavedStateRegistry");
        byzVarK.X(objA instanceof Bundle ? (Bundle) objA : null);
        f("androidx.savedstate.SavedStateRegistry", new ats(this, 8));
    }

    @Override // defpackage.bfx
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.bfx
    public final Map b() {
        return this.b.b();
    }

    @Override // defpackage.bfx
    public final boolean e(Object obj) {
        return this.b.e(obj);
    }

    @Override // defpackage.bfx
    public final nki f(String str, uif uifVar) {
        return this.b.f(str, uifVar);
    }

    @Override // defpackage.cwh
    public final /* synthetic */ cwc getLifecycle() {
        return this.d;
    }

    @Override // defpackage.deu
    public final det getSavedStateRegistry() {
        return this.c;
    }
}
