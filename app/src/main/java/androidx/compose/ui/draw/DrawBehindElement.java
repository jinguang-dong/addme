package androidx.compose.ui.draw;

import defpackage.bij;
import defpackage.bjh;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DrawBehindElement extends bwa {
    private final uiq a;

    public DrawBehindElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bjh(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bjh) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && this.a == ((DrawBehindElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
