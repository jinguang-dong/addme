package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.amn;
import defpackage.bij;
import defpackage.bwa;
import defpackage.uiu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WrapContentElement extends bwa {
    private final uiu a;
    private final Object b;

    public WrapContentElement(uiu uiuVar, Object obj) {
        this.a = uiuVar;
        this.b = obj;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new amn(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        amn amnVar = (amn) bijVar;
        amnVar.b = 3;
        amnVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && a.ao(this.b, ((WrapContentElement) obj).b);
    }

    public final int hashCode() {
        a.aQ(3);
        return this.b.hashCode() + 41230;
    }
}
