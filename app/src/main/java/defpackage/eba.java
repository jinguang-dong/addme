package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eba implements eay {
    public final dco a;
    public final dcc b;

    public eba(dco dcoVar) {
        this.a = dcoVar;
        this.b = new eaz(dcoVar);
    }

    @Override // defpackage.eay
    public final List a(String str) {
        dcu dcuVarA = dcu.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        dcuVarA.g(1, str);
        dco dcoVar = this.a;
        dcoVar.k();
        Cursor cursorF = cwy.f(dcoVar, dcuVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            dcuVarA.j();
        }
    }
}
