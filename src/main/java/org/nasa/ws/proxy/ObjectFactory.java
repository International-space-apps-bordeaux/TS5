
package org.nasa.ws.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.nasa.ws.proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SSCResourceLimitExceededException_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "SSCResourceLimitExceededException");
    private final static QName _GetDataResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getDataResponse");
    private final static QName _GetAcknowledgementsResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAcknowledgementsResponse");
    private final static QName _SSCDatabaseLockedException_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "SSCDatabaseLockedException");
    private final static QName _GetAllSpaseObservatoriesResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSpaseObservatoriesResponse");
    private final static QName _GetAllGroundStations_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllGroundStations");
    private final static QName _GetGraphs_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getGraphs");
    private final static QName _GetDataFilesResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getDataFilesResponse");
    private final static QName _GetPrivacyAndImportantNotices_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getPrivacyAndImportantNotices");
    private final static QName _GetData_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getData");
    private final static QName _SSCExternalException_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "SSCExternalException");
    private final static QName _GetAllSatellites_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSatellites");
    private final static QName _GetPrivacyAndImportantNoticesResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getPrivacyAndImportantNoticesResponse");
    private final static QName _GetAllSatellitesResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSatellitesResponse");
    private final static QName _GetAllGroundStationsResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllGroundStationsResponse");
    private final static QName _GetGraphsResponse_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getGraphsResponse");
    private final static QName _GetAllSpaseObservatories_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSpaseObservatories");
    private final static QName _GetAcknowledgements_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getAcknowledgements");
    private final static QName _GetDataFiles_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "getDataFiles");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.nasa.ws.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAcknowledgements }
     * 
     */
    public GetAcknowledgements createGetAcknowledgements() {
        return new GetAcknowledgements();
    }

    /**
     * Create an instance of {@link GetGraphsResponse }
     * 
     */
    public GetGraphsResponse createGetGraphsResponse() {
        return new GetGraphsResponse();
    }

    /**
     * Create an instance of {@link GetAllSpaseObservatories }
     * 
     */
    public GetAllSpaseObservatories createGetAllSpaseObservatories() {
        return new GetAllSpaseObservatories();
    }

    /**
     * Create an instance of {@link GetDataFiles }
     * 
     */
    public GetDataFiles createGetDataFiles() {
        return new GetDataFiles();
    }

    /**
     * Create an instance of {@link GetAllGroundStationsResponse }
     * 
     */
    public GetAllGroundStationsResponse createGetAllGroundStationsResponse() {
        return new GetAllGroundStationsResponse();
    }

    /**
     * Create an instance of {@link GetPrivacyAndImportantNoticesResponse }
     * 
     */
    public GetPrivacyAndImportantNoticesResponse createGetPrivacyAndImportantNoticesResponse() {
        return new GetPrivacyAndImportantNoticesResponse();
    }

    /**
     * Create an instance of {@link GetAllSatellitesResponse }
     * 
     */
    public GetAllSatellitesResponse createGetAllSatellitesResponse() {
        return new GetAllSatellitesResponse();
    }

    /**
     * Create an instance of {@link GetGraphs }
     * 
     */
    public GetGraphs createGetGraphs() {
        return new GetGraphs();
    }

    /**
     * Create an instance of {@link GetDataFilesResponse }
     * 
     */
    public GetDataFilesResponse createGetDataFilesResponse() {
        return new GetDataFilesResponse();
    }

    /**
     * Create an instance of {@link GetAllGroundStations }
     * 
     */
    public GetAllGroundStations createGetAllGroundStations() {
        return new GetAllGroundStations();
    }

    /**
     * Create an instance of {@link GetAllSatellites }
     * 
     */
    public GetAllSatellites createGetAllSatellites() {
        return new GetAllSatellites();
    }

    /**
     * Create an instance of {@link SSCExternalException }
     * 
     */
    public SSCExternalException createSSCExternalException() {
        return new SSCExternalException();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetPrivacyAndImportantNotices }
     * 
     */
    public GetPrivacyAndImportantNotices createGetPrivacyAndImportantNotices() {
        return new GetPrivacyAndImportantNotices();
    }

    /**
     * Create an instance of {@link SSCDatabaseLockedException }
     * 
     */
    public SSCDatabaseLockedException createSSCDatabaseLockedException() {
        return new SSCDatabaseLockedException();
    }

    /**
     * Create an instance of {@link GetAcknowledgementsResponse }
     * 
     */
    public GetAcknowledgementsResponse createGetAcknowledgementsResponse() {
        return new GetAcknowledgementsResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link SSCResourceLimitExceededException }
     * 
     */
    public SSCResourceLimitExceededException createSSCResourceLimitExceededException() {
        return new SSCResourceLimitExceededException();
    }

    /**
     * Create an instance of {@link GetAllSpaseObservatoriesResponse }
     * 
     */
    public GetAllSpaseObservatoriesResponse createGetAllSpaseObservatoriesResponse() {
        return new GetAllSpaseObservatoriesResponse();
    }

    /**
     * Create an instance of {@link DistanceFromOptions }
     * 
     */
    public DistanceFromOptions createDistanceFromOptions() {
        return new DistanceFromOptions();
    }

    /**
     * Create an instance of {@link GraphRequest }
     * 
     */
    public GraphRequest createGraphRequest() {
        return new GraphRequest();
    }

    /**
     * Create an instance of {@link GraphLabelOptions }
     * 
     */
    public GraphLabelOptions createGraphLabelOptions() {
        return new GraphLabelOptions();
    }

    /**
     * Create an instance of {@link GroundStationDescription }
     * 
     */
    public GroundStationDescription createGroundStationDescription() {
        return new GroundStationDescription();
    }

    /**
     * Create an instance of {@link RegionFilterOptions }
     * 
     */
    public RegionFilterOptions createRegionFilterOptions() {
        return new RegionFilterOptions();
    }

    /**
     * Create an instance of {@link SatelliteData }
     * 
     */
    public SatelliteData createSatelliteData() {
        return new SatelliteData();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link RegionOptions }
     * 
     */
    public RegionOptions createRegionOptions() {
        return new RegionOptions();
    }

    /**
     * Create an instance of {@link SpaseObservatoryDescription }
     * 
     */
    public SpaseObservatoryDescription createSpaseObservatoryDescription() {
        return new SpaseObservatoryDescription();
    }

    /**
     * Create an instance of {@link FilteredCoordinateOptions }
     * 
     */
    public FilteredCoordinateOptions createFilteredCoordinateOptions() {
        return new FilteredCoordinateOptions();
    }

    /**
     * Create an instance of {@link DataFileRequest }
     * 
     */
    public DataFileRequest createDataFileRequest() {
        return new DataFileRequest();
    }

    /**
     * Create an instance of {@link SpaceRegionsFilterOptions }
     * 
     */
    public SpaceRegionsFilterOptions createSpaceRegionsFilterOptions() {
        return new SpaceRegionsFilterOptions();
    }

    /**
     * Create an instance of {@link BFieldModelParameters }
     * 
     */
    public BFieldModelParameters createBFieldModelParameters() {
        return new BFieldModelParameters();
    }

    /**
     * Create an instance of {@link TimeSeriesGraphOptions }
     * 
     */
    public TimeSeriesGraphOptions createTimeSeriesGraphOptions() {
        return new TimeSeriesGraphOptions();
    }

    /**
     * Create an instance of {@link GraphScale }
     * 
     */
    public GraphScale createGraphScale() {
        return new GraphScale();
    }

    /**
     * Create an instance of {@link BFieldModelOptions }
     * 
     */
    public BFieldModelOptions createBFieldModelOptions() {
        return new BFieldModelOptions();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link CoordinateData }
     * 
     */
    public CoordinateData createCoordinateData() {
        return new CoordinateData();
    }

    /**
     * Create an instance of {@link SatelliteDescription }
     * 
     */
    public SatelliteDescription createSatelliteDescription() {
        return new SatelliteDescription();
    }

    /**
     * Create an instance of {@link HemisphereOptions }
     * 
     */
    public HemisphereOptions createHemisphereOptions() {
        return new HemisphereOptions();
    }

    /**
     * Create an instance of {@link CoordinateOptions }
     * 
     */
    public CoordinateOptions createCoordinateOptions() {
        return new CoordinateOptions();
    }

    /**
     * Create an instance of {@link ValueOptions }
     * 
     */
    public ValueOptions createValueOptions() {
        return new ValueOptions();
    }

    /**
     * Create an instance of {@link FileResult }
     * 
     */
    public FileResult createFileResult() {
        return new FileResult();
    }

    /**
     * Create an instance of {@link OrbitGraphOptions }
     * 
     */
    public OrbitGraphOptions createOrbitGraphOptions() {
        return new OrbitGraphOptions();
    }

    /**
     * Create an instance of {@link BFieldTraceOptions }
     * 
     */
    public BFieldTraceOptions createBFieldTraceOptions() {
        return new BFieldTraceOptions();
    }

    /**
     * Create an instance of {@link LocationFilterOptions }
     * 
     */
    public LocationFilterOptions createLocationFilterOptions() {
        return new LocationFilterOptions();
    }

    /**
     * Create an instance of {@link DataRequest }
     * 
     */
    public DataRequest createDataRequest() {
        return new DataRequest();
    }

    /**
     * Create an instance of {@link BTraceData }
     * 
     */
    public BTraceData createBTraceData() {
        return new BTraceData();
    }

    /**
     * Create an instance of {@link FormatOptions }
     * 
     */
    public FormatOptions createFormatOptions() {
        return new FormatOptions();
    }

    /**
     * Create an instance of {@link MapLimits }
     * 
     */
    public MapLimits createMapLimits() {
        return new MapLimits();
    }

    /**
     * Create an instance of {@link SatelliteSpecification }
     * 
     */
    public SatelliteSpecification createSatelliteSpecification() {
        return new SatelliteSpecification();
    }

    /**
     * Create an instance of {@link LocationFilter }
     * 
     */
    public LocationFilter createLocationFilter() {
        return new LocationFilter();
    }

    /**
     * Create an instance of {@link OutputOptions }
     * 
     */
    public OutputOptions createOutputOptions() {
        return new OutputOptions();
    }

    /**
     * Create an instance of {@link MapProjectionGraphOptions }
     * 
     */
    public MapProjectionGraphOptions createMapProjectionGraphOptions() {
        return new MapProjectionGraphOptions();
    }

    /**
     * Create an instance of {@link DataResult }
     * 
     */
    public DataResult createDataResult() {
        return new DataResult();
    }

    /**
     * Create an instance of {@link MappedRegionFilterOptions }
     * 
     */
    public MappedRegionFilterOptions createMappedRegionFilterOptions() {
        return new MappedRegionFilterOptions();
    }

    /**
     * Create an instance of {@link GraphFormatOptions }
     * 
     */
    public GraphFormatOptions createGraphFormatOptions() {
        return new GraphFormatOptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSCResourceLimitExceededException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "SSCResourceLimitExceededException")
    public JAXBElement<SSCResourceLimitExceededException> createSSCResourceLimitExceededException(SSCResourceLimitExceededException value) {
        return new JAXBElement<SSCResourceLimitExceededException>(_SSCResourceLimitExceededException_QNAME, SSCResourceLimitExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcknowledgementsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAcknowledgementsResponse")
    public JAXBElement<GetAcknowledgementsResponse> createGetAcknowledgementsResponse(GetAcknowledgementsResponse value) {
        return new JAXBElement<GetAcknowledgementsResponse>(_GetAcknowledgementsResponse_QNAME, GetAcknowledgementsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSCDatabaseLockedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "SSCDatabaseLockedException")
    public JAXBElement<SSCDatabaseLockedException> createSSCDatabaseLockedException(SSCDatabaseLockedException value) {
        return new JAXBElement<SSCDatabaseLockedException>(_SSCDatabaseLockedException_QNAME, SSCDatabaseLockedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSpaseObservatoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAllSpaseObservatoriesResponse")
    public JAXBElement<GetAllSpaseObservatoriesResponse> createGetAllSpaseObservatoriesResponse(GetAllSpaseObservatoriesResponse value) {
        return new JAXBElement<GetAllSpaseObservatoriesResponse>(_GetAllSpaseObservatoriesResponse_QNAME, GetAllSpaseObservatoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGroundStations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAllGroundStations")
    public JAXBElement<GetAllGroundStations> createGetAllGroundStations(GetAllGroundStations value) {
        return new JAXBElement<GetAllGroundStations>(_GetAllGroundStations_QNAME, GetAllGroundStations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGraphs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getGraphs")
    public JAXBElement<GetGraphs> createGetGraphs(GetGraphs value) {
        return new JAXBElement<GetGraphs>(_GetGraphs_QNAME, GetGraphs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getDataFilesResponse")
    public JAXBElement<GetDataFilesResponse> createGetDataFilesResponse(GetDataFilesResponse value) {
        return new JAXBElement<GetDataFilesResponse>(_GetDataFilesResponse_QNAME, GetDataFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrivacyAndImportantNotices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getPrivacyAndImportantNotices")
    public JAXBElement<GetPrivacyAndImportantNotices> createGetPrivacyAndImportantNotices(GetPrivacyAndImportantNotices value) {
        return new JAXBElement<GetPrivacyAndImportantNotices>(_GetPrivacyAndImportantNotices_QNAME, GetPrivacyAndImportantNotices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSCExternalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "SSCExternalException")
    public JAXBElement<SSCExternalException> createSSCExternalException(SSCExternalException value) {
        return new JAXBElement<SSCExternalException>(_SSCExternalException_QNAME, SSCExternalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSatellites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAllSatellites")
    public JAXBElement<GetAllSatellites> createGetAllSatellites(GetAllSatellites value) {
        return new JAXBElement<GetAllSatellites>(_GetAllSatellites_QNAME, GetAllSatellites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrivacyAndImportantNoticesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getPrivacyAndImportantNoticesResponse")
    public JAXBElement<GetPrivacyAndImportantNoticesResponse> createGetPrivacyAndImportantNoticesResponse(GetPrivacyAndImportantNoticesResponse value) {
        return new JAXBElement<GetPrivacyAndImportantNoticesResponse>(_GetPrivacyAndImportantNoticesResponse_QNAME, GetPrivacyAndImportantNoticesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSatellitesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAllSatellitesResponse")
    public JAXBElement<GetAllSatellitesResponse> createGetAllSatellitesResponse(GetAllSatellitesResponse value) {
        return new JAXBElement<GetAllSatellitesResponse>(_GetAllSatellitesResponse_QNAME, GetAllSatellitesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGroundStationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAllGroundStationsResponse")
    public JAXBElement<GetAllGroundStationsResponse> createGetAllGroundStationsResponse(GetAllGroundStationsResponse value) {
        return new JAXBElement<GetAllGroundStationsResponse>(_GetAllGroundStationsResponse_QNAME, GetAllGroundStationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGraphsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getGraphsResponse")
    public JAXBElement<GetGraphsResponse> createGetGraphsResponse(GetGraphsResponse value) {
        return new JAXBElement<GetGraphsResponse>(_GetGraphsResponse_QNAME, GetGraphsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSpaseObservatories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAllSpaseObservatories")
    public JAXBElement<GetAllSpaseObservatories> createGetAllSpaseObservatories(GetAllSpaseObservatories value) {
        return new JAXBElement<GetAllSpaseObservatories>(_GetAllSpaseObservatories_QNAME, GetAllSpaseObservatories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcknowledgements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getAcknowledgements")
    public JAXBElement<GetAcknowledgements> createGetAcknowledgements(GetAcknowledgements value) {
        return new JAXBElement<GetAcknowledgements>(_GetAcknowledgements_QNAME, GetAcknowledgements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ssc.spdf.gsfc.nasa.gov/", name = "getDataFiles")
    public JAXBElement<GetDataFiles> createGetDataFiles(GetDataFiles value) {
        return new JAXBElement<GetDataFiles>(_GetDataFiles_QNAME, GetDataFiles.class, null, value);
    }

}
