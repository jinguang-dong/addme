package defpackage;

import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edt {
    public static final /* synthetic */ int a = 0;

    static {
        dwj.a("DiagnosticsWrkr");
    }

    public static final void a(ebo eboVar, ecs ecsVar, ebh ebhVar, List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ebx ebxVar = (ebx) it.next();
            ebg ebgVarC = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.C(ebhVar, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar));
            Integer numValueOf = ebgVarC != null ? Integer.valueOf(ebgVarC.c) : null;
            String str = ebxVar.b;
            dcu dcuVarA = dcu.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            dcuVarA.g(1, str);
            dco dcoVar = ((ebq) eboVar).a;
            dcoVar.k();
            Cursor cursorF = cwy.f(dcoVar, dcuVarA);
            try {
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(cursorF.getString(0));
                }
                cursorF.close();
                dcuVarA.j();
                ske.ca(arrayList, ",", null, null, null, 62);
                ske.ca(ecsVar.a(str), ",", null, null, null, 62);
                String str2 = ebxVar.c;
                Objects.toString(numValueOf);
                int i = ebxVar.x;
                cpn.v(i);
                if (i == 0) {
                    throw null;
                }
            } catch (Throwable th) {
                cursorF.close();
                dcuVarA.j();
                throw th;
            }
        }
    }
}
