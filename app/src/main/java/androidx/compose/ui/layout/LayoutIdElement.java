package androidx.compose.ui.layout;

import defpackage.a;
import defpackage.bij;
import defpackage.brz;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LayoutIdElement extends bwa {
    private final Object a;

    public LayoutIdElement(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new brz(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((brz) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && a.ao(this.a, ((LayoutIdElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
