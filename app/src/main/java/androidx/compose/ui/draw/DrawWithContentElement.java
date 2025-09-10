package androidx.compose.ui.draw;

import defpackage.bij;
import defpackage.bjk;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithContentElement extends bwa {
    private final uiq a;

    public DrawWithContentElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bjk(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bjk) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && this.a == ((DrawWithContentElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
