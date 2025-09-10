package androidx.compose.foundation.lazy.layout;

import defpackage.a;
import defpackage.aii;
import defpackage.amr;
import defpackage.apb;
import defpackage.bad;
import defpackage.bij;
import defpackage.bwa;
import defpackage.uif;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifier extends bwa {
    private final uif a;
    private final aii b;
    private final boolean d;
    private final boolean e = false;
    private final amr f;

    public LazyLayoutSemanticsModifier(uif uifVar, amr amrVar, aii aiiVar, boolean z) {
        this.a = uifVar;
        this.f = amrVar;
        this.b = aiiVar;
        this.d = z;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new apb(this.a, this.f, this.b, this.d);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        apb apbVar = (apb) bijVar;
        apbVar.a = this.a;
        apbVar.d = this.f;
        aii aiiVar = apbVar.b;
        aii aiiVar2 = this.b;
        if (aiiVar != aiiVar2) {
            apbVar.b = aiiVar2;
            bad.D(apbVar);
        }
        boolean z = this.d;
        if (apbVar.c == z) {
            return;
        }
        apbVar.c = z;
        apbVar.c();
        bad.D(apbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        if (this.a != lazyLayoutSemanticsModifier.a || !a.ao(this.f, lazyLayoutSemanticsModifier.f) || this.b != lazyLayoutSemanticsModifier.b || this.d != lazyLayoutSemanticsModifier.d) {
            return false;
        }
        boolean z = lazyLayoutSemanticsModifier.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + a.o(this.d)) * 31) + a.o(false);
    }
}
