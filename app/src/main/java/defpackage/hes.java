package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hes implements uiq {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ hes(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        ddw ddwVarA;
        int i = this.b;
        hez hezVar = null;
        if (i != 0) {
            if (i == 1) {
                return new blr(this.a);
            }
            if (i == 2) {
                ddo ddoVar = (ddo) obj;
                ddwVarA = ddoVar.a("DELETE FROM shots WHERE start_millis < ?");
                try {
                    ddwVarA.e(1, this.a);
                    ddwVarA.j();
                    return Integer.valueOf(cgh.x(ddoVar));
                } finally {
                }
            }
            ddwVarA = ((ddo) obj).a("SELECT * FROM shot_log WHERE shot_id = ? ORDER BY sequence");
            try {
                ddwVarA.e(1, this.a);
                int iW = cgh.w(ddwVarA, "sequence");
                int iW2 = cgh.w(ddwVarA, "shot_id");
                int iW3 = cgh.w(ddwVarA, "time_millis");
                int iW4 = cgh.w(ddwVarA, "message");
                ArrayList arrayList = new ArrayList();
                while (ddwVarA.j()) {
                    hfd hfdVar = new hfd();
                    hfdVar.a = (int) ddwVarA.b(iW);
                    hfdVar.b = ddwVarA.b(iW2);
                    hfdVar.c = ddwVarA.b(iW3);
                    if (ddwVarA.i(iW4)) {
                        hfdVar.d = null;
                    } else {
                        hfdVar.d = ddwVarA.d(iW4);
                    }
                    arrayList.add(hfdVar);
                }
                return arrayList;
            } finally {
            }
        }
        ddwVarA = ((ddo) obj).a("SELECT * FROM shots WHERE shot_id = ?");
        try {
            ddwVarA.e(1, this.a);
            int iW5 = cgh.w(ddwVarA, "shot_id");
            int iW6 = cgh.w(ddwVarA, "title");
            int iW7 = cgh.w(ddwVarA, "start_millis");
            int iW8 = cgh.w(ddwVarA, "persisted_millis");
            int iW9 = cgh.w(ddwVarA, "canceled_millis");
            int iW10 = cgh.w(ddwVarA, "deleted_millis");
            int iW11 = cgh.w(ddwVarA, zflNUOOzDfM.UGY);
            int iW12 = cgh.w(ddwVarA, "capture_session_type");
            int iW13 = cgh.w(ddwVarA, "capture_session_shot_id");
            int iW14 = cgh.w(ddwVarA, "pid");
            int iW15 = cgh.w(ddwVarA, "stuck");
            int iW16 = cgh.w(ddwVarA, "failed");
            if (ddwVarA.j()) {
                hez hezVar2 = new hez();
                hezVar2.a = ddwVarA.b(iW5);
                if (ddwVarA.i(iW6)) {
                    hezVar2.b = null;
                } else {
                    hezVar2.b = ddwVarA.d(iW6);
                }
                hezVar2.c = ddwVarA.b(iW7);
                hezVar2.d = ddwVarA.b(iW8);
                hezVar2.e = ddwVarA.b(iW9);
                hezVar2.f = ddwVarA.b(iW10);
                hezVar2.g = ddwVarA.b(iW11);
                if (ddwVarA.i(iW12)) {
                    hezVar2.h = null;
                } else {
                    hezVar2.h = ddwVarA.d(iW12);
                }
                if (ddwVarA.i(iW13)) {
                    hezVar2.i = null;
                } else {
                    hezVar2.i = ddwVarA.d(iW13);
                }
                hezVar2.j = ddwVarA.b(iW14);
                hezVar2.k = ((int) ddwVarA.b(iW15)) != 0;
                hezVar2.l = ((int) ddwVarA.b(iW16)) != 0;
                hezVar = hezVar2;
            }
            return hezVar;
        } finally {
        }
    }
}
