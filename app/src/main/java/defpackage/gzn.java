package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzn {
    public static final gzi a;
    public static final gzi b;
    public static final gzi c;
    public static final gzi d;

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.enable_burrata";
        gzhVar.o();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.burrata_script";
        gzhVar2.l();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.burrata_user_flow_type";
        List list = gzm.c;
        ArrayList arrayList = new ArrayList(ske.bq(list, 10));
        ufj ufjVar = new ufj((ufm) list);
        while (ufjVar.hasNext()) {
            arrayList.add(Integer.valueOf(((gzm) ufjVar.next()).ordinal()));
        }
        gzhVar3.e = ujp.aZ(arrayList);
        a = gzhVar3.a();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.burrata_backend_type";
        List list2 = gzl.d;
        ArrayList arrayList2 = new ArrayList(ske.bq(list2, 10));
        ufj ufjVar2 = new ufj((ufm) list2);
        while (ufjVar2.hasNext()) {
            arrayList2.add(Integer.valueOf(((gzl) ufjVar2.next()).ordinal()));
        }
        gzhVar4.e = ujp.aZ(arrayList2);
        b = gzhVar4.a();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.burrata_guidance_frame";
        gzhVar5.m();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.burrata_online_backend_key";
        gzhVar6.l();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = "camera.burrata_scan_duration_ms";
        c = gzhVar7.a();
        gzh gzhVar8 = new gzh();
        gzhVar8.b = "camera.burrata_backend_aratea_endpoint";
        List list3 = gzk.c;
        ArrayList arrayList3 = new ArrayList(ske.bq(list3, 10));
        ufj ufjVar3 = new ufj((ufm) list3);
        while (ufjVar3.hasNext()) {
            arrayList3.add(Integer.valueOf(((gzk) ufjVar3.next()).ordinal()));
        }
        gzhVar8.e = ujp.aZ(arrayList3);
        d = gzhVar8.a();
        gzh gzhVar9 = new gzh();
        gzhVar9.b = "camera.burrata_vb_log";
        gzhVar9.o();
        gzh gzhVar10 = new gzh();
        gzhVar10.b = "camera.burrata_debug_saving";
        gzhVar10.o();
        gzh gzhVar11 = new gzh();
        gzhVar11.b = "camera.burrata_lt_override";
        gzhVar11.l();
    }
}
