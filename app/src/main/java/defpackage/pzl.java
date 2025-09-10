package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzl implements sxi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pzl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = 9;
        int i2 = 5;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        switch (this.b) {
            case 0:
                break;
            case 1:
                Object obj2 = this.a;
                pzh pzhVar = (pzh) obj2;
                break;
            case 2:
                break;
            case 3:
                Object obj3 = this.a;
                pzr pzrVar = (pzr) obj3;
                break;
            case 4:
                break;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    Object obj4 = this.a;
                    qbu.h("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                    break;
                }
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    Object obj5 = this.a;
                    qbu.h("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                    break;
                }
            case 7:
                ArrayList arrayList = new ArrayList();
                for (qao qaoVar : (List) obj) {
                    Object obj6 = this.a;
                    pzr pzrVar2 = (pzr) obj6;
                    qdp qdpVarE = qdp.e(pzrVar2.o.c(qaoVar.a.c));
                    pzn pznVar = new pzn(obj6, qaoVar, i4);
                    Executor executor = pzrVar2.k;
                    arrayList.add(qdpVarE.g(pznVar, executor).g(new pzn(obj6, qaoVar, i5), executor));
                }
                break;
            case 8:
                pzr pzrVar3 = (pzr) this.a;
                SharedPreferences sharedPreferencesX = qsp.x(pzrVar3.b, "gms_icing_mdd_manager_metadata", pzrVar3.j);
                if (sharedPreferencesX.getBoolean("mdd_migrated_to_offroad", false)) {
                    break;
                } else {
                    int i6 = qbu.a;
                    break;
                }
            case 9:
                Object obj7 = this.a;
                pzr pzrVar4 = (pzr) obj7;
                qag qagVar = pzrVar4.f;
                Context context = qagVar.a;
                SharedPreferences sharedPreferencesX2 = qsp.x(context, "gms_icing_mdd_shared_file_manager_metadata", qagVar.j);
                if (sharedPreferencesX2.contains("migrated_to_new_file_key")) {
                    if (sharedPreferencesX2.getBoolean("migrated_to_new_file_key", false)) {
                        prh.m(context);
                    }
                    sharedPreferencesX2.edit().remove("migrated_to_new_file_key").commit();
                }
                break;
            case 10:
                Object obj8 = this.a;
                pzr pzrVar5 = (pzr) obj8;
                break;
            case 11:
                break;
            case 12:
                pzr pzrVar6 = (pzr) this.a;
                if (pzrVar6.m.D()) {
                    qdp qdpVarE2 = qdp.e(pzrVar6.n.b());
                    pzg pzgVar = new pzg(i3);
                    sxo sxoVar = sxo.a;
                    break;
                } else {
                    break;
                }
            case 13:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj9 = this.a;
                pzr pzrVar7 = (pzr) obj9;
                SharedPreferences sharedPreferencesX3 = qsp.x(pzrVar7.b, "gms_icing_mdd_manager_metadata", pzrVar7.j);
                if (!sharedPreferencesX3.contains("gms_icing_mdd_reset_trigger")) {
                    sharedPreferencesX3.edit().putInt("gms_icing_mdd_reset_trigger", pzrVar7.m.l()).commit();
                }
                int i7 = sharedPreferencesX3.getInt("gms_icing_mdd_reset_trigger", 0);
                int iL = pzrVar7.m.l();
                if (i7 < iL) {
                    sharedPreferencesX3.edit().putInt("gms_icing_mdd_reset_trigger", iL).commit();
                    int i8 = qbu.a;
                    pzrVar7.c.l(1045);
                    qag qagVar2 = pzrVar7.f;
                    break;
                } else {
                    break;
                }
            case 15:
                Object obj10 = this.a;
                pzr pzrVar8 = (pzr) obj10;
                break;
            case 16:
                pzg pzgVar2 = new pzg(8);
                pzs pzsVar = (pzs) this.a;
                break;
            case 17:
                pvr pvrVar = (pvr) obj;
                if (pvrVar == null) {
                    qbu.d("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", this.a);
                    break;
                } else {
                    break;
                }
            case 18:
                List<pvp> list = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                Object obj11 = this.a;
                try {
                    for (pvp pvpVar : list) {
                        arrayList2.add(qsz.n(((qag) obj11).c.e(pvpVar), new pzn(obj11, pvpVar, i3, null), ((qag) obj11).k));
                    }
                } catch (Exception unused) {
                    ((qag) obj11).b.a();
                }
                break;
            case 19:
                if (((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    qbu.d("%s: Unable to modify file subscription for key %s", "SharedFileManager", this.a);
                    break;
                }
            default:
                if (((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    qbu.d("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", this.a);
                    break;
                }
        }
        return ske.M(false);
    }
}
