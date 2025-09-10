package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dex {
    public final deu a;
    public boolean c;
    public Bundle d;
    public boolean e;
    private final uif h;
    public final coe g = new coe();
    public final Map b = new LinkedHashMap();
    public boolean f = true;

    public dex(deu deuVar, uif uifVar) {
        this.a = deuVar;
        this.h = uifVar;
    }

    public final void a() {
        deu deuVar = this.a;
        if (deuVar.getLifecycle().a != cwb.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.a();
        deuVar.getLifecycle().a(new nd(this, 3));
        this.c = true;
    }
}
