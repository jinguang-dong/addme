package androidx.compose.material3.internal;

import defpackage.axb;
import defpackage.bad;
import defpackage.bij;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChildSemanticsNodeElement extends bwa {
    private final uiq a;

    public ChildSemanticsNodeElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new axb(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        axb axbVar = (axb) bijVar;
        axbVar.a = this.a;
        bad.D(axbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChildSemanticsNodeElement) && this.a == ((ChildSemanticsNodeElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
