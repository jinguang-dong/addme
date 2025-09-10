package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opp implements ofc {
    public final opm a;
    private final Status b;

    public opp(Status status, opm opmVar) {
        this.b = status;
        this.a = opmVar;
    }

    @Override // defpackage.ofc
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        opm opmVar = this.a;
        ojl.ay(opmVar);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(opmVar.a == 1));
    }
}
