package androidx.compose.ui.semantics;

import defpackage.a;
import defpackage.bij;
import defpackage.bwa;
import defpackage.cbe;
import defpackage.cbn;
import defpackage.cbo;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends bwa implements cbo {
    private final boolean a;
    private final uiq b;

    public AppendedSemanticsElement(boolean z, uiq uiqVar) {
        this.a = z;
        this.b = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new cbe(this.a, false, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        cbe cbeVar = (cbe) bijVar;
        cbeVar.a = this.a;
        cbeVar.b = this.b;
    }

    @Override // defpackage.cbo
    public final cbn d() {
        cbn cbnVar = new cbn();
        cbnVar.a = this.a;
        this.b.a(cbnVar);
        return cbnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    public final int hashCode() {
        return (a.o(this.a) * 31) + this.b.hashCode();
    }
}
