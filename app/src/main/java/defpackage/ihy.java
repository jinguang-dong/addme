package defpackage;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageF;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StringAeResultsMap;
import com.google.googlex.gcam.StringFrameMetadataMap;
import com.google.googlex.gcam.StringSpatialGainMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ihy {
    public static final sgv a = sgv.g("ihy");
    public final uem b;
    public final hbj c;

    public ihy(uem uemVar, hbj hbjVar) {
        this.b = uemVar;
        this.c = hbjVar;
    }

    public static final void a(String str, PortraitRequest portraitRequest, ShotMetadata shotMetadata) {
        long jPortraitRequest_ae_results_get = GcamModuleJNI.PortraitRequest_ae_results_get(portraitRequest.a, portraitRequest);
        StringAeResultsMap stringAeResultsMap = jPortraitRequest_ae_results_get == 0 ? null : new StringAeResultsMap(jPortraitRequest_ae_results_get, false);
        AeResults aeResultsC = shotMetadata.c();
        GcamModuleJNI.StringAeResultsMap_set(stringAeResultsMap.a, stringAeResultsMap, str, aeResultsC == null ? 0L : aeResultsC.a, aeResultsC);
        long jPortraitRequest_frame_metadata_get = GcamModuleJNI.PortraitRequest_frame_metadata_get(portraitRequest.a, portraitRequest);
        (jPortraitRequest_frame_metadata_get == 0 ? null : new StringFrameMetadataMap(jPortraitRequest_frame_metadata_get, false)).b(str, shotMetadata.d());
        portraitRequest.b().b(str, shotMetadata.f());
        long jPortraitRequest_gain_map_get = GcamModuleJNI.PortraitRequest_gain_map_get(portraitRequest.a, portraitRequest);
        StringSpatialGainMap stringSpatialGainMap = jPortraitRequest_gain_map_get == 0 ? null : new StringSpatialGainMap(jPortraitRequest_gain_map_get, false);
        long jShotMetadata_gain_map_rggb_get = GcamModuleJNI.ShotMetadata_gain_map_rggb_get(shotMetadata.a, shotMetadata);
        InterleavedImageF interleavedImageF = jShotMetadata_gain_map_rggb_get != 0 ? new InterleavedImageF(jShotMetadata_gain_map_rggb_get, false) : null;
        SpatialGainMap spatialGainMap = new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_1(InterleavedImageF.a(interleavedImageF), interleavedImageF));
        GcamModuleJNI.StringSpatialGainMap_set(stringSpatialGainMap.a, stringSpatialGainMap, str, spatialGainMap.a, spatialGainMap);
    }
}
