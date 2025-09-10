package androidx.compose.ui.semantics;

import defpackage.bij;
import defpackage.bwa;
import defpackage.cbe;
import defpackage.cbn;
import defpackage.cbo;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClearAndSetSemanticsElement extends bwa implements cbo {
    private final uiq a;

    public ClearAndSetSemanticsElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new cbe(false, true, this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((cbe) bijVar).b = this.a;
    }

    @Override // defpackage.cbo
    public final cbn d() {
        cbn cbnVar = new cbn();
        cbnVar.a = false;
        cbnVar.b = true;
        this.a.a(cbnVar);
        return cbnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.a == ((ClearAndSetSemanticsElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
