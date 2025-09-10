package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.akr;
import defpackage.bie;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BoxChildDataElement extends bwa {
    private final bie a;

    public BoxChildDataElement(bie bieVar) {
        this.a = bieVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new akr(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((akr) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && a.ao(this.a, boxChildDataElement.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }
}
