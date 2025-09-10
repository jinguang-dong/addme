package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oeq extends Exception {
    private final yd a;

    public oeq(yd ydVar) {
        this.a = ydVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        yd ydVar = this.a;
        boolean z = true;
        for (ofl oflVar : ydVar.keySet()) {
            odj odjVar = (odj) ydVar.get(oflVar);
            ojl.ay(odjVar);
            z &= !odjVar.c();
            arrayList.add(oflVar.a() + ": " + odjVar.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
