package androidx.compose.foundation;

import defpackage.a;
import defpackage.afl;
import defpackage.bij;
import defpackage.bwa;
import defpackage.ocq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HoverableElement extends bwa {
    private final ocq a;

    public HoverableElement(ocq ocqVar) {
        this.a = ocqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new afl(this.a);
    }

    @Override // defpackage.bwa
    public final /* synthetic */ void b(bij bijVar) {
        afl aflVar = (afl) bijVar;
        ocq ocqVar = aflVar.a;
        ocq ocqVar2 = this.a;
        if (a.ao(ocqVar, ocqVar2)) {
            return;
        }
        aflVar.d();
        aflVar.a = ocqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && a.ao(((HoverableElement) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
