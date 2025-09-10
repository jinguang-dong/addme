package defpackage;

import android.database.Cursor;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecv implements ecs {
    public final dco a;
    public final dcc b;
    public final dcv c;

    public ecv(dco dcoVar) {
        this.a = dcoVar;
        this.b = new ect(dcoVar);
        this.c = new ecu(dcoVar);
    }

    @Override // defpackage.ecs
    public final List a(String str) {
        dcu dcuVarA = dcu.a(zflNUOOzDfM.mWTwdVAno, 1);
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
