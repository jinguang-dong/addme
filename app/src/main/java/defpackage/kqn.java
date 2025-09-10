package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqn {
    private static final sgv a = sgv.g("kqn");

    public static double a(pjo pjoVar) {
        return Collection.EL.stream(pjoVar.u()).mapToDouble(new kql(0)).min().orElseThrow();
    }

    public static double b(pjo pjoVar) {
        ((SizeF) pjoVar.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getClass();
        return r2.getWidth();
    }

    public static Range c(pjo pjoVar, pjo pjoVar2, double d) {
        double dA = a(pjoVar);
        return Range.create(Float.valueOf(pjoVar.d()), Float.valueOf(ske.aj((float) (d * ((b(pjoVar) * a(pjoVar2)) / (b(pjoVar2) * dA))), pjoVar.d(), pjoVar.c())));
    }

    public static sbp d(Set set) {
        Stream streamSorted = Collection.EL.stream(((Map) Collection.EL.stream(set).collect(Collectors.groupingBy(new jkv(16)))).values()).map(new jkv(17)).sorted(Comparator$CC.comparingDouble(new kql(2)));
        int i = sbp.d;
        return (sbp) streamSorted.collect(ryv.a);
    }

    public static Set f(pka pkaVar, pjp pjpVar) {
        List listH = pjpVar.h(pkaVar);
        HashSet hashSet = new HashSet();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            pjo pjoVarA = pjpVar.a((pjr) it.next());
            scn scnVar = ((pjn) pjoVarA).b;
            if (scnVar.isEmpty()) {
                hashSet.add(pjoVarA);
            } else {
                hashSet.addAll((java.util.Collection) Collection.EL.stream(scnVar).map(new gwl(pjpVar, 2)).collect(ryv.b));
            }
        }
        return hashSet;
    }

    public static List e(pjo pjoVar, int i, boolean z) {
        StreamConfigurationMap streamConfigurationMap = z ? (StreamConfigurationMap) pjoVar.m(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION) : (StreamConfigurationMap) pjoVar.m(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            ((sgt) a.c().M(3381)).s(LmJPKwPBa.oNkLT);
            int i2 = sbp.d;
            return sex.a;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        List listBO = (outputSizes == null || outputSizes.length == 0) ? ojl.bO(streamConfigurationMap.getHighResolutionOutputSizes(i)) : ojl.bO(outputSizes);
        pjoVar.j();
        return listBO;
    }
}
