package androidx.compose.ui.layout;

import defpackage.bij;
import defpackage.bsb;
import defpackage.bwa;
import defpackage.uiv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutElement extends bwa {
    private final uiv a;

    public LayoutElement(uiv uivVar) {
        this.a = uivVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bsb(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bsb) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && this.a == ((LayoutElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
