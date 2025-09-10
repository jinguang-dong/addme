package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myt {
    public final List a;
    public final LinkedHashMap b;
    private final Context c;
    private final mky d;
    private final owq e;
    private final owq f;
    private final String g;
    private final String h;
    private final ovx i;
    private final hbj j;

    public myt(Context context, mky mkyVar, ovx ovxVar, owq owqVar, owq owqVar2, hbj hbjVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = context;
        this.d = mkyVar;
        this.i = ovxVar;
        this.e = owqVar;
        this.f = owqVar2;
        this.j = hbjVar;
        nkw nkwVar = nkw.SLOW_MOTION;
        myu myuVar = new myu((Object) nkwVar, nkt.a(nkwVar).c(context.getResources()), nkt.a(nkwVar).b(context.getResources()), false);
        nkw nkwVar2 = nkw.TIME_LAPSE;
        myu myuVar2 = new myu((Object) nkwVar2, nkt.a(nkwVar2).c(context.getResources()), nkt.a(nkwVar2).b(context.getResources()), true);
        if (hbjVar.p(gzo.aE)) {
            arrayList.add(myuVar);
        }
        linkedHashMap.put(nkwVar, myuVar);
        arrayList.add(myuVar2);
        linkedHashMap.put(nkwVar2, myuVar2);
        this.g = context.getString(R.string.hfr_record_speed, 1, 4);
        this.h = context.getString(R.string.hfr_record_speed, 1, 8);
    }

    private final String d() {
        return this.c.getString(R.string.timelapse_manual_record_speed, Integer.valueOf((int) this.d.a(((Double) this.e.dL()).doubleValue())));
    }

    private final void e(nkw nkwVar) {
        if (!this.b.containsKey(nkwVar)) {
            throw new IllegalArgumentException("Unsupported mode: ".concat(String.valueOf(String.valueOf(nkwVar))));
        }
    }

    public final ryo a(nkw nkwVar) {
        String string;
        String quantityString;
        e(nkwVar);
        ryo ryoVar = new ryo();
        if (nkwVar.equals(nkw.VIDEO)) {
            return ryoVar;
        }
        if (!nkwVar.equals(nkw.TIME_LAPSE)) {
            if (!nkwVar.equals(nkw.SLOW_MOTION)) {
                return new ryo(ryoVar);
            }
            Context context = this.c;
            String string2 = context.getString(R.string.accessibility_hfr_record_speed_desc, 1, 8);
            ryoVar.o(0, this.h);
            ryoVar.o(0, string2);
            ryoVar.o(0, context.getResources().getString(R.string.tooltip_msg_hfr_record_speed_1_8x));
            String string3 = context.getString(R.string.accessibility_hfr_record_speed_desc, 1, 4);
            ryoVar.o(1, this.g);
            ryoVar.o(1, string3);
            ryoVar.o(1, context.getResources().getString(R.string.tooltip_msg_hfr_record_speed_1_4x));
            return new ryo(ryoVar);
        }
        sem semVarB = sem.b(Collections.reverseOrder());
        Object[] objArrAU = ujp.aU(this.d.g.values().v());
        Arrays.sort(objArrAU, semVarB);
        ArrayList arrayListAB = ujp.aB(Arrays.asList(objArrAU));
        hbj hbjVar = this.j;
        gzg gzgVar = haw.j;
        sbp sbpVarP = hbjVar.p(gzgVar) ? sbp.p(Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_auto), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_5x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_10x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_30x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_120x)) : sbp.p(Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_1x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_5x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_10x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_30x), Integer.valueOf(R.string.tooltip_msg_timelapse_record_speed_120x));
        Iterator it = arrayListAB.iterator();
        int i = 0;
        while (it.hasNext()) {
            double dDoubleValue = ((Double) it.next()).doubleValue();
            if (i != 0) {
                double d = r1.e / dDoubleValue;
                Context context2 = this.c;
                int i2 = (int) d;
                Integer numValueOf = Integer.valueOf(i2);
                string = context2.getString(R.string.timelapse_manual_record_speed, numValueOf);
                quantityString = context2.getResources().getQuantityString(R.plurals.accessibility_timelapse_manual_record_speed_desc, i2, numValueOf);
            } else if (hbjVar.p(gzgVar)) {
                Context context3 = this.c;
                string = context3.getResources().getString(R.string.timelapse_auto_record_speed);
                quantityString = context3.getResources().getString(R.string.accessibility_timelapse_auto_record_speed_desc);
                i = 0;
            } else {
                i = 0;
                double d2 = r1.e / dDoubleValue;
                Context context22 = this.c;
                int i22 = (int) d2;
                Integer numValueOf2 = Integer.valueOf(i22);
                string = context22.getString(R.string.timelapse_manual_record_speed, numValueOf2);
                quantityString = context22.getResources().getQuantityString(R.plurals.accessibility_timelapse_manual_record_speed_desc, i22, numValueOf2);
            }
            Integer numValueOf3 = Integer.valueOf(i);
            ryoVar.o(numValueOf3, string);
            ryoVar.o(numValueOf3, quantityString);
            ryoVar.o(numValueOf3, this.c.getResources().getString(((Integer) sbpVarP.get(i)).intValue()));
            i++;
        }
        return new ryo(ryoVar);
    }

    public final String b(nkw nkwVar) {
        e(nkwVar);
        return nkwVar.equals(nkw.VIDEO) ? "" : nkwVar.equals(nkw.TIME_LAPSE) ? this.j.p(haw.j) ? this.c.getResources().getString(R.string.timelapse_auto_record_speed) : d() : nkwVar.equals(nkw.SLOW_MOTION) ? ((oxh) this.i.d).equals(oxh.FPS_120_HFR_4X) ? this.g : this.h : "";
    }

    public final String c() {
        return ((mkx) this.f.dL()).equals(mkx.AUTO) ? this.c.getResources().getString(R.string.timelapse_auto_record_speed) : d();
    }

    public myt() {
        this.a = new ArrayList();
    }
}
