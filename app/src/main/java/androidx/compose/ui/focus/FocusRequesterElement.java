package androidx.compose.ui.focus;

import defpackage.a;
import defpackage.bij;
import defpackage.bjw;
import defpackage.bjz;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FocusRequesterElement extends bwa {
    private final bjw a;

    public FocusRequesterElement(bjw bjwVar) {
        this.a = bjwVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bjz(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        bjz bjzVar = (bjz) bijVar;
        bjzVar.a.d.m(bjzVar);
        bjzVar.a = this.a;
        bjzVar.a.d.n(bjzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && a.ao(this.a, ((FocusRequesterElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
